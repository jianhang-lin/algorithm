package work.jianhang.sort;

public class ShellSort extends SortTestHelper {

    /**
     * 把记录按下标的一定增量分组，对每组使用直接插入排序算法排序；
     * 随着增量逐渐减少，每组包含的关键词越来越多，当增量减至1时，整个文件恰被分成一组，算法便终止.
     * @param arr 数组
     * @param n 数组的个数
     */
    @Override
    void sort(int[] arr, int n) {
        int d = n;
        while (Boolean.TRUE) {
            d = d/2;
            for (int x=0; x<d; x++) {
                for (int i=x+d; i<n; i=i+d) {
                    int e = arr[i];
                    int j;
                    for (j=i-d;j>=0 && arr[j] > e; j=j-d) {
                        arr[j+d] = arr[j];
                    }
                    arr[j+d] = e;
                }
            }
            if (d == 1) {
                break;
            }
        }
    }
}
