package com.guo.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 * 
 * @Description:
 * @author gjyip
 * @date 2021-05-17
 */
public class _0094_二叉树的中序遍历 {

	/**
	 * 递归
	 * 
	 * @param root
	 * @return
	 */
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		return inorderTraversal(root, list);
	}

	public List<Integer> inorderTraversal(TreeNode node, List<Integer> list) {
		if (node == null) {
			return list;
		}
		inorderTraversal(node.left, list);
		list.add(node.val);
		inorderTraversal(node.right, list);
		return list;
	}

	/**
	 * 迭代(利用栈)
	 * 
	 * @param root
	 * @return
	 */
	public List<Integer> inorderTraversal2(TreeNode root) {

		if (root == null) {
			return new ArrayList<>();
		}

//		TreeNode node
//		while(root) {
//			
//		}
		return null;
	}
}
