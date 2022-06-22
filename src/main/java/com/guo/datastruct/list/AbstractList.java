package com.guo.datastruct.list;

/**
 * @Description:
 * @author gjyip
 * @date 2021-03-27
 */
public abstract class AbstractList<E> implements List<E> {

	protected int size;

	protected static final int ELEMENT_NOT_FOUND = -1;

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
		return indexOf(element) >= 0;
	}

	/**
	 * 添加元素到最后面
	 */
	public void add(E element) {
		add(size, element);
	}

	protected void rangeCheck(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("index:" + index + ",size:" + size);
		}
	}

	protected void rangeCheckForAdd(int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("index:" + index + ",size:" + size);
		}
	}
}
