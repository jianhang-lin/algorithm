package work.jianhang.sort;

import org.junit.Assert;

/**
 * 最大堆
 */
public class MaxHeap<E> {
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

    private void shiftUp(int k) {
        while (k > 1 && data[k/2] < data[k]) {
            swap(data, k/2, k);
            k = k/2;
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
