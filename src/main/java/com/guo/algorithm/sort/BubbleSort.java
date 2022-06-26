package com.guo.algorithm.sort;

/**
 * 冒泡排序
 *
 * @Author gjyip
 * @Date 2022/6/24
 **/
public class BubbleSort {

    public void bubbleSort1(Integer[] array) {

        for (int end = array.length - 1; end > 0; end--) {
            for (int i = 1; i <= end; i++) {
                //如果是后一位大于前一位，此时就需要将交换
                if (array[i] - array[i - 1] < 0) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
        }
    }

}
