package cn.maodun.generate.offer;

import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 从上往下打印二叉树
 * <p>
 * <p>
 * 8
 * 6    10
 * 5  7  9   11
 *
 * @author DELL
 * @date 2023/7/2
 */
public class Offer32 {

    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode();
        treeNode.val = 8;

        TreeNode treeNode1 = generateTreeNode(6, 5, 7);
        TreeNode treeNode2 = generateTreeNode(10, 9, 11);

        treeNode.left = treeNode1;
        treeNode.right = treeNode2;

        printTree(treeNode);
    }

    private static TreeNode generateTreeNode(int centerVal, int leftVal, int rightVal) {

        TreeNode treeNode = new TreeNode();
        treeNode.val = centerVal;

        TreeNode left = new TreeNode();
        left.val = leftVal;

        TreeNode right = new TreeNode();
        right.val = rightVal;

        treeNode.left = left;
        treeNode.right = right;

        return treeNode;
    }


    static void printTree(TreeNode treeNode) {
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        if (Objects.isNull(treeNode)) {
            return;
        }
        queue.add(treeNode);

        while (queue.size() > 0) {
            TreeNode peek = queue.poll();
            System.out.println(peek.val);

            if (Objects.nonNull(peek.left)) {
                queue.add(peek.left);
            }

            if (Objects.nonNull(peek.right)) {
                queue.add(peek.right);
            }
        }


    }
}
