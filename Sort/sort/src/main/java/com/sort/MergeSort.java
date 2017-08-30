package com.sort;

/**
 * Created by Administrator on 28/08/2017.
 */
// DRY: don't repeat yourself
public class MergeSort implements SortAlgorithm {
  // TODO remove those fields and make this class stateless.
  int[] numbers;
  int[] helper;
  int number;

  @Override
  public void sort(int[] values) {
    numbers = values;
    number = values.length;
    helper = new int[number];
    mergesort(0, number - 1);
  }

  public void mergesort(int low, int high) {
    // check if low is smaller than high, if not then the array is sorted
    if (low < high) {
      // Get the index of the element which is in the middle
      int middle = low + (high - low) / 2;// dang su dung teamviewer tren chrome :D
      // Sort the left side of the array
      mergesort(low, middle);
      // Sort the right side of the array
      mergesort(middle + 1, high);
      // Combine them both
      sort(low, middle, high);
    }
  }

  public void sort(int low, int middle, int high) {

    // Copy both parts into the helper array
    for (int i = low; i <= high; i++) {
      helper[i] = numbers[i];
    }

    int i = low;
    int j = middle + 1;
    int k = low;
    // Copy the smallest values from either the left or the right side back
    // to the original array
    while (i <= middle && j <= high) {
      if (helper[i] <= helper[j]) {
        numbers[k] = helper[i];
        i++;
      } else {
        numbers[k] = helper[j];
        j++;
      }
      k++;
    }
    // Copy the rest of the left side of the array into the target array
    while (i <= middle) {
      numbers[k] = helper[i];
      k++;
      i++;
    }
    // Since we are sorting in-place any leftover elements from the right side
    // are already at the right position.

  }
}