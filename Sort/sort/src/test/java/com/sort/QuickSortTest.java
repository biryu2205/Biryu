package com.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 30/08/2017.
 */

  public class QuickSortTest extends AbstractSortTest {
    @Override SortAlgorithm initSortAlgorithm() {
      return new QuickSort();
    }
  }