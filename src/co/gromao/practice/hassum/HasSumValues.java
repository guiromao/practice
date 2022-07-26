package co.gromao.practice.hassum;

import java.util.HashSet;
import java.util.Set;

/**
 * To discover whether an array has 2 values that will make up a given 'sum'
 */
public class HasSumValues {

    public static void main(String[] args) {
        int [] arrayOfInt = { 1, 4, 5, 8, 10, 12};
        boolean hasSum = hasValuesThatMakeSum(arrayOfInt, 13);
        System.out.println(hasSum);
    }

    private static boolean hasValuesThatMakeSum(int[] array, int sum) {
        Set<Integer> complements = new HashSet<>();

        for(int i: array) {
            if (complements.contains(sum - i)) {
                return true;
            }
            complements.add(i);
        }

        return false;
    }

}
