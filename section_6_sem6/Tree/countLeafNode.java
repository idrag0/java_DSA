package Tree;
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class countLeafNode {
    // Function to count leaf nodes
    public static int countLeaf(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;


        return countLeaf(root.left) + countLeaf(root.right);
    }

    // Example usage
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Number of leaf nodes: " + countLeaf(root));
    }
}
