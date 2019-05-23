package work.jianhang.sort;

/**
 * 堆排序
 */
public class HeapSort extends SortTestHelper {

    @Override
    void sort(int[] arr, int n) {
        MaxHeap maxHeap = new MaxHeap(n);
        for (int i=0; i<n; i++) {
            maxHeap.insert(arr[i]);
        }

        for (int i=n-1; i>=0; i--) {
            arr[i] = maxHeap.extractMax();
        }
    }
}
