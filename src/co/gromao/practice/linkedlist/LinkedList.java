package co.gromao.practice.linkedlist;

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public LinkedList(T value) {
        this.head = new Node<>(value);
        this.tail = this.head;
    }

    public void append(T value) {
        Node<T> node = new Node<>(value);
        this.tail.setNext(node);
        this.tail = node;
    }

    public void prepend(T value) {
        Node<T> node = new Node<>(value);
        node.setNext(this.head);
        this.head = node;
    }

    public void printList() {
        Node<T> node = this.head;

        System.out.print(node.getValue() + " ");

        while (node.hasNext()) {
            node = node.getNext();
            System.out.print(node.getValue() + " ");
        }
    }

}
