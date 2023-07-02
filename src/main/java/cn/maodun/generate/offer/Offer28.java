package cn.maodun.generate.offer;

/**
 * 判断是否是对称二叉树
 * 我们发现可以通过比较二叉树的前序遍历序列和对称前序遍历序列
 * 来判断二叉树是不是对称的。如果两个序列是一样的，那么二叉树就是
 * 对称的。
 *
 * @author DELL
 * @date 2023/6/28
 */
public class Offer28 {
    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode();
        treeNode.val = 1;

        TreeNode left = new TreeNode();
        left.val = 2;

        TreeNode right = new TreeNode();
        right.val = 3;

        treeNode.left = left;
        treeNode.right = right;

        boolean symmetrical = isSymmetrical(treeNode);
        System.out.println(symmetrical);
    }


    static boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null)
            return true;
        return isSymmetrical(pRoot.left, pRoot.right);
    }

    static boolean isSymmetrical(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null || t2 == null)
            return false;
        if (t1.val != t2.val)
            return false;
        return isSymmetrical(t1.left, t2.right) && isSymmetrical(t1.right, t2.left);
    }
}
