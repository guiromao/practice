package co.gromao.practice.stack;

import java.util.Objects;

public class Stack<T> {

    private Node<T> bottom;
    private Node<T> top;
    private int length;

    public Stack() {
        this.length = 0;
    }

    public Node<T> peek() {
        return top;
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value);

        if (length == 0) {
            this.bottom = newNode;
            this.top = this.bottom;
        } else {
            this.top.setNext(newNode);
            this.top = newNode;
        }
        this.length++;
    }

    public Node<T> pop() {
        if (length == 0) {
            throw new IllegalStateException("Cannot pop empty Stack");
        }

        Node<T> result = this.top;

        if (length == 1) {
            this.bottom = null;
            this.top = this.bottom;
        } else {
            Node<T> currNode = traverseToSecondLast();
            currNode.setNext(null);
            this.top = currNode;
        }

        this.length--;

        return result;
    }

    public boolean isEmpty() {
        return Objects.isNull(this.bottom) && Objects.isNull(this.top) && length == 0;
    }

    public void print() {
        for (Node<T> currNode = this.bottom; Objects.nonNull(currNode); currNode = currNode.getNext()) {
            System.out.print(currNode.getValue() + " ");
        }
        System.out.println();
    }

    private Node<T> traverseToSecondLast() {
        Node<T> currNode = this.bottom;

        while (!currNode.getNext().equals(this.top)) {
            currNode = currNode.getNext();
        }

        return currNode;
    }
}
