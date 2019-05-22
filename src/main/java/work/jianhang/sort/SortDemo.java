package work.jianhang.sort;

/**
 * 排序的Demo类
 */
public class SortDemo {

    public static void main(String[] args) {
        int n = 10000;
        int[] arr = SortTestHelper.generateRandomArray(n, 0, n);
//        SelectionSort selectionSort = new SelectionSort();
//        selectionSort.sort(arr, n);
//        Integer[] arrInteger = SortTestHelper.int2Integer(arr, n);
//        SortTestHelper.printArray(arrInteger, n);

        SortTestHelper s = new SelectionSort();
        s.testSort("Selection Sort", arr, n);
    }

}
