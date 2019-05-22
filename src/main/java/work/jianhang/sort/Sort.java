package work.jianhang.sort;

class Sort {

    /**
     * 选择排序:将一个int类型的数组从小到大进行排序
     * @param arr 数组
     * @param n 数组的个数
     */
    static void selectionSort(int[] arr, int n) {
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

    /**
     * 交换数组中两元素
     * @param ints 需要进行交换操作的数组
     * @param x 数组中的位置1
     * @param y 数组中的位置2
     * @return 交换后的数组
     */
    private static int[] swap(int[] ints, int x, int y) {
        int temp = ints[x];
        ints[x] = ints[y];
        ints[y] = temp;
        return ints;
    }

}
