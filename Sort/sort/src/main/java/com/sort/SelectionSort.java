package com.sort;

/**
 * Created by Administrator on 28/08/2017.
 */
public class SelectionSort implements SortAlgorithm {
  @Override
  public void sort(int[] arr) {
    int minIndex;
    int temp;
    int size = arr.length;
    for (int i = 0; i < size - 1; i++) {
      minIndex = i;
      for (int j = i + 1; j < size; j++)
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      if (minIndex != i) {
        temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
      }
    }
  }
}
