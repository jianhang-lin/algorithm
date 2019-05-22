package work.jianhang.sort;

/**
 * 排序的Demo类
 */
public class SortDemo {

    public static void main(String[] args) {
        int n = 10000;
        int[] arr = SortTestHelper.generateRandomArray(n, 0, n);
        Sort.selectionSort(arr, n);
        Integer[] arrInteger = SortTestHelper.int2Integer(arr, n);
        SortTestHelper.printArray(arrInteger, n);
    }

}
