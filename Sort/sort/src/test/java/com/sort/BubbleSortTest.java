package com.sort;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 26/08/2017.
 */
public class BubbleSortTest {
  @Test
  public void sort() {
    int[] arr = {4, 3, 2, 1, 1, 1};
    System.out.println("Original: " + Arrays.toString(arr));
    int[] expected = {1, 1, 1, 2, 3, 4};
    BubbleSort.sort(arr);
    System.out.println("Sorted: " + Arrays.toString(arr));
    Assert.assertArrayEquals(expected, arr);
  }
}