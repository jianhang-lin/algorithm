package work.jianhang.sort;

/**
 * 冒泡排序
 */
public class BubbleSort extends SortTestHelper {

    /**
     * 原理如下：
     * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
     * 针对所有的元素重复以上的步骤，除了最后一个。
     * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     *
     * @param arr 数组
     * @param n 数组的个数
     */
    @Override
    void sort(int[] arr, int n) {
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-i-1;j++) { // -1是为了防止溢出
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }
}
