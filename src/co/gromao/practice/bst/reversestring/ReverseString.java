package co.gromao.practice.bst.reversestring;

public class ReverseString {

    public static void main(String[] args) {
        String str = "astronautics";
        System.out.println(reverseStringRecursively(str));
    }

    private static String reverseStringRecursively(String str) {
        if (str.length() == 1) {
            return "" + str.charAt(0);
        }

        return str.charAt(str.length() - 1) + reverseStringRecursively("" + str);
    }

    private static String reverseStringIteratively(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }

        return stringBuilder.toString();
    }

}
