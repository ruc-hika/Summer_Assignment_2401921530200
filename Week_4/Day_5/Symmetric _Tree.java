/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true ;
        Queue<TreeNode> lefttree = new LinkedList<>() ;
        Queue<TreeNode> righttree = new LinkedList<>();
        lefttree.add( root.left);
        righttree.add( root.right);
        while( ! lefttree.isEmpty() && !righttree.isEmpty()){
            TreeNode leftnode = lefttree.poll();
            TreeNode rightnode = righttree.poll();
            if(leftnode == null && rightnode == null) continue ;
           if(leftnode == null || rightnode == null) return false ;
            if(leftnode.val != rightnode.val) return false ;
            lefttree.add(leftnode.left);
            lefttree.add(leftnode.right);
            righttree.add(rightnode.right);
            righttree.add(rightnode.left);

        }
        return true ;
    }
}
