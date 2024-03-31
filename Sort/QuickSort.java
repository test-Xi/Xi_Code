package Sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 6, 2, 1};
        qickSort(arr, 0, arr.length - 1);
    }

    private static void qickSort(int[] arr, int i, int j) {
        //当排序只剩一个数时,停止递归
        if (i >= j) {
            return;
        }
        int start = i;
        int end = j;
        int standard = arr[i];
        while (start != end) {
            //从右向左找寻少于标准的数
            while (true) {
                if (end <= start || arr[end] < standard) {
                    break;
                }
                end--;
            }
            //从左向右寻找大于标准的数
            while (true) {
                if (start >= end || arr[start] > standard) {
                    break;
                }
                start++;
            }
            //交换不满足的数
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //将标准数放入数组中
        arr[i] = arr[end];
        arr[end] = standard;

        //分别排序基准数左右两侧的数
        qickSort(arr, i, end - 1);
        qickSort(arr, start + 1, j);
    }
}
