package work.jianhang.sort;

import java.util.Random;

public class UnionFindTestHelper {
    public static void testUF1(int n) {
        UnionFind unionFind = new UnionFind(n);
        Long startTime = System.currentTimeMillis();
        Random random = new Random();
        for (int i=0; i<n; i++) {
            int a = random.nextInt(n);
            int b = random.nextInt(n);
            unionFind.unionElements(a, b);
        }
        for (int i=0; i<n; i++) {
            int a = random.nextInt(n);
            int b = random.nextInt(n);
            unionFind.isConnected(a, b);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("UF1, " +2*n + " ops, " + ((endTime - startTime) * 1.00) / 1000  + " s");
    }

    public static void testUF2(int n) {
        UnionFind2 unionFind2 = new UnionFind2(n);
        Long startTime = System.currentTimeMillis();
        Random random = new Random();
        for (int i=0; i<n; i++) {
            int a = random.nextInt(n);
            int b = random.nextInt(n);
            unionFind2.unionElements(a, b);
        }
        for (int i=0; i<n; i++) {
            int a = random.nextInt(n);
            int b = random.nextInt(n);
            unionFind2.isConnected(a, b);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("UF1, " +2*n + " ops, " + ((endTime - startTime) * 1.00) / 1000  + " s");
    }
}
