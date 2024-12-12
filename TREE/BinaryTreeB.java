package TREE;

public class BinaryTreeB {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
         static int idx= -1;

         public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]== -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
         }
    }

    public static Node addNode(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = addNode(root.left, value);
        } else if (value > root.data) {
            root.right = addNode(root.right, value);
        }
        return root;
    }

    public static Node deleteNode(Node root, int value) {
        if (root == null) {
            return null;
        }
        if (value < root.data) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.data) {
            root.right = deleteNode(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = findMin(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    public static int findMin(Node root) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    public static boolean searchNode(Node root, int value) {
        if (root == null) {
            return false;
        }
        if (value == root.data) {
            return true;
        }
        return value < root.data ? searchNode(root.left, value) : searchNode(root.right, value);
    }



    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BinaryTree.buildTree(nodes);

        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
    }
}
