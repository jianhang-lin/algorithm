package work.jianhang.sort;

/**
 * 归并排序
 */
public class MergeSort extends SortTestHelper {

    @Override
    void sort(int[] arr, int n) {
        sort(arr, 0, n-1);
    }

    /**
     * 递归使用归并排序，对arr[l,...,r]的范围进行排序
     * @param arr 数组
     * @param l 最开始的位置
     * @param r 最后的位置
     */
    void sort(int[] arr, int l, int r) {

    }
}
