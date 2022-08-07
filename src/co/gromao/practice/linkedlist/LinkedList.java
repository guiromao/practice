package co.gromao.practice.linkedlist;

import java.util.Objects;

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

    public void insert(int index, T value) {
        if (index == 0) {
            prepend(value);
        }

        Node<T> node = new Node<>(value);
        boolean inserted = false;
        int i = 0;

        for (Node<T> currNode = this.head; Objects.nonNull(currNode) && !inserted; currNode = currNode.getNext(), i++) {
            if ((i + 1) == index) {
                Node<T> nextNode = currNode.getNext();
                node.setNext(nextNode);
                currNode.setNext(node);
                inserted = true;
            }
        }
    }

    public void print() {
        for (Node<T> node = this.head; Objects.nonNull(node); node = node.getNext()) {
            System.out.print(node.getValue() + " ");
        }

        System.out.println();
    }

}
