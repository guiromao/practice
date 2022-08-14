package co.gromao.practice.bst;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.insert(10);
        bst.insert(18);
        bst.insert(89);
        bst.insert(17);
        bst.insert(4);
        bst.insert(1);
        bst.insert(3);

        System.out.println("Lookup 4: " + bst.lookup(4));
        System.out.println("Lookup 4000: " + bst.lookup(4000));

        bst.remove(18);
        bst.print();
    }

}
