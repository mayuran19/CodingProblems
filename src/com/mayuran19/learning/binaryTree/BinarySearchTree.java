package com.mayuran19.learning.binaryTree;

import sun.reflect.generics.tree.Tree;

/**
 * Created by smayuran on 11/23/2017.
 */
public class BinarySearchTree {
    private TreeNode root;

    public TreeNode find(int value, TreeNode paramTreeNode) {
        TreeNode currentNode = null;
        if (paramTreeNode != null) {
            currentNode = paramTreeNode;
        } else {
            currentNode = root;
        }

        if (currentNode == null) {
            return null;
        }
        if (currentNode.getValue() == value) {
            return currentNode;
        } else {
            if (value < currentNode.getValue()) {
                currentNode = currentNode.getLeft();
            } else {
                currentNode = currentNode.getRight();
            }
        }
        return find(value, currentNode);
    }

    public TreeNode insert(int value, TreeNode paramTreeNode) {
        if (root == null) {
            root = new TreeNode(value, null, null);
            return root;
        } else {
            TreeNode currentNode = null;
            if (paramTreeNode == null) {
                currentNode = root;
            } else {
                currentNode = paramTreeNode;
            }

            if (value <= currentNode.getValue()) {
                if (currentNode.getLeft() == null) {
                    TreeNode treeNode = new TreeNode(value, null, null);
                    currentNode.setLeft(treeNode);
                    return treeNode;
                } else {
                    currentNode = currentNode.getLeft();
                    return insert(value, currentNode);
                }
            } else {
                if (currentNode.getRight() == null) {
                    TreeNode treeNode = new TreeNode(value, null, null);
                    currentNode.setRight(treeNode);
                    return treeNode;
                } else {
                    currentNode = currentNode.getRight();
                    return insert(value, currentNode);
                }
            }
        }
    }

    /**
     * Visit the root node
     * Traverse left sub tree
     * Traverse right sub tree
     *
     * @param root
     */
    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.println(root.getValue());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.println(root.getValue());
            inOrder(root.getRight());
        }
    }

    public void postOrder(TreeNode root){
        if(root != null){
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.println(root.getValue());
        }
    }

    public static void main(String args[]) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        TreeNode root = binarySearchTree.insert(3, null);
        binarySearchTree.insert(2, null);
        binarySearchTree.insert(4, null);
        binarySearchTree.insert(5, null);
        binarySearchTree.insert(6, null);
        binarySearchTree.insert(7, null);
        binarySearchTree.insert(3, null);
        binarySearchTree.insert(5, null);
        binarySearchTree.insert(9, null);
        binarySearchTree.insert(10, null);
        binarySearchTree.insert(12, null);
        binarySearchTree.insert(1, null);
        binarySearchTree.insert(6, null);

        //TreeNode treeNode = binarySearchTree.find(12, null);
        binarySearchTree.preOrder(binarySearchTree.root);
        binarySearchTree.inOrder(binarySearchTree.root);
        binarySearchTree.postOrder(binarySearchTree.root);
        //System.out.println(treeNode.getValue());
    }
}
