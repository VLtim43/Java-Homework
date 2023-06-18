 class IntegerHashTable {
    private int capacity;
    private int size;
    private int[] table;

    public IntegerHashTable(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.table = new int[capacity];
    }

    public int getMaxCapacity() {
        return capacity;
    }

    public int getCurrentCapacity() {
        return size;
    }

    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Tabela cheia");
            return;
        }

        int hash = hash(value);
        while (table[hash] != 0) {
            hash = (hash + 1) % capacity;
        }

        table[hash] = value;
        size++;
    }

    public boolean contains(int value) {
        int hash = hash(value);
        int initialHash = hash;

        while (table[hash] != 0) {
            if (table[hash] == value) {
                return true;
            }

            hash = (hash + 1) % capacity;


            if (hash == initialHash) {
                break;
            }
        }

        return false;
    }

    public boolean remove(int value) {
        int hash = hash(value);
        int initialHash = hash;

        while (table[hash] != 0) {
            if (table[hash] == value) {
                table[hash] = 0;
                size--;
                return true;
            }

            hash = (hash + 1) % capacity;


            if (hash == initialHash) {
                break;
            }
        }

        return false;
    }

    private int hash(int value) {
        return value % capacity;
    }
}

public class Main {
     public static void main(String[] args) {
         IntegerHashTable hashTable = new IntegerHashTable(11);


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

         System.out.println("Max capacity: " + hashTable.getMaxCapacity());
         System.out.println("Current capacity: " + hashTable.getCurrentCapacity());


     }
 }
