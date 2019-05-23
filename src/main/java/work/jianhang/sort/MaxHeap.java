package work.jianhang.sort;

import org.junit.Assert;

/**
 * 最大堆实体类
 */
public class MaxHeap {
    private int[] data;
    private int count;
    private int capacity;

    public MaxHeap() {
    }

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        data = new int[capacity +1];
        count = 0;
    }

    public MaxHeap(int[] data) {
        this.data = data;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void insert(int item) {
        Assert.assertTrue(count +1 <= capacity);
        data[count+1] = item;
        count++;
        shiftUp(count);
    }

    public int extractMax() {
        Assert.assertTrue(count > 0);
        int ret = data[1];
        swap(data, 1, count);
        count--;
        shiftDown(1);
        return ret;
    }

    private void shiftUp(int k) {
        while (k > 1 && data[k/2] < data[k]) {
            swap(data, k/2, k);
            k /= 2;
        }
    }

    private void shiftDown(int k) {
        // 有子节点
        while (2*k <= count) {
            int j = 2*k;// 在此轮循环中，data[k]和data[j]交换位置
            // 是否存在右子节点，并且右子节点大于左子节点
            if (j +1 <= count && data[j+1] > data[j]) {
                j = j+1;
            }
            // 父节点的数据是否大于子节点的数据
            if (data[k] >= data[j]) {
                break;
            }
            swap(data, k, j);
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
