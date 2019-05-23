package work.jianhang.sort;

/**
 * 自底向上的归并排序
 */
public class MergeSortBU extends MergeSort {

    @Override
    void sort(int[] arr, int n) {
        for (int sz=1; sz<=n; sz+=sz) {
            for (int i=0; i+sz<n; i+=sz+sz) {
                // 对arr[i,...,i+sz-1]和arr[i+sz,...,i+2*sz-1]进行归并排序
                merge(arr, i, i+sz-1, min(i+sz+sz-1, n-1));
            }
        }
    }

    private int min(int a, int b) {
        return a < b? a : b;
    }
}
