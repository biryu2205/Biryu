package com.sort;

import java.util.Arrays;
import org.junit.Test;

/**
 * Created by Administrator on 28/08/2017.
 */
public class MergeSortTest {
  @Test
  public void sort_sampleData() {
    int[] arr = {1, 1, 3, 5, 4};
    System.out.println("Before sort: " + Arrays.toString(arr));
    MergeSort.sort(arr);
    System.out.println("After sort: " + Arrays.toString(arr));
    MergeSort.sort(arr);
  }

  @Test
  public void sort_sampleData2() {
    int[] arr = {6, 5, 4, 3, 2, 1, 0};
    System.out.println("Before sort: " + Arrays.toString(arr));
    MergeSort.sort(arr);
    System.out.println("After sort: " + Arrays.toString(arr));
    MergeSort.sort(arr);
  }
}