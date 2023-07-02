package cn.maodun.generate.offer;

/**
 * @author DELL
 * @date 2023/6/30
 */
public class Offer55 {
    public static void main(String[] args) {

    }

    public int TreeDepth(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(TreeDepth(root.left), TreeDepth(root.right));
    }
}
