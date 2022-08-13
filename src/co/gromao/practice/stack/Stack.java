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
            newNode.setNext(this.top);
            this.top = newNode;
        }
        this.length++;
    }

    public Node<T> pop() {
        if (length == 0) {
            return null;
        }

        Node<T> result = this.top;

        if (length == 1) {
            this.bottom = null;
            this.top = this.bottom;
        } else {
            this.top = this.top.getNext();
        }

        this.length--;

        return result;
    }

    public boolean isEmpty() {
        return Objects.isNull(this.bottom) && Objects.isNull(this.top) && length == 0;
    }

    public void print() {
        for (Node<T> currNode = this.top; Objects.nonNull(currNode); currNode = currNode.getNext()) {
            System.out.print(currNode.getValue() + " ");
        }
        System.out.println();
    }

}
