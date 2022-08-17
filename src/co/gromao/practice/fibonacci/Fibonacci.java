package co.gromao.practice.fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Iterative");
        for (int i = 0; i < 20; i++) {
            System.out.print(fibonacciIterative(i) + " ");
        }
        System.out.println("\n\nRecursive:");
        for (int i = 0; i < 20; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
    }

    private static int fibonacciIterative(int index) {
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }

        int firstElement = 0;
        int secondElement = 1;
        int result = firstElement + secondElement;

        for (int counter = 3; counter <= index; counter++) {
            firstElement = secondElement;
            secondElement = result;
            result = firstElement + secondElement;
        }

        return result;
    }

    private static int fibonacciRecursive(int index) {
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        return fibonacciRecursive(index - 1) + fibonacciRecursive(index - 2);
    }

}
