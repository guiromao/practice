package co.gromao.practice.sort.bubble;

import java.util.Objects;

public class BubbleSort {

    public int[] sort(int[] array) {
        boolean isSorted = false;
        Integer max = null;

        while (!isSorted) {
            boolean hasSwitched = false;
            boolean hasHitMax = false;
            for (int i = 0; i < array.length - 1 && !hasHitMax; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    hasSwitched = true;
                }
                if (i + 2 == array.length || Objects.equals(max, array[i + 1])) {
                    max = array[i];
                    hasHitMax = true;
                }
            }
            if (!hasSwitched) {
                isSorted = true;
            }
        }

        return array;
    }

}
