package com.sort;

import java.util.Arrays;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public abstract class AbstractSortTest {
  private SortAlgorithm algorithm = initSortAlgorithm();

  abstract SortAlgorithm initSortAlgorithm();

  @Test(expected = NullPointerException.class)
  public void sort_nullArray() {
    algorithm.sort(null);
  }

  @Test
  public void sort_empty() {
    int[] emptyArr = new int[0];
    algorithm.sort(emptyArr);
  }

  @Test
  public void sort_simple() {
    int[] arr = {3, 2, 1};
    System.out.println("Before sort: " + Arrays.toString(arr));
    algorithm.sort(arr);
    System.out.println("After sort: " + Arrays.toString(arr));
    assertSorted(arr);
  }

  @Test
  public void sort_sampleData() { // TODO avoid duplicate code
    int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    System.out.println("Before sort: " + Arrays.toString(arr));
    algorithm.sort(arr);
    System.out.println("After sort: " + Arrays.toString(arr));
    assertSorted(arr);
  }

  /**
   * Với 1 array đã sort thì ko có tồn tại trường hợp arr[i-1]<=arr[i]
   * nên nếu ko thỏa điều kiện in ra mess và vị trí ko thỏa  [i].
   */
  private void assertSorted(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      assertTrue("Elements is not sorted as index " + i, arr[i - 1] <= arr[i]);
    }
  }
}
