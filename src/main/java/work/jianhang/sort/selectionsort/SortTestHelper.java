package work.jianhang.sort.selectionsort;


import com.sun.tools.javac.util.Assert;

import java.util.Random;

/**
 * 定义辅助函数
 */
public class SortTestHelper {

    /**
     * 生成n个元素的随机数组，每个元素的随机范围为[rangeL, rangeR]
     * @param n 数组个数
     * @param rangeL 随机数组的最小值
     * @param rangeR 随机数组的最大值
     * @return int[]
     */
    public static int[] generateRandomArray(int n, int rangeL, int rangeR) {
        Assert.check(rangeL < rangeR);
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i=0; i<n; i++) {
            arr[i] = rand.nextInt(rangeR) + rangeL;
        }
        return arr;
    }

}
