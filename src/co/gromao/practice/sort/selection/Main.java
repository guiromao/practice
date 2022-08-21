package co.gromao.practice.sort.selection;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int [] arr = { 9, 2, 7, 11, 4, 33, 22, 0, 4 };

        selectionSort.sort(arr);

        Stream.of(arr).forEach(i -> System.out.print(Arrays.toString(i) + " "));
    }

}
