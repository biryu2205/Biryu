package com.sort;

import java.util.Arrays;
import org.junit.Test;

/**
 * Created by Administrator on 28/08/2017.
 */
public class MergeSortTest extends AbstractSortTest{
  @Override SortAlgorithm initSortAlgorithm() {
    return new MergeSort();
  }
}