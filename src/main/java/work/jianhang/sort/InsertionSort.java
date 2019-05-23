package work.jianhang.sort;

/**
 * 插入排序
 */
public class InsertionSort extends SortTestHelper {

    @Override
    void sort(int[] arr, int n) {
        for (int i=1; i<n; i++) {
            // 寻找元素arr[i]合适的插入位置
            int e = arr[i];
            int j;
            for (j=i; j>0 && arr[j-1] > e; j--) {
                arr[j] = arr[j-1];
            }
            arr[j] = e;
        }
    }

    /**
     * 将arr[l,...,r]范围的数组进行插入排序
     * @param arr 数组
     * @param l 最开始的位置
     * @param r 最后的位置
     */
    void sort(int[] arr, int l, int r) {
        for (int i=l+1; i<=r; i++) {
            int e = arr[i];
            int j;
            for (j=i; j>l && arr[j-1] > e; j--) {
                arr[j] = arr[j-1];
            }
            arr[j] = e;
        }
    }
}
