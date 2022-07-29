package co.gromao.practice.mergesortedarrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int [] x = {0, 1, 5, 8, 11, 20};
        int [] y = {4, 5, 7, 9, 18, 22};

        int [] result = mergeSortedArrays(x, y);

        for (int i: result) {
            System.out.print(i + " ");
        }
    }

    private static int [] mergeSortedArrays(int[] arr1, int[] arr2) {
        int combinedLength = arr1.length + arr2.length;
        int [] result = new int [combinedLength];

        for (int i = 0, j = 0; i + j < combinedLength; ) {
            if (i < arr1.length && arr1[i] < arr2[j]) {
                result[i + j] = arr1[i++];
            } else {
                result[i + j] = arr2[j++];
            }
        }

        return result;
    }

}
