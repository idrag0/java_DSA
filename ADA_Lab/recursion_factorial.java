package ADA_Lab;

import java.util.Scanner;

import TREE.BST.searchBST;

public class recursion_factorial {
    public static int factorail(int n){
        if(n==0){
            return 1;
        }

        return n*factorail(n-1);
    }

    public static void main(String args[]){
       
    }
}
