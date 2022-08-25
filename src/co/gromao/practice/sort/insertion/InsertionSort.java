package co.gromao.practice.sort.insertion;

public class InsertionSort {

    public int[] sort(int [] arr) {
        int [] result = new int[arr.length];
        result[0] = arr[0];

        for (int i = 1; i < result.length - 1; i++) {
            result[i] = Integer.MAX_VALUE;
        }

        for (int i = 1; i < arr.length; i++) {
            putValueInSortedArray(arr[i], result);
        }

        return result;
    }

    private void putValueInSortedArray(int number, int[] arr) {
        int index = findIndex(number, arr);

        unshiftFromIndex(arr, index + 1);
        arr[index] = number;
    }

    private void unshiftFromIndex(int[] arr, int index) {
        for (int i = arr.length - 1; i >= index; i--) {
            arr[i] = arr[i - 1];
        }
    }

    private int findIndex(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (number < arr[i]) {
                return i;
            }
        }

        return -1;
    }

}
