package work.jianhang.sort;

import org.junit.jupiter.api.Test;

class InsertionSortTest {

    private int n = 10;
    private int[] randomArray = SortTestHelper.generateRandomArray(n, 1, 100);

    @Test
    void sort() {
        BaseSort sort = new InsertionSort();
        sort.sort(randomArray, n);
        Integer[] integers = SortTestHelper.int2Integer(randomArray, n);
        SortTestHelper.printArray(integers, n);
    }
}