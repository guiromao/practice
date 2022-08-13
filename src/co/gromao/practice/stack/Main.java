package co.gromao.practice.stack;

public class Main {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Spring");
        stack.push("MongoDB");

        System.out.println(stack.peek());

        stack.pop();

        stack.print();

        stack.push("ReactJS");
        stack.push("SQL");

        stack.print();

        Node<String> node = stack.pop();
        System.out.println("Popped node: " + node);
        stack.pop();

        stack.print();

        System.out.println("Is Stack empty: " + stack.isEmpty());

        stack.pop();
        stack.pop();

        System.out.println("Is Stack empty: " + stack.isEmpty());
        stack.print();
    }

}
