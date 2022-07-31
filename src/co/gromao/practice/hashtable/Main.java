package co.gromao.practice.hashtable;

public class Main {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(20);

        hashTable.set("Nix", 8);
        hashTable.set("Bowie", 2);
        hashTable.set("Gui", 34);

        System.out.println(hashTable.get("Nix"));
        System.out.println(hashTable.get("Bowie"));
        System.out.println(hashTable.get("Gui"));
        System.out.println(hashTable.get("BuzzLightyear"));

        System.out.println(hashTable.keys());
    }

}
