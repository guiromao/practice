package co.gromao.practice.hashtable;

import java.util.Objects;

public class Data {

    private final String key;
    private final Integer value;

    public Data(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Data data = (Data) o;
        return key.equals(data.key) && Objects.equals(value, data.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}
