package co.gromao.practice.sort.selection;

public class SelectionSort {

    public void sort(int [] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int swapIndex = -1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    swapIndex = j;
                }
            }
            if (min != array[i]) {
                int temp = array[i];
                array[i] = min;
                array[swapIndex] = temp;
            }
        }
    }

}
