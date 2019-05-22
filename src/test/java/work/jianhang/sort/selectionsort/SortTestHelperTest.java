package work.jianhang.sort.selectionsort;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * SortTestHelper的测试类
 */
class SortTestHelperTest {

    @Test
    void generateRandomArray() {
        int[] randomArray = SortTestHelper.generateRandomArray(10, 0, 100);
        System.out.println(Arrays.toString(randomArray));
        Assert.assertNotNull(randomArray);
    }
}