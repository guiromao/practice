package co.gromao.practice.hashtable;

public class HashTable {

    private final int [] data;

    public HashTable(int size) {
        this.data = new int[size];
    }

    public void set(String key, int value) {
        int hash = hash(key);

        validateHash(hash);

        data[hash] = value;
    }

    public int get(String key) {
        int hash = hash(key);

        validateHash(hash);

        return data[hash];
    }

    private int hash(String key) {
        int hash = 0;

        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % data.length;
        }

        return hash;
    }

    private void validateHash(int hash) {
        if (hash < 0 || hash >= data.length) {
            throw new IllegalArgumentException("Invalid hash for hashTable");
        }
    }

}
