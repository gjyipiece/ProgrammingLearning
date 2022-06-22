package com.guo.datastruct.list;

/**
 * @Description:
 * @author gjyip
 * @date 2021-03-23
 */
public class LinkedList<E> extends AbstractList<E> {

	private Node<E> first;

	@Override
	public boolean add(int index, E element) {
		if (index == 0) {
			first = new Node<E>(element, first.next);
		} else {
			// 获取到上一节点
			Node<E> prev = node(index - 1);
			prev.next = new Node<E>(element, prev.next);
		}
		size++;
		return true;
	}

	@Override
	public E get(int index) {
		return node(index).element;
	}

	@Override
	public E set(int index, E element) {
		Node<E> node = node(index);
		E old = node.element;
		node.element = element;
		return old;
	}

	@Override
	public E remove(int index) {
		Node<E> node = first;
		if (index == 0) {
			// 说明删除的是投节点
			first = first.next;
		} else {
			// 获取到上一节点
			Node<E> prev = node(index - 1);
			node = prev.next;
			prev.next = node.next;
		}
		size--;
		return node.element;
	}

	@Override
	public int indexOf(E element) {
		Node<E> node = first;
		if (element == null) {
			for (int i = 0; i < size; i++) {
				if (node.element == null) {
					return i;
				}
				node = node.next;
			}
		} else {
			for (int i = 0; i < size; i++) {
				if (element.equals(node.element)) {
					return i;
				}
				node = node.next;
			}
		}
		return ELEMENT_NOT_FOUND;
	}

	@Override
	public void clear() {
		size = 0;
		first = null;
	}

	private Node<E> node(int index) {
		rangeCheck(index);
		Node<E> node = first;
		for (int i = 0; i < size; i++) {
			node = node.next;
		}
		return node;
	}

	public static class Node<E> {
		E element;
		Node<E> next;

		public Node(E element, Node<E> next) {
			this.element = element;
			this.next = next;
		}
	}

}
