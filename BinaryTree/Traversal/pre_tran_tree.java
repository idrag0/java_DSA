package BinaryTree.Traversal;

public class pre_tran_tree {
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
         public static void preOder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preOder(root.left);
            preOder(root.right);
         }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = tree.buildTree(nodes);

        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);

        tree.preOder(root);
}
}