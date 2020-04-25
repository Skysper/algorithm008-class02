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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(result, root);
        return result;
    }
    private void inorder(List<Integer> list, TreeNode node) {
        if(node == null) {
            return;
        }
        inorder(list, node.left);
        list.add(node.val);
        inorder(list, node.right);
    }
}