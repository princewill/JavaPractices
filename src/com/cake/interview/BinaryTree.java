package com.cake.interview;

import java.util.*;

public class BinaryTree {

    public static class BinaryTreeNode {
        private int value;
        public BinaryTreeNode left;
        public BinaryTreeNode right;

        public BinaryTreeNode(int value) {
            this.value = value;
        }

        public BinaryTreeNode insertLeft(int leftValue) {
            this.left = new BinaryTreeNode(leftValue);
            return this.left;
        }

        public BinaryTreeNode insertRight(int rightValue) {
            this.right = new BinaryTreeNode(rightValue);
            return this.right;
        }

        public int getNodeValue(BinaryTreeNode node) {
            return this.value;
        }
    }

    public static class NodeDepthPair {
        int depth;
        BinaryTreeNode node;

        public NodeDepthPair(BinaryTreeNode node, int depth){
            this.depth = depth;
            this.node = node;
        }

    }

    public static boolean isBalanced(BinaryTreeNode treeRoot) {

        if(treeRoot == null) return true;

        ArrayList<Integer> depths = new ArrayList<>(3);

        Deque<NodeDepthPair> nodeDepthPairs = new ArrayDeque<>();

        nodeDepthPairs.push(new NodeDepthPair(treeRoot, 0));

        while(!nodeDepthPairs.isEmpty()){
            NodeDepthPair nodeDepthPair = nodeDepthPairs.pop();
            BinaryTreeNode node = nodeDepthPair.node;
            int depth = nodeDepthPair.depth;

            if(node.left == null && node.right == null){

                if (!depths.contains(depth)) {
                    depths.add(depth);
                    if(depths.size() > 2 || (depths.size() == 2 && Math.abs(depths.get(0) - depths.get(1)) > 1)){
                        return false;
                    }
                }
            }
            else {
                if(node.left != null) {
                    nodeDepthPairs.push(new NodeDepthPair(node.left, depth + 1));
                }
                if(node.right != null) {
                    nodeDepthPairs.push(new NodeDepthPair(node.right, depth + 1));
                }
            }
        }

        return true;
    }

}

