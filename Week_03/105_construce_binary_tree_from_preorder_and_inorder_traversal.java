/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int pIndex =0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode node = new TreeNode(0);
        return _generator(preorder, inorder, 0, inorder.length);
    }

    private TreeNode _generator(int[] preorder, int[] inorder, int start, int end) {
        if(start >= end || pIndex >= preorder.length) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[pIndex]);
        int mid = 0;
        for(int i = start; i< end; i++) {
            if(inorder[i] == preorder[pIndex]) {
                mid = i;
                break;
            }
        }
        pIndex++;
        node.left = _generator(preorder, inorder, start, mid);
        node.right = _generator(preorder, inorder, mid + 1, end);
        return node;
    }
}