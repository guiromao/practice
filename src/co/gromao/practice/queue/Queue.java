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
            this.last.setNext(currNode);
            this.last = currNode;
        }
        this.length++;
    }

    public Node<T> dequeue() {
        Node<T> result = this.first;

        this.first = (this.length == 1) ? null : this.first.getNext();
        
        this.length--;

        return result;
    }

}
