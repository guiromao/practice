package co.gromao.practice.queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> queue = new Queue();

        queue.enqueue("Wolverine");
        queue.enqueue("Cyclops");
        queue.enqueue("Deadpool");

        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

}
