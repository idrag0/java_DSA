package Tree;
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class mirrorImage {
    // Function to create mirror image of a binary tree
    public static Node mirror(Node root) {
        if (root == null)
            return null;
        // Swap left and right children
        Node temp = root.left;
        root.left = mirror(root.right);
        root.right = mirror(temp);
        return root;
    }

    // Utility function to print inorder traversal
    public static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Example usage
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Inorder of original tree:");
        inorder(root);

        mirror(root);

        System.out.println("\nInorder of mirror image:");
        inorder(root);
    }
}
