package TREE.BST;

public class print_Kth {
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

    //Insertiion of element in this
    public static Node insert(Node root, int data){
        if(root==null){
            root = new Node(data);
            return root;
        }

        if(root.data > data){
            // left subtree
            root.left = insert(root.left,data);
        }
        else{
            //right subtree
            root.right = insert(root.right,data);
        }

        return root;
    }

    public static void printInRang(Node root, int k1, int k2){
        if(root == null){
            return;
        }

        if(root.data >= k1 && root.data <= k2){
            printInRang(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRang(root.right, k1, k2);
        }
        else if(root.data < k1){
            printInRang(root.left, k1, k2);
        }
        else{
            printInRang(root.right, k1, k2);
        }
    }
    

    public static void main(String[] args) {
        int val[]={ 1,6,3,2,5,4};
        Node root= null;
        
        for(int i=0;i<val.length;i++){
            root = insert(root, val[i]);
        }

        
        printInRang(root, 2, 5);
    }
}
