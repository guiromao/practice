package co.gromao.practice.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(10);

        list.append(20);
        list.append(33);
        list.append(1906);
        list.append(7);

        list.prepend(80);
        list.prepend(1988);
        list.prepend(1);

        list.append(2000);
        list.prepend(0);

        list.insert(2, 999);

        list.print();
    }

}
