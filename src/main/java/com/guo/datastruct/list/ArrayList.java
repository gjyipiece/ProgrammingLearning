package com.guo.datastruct.list;

/**
 * 动态数组
 * 
 * @Description:
 * @author gjyip
 * @date 2021-03-21
 */
public class ArrayList<E> extends AbstractList<E> {

	private E[] elements;

	/**
	 * 
	 * @param capacity
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(int capacity) {
		capacity = capacity < DEFAULT_CAPACITY ? DEFAULT_CAPACITY : capacity;
		elements = (E[]) new Object[capacity];
	}

	public ArrayList() {
		this(DEFAULT_CAPACITY);
	}

	/**
	 * 添加元素到指定位置
	 */
	@Override
	public boolean add(int index, E element) {
		rangeCheckForAdd(index);

		ensureCapacity(index + 1);
		// 指定位置后面的元素往后移动一位
		for (int i = size - 1; i >= index; i--) {
			elements[i + 1] = elements[i];
		}
		elements[index] = element;
		size++;
		return true;
	}

	/**
	 * 返回 index 位置对应的元素
	 */
	@Override
	public E get(int index) {
		rangeCheck(index);
		return elements[0];
	}

	/**
	 * 设置 index 位置的元素
	 */
	@Override
	public E set(int index, E element) {
		rangeCheck(index);
		E old = elements[index];
		elements[index] = element;
		return old;
	}

	/**
	 * 删除 index 位置对应的元素
	 */
	@Override
	public E remove(int index) {
		rangeCheck(index);
		E old = elements[index];
		// 后面的元素往前挪动一位
		for (int i = index + 1; i < size; i++) {
			elements[i - 1] = elements[i];
			size--;
		}
		return old;
	}

	/**
	 * 查看元素的位置
	 */
	@Override
	public int indexOf(E element) {
		if (element == null) {
			for (int i = 0; i < size; i++) {
				if (elements[i] == null) {
					return i;
				}
			}
		} else {
			for (int i = 0; i < size; i++) {
				if (elements[i].equals(element)) {
					return i;
				}
			}
		}

		return ELEMENT_NOT_FOUND;
	}

	/**
	 * 清除所有元素
	 */
	@Override
	public void clear() {
		for (int i = 0; i < size; i++) {
			elements[i] = null;
		}
		size = 0;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("size:").append(size).append(", [");
		for (int i = 0; i < size; i++) {
			if (i != 0) {
				sb.append(",");
			}
			sb.append(elements[i]);
		}
		sb.append("]");
		return sb.toString();
	}

	@SuppressWarnings("unchecked")
	private void ensureCapacity(int capacity) {
		int oldCapacity = elements.length;
		// 如果就的容量大于需要的容量
		if (oldCapacity >= capacity) {
			return;
		}

		// 此时就需要扩容,根据官方给的是扩大1.5倍
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		E[] newElements = (E[]) new Object[newCapacity];

		// 将旧的数组复制到新的数组里
		for (int i = 0; i < size; i++) {
			newElements[i] = elements[i];
		}
		elements = newElements;

		System.out.println(oldCapacity + "扩容为" + newCapacity);
	}

}
