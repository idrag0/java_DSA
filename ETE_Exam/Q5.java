package ETE_Exam;

import java.util.*;

import search_Sort.binary_search;
public class Q5 {
    static class Node{
        char data;
        Node left;
        Node right;

        public Node(char data){
            this.data = data;
            this.left= null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int index=-1;

        //creating tree
        public static Node buildTree(char node[]){
            index++;

            if(node[index] ==' '){
                return null;
            }

            Node newNode = new Node(node[index]);
            newNode.left= buildTree(node);
            newNode.right=buildTree(node);

            return newNode;
        }
    }

    public static void main(String args[]){
        try{
            char[] ch= {'/','-','a',' ',' ','b','+','*','c',' ',' ','d',' ',' ','e'};
            BinaryTree tree = new BinaryTree();
            Node root = BinaryTree.buildTree(ch);

            System.out.println(root.data);
        }catch(Exception e){
            e.getStackTrace();
        }

    }
}
