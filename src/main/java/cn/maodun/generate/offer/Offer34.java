package cn.maodun.generate.offer;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @author DELL
 * @date 2023/7/2
 */
public class Offer34 {
    private static ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        treeNode.val = 10;

        treeNode.left = generateTreeNode(5, 4, 7);

        TreeNode treeNode2 = new TreeNode();
        treeNode2.val = 12;
        treeNode.right = treeNode2;

        findPath(treeNode,22);
        AtomicInteger index = new AtomicInteger();
        ret.forEach(r -> {
            String collect = r.stream().map(String::valueOf).collect(Collectors.joining(","));
            System.out.println(index.incrementAndGet() + ": " + collect);
        });
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

    public static void findPath(TreeNode root, int target) {
        backtracking(root, target, new ArrayList<>());
    }

    private static void backtracking(TreeNode node, int target, ArrayList<Integer> path) {
        if (node == null)
            return;
        path.add(node.val);
        target -= node.val;
        if (target == 0 && node.left == null && node.right == null) {
            ret.add(new ArrayList<>(path));
        } else {
            backtracking(node.left, target, path);
            backtracking(node.right, target, path);
        }
        path.remove(path.size() - 1);
    }
}
