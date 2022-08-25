package co.gromao.practice.sort.insertion;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int [] arr = {8, 12, 1, 3, 9, 23, 14, 5};

        arr = insertionSort.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

}
