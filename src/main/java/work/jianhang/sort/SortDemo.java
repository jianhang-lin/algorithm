package work.jianhang.sort;

import work.jianhang.sort.selectionsort.SortTestHelper;

/**
 * 排序的Demo类
 */
public class SortDemo {

    public static void main(String[] args) {
        int n = 10000;
        Integer[] arr = SortTestHelper.generateRandomArray(n, 0, n);
        //selectionSort(arr, n);
        SortTestHelper.printArray(arr, n);
    }

}
