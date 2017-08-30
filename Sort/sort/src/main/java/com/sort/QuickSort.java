package com.sort;

/**
 * Created by Administrator on 30/08/2017.
 */
public class QuickSort implements SortAlgorithm {
  @Override public void sort(int[] arr) {
  }
  void sort(int[] arr, int left, int right) {
    if (left >= right) return;
    int pivot = arr[(left + right) / 2];
    int i = left;
    int j = right;
    do {
      while (arr[i] < pivot) i++;
      while (arr[j] < pivot) j--;
      if (i <= j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = arr[i];
        i++;
        j--;
      }
    } while (i < j);
    sort(arr, left, j);
    sort(arr, i, right);
  }
}
