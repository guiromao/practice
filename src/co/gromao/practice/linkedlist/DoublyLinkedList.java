package co.gromao.practice.linkedlist;

import java.util.Objects;

public class DoublyLinkedList<T> {

    private DoublyNode<T> head;
    private DoublyNode<T> tail;
    private int length;

    public DoublyLinkedList(T value) {
        this.head = new DoublyNode<>(value, null);
        this.tail = head;
        this.length = 1;
    }

    public void prepend(T value) {
        DoublyNode<T> newNode = new DoublyNode<>(value, null);
        newNode.setNext(this.head);
        this.head.setPrevious(newNode);
        this.head = newNode;
        this.length++;
    }

    public void append(T value) {
        DoublyNode<T> newNode = new DoublyNode<>(value, this.tail);
        this.tail.setNext(newNode);
        this.tail = newNode;
        this.length++;
    }

    public void insert(int index, T value) {
        DoublyNode<T> newNode = new DoublyNode<>(value, null);
        DoublyNode<T> referenceNode = traverseToIndex(index - 1);
        DoublyNode<T> nextNode = Objects.isNull(referenceNode.getNext()) ? null : referenceNode.getNext();
        newNode.setNext(nextNode);
        referenceNode.setNext(newNode);

        if (Objects.nonNull(nextNode)) {
            nextNode.setPrevious(newNode);
        }

        this.length++;
    }

    public void remove(int index) {
        DoublyNode<T> referenceNode = traverseToIndex(index - 1);
        DoublyNode<T> nodeToRemove = referenceNode.getNext();
        DoublyNode<T> nextNode = nodeToRemove.equals(this.tail) ? null : nodeToRemove.getNext();

        referenceNode.setNext(nextNode);

        if (Objects.nonNull(nextNode)) {
            nextNode.setPrevious(referenceNode);
        }
    }

    public void print() {
        for (DoublyNode<T> currNode = this.head; Objects.nonNull(currNode); currNode = currNode.getNext()) {
            System.out.print(currNode.getValue() + " ");
        }
        System.out.println();
    }

    private DoublyNode<T> traverseToIndex(int index) {
        DoublyNode<T> result = this.head;
        int i = 0;

        while (i < index) {
            result = result.getNext();
            i++;
        }

        return result;
    }

}
