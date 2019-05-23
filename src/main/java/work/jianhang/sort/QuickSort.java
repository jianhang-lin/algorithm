package work.jianhang.sort;

/**
 * 快速排序
 */
class QuickSort extends SortTestHelper {

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
//        if (l >= r) {
//            return;
//        }

        if (r-l <= 15) {
            InsertionSort insertionSort = new InsertionSort();
            insertionSort.sort(arr, l, r);
            return;
        }

        int p = partition(arr, l, r);
        quickSort(arr, l, p-1);
        quickSort(arr, p+1, r);
    }

    /**
     * 对arr[l,...,r]部分进行partition操作
     * @param arr 数组
     * @param l 最先的位置
     * @param r 最后的位置
     * @return 返回p，使得arr[l,...,p-1]的每个数据都小于arr[p]，而arr[p+1,...,r] >的每个数据都大于arr[p]
     */
    private int partition(int[] arr, int l, int r) {
        int v = arr[l];
        // arr[l+1,...,j] < v; arr[j+1,...,i) > v
        int p = l;
        for (int i=l+1; i<=r; i++) {
            if (arr[i] < v) {
                swap(arr, p+1, i);
                p++;
            }
        }
        swap(arr, l, p);
        return p;
    }
}
