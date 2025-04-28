package practise.Tree;

import java.util.*;

public class levelorder {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        
        public TreeNode(int val) {
            this.val = val;
            left = null;
            right = null;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val= val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> levelorder(TreeNode root){
        ArrayList<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> level = new ArrayList<>();

            for(int i=0; i<n; i++){
                TreeNode node = q.remove();

                level.add(node.val);

                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }

            result.add(level);
        }

        return result;
    }

    public void printtree(List<Integer> re){
        for(int n: re){
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        levelorder l = new levelorder();
        TreeNode root = l.new TreeNode(3);
        root.left = l.new TreeNode(9);
        root.right = l.new TreeNode(20);
        root.right.left = l.new TreeNode(15);
        root.right.right = l.new TreeNode(7);

        List<List<Integer>> result = l.levelorder(root);

        for(List<Integer> re: result){
            l.printtree(re);
        }
    }
}
