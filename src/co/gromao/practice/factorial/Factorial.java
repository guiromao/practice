package co.gromao.practice.factorial;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorialIterative(5));
        System.out.println(factorialRecursive(5));

        System.out.println();

        System.out.println(factorialIterative(10));
        System.out.println(factorialRecursive(10));
    }

    private static int factorialRecursive(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorialRecursive(number - 1);
    }

    private static int factorialIterative(int number) {
        int result = number;

        for (int i = number - 1; i > 1; i--) {
            result *= i;
        }

        return result;
    }

}
