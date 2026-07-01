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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inorderindexmap = new HashMap<>();
        for(int i =0 ;i< inorder.length ;i++)
        inorderindexmap.put(inorder[i],i);
        return splitTree(preorder , inorderindexmap , 0 ,0 , inorder.length-1);
    }
    private TreeNode splitTree(int[] preorder , Map<Integer ,Integer> inorderindexmap, int rootindex , int left , int right){
        if(left > right){
            return null ;
        }
        TreeNode root = new TreeNode (preorder[rootindex]);
        int mid = inorderindexmap.get(preorder[rootindex]);
        if(mid>left){ 
        root.left = splitTree(preorder, inorderindexmap, rootindex+1, left , mid-1);
        }
        if(mid<right){ 
        root.right = splitTree(preorder, inorderindexmap, rootindex + mid -left +1 , mid + 1 , right);
    }
        return root ; 
    }
}
