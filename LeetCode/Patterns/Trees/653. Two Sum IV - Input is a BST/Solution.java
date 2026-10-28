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
    public boolean findTarget(TreeNode root, int k) {

        HashSet<Integer> set = new HashSet<>();
        return inorder(root, k, set);
    }

    boolean inorder(TreeNode root, int k, HashSet<Integer> set) {
        if (root == null) {
            return false;
        }

        int need = k - root.val;

        if (set.contains(need)) {
            return true;
        }

        set.add(root.val);

        return inorder(root.left, k, set) ||
               inorder(root.right, k, set);
    }
}
        
    