package co.gromao.practice.sort.bubble;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int [] arr = { 6, 9, 12, 2, 22, 30, 1, 8, 77, 33 };

        arr = bubbleSort.sort(arr);

        Stream.of(arr).forEach(i -> System.out.print(Arrays.toString(i) + " "));
    }

}
