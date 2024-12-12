package TREE;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int[] diameter = new int[1];
        height(root, diameter);
        return diameter[0];
    }

    int height(Node node, int[] diameter) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left, diameter);
        int rightHeight = height(node.right, diameter);

        diameter[0] = Math.max(diameter[0], leftHeight + rightHeight + 1);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("The diameter of given binary tree is : " + tree.diameter(tree.root));
    }
}
