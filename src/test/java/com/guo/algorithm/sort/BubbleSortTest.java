package com.guo.algorithm.sort;

import com.guo.utils.Integers;
import com.guo.utils.Times;
import org.junit.Test;

/**
 * @Author gjyip
 * @Date 2022/6/25
 **/
public class BubbleSortTest {

    @Test
    public void BubbleSort1Test() {
        Integer[] array = Integers.random(10, 1, 100);

        Times.test("BubbleSort1", () -> {
            BubbleSort bubbleSort = new BubbleSort();
            bubbleSort.bubbleSort1(array);
        });
        Integers.println(array);
    }
}
