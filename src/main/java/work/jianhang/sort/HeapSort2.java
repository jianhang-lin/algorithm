package work.jianhang.sort;

/**
 * 原地堆排序
 */
public class HeapSort2 extends SortTestHelper {

    @Override
    void sort(int[] arr, int n) {
        // 通过heapify操作，构建数组成为一个最大堆
        for (int i=(n-1)/2; i>=0; i--) {
            shiftDown(arr, n, i);
        }

        for (int i=n-1; i>0; i--) {
            swap(arr, 0, i);// 把当前最大值放到合适的位置
            shiftDown(arr, i, 0);
        }
    }

    /**
     * 数组arr的n个元素的堆，向下移动索引k找到合适的位置
     * @param arr 数组
     * @param n 元素个数
     * @param k 索引
     */
    private void shiftDown(int[] arr, int n, int k) {
        while (2*k+1 < n) {// 索引从0开始计算，左子节点索引2k+1小于n，即表示不越界
            int j = 2*k + 1;// 在此轮循环中，arr[k]和arr[j]交换位置
            // 是否存在右子节点，并且右子节点大于左子节点
            if (j + 1 < n && arr[j+1] > arr[j]) {
                j = j+1;
            }
            // 父节点的数据是否大于子节点的数据
            if (arr[k] >= arr[j]) {
                break;
            }
            swap(arr, k, j);
            k=j;
        }
    }
}
