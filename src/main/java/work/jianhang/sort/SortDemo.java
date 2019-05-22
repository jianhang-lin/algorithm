package work.jianhang.sort;

/**
 * 排序的Demo类
 */
public class SortDemo {

    public static void main(String[] args) {
        int n = 100000;
        int[] arr = SortTestHelper.generateRandomArray(n, 0, n);
        int[] arr2 = SortTestHelper.copyIntArray(arr, n);
        int[] arr3 = SortTestHelper.copyIntArray(arr, n);

        SortTestHelper selectionSort = new SelectionSort();
        selectionSort.testSort("Selection Sort", arr, n);

        SortTestHelper insertionSort = new InsertionSort();
        insertionSort.testSort("Insertion Sort", arr2, n);

        SortTestHelper bubbleSort = new BubbleSort();
        bubbleSort.testSort("Bubble Sort", arr3, n);
    }

}
