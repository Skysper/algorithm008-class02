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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(list, root);
        return list;
    }

    public void preorder(List<Integer> list, TreeNode node) {
        if(node != null) {
            list.add(node.val);
            preorder(list, node.left);
            preorder(list, node.right);
        }
    }
}