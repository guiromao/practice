package co.gromao.practice.reversestring;

public class ReverseString {

    public static void main(String[] args) {
        String str1 = "Yeah, baby, yeah! Groovy! We all live in a yellow submarine. Oh yes we do. Oh yes we do!";
        String str2 = "Sargent Pepper's Lonely Heart Band Club. Yeah, do you care for a little bit of good music? " +
                "Hop in. You're in for a treat. Get in the disco. Get in the groove. Tap that foot. Mark that rhythm. " +
                "Let it flow. Let it go. Now you're in the music. Now you're the music. Oh yeah, let's get this reversed," +
                " baby.";
        long tagTime;

        tagTime = System.currentTimeMillis();
        System.out.println(reverseString(str1) + " | in " + (System.currentTimeMillis() - tagTime) + " ms");

        tagTime = System.currentTimeMillis();
        System.out.println(reverseStringEasyWay(str1) + " | in " + (System.currentTimeMillis() - tagTime) + " ms");

        tagTime = System.currentTimeMillis();
        System.out.println(reverseString(str2) + " | in " + (System.currentTimeMillis() - tagTime) + " ms");

        tagTime = System.currentTimeMillis();
        System.out.println(reverseStringEasyWay(str2) + " | in " + (System.currentTimeMillis() - tagTime) + " ms");

        // All show 0 (zero) ms
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
