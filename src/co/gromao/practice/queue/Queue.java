package co.gromao.practice.queue;

public class Queue<T> {

    private Node<T> first;
    private Node<T> last;
    private int length;

    public Queue() {
        this.length = 0;
    }

    public Node<T> peek() {
        return this.first;
    }

    public void enqueue(T value) {
        Node<T> currNode = new Node<>(value);

        if (this.length == 0) {
            this.first = currNode;
            this.last = this.first;
        } else {
            currNode.setNext(this.last);
            this.last = currNode;
        }
        this.length++;
    }

    public Node<T> dequeue() {
        Node<T> result = this.first;

        if (this.length == 1) {
            this.first = null;
        } else {
            Node<T> newFirst = secondToLast();
            newFirst.setNext(null);
            this.first = newFirst;
        }
        this.length--;

        return result;
    }

    private Node<T> secondToLast() {
        Node<T> currNode = this.last;

        while (!currNode.getNext().equals(this.first)) {
            currNode = currNode.getNext();
        }

        return currNode;
    }

}
