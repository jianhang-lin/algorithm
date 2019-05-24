package work.jianhang.sort;

/**
 * 二分搜索树
 */
public class BinarySearchTree {

    private Node root;
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

    public void insert(int key, int value) {
        root = insert(root, key, value);
    }

    public boolean contain(int key) {
        return contain(root, key);
    }

    public Object search(int key) {
        return search(root, key);
    }

    /**
     * 前序遍历
     */
    public void preOrder(){
        preOrder(root);
    }

    /**
     * 中序遍历
     */
    public void inOrder(){
        inOrder(root);
    }

    /**
     * 后序遍历
     */
    public void postOrder(){
        postOrder(root);
    }

    /**
     * 向以node为根的二叉搜索树中，插入节点(key, value)
     * 返回插入新节点后的二叉树搜索树的根
     * @param node 根节点
     * @param key 节点的key
     * @param value 节点的value
     * @return Node
     */
    private Node insert(Node node, int key, int value) {
        if (node == null) {
            count++;
            return new Node(key, value);
        }
        if (key == node.getKey()) {
            node.setValue(value);
        } else if (key < node.getKey()) {
            node.setLeft(insert(node.getLeft(), key, value));
        } else {
            node.setRight(insert(node.getRight(), key, value));
        }
        return node;
    }

    /**
     * 查看以node为根的二叉搜索树中是否包含键值为key的节点
     * @param node 根节点
     * @param key 键值
     * @return boolean
     */
    private boolean contain(Node node, int key) {
        if (node == null) {
            return Boolean.FALSE;
        }
        if (key == node.getKey()) {
            return Boolean.TRUE;
        } else if (key < node.getKey()) {
            return contain(node.getLeft(), key);
        } else {
            return contain(node.getRight(), key);
        }
    }

    /**
     * 在以node为根的二叉搜索树中查找key所对应的value
     * @param node 根节点
     * @param key 键值
     * @return int
     */
    private Object search(Node node, int key) {
        if (node == null) {
            return null;
        }
        if (key == node.getKey()) {
            return node.getValue();
        } else if (key < node.getKey()) {
            return search(node.getLeft(), key);
        } else {
            return search(node.getRight(), key);
        }
    }

    /**
     * 对以node为根的二叉搜索树进行前序遍历
     * @param node 根节点
     */
    private void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.getKey());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    /**
     * 对以node为根的二叉搜索树进行中序遍历
     * @param node 根节点
     */
    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.println(node.getKey());
            inOrder(node.getRight());
        }
    }

    /**
     * 对以node为根的二叉搜索树进行后序遍历
     * @param node 根节点
     */
    private void postOrder(Node node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getKey());
        }
    }

    /**
     * 二叉搜索树的空间释放
     * @param node 节点
     */
    private void destroy(Node node) {
        if(node != null) {
            destroy(node.getLeft());
            destroy(node.getRight());
            node = null;
            count--;
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    class Node {
        private int key;
        private int value;
        Node left;
        Node right;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
