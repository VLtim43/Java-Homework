
 class IntegerHashTable {
     private int[][] table;
     private int capacity;
     private int size;

     public IntegerHashTable(int capacity) {
         this.capacity = capacity;
         this.table = new int[capacity][2]; // 2 buckets
         this.size = 0;
     }

     public void insert(int key) {
         if (size == capacity * 2) {
             System.out.println("Tabela cheia. Não se pode inserir: " + key);
             return;
         }

         int index = hash(key);
         for (int i = 0; i < 2; i++) {
             int slotIndex = (index + i) % capacity;
             if (table[slotIndex][0] == 0) {
                 table[slotIndex][0] = key;
                 size++;
                 return;
             }
         }

         System.out.println("Tabela cheia. Não se pode inserir: " + key);

     }

     public boolean search(int key) {
         int index = hash(key);
         for (int i = 0; i < 2; i++) {
             int slotIndex = (index + i) % capacity;
             if (table[slotIndex][0] == key) {
                 return true;
             }
         }
         return false;
     }

     public void delete(int key) {
         int index = hash(key);
         for (int i = 0; i < 2; i++) {
             int slotIndex = (index + i) % capacity;
             if (table[slotIndex][0] == key) {
                 table[slotIndex][0] = 0;
                 size--;
                 return;
             }
         }
         System.out.println("Valor não encontrado: " + key);
     }

     private int hash(int key) {
         return key % capacity;
     }

     public int getSize() {
         return size;
     }

     public int getCapacity() {
         return capacity;
     }

 }





public class LinearHash {
    public static void main(String[] args) {
        IntegerHashTable hashTable = new IntegerHashTable(11);

        hashTable.insert(37);
        hashTable.insert(14);
        hashTable.insert(25);
        hashTable.insert(13);
        hashTable.insert( 7);
        hashTable.insert(2);
        hashTable.insert(4);
        hashTable.insert(15);
        hashTable.insert(16);
        hashTable.delete(4);
        hashTable.insert(10);
        hashTable.insert(21);
        hashTable.insert(36);
        hashTable.insert(41);


        System.out.println(hashTable.getCapacity()); // Output: 4




    }
}