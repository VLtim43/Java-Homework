



 class IntegerHashTable {
    private int[] table;
    private int capacity;
    private int size;

    public IntegerHashTable(int capacity) {
        this.capacity = capacity;
        this.table = new int[capacity];
        this.size = 0;
    }

    public void insert(int key) {
        if (size == capacity) {
            System.out.println("Tabela cheia, não se pode inserir o valor: " + key);
            return;
        }

        int index = hash(key);
        while (table[index] != 0) {
            index = (index + 1) % capacity; // Linear probing
        }

        table[index] = key;
        size++;
    }

    public boolean search(int key) {
        int index = hash(key);
        int count = 0;

        while (table[index] != 0 && count < capacity) {
            if (table[index] == key) {
                return true;
            }

            index = (index + 1) % capacity; // Linear probing
            count++;
        }

        return false;
    }

    public void delete(int key) {
        int index = hash(key);
        int count = 0;

        while (table[index] != 0 && count < capacity) {
            if (table[index] == key) {
                table[index] = 0;
                size--;
                return;
            }

            index = (index + 1) % capacity; // Linear probing
            count++;
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