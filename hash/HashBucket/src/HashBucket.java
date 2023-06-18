 class HashBucket {
     private int[][] table;
     private int currentCapacity;
     private int maxCapacity;

     public HashBucket(int maxCapacity) {
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
        HashBucket hashBucket = new HashBucket(11);
        System.out.println("Capacidade max: " + hashBucket.getMaxCapacity());
        System.out.println("Capacidade atual: " + hashBucket.getCurrentCapacity());

        hashBucket.insert(37);

        hashBucket.insert(14);
        hashBucket.insert(25);
        hashBucket.insert(13);
        hashBucket.insert(7);
        hashBucket.insert(2);
        hashBucket.insert(4);
        hashBucket.insert(15);
        hashBucket.insert(16);

        hashBucket.remove(4);

        hashBucket.insert(10);
        hashBucket.insert(21);
        hashBucket.insert(36);

        hashBucket.insert(41);


    }
}
