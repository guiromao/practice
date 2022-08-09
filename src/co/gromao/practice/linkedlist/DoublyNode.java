package co.gromao.practice.linkedlist;

import java.util.Objects;

public class DoublyNode<T> {

    private T value;
    private DoublyNode<T> previous;
    private DoublyNode<T> next;

    public DoublyNode(T value) {
        this.value = value;
        this.previous = null;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public DoublyNode<T> getPrevious() {
        return previous;
    }

    public DoublyNode<T> getNext() {
        return next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setPrevious(DoublyNode<T> previous) {
        this.previous = previous;
    }

    public void setNext(DoublyNode<T> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DoublyNode<?> that = (DoublyNode<?>) o;
        return Objects.equals(value, that.value) && Objects.equals(previous, that.previous) && Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, previous, next);
    }
}
