package work.jianhang.sort;

/**
 * 排序的基类
 */
abstract class BaseSort {

    /**
     * 排序的实际算法实现逻辑
     * @param arr 数组
     * @param n 元素的个数
     */
    abstract void sort(int[] arr, int n);
}
