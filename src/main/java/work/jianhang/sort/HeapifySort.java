package work.jianhang.sort;

/**
 * 改进的堆排序：Heapify算法
 */
public class HeapifySort extends SortTestHelper {

    @Override
    void sort(int[] arr, int n) {
        MaxHeap maxHeap = new MaxHeap(arr, n);

        for (int i=n-1; i>=0; i--) {
            arr[i] = maxHeap.extractMax();
        }
    }
}
