package com.guo.datastruct.binarytree;

/**
 * 二叉搜索树
 * 
 * @Description:
 * @author gjyip
 * @date 2021-03-28
 */
public class BinarySearchTree<E> {

	private int size;

	/**
	 * 元素的数量
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}

	/**
	 * 是否为空
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * 是否包含某个元素
	 */
	public boolean contains(E element) {
		return false;
	}

	/**
	 * 添加元素
	 */
	public void add(E element) {

	}

	/**
	 * 删除元素
	 * 
	 * @param index
	 * @return
	 */
	public E remove(E element) {
		return null;
	}

	/**
	 * 清除所有元素
	 */
	public void clear() {

	}

	/**
	 * 层序遍历
	 * 
	 * @param node
	 */
	public void levelOrderTraversal(Node<E> node) {

	}

	/**
	 * 节点对象
	 * 
	 * @author gjyip
	 *
	 * @param <E>
	 */
	public static class Node<E> {

		private E element;
		private Node<E> parent;
		private Node<E> left;
		private Node<E> right;

		public Node(E element, Node<E> parent) {
			this.element = element;
			this.parent = parent;
		}
	}
}
