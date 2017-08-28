package com.sort;

/**
 * Created by Administrator on 27/08/2017.
 */
class InsertionSort implements SortAlgorithm {
  // real insertion sort
  @Override
  public void sort(int[] arr) {
    System.out.println("InsertionSort.sort");
    for (int i = 1; i < arr.length; i++) {
      int insertPoint = i - 1;
      while (insertPoint > 0 && arr[insertPoint] > arr[i]) {
        insertPoint--;
      }
      int backup = arr[i];
      System.arraycopy(arr, insertPoint, arr, insertPoint + 1, i - insertPoint);
      arr[insertPoint] = backup;
    }
  }
}

/*

(n-1) = 2^20 = 1024 * 1024
log(n) = 20 (102400/2)
{1 2 3 5 6 7 8}  {4}


 */


