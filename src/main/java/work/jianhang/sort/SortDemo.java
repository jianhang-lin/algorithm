package work.jianhang.sort;

import static work.jianhang.sort.SortTestHelper.copyIntArray;

/**
 * 排序的Demo类
 */
public class SortDemo {

    public static void main(String[] args) {
        int n = 50000;
        int[] arr = SortTestHelper.generateRandomArray(n, 0, n);
        int[] arr2 = copyIntArray(arr, n);
        int[] arr3 = copyIntArray(arr, n);
        int[] arr4 = copyIntArray(arr, n);
        int[] arr5 = copyIntArray(arr, n);
        int[] arr6 = copyIntArray(arr, n);
        int[] arr7 = copyIntArray(arr, n);
        int[] arr8 = copyIntArray(arr, n);
        int[] arr9 = copyIntArray(arr, n);
        int[] arr10 = copyIntArray(arr, n);
        int[] arr11 = copyIntArray(arr, n);
        int[] arr12 = copyIntArray(arr, n);

        System.out.println("Test for Random Array, size = " + n +", random range [" + 0 + ", " + n + "]");
        SortTestHelper selectionSort = new SelectionSort();
        selectionSort.testSort("Selection Sort", arr, n);

        SortTestHelper insertionSort = new InsertionSort();
        insertionSort.testSort("Insertion Sort", arr2, n);

        SortTestHelper bubbleSort = new BubbleSort();
        bubbleSort.testSort("Bubble Sort", arr3, n);

        SortTestHelper shellSort = new ShellSort();
        shellSort.testSort("ShellSort Sort", arr4, n);

        SortTestHelper mergeSort = new MergeSort();
        mergeSort.testSort("Merge Sort", arr5, n);

        SortTestHelper mergeSortBU = new MergeSortBU();
        mergeSortBU.testSort("Merge SortBU", arr6, n);

        SortTestHelper quickSort = new QuickSort();
        quickSort.testSort("Quick Sort", arr7, n);

        SortTestHelper quickSort2 = new QuickSort2();
        quickSort2.testSort("Quick Sort2", arr8, n);

        SortTestHelper quickSort3Ways = new QuickSort3Ways();
        quickSort3Ways.testSort("Quick Sort 3 Ways", arr9, n);

        SortTestHelper heapSort = new HeapSort();
        heapSort.testSort("Heap Sort", arr10, n);

        SortTestHelper heapifySort = new HeapifySort();
        heapifySort.testSort("Heapify Sort", arr11, n);

        SortTestHelper heapSort2 = new HeapSort2();
        heapSort2.testSort("Heap Sort 2", arr12, n);
    }

}
