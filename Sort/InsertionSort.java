package Sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        insertSort(arr);
    }

    private static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("排序结果:");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
