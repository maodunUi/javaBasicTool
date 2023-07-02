package cn.maodun.generate.offer;

import java.util.Objects;

/**
 * 树的镜像
 * 总结上面的过程，我们得出求一棵树的镜像的过程：先前序遍历这棵
 * 树的每个节点，如果遍历到的节点有子节点，就交换它的两个子节点。当
 * 交换完所有非叶节点的左、右子节点之后，就得到了树的镜像。
 *
 * @author DELL
 * @date 2023/7/2+
 */
public class Offer27 {


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        treeNode.val= 1;

        TreeNode leftNode = new TreeNode();
        leftNode.val = 2 ;
        TreeNode rightNode = new TreeNode();
        rightNode.val = 3 ;

        treeNode.left = leftNode;
        treeNode.right = rightNode;

        printNode(treeNode);

        mirrorRecursively(treeNode);
        System.out.println("mirror after");
        printNode(treeNode);

    }

    private static void printNode(TreeNode treeNode) {
        if (Objects.nonNull(treeNode)){
            System.out.println(treeNode.val);
            printNode(treeNode.left);
            printNode(treeNode.right);
        }
    }

    static void mirrorRecursively(TreeNode treeNode) {
        if (Objects.isNull(treeNode)) {
            return;
        }
        if (Objects.isNull(treeNode.left) && Objects.isNull(treeNode.right)) {
            return;
        }

        TreeNode tempNode = treeNode.left;
        treeNode.left = treeNode.right;
        treeNode.right = tempNode;

        if (Objects.nonNull(treeNode.left)) {
            mirrorRecursively(treeNode.left);
        }

        if (Objects.nonNull(treeNode.right)) {
            mirrorRecursively(treeNode.right);
        }
    }
}
