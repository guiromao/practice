package co.gromao.practice.firstrecurringcharacter;

import java.util.HashSet;
import java.util.Set;

public class FirstRecurringCharacter {

    public static void main(String[] args) {
        System.out.println(firstRecurringCharacter(new char[]{'e', 'k', '!', '&', 'e', 'h', 'j'}));
        System.out.println(firstRecurringCharacter(new char[]{'3', '4', '4', '1', '3', '9', '0'}));
        System.out.println(firstRecurringCharacter(new char[]{'+', '-', '*', '/', '.', '*', '-'}));
        System.out.println(firstRecurringCharacter(new char[]{'1', '2', '3', '4', '5', '6', '7'}));
    }

    private static Character firstRecurringCharacter(char[] charArray) {
        Set<Character> setChars = new HashSet<>();

        for (char ch: charArray) {
            if (setChars.contains(ch)) {
                return ch;
            }
            setChars.add(ch);
        }

        return null;
    }

}
