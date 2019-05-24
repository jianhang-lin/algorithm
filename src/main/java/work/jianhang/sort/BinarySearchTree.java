package work.jianhang.sort;

/**
 * 二分搜索树
 */
public class BinarySearchTree {

    private Node[] root;
    private int count;

    public BinarySearchTree() {
        root = null;
        count = 0;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public Node[] getRoot() {
        return root;
    }

    public void setRoot(Node[] root) {
        this.root = root;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    class Node {
        private Object key;
        private Object value;
        Node[] left;
        Node[] right;

        public Node(Object key, Object value) {
            this.key = key;
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public Object getKey() {
            return key;
        }

        public void setKey(Object key) {
            this.key = key;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Node[] getLeft() {
            return left;
        }

        public void setLeft(Node[] left) {
            this.left = left;
        }

        public Node[] getRight() {
            return right;
        }

        public void setRight(Node[] right) {
            this.right = right;
        }
    }
}
