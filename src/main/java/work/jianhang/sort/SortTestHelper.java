package work.jianhang.sort;

import org.junit.Assert;

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
     * @return Integer[]
     */
    public static int[] generateRandomArray(int n, int rangeL, int rangeR) {
        Assert.assertTrue(rangeL <= rangeR);
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i=0; i<n; i++) {
            arr[i] = rand.nextInt(rangeR) + rangeL;
        }
        return arr;
    }

    /**
     * 把int类型的数组转换成Intege类型的数组
     * @param arr int类型的数组
     * @param n 数组的个数
     * @return Intege类型的数组
     */
    public static Integer[] int2Integer(int[] arr, int n) {
        Integer[] integers = new Integer[n];
        for (int i=0; i<n; i++) {
            integers[i] = arr[i];
        }
        return integers;
    }

    /**
     * 打印出随机数组的数据
     * @param arr 随机数组
     * @param n 数组的个数
     * @param <T> 泛型
     */
    public static <T> void printArray(T[] arr, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb.toString());
    }

    /**
     * 用来测试一个排序的算法
     * @param sortName 排序算法的名称
     * @param arr 数组
     * @param n 元素的个数
     * @param <T> 泛型
     */
    static <T> void testSort(String sortName, T[] arr, int n) {
        Long startTime = System.currentTimeMillis();
        //sort(arr, n);
        Long endTime = System.currentTimeMillis();

        System.out.println(sortName + " : " + (endTime - startTime) / 1000 + " s");
    }

    /**
     * 判断数组是否排序成功的
     * @param arr 数组
     * @param n 元素的个数
     * @return boolean
     */
    static boolean isSorted(int[] arr, int n) {
        for (int i=0; i<n-1; i++) {
            if (arr[i] > arr[i+1]) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}
