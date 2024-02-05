package TREE;

public class heightTree {
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

    // height of tree recursively
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftH = height(root.left);
        int rightH =height(root.right);

        return Math.max(leftH, rightH)+1;
    }

    // count of tree recursively
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftH = count(root.left);
        int rightH =count(root.right);

        return 1+leftH+rightH ;
    }

    //sum of nodes of tree recursively
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int sumLeft = sum(root.left);
        int SumRight =sum(root.right);

        return root.data+sumLeft+SumRight;
    }


    public static void main(String args[]){
        /*
                   1
                  / \
                2     3
               / \    / \
              4   5  6    7 
         */

        Node root= new Node(1);
        root.left= new Node(2);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right= new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of Tree = " +height(root));
        System.out.println("No of Nodes in Tree = " +count(root));
        System.out.println("Sum of Nodes in Tree = " +sum(root));


    }
}
