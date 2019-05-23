package work.jianhang.sort;

/**
 * 快速排序
 */
public class QuickSort extends SortTestHelper {

    @Override
    void sort(int[] arr, int n) {
        quickSort(arr, 0, n-1);
    }

    /**
     * 对arr[l,...,r]部分进行快速排序
     * @param arr 数组
     * @param l 最先的位置
     * @param r 最后的位置
     */
    private void quickSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int p = partition(arr, l, r);
        quickSort(arr, l, p-1);
        quickSort(arr, p+1, r);
    }

    private int partition(int[] arr, int l, int r) {
        return 0;
    }
}
