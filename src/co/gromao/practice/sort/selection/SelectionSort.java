package co.gromao.practice.sort.selection;

public class SelectionSort {

    public void sort(int [] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            int temp = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

}
