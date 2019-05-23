package work.jianhang.sort;

import java.util.Random;

/**
 * 改进的快速排序
 */
class QuickSort2 extends QuickSort {

    /**
     * 避免退化成O(n^2)的效率
     * @param arr 数组
     * @param l 最先的位置
     * @param r 最后的位置
     * @return int
     */
    @Override
    int partition(int[] arr, int l, int r) {
        Random random = new Random();
        swap(arr, l, random.nextInt(r-l+1) + l);
        int v = arr[l];

        // arr[l+1,...,i] <= v; arr[j,...,r] >= v
        int i=l+1, j = r;
        while (Boolean.TRUE) {
            while (i <=r && arr[i] < v) {
                i++;
            }
            while (j >= l+1 && arr[j] > v) {
                j--;
            }
            if (i>j) {
                break;
            }
            swap(arr, i,j);
            i++;
            j--;
        }
        swap(arr, l, j);
        return j;
    }
}
