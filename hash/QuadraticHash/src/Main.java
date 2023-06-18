class QuadraticHash {
    private int capacity;
    private int size;
    private Integer[] table;

    public QuadraticHash(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.table = new Integer[capacity];
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
        int i = 1;
        while (table[hash] != null) {
            hash = (hash + (i * i)) % capacity;
            i++;
        }

        table[hash] = value;
        size++;
    }

    public boolean contains(int value) {
        int hash = hash(value);
        int initialHash = hash;
        int i = 1;

        while (table[hash] != null) {
            if (table[hash] == value) {
                return true;
            }

            hash = (hash + (i * i)) % capacity;
            i++;

            if (hash == initialHash) {
                break;
            }
        }

        return false;
    }

    public boolean remove(int value) {
        int hash = hash(value);
        int initialHash = hash;
        int i = 1;

        while (table[hash] != null) {
            if (table[hash] == value) {
                table[hash] = null;
                size--;
                return true;
            }

            hash = (hash + (i * i)) % capacity;
            i++;

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
        QuadraticHash quadraticHash = new QuadraticHash(11);

        quadraticHash.insert(37);
        quadraticHash.insert(14);
        quadraticHash.insert(25);
        quadraticHash.insert(13);
        quadraticHash.insert(7);
        quadraticHash.insert(2);
        quadraticHash.insert(4);
        quadraticHash.insert(15);
        quadraticHash.insert(16);
        quadraticHash.remove(4);
        quadraticHash.insert(10);
        quadraticHash.insert(21);
        quadraticHash.insert(36);
        quadraticHash.insert(41);

        System.out.println("Max capacity: " + quadraticHash.getMaxCapacity());
        System.out.println("Current capacity: " + quadraticHash.getCurrentCapacity());
    }
}
