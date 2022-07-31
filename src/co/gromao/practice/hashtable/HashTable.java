package co.gromao.practice.hashtable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class HashTable {

    private final List<Data>[] data;

    public HashTable(int size) {
        this.data = new List[size];
    }

    public void set(String key, int value) {
        int address = hash(key);

        if (Objects.isNull(data[address])) {
            data[address] = new ArrayList<>();
        }

        data[address].add(new Data(key, value));
    }

    public int get(String key) {
        int address = hash(key);

        if (Objects.nonNull(data[address])) {
            return findValueOfKey(key, data[address]);
        }

        throw new IllegalArgumentException("Non existing key in saved data");
    }

    public List<String> keys() {
        return Stream.of(data)
                .filter(Objects::nonNull)
                .map(this::extractKeys)
                .flatMap(Collection::stream)
                .toList();
    }

    private int findValueOfKey(String key, List<Data> dataList) {
        for (Data item: dataList) {
            if (key.equals(item.getKey())) {
                return item.getValue();
            }
        }

        throw new IllegalArgumentException("Non existing key address's saved data list");
    }

    private int hash(String key) {
        int hash = 0;

        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % data.length;
        }

        return hash;
    }

    private List<String> extractKeys(List<Data> data) {
        return data.stream()
                .map(Data::getKey)
                .toList();
    }

}
