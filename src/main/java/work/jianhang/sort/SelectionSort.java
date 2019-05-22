package work.jianhang.sort;

/**
 * 选择排序
 */
class SelectionSort extends SortTestHelper{

    /**
     * 将一个int类型的数组从小到大进行排序
     * @param arr 数组
     * @param n 数组的个数
     */
    @Override
    void sort(int[] arr, int n) {
        for (int i=0; i<n; i++) {
            // 寻找[i,n)区间里的最小值
            int minIndex = i;
            for (int j=i+1; j<n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            swap(arr, i, minIndex);

        }
    }

}
