package co.gromao.practice.bst.reversestring;

public class ReverseString {

    public static void main(String[] args) {
        String str = "astronautics";
        System.out.println(reverseStringRecursively(str, str.length()));
    }

    private static String reverseStringRecursively(String str, int length) {
        if (length - 1 == 0) {
            return "" + str.charAt(0);
        }

        return str.charAt(length - 1) + reverseStringRecursively(str, length - 1);
    }

    private static String reverseStringIteratively(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }

        return stringBuilder.toString();
    }

}
