package work.jianhang.sort;

import java.util.Random;

/**
 * 三路快速排序
 */
class QuickSort3Ways extends SortTestHelper {

    @Override
    void sort(int[] arr, int n) {
        quickSort3Ways(arr, 0, n-1);
    }

    /**
     * 对arr[l,...,r]部分进行快速排序
     * @param arr 数组
     * @param l 最先的位置
     * @param r 最后的位置
     */
    private void quickSort3Ways(int[] arr, int l, int r) {

        if (r-l <= 15) {
            InsertionSort insertionSort = new InsertionSort();
            insertionSort.sort(arr, l, r);
            return;
        }

        // partition
        Random random = new Random();
        swap(arr, l, random.nextInt(r-l+1) + l);
        int v = arr[l];

        int lt = l;// arr[l+1,...,lt] < v
        int gt = r+1;// arr[gt,...,r] > v
        int i = l+1;// arr[lt+1,...,i) == v
        while (i<gt) {
            if (arr[i]<v) {
                swap(arr, i, lt+1);
                lt++;
                i++;
            } else if (arr[i] > v) {
                swap(arr, i, gt-1);
                gt--;
            } else {
                // arr[i] == v
                i++;
            }
        }
        swap(arr, l, lt);

        quickSort3Ways(arr, l, lt-1);
        quickSort3Ways(arr, gt, r);
    }

}
