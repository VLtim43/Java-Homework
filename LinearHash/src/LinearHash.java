 class LinearHashTable {
     private int[][] table;
     private int currentCapacity;
     private int maxCapacity;

     public LinearHashTable(int maxCapacity) {
         table = new int[maxCapacity][2];
         this.maxCapacity = maxCapacity;
         currentCapacity = 0;
     }

     public int getMaxCapacity() {
         return maxCapacity;
     }

     public int getCurrentCapacity() {
         return currentCapacity;
     }

     public void insert(int key) {
         if (currentCapacity >= maxCapacity) {
             System.out.println("Tabela cheia, não se pode inserir nenhum elemento: " + key);
             return;
         }

         int hash = key % maxCapacity;
         int collisionCount = 0;

         while (table[hash][0] != 0 && collisionCount < 2) {
             hash = (hash + 1) % maxCapacity;
             collisionCount++;
         }

         if (collisionCount >= 2) {
             System.out.println("Não se pode inserir o elemento: " + key + ". Buckets cheios para essa posição.");
             return;
         }

         table[hash][0] = key;
         table[hash][1] = 1;
         currentCapacity++;
     }

     public void remove(int key) {
         int hash = key % maxCapacity;

         while (table[hash][0] != key && table[hash][1] != 0) {
             hash = (hash + 1) % maxCapacity;
         }

         if (table[hash][0] == key) {
             table[hash][0] = 0;
             table[hash][1] = 0;
             currentCapacity--;
             System.out.println("Elemento removido: " + key);
         } else {
             System.out.println("Element não encontrado: " + key);
         }
     }





    public static void main(String[] args) {
        LinearHashTable hashTable = new LinearHashTable(11);
        System.out.println("Capacidade max: " + hashTable.getMaxCapacity());
        System.out.println("Capacidade atual: " + hashTable.getCurrentCapacity());

        hashTable.insert(37);

        hashTable.insert(14);
        hashTable.insert(25);
        hashTable.insert(13);
        hashTable.insert(7);
        hashTable.insert(2);
        hashTable.insert(4);
        hashTable.insert(15);
        hashTable.insert(16);

        hashTable.remove(4);

        hashTable.insert(10);
        hashTable.insert(21);
        hashTable.insert(36);

        hashTable.insert(41);


    }
}
