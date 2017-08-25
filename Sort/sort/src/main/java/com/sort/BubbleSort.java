package com.sort;

/**
 * Created by Administrator on 26/08/2017.
 */
public class BubbleSort {
  public static void sort(int[] arr) {
    int size = arr.length;
    int temp;
    for (int i = 0; i < size; i++) {
      for (int index = 1; index < size; index++) {
        if (arr[index - 1] > arr[index]) {
          temp = arr[index - 1];
          arr[index - 1] = arr[index];
          arr[index] = temp;
        }
      }
    }
  }
}
