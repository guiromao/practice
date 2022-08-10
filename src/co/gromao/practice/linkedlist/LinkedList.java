package co.gromao.practice.linkedlist;

import java.lang.reflect.Array;
import java.util.Objects;

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int length;

    public LinkedList(T value) {
        this.head = new Node<>(value);
        this.tail = this.head;
        this.length = 1;
    }

    public void append(T value) {
        Node<T> node = new Node<>(value);
        this.tail.setNext(node);
        this.tail = node;
        this.length++;
    }

    public void prepend(T value) {
        Node<T> node = new Node<>(value);
        node.setNext(this.head);
        this.head = node;
        this.length++;
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

        this.length++;
    }

    public void remove(int index) {
        int i = 0;
        Node<T> currNode = this.head;

        while (i < index - 1) {
            currNode = currNode.getNext();
            i++;
        }

        Node<T> nextNode = currNode.getNext();

        if (nextNode.equals(this.tail)) {
            nextNode = null;
        } else {
            nextNode = nextNode.getNext();
        }

        currNode.setNext(nextNode);
        this.length--;
    }

    public void reverse() {
        Node<T>[] nodesArr = new Node[length];
        int index = 0;

        for (Node<T> currNode = this.head; Objects.nonNull(currNode); currNode = currNode.getNext(), index++) {
            nodesArr[index] = new Node<>(currNode.getValue());
        }

        index = length - 1;
        Node<T> currNode;

        while (index >= 0) {
            currNode = nodesArr[index];

            if (index == length - 1) {
                this.head = currNode;
            }

            if (index == 0) {
                this.tail = currNode;
            }

            if (index - 1 >= 0) {
                currNode.setNext(nodesArr[index - 1]);
            }

            index--;
        }
    }

    public void print() {
        for (Node<T> node = this.head; Objects.nonNull(node); node = node.getNext()) {
            System.out.print(node.getValue() + " ");
        }

        System.out.println();
    }

}
