package com.guo.datastruct.list;

/**
 * @Description:
 * @author gjyip
 * @date 2021-03-27
 */
public interface List<E> {

	static final int DEFAULT_CAPACITY = 10;

	/**
	 * 元素的数量
	 * 
	 * @return
	 */
	int size();

	/**
	 * 是否为空
	 */
	boolean isEmpty();

	/**
	 * 是否包含某个元素
	 */
	boolean contains(E element);

	/**
	 * 添加元素到最后面
	 */
	void add(E element);

	/**
	 * 添加元素到指定位置
	 */
	boolean add(int index, E element);

	/**
	 * 返回 index 位置对应的元素
	 */
	E get(int index);

	/**
	 * 设置 index 位置的元素
	 */
	E set(int index, E element);

	/**
	 * 删除 index 位置对应的元素
	 */
	E remove(int index);

	/**
	 * 查看元素的位置
	 */
	int indexOf(E element);

	/**
	 * 清除所有元素
	 */
	void clear();
}
