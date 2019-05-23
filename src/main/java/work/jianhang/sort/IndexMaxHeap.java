package work.jianhang.sort;

import org.junit.Assert;

/**
 * 索引最大堆实体类
 */
public class IndexMaxHeap {
    private int[] data;
    private int[] indexes;
    private int[] reverse; // 表示索引i在indexes(堆)中的位置
    private int count;
    private int capacity;

    public IndexMaxHeap() {
    }

    public IndexMaxHeap(int capacity) {
        this.capacity = capacity;
        data = new int[capacity + 1];
        indexes = new int[capacity + 1];
        reverse = new int[capacity + 1];
        for (int i=0; i<=capacity; i++) {
            reverse[i] = 0; // 表示i这个索引在堆中不存在
        }
        count = 0;
    }

    public IndexMaxHeap(int[] data) {
        this.data = data;
    }

    public IndexMaxHeap(int[] arr, int n) {
        data = new int[n+1];
        capacity = n;
        for (int i=0; i<n; i++) {
            data[i+1] = arr[i];
        }
        count = n;

        // 从第一个不是叶子节点的节点开始调整
        for (int i = count/2; i>=1; i--) {
            shiftDown(i);
        }
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    // 传入的i对用户而言，是从0索引的
    public void insert(int i, int item) {
        Assert.assertTrue(i + 1 >= 1 && i + 1 <= capacity);
        Assert.assertTrue(count +1 <= capacity);
        i += 1;
        data[i] = item;
        indexes[count + 1] = i;
        reverse[i] = count + 1;
        count++;
        shiftUp(count);
    }

    public int extractMax() {
        Assert.assertTrue(count > 0);
        int ret = data[indexes[1]];
        swap(indexes, 1, count);
        reverse[indexes[1]] = 1;
        reverse[indexes[count]] = 0;
        count--;
        shiftDown(1);
        return ret;
    }

    public int extractMaxIndex() {
        Assert.assertTrue(count > 0);
        int ret = indexes[1] - 1; // 从内部1开始的索引转成外部从0开始的索引
        swap(indexes, 1, count);
        reverse[indexes[1]] = 1;
        reverse[indexes[count]] = 0;
        count--;
        shiftDown(1);
        return ret;
    }

    public int getItem(int i) {
        Assert.assertTrue(contain(i));
        return data[i+1];
    }

    public void change(int i, int newItem) {
        Assert.assertTrue(contain(i));
        i += 1;
        data[i] = newItem;
        // 找到indexes[j] = i，j表示data[i]在堆中的位置
        // 之后shiftUp(j)和shiftDown(j)
//        for (int j=1; j <= count; j++) {
//            if (indexes[j] == i) {
//                shiftUp(j);
//                shiftDown(j);
//                return;
//            }
//        }
        int j = reverse[i];
        shiftUp(j);
        shiftDown(j);
    }

    private boolean contain(int i) {
        Assert.assertTrue(i + 1 >= 1 && i +1 <= capacity);
        return reverse[i+1] != 0;
    }

    private void shiftUp(int k) {
        while (k > 1 && data[indexes[k/2]] < data[indexes[k]]) {
            swap(indexes, k/2, k);
            reverse[indexes[k/2]] = k/2;
            reverse[indexes[k]] = k;
            k /= 2;
        }
    }

    private void shiftDown(int k) {
        // 有子节点
        while (2*k <= count) {
            int j = 2*k;// 在此轮循环中，data[k]和data[j]交换位置
            // 是否存在右子节点，并且右子节点大于左子节点
            if (j +1 <= count && data[indexes[j+1]] > data[indexes[j]]) {
                j = j+1;
            }
            // 父节点的数据是否大于子节点的数据
            if (data[indexes[k]] >= data[indexes[j]]) {
                break;
            }
            swap(indexes, k, j);
            reverse[indexes[k]] = k;
            reverse[indexes[j]] = j;
            k=j;
        }
    }

    private int[] swap(int[] ints, int x, int y) {
        int temp = ints[x];
        ints[x] = ints[y];
        ints[y] = temp;
        return ints;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int[] getIndexes() {
        return indexes;
    }

    public void setIndexes(int[] indexes) {
        this.indexes = indexes;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
