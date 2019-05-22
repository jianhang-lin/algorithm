package work.jianhang.sort;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * SortTestHelper的测试类
 */
class SortTestHelperTest {


    private int n = 10;
    private int[] randomArray = SortTestHelper.generateRandomArray(n, 1, 100);

    @Test
    void generateRandomArray() {
        System.out.println(Arrays.toString(randomArray));
        Assert.assertNotNull(randomArray);
    }

    @Test
    void int2Integer() {
        Integer[] integers = SortTestHelper.int2Integer(randomArray, n);
        Assert.assertNotNull(integers);
    }

    @Test
    void printArray() {
        Integer[] integers = SortTestHelper.int2Integer(randomArray, n);
        SortTestHelper.printArray(integers, n);
    }
}