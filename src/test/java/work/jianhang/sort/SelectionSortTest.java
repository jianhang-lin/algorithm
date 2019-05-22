package work.jianhang.sort;

import org.junit.jupiter.api.Test;

class SelectionSortTest {

    private int n = 10;
    private int[] randomArray = SortTestHelper.generateRandomArray(n, 1, 100);

    @Test
    void sort() {
        SelectionSort.sort(randomArray, n);
        Integer[] integers = SortTestHelper.int2Integer(randomArray, n);
        SortTestHelper.printArray(integers, n);
    }
}