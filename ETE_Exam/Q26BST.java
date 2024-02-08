package ETE_Exam;

import TREE.Traversal.inoder_tree;

public class Q26BST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        //inset elemnt
        public static Node insertT(Node root, int data){
        if(root==null){
            root = new Node(data);
            return root;
        }

        if(root.data > data){
            // left subtree
            root.left = insertT(root.left, data);
        }
        else{
            //right subtree
            root.right = insertT(root.right,data);
        }

        return root;
    }

    //search in BST
    public static boolean searchBSt(Node root,int key){

        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data>key){
           return searchBSt(root.left, key);
        }
        else{
            return searchBSt(root.right, key);
        }
    }

    public static void inoderPrint(Node root){
        if(root == null){
            return;
        }

        inoderPrint(root.left);
        System.out.print(root.data+" ");
        inoderPrint(root.right);
    }

    }
    public static void main(String[] args) {
        Node root = null;
        root = Node.insertT(root, 10);
        root = Node.insertT(root, 20);
        root = Node.insertT(root, 30);
        root = Node.insertT(root, 40);
        root = Node.insertT(root, 50);
        root = Node.insertT(root, 60);
        root = Node.insertT(root, 70);
        root = Node.insertT(root, 80);
        root = Node.insertT(root, 90);
        root = Node.insertT(root, 100);

        inoderPrint(root);
    }


}
