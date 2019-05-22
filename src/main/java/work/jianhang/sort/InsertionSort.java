package work.jianhang.sort;

/**
 * 插入排序
 */
public class InsertionSort extends SortTestHelper {

    /**
     * 将一个int类型的数组从小到大进行排序
     * @param arr 数组
     * @param n 数组的个数
     */
    @Override
    void sort(int[] arr, int n) {
        for (int i=1; i<n; i++) {
            // 寻找元素arr[i]合适的插入位置
            for (int j=i; j>0 && arr[j] < arr[j-1]; j--) {
                swap(arr, j, j-1);
            }
        }
    }
}
