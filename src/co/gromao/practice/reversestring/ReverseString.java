package co.gromao.practice.reversestring;

public class ReverseString {

    public static void main(String[] args) {
        String str1 = "Yeah, baby, yeah! Groovy!";
        String str2 = "Sargent Pepper's Lonely Heart Band Club";

        System.out.println(reverseString(str1));
        System.out.println(reverseStringEasyWay(str1));
        System.out.println(reverseString(str2));
        System.out.println(reverseStringEasyWay(str2));
    }

    private static String reverseString(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }

        return stringBuilder.toString();
    }

    private static String reverseStringEasyWay(String str) {
        return new StringBuffer(str).reverse().toString();
    }

}
