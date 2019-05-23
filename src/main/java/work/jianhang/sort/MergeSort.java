package work.jianhang.sort;

/**
 * 归并排序
 */
public class MergeSort extends SortTestHelper {

    @Override
    void sort(int[] arr, int n) {
        mergeSort(arr, 0, n-1);
    }

    /**
     * 递归使用归并排序，对arr[l,...,r]的范围进行排序
     * @param arr 数组
     * @param l 最开始的位置
     * @param r 最后的位置
     */
    private void mergeSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int mid = (l+r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }

    /**
     * 将arr[l,...,mid]和arr[mid+1,...,r]两部分进行归并
     * @param arr 数组
     * @param l 最开始的位置
     * @param mid 中间的位置
     * @param r 最后的位置
     */
    private void merge(int[] arr, int l, int mid, int r) {
        int[] aux = new int[r-l+1];
        for (int i=l; i<=r; i++) {
            aux[i-l] = arr[i];
        }

        int i = l;
        int j = mid +1;
        for (int k = l; k<=r; k++) {
            if (i > mid) {
                arr[k] = aux[j-l];
                j++;
            } else if (j > r) {
                arr[k] = aux[i-l];
                i++;
            } else if (aux[i-l] < aux[j-l]) {
                arr[k] = aux[i-l];
                i++;
            } else {
                arr[k] = aux[j-l];
                j++;
            }
        }
    }
}
