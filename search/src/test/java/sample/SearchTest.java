package sample;

import org.junit.Assert;
import org.junit.Test;

import static sample.Search.binSearch;
import static sample.Search.binarySearch;
import static sample.Search.sequencesSearch;

/**
 * Created by Administrator on 25/08/2017.
 */
public class SearchTest {

  @Test
  public void binarySearch_found() {
    int[] numbers = {1, 2, 3, 4};
    int neededNumber = 1;
    int result = binarySearch(numbers, neededNumber);
    Assert.assertEquals(0, result);
  }

  @Test
  public void binarySearch_notfound() {
    int[] numbers = {1, 2, 3, 4};
    int neededNumber = 5;
    int result = binarySearch(numbers, neededNumber);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void binarySearch_emptyArray() {
    int[] numbers = {};
    int neededNumber = 1;
    int result = binarySearch(numbers, neededNumber);
    Assert.assertEquals(-1, result);
  }

  @Test
  public void binarySearch_returnAtFirst() {
    int[] numbers = {0, 1, 2, 3};
    int neededNumber = 0;
    int result = binarySearch(numbers, neededNumber);
    Assert.assertEquals(0, result);
  }

  @Test
  public void binarySearch_returnAtLast() {
    int[] numbers = {0, 1, 2, 3};
    int neededNumber = 3;
    int result = binarySearch(numbers, neededNumber);
    Assert.assertEquals(3, result);
  }

  @Test
  public void binarySearch_foundFirst() {
    int[] numbers = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    int neededNumber = 1;
    int result = binarySearch(numbers, neededNumber);

    Assert.assertEquals(2, result);
  }

  @Test
  public void binarySearch_emtyArray() {
    int[] numbers = {};
    int neededNumber = 2;
    int result = binSearch(numbers, 2);
    Assert.assertEquals(result, -1);
  }

  @Test
  public void sequencesSearch_emptyArray() {
    int[] numbers = {};
    int neededNumber = 3;
    int result = sequencesSearch(numbers, neededNumber);
    Assert.assertEquals(-1, result); // expect first, then actual
  }

  @Test
  public void sequencesSearch_notFound() {
    int[] numbers = {1, 2, 3};
    int neededNumber = 4;
    int result = sequencesSearch(numbers, neededNumber);
    Assert.assertEquals(-1, result); // expect first, then actual
  }

  @Test
  public void sequencesSearch_found() {
    int[] numbers = {1, 2, 3};
    int neededNumber = 2;
    int result = sequencesSearch(numbers, neededNumber);
    Assert.assertEquals(1, result); // expect first, then actual
  }

  @Test
  public void sequencesSearch_returnAtFirst() {
    int[] numbers = {2, 2, 2};
    int neededNumber = 2;
    int result = sequencesSearch(numbers, neededNumber);
    Assert.assertEquals(0, result); // expect first, then actual
  }

  @Test
  public void sequencesSearch_returnAtLast() {
    int[] numbers = {1, 2};
    int neededNumber = 2;
    int result = sequencesSearch(numbers, neededNumber);
    Assert.assertEquals(1, result); // expect first, then actual
  }
}