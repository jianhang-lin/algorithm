package work.jianhang.sort;

import org.junit.Assert;

/**
 * 并查集
 */
public class UnionFind2 {

    private int[] parent;
    private int count;

    public UnionFind2(int n) {
        count = n;
        parent = new int[n];
        for (int i=0; i<n; i++) {
            parent[i] = i;
        }
    }

    public int find(int p) {
        Assert.assertTrue(p >= 0 && p < count);
        while (p != parent[p]) {
            p = parent[p];
            break;
        }
        return p;
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    public void unionElements(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) {
            return;
        }
        parent[pRoot] = qRoot;
    }

    public int[] getParent() {
        return parent;
    }

    public void setParent(int[] parent) {
        this.parent = parent;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
