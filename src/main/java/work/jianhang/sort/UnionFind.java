package work.jianhang.sort;

import org.junit.Assert;

/**
 * 并查集
 */
public class UnionFind {

    private int[] id;
    private int count;

    public UnionFind(int n) {
        count = n;
        id = new int[n];
        for (int i=0; i<n; i++) {
            id[i] = i;
        }
    }

    public int find(int p) {
        Assert.assertTrue(p >= 0 && p < count);
        return id[p];
    }

    boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    public void unionElements(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        if (pId == qId) {
            return;
        }
        for (int i=0; i<count; i++) {
            if (id[i] == pId) {
                id[i] = qId;
            }
        }
    }

    public int[] getId() {
        return id;
    }

    public void setId(int[] id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
