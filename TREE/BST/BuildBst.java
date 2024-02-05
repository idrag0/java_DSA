package TREE.BST;

public class BuildBst {
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

    //deleate Node of BST
    public static Node delete(Node root,int data){
        if(root.data < data){
            root.right = delete(root.right, data);
        }
        else if(root.data > data){
            root.left = delete(root.left, data);
        }else{// root.data == data
            // voila
            //case 1 - leaf node
            if(root.left == null & root.right == null){
                return null;
            }

            //case 2 - single child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case 3 - Both children
            Node IS = findInoderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
            
        }
        return root;
    }

    //helper
    public static Node findInoderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;
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



    public static void main(String[] args) {
        int val[]={ 1,6,3,2,5,4};
        Node root= null;
        
        for(int i=0;i<val.length;i++){
            root = insert(root, val[i]);
        }

        inoder(root);
        System.out.println();

        delete(root, 6);

        inoder(root);
    }
}
