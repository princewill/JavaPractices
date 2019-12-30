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

    public static class UpperLowerboundNode {

        public int lowerBound;
        public int upperBound;
        public BinaryTreeNode node;

        UpperLowerboundNode(BinaryTreeNode node, int upper, int lower) {
            this.lowerBound = lower;
            this.upperBound = upper;
            this.node = node;
        }

    }


    public static boolean isBinarySearchTree(BinaryTreeNode root) {

        Deque<UpperLowerboundNode> bounds = new ArrayDeque<>();
        bounds.push(new UpperLowerboundNode(root, Integer.MAX_VALUE, Integer.MIN_VALUE));


        while(!bounds.isEmpty()){

            UpperLowerboundNode nodeBound = bounds.pop();

            if(nodeBound.node.value <= nodeBound.lowerBound || nodeBound.node.value >= nodeBound.upperBound){
                return false;
            }

            if(nodeBound.node.left != null) {
                bounds.push(new UpperLowerboundNode(nodeBound.node.left, nodeBound.node.value, nodeBound.lowerBound));
            }

            if(nodeBound.node.right != null) {
                bounds.push(new UpperLowerboundNode(nodeBound.node.right, nodeBound.upperBound, nodeBound.node.value));

            }

        }

        return true;
    }

}

