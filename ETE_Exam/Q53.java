package ETE_Exam;

public class Q53 {
    // Node class representing a node in the binary tree
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Function to perform preorder traversal of the binary tree
    static void preorderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    // Function to perform postorder traversal of the binary tree
    static void postorderTraversal(Node root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Function to perform inorder traversal of the binary tree
    static void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Perform traversals
        System.out.println("Preorder traversal:");
        preorderTraversal(root);

        System.out.println("\nPostorder traversal:");
        postorderTraversal(root);

        System.out.println("\nInorder traversal:");
        inorderTraversal(root);
    }
}
