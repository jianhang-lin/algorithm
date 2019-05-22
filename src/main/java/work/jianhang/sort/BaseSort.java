package work.jianhang.sort;

/**
 * 排序的基类
 */
abstract class BaseSort {

    /**
     * 将一个int类型的数组从小到大进行排序
     * @param arr 数组
     * @param n 数组的个数
     */
    abstract void sort(int[] arr, int n);
}
