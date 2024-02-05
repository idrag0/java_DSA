package TREE.BST;

public class searchBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            // this.left=null;
            // this.right=null;
        }
    }

    public static Node insert(Node root, int data){
        if(root==null){
            root = new Node(data);
            return root;
        }

        if(root.data > data){
            // left subtree
            root.left = insert(root.left, data);
        }
        else{
            //right subtree
            root.right = insert(root.right,data);
        }

        return root;
    }

    // in-Oder
    public static void inoder(Node root){
        if(root == null){
            return ;
        }
        inoder(root.left);
        System.out.print(root.data+" ");
        inoder(root.right);
    }

    //search in BST
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data>key){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    }

    public static void main(String[] args) {
        int val[]={ 1,6,3,2,5,4};
        Node root= null;
        
        for(int i=0;i<val.length;i++){
            root = insert(root, val[i]);
        }

        inoder(root);
        System.out.println();

        if(search(root,4)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
}
