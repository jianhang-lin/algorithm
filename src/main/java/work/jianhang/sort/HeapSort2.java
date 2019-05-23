package work.jianhang.sort;

/**
 * 改进的堆排序
 */
public class HeapSort2 extends SortTestHelper {

    @Override
    void sort(int[] arr, int n) {
        MaxHeap maxHeap = new MaxHeap(arr, n);

        for (int i=n-1; i>=0; i--) {
            arr[i] = maxHeap.extractMax();
        }
    }
}
