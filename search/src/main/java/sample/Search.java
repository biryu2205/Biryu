package sample;

/**
 * Created by Administrator on 24/08/2017.
 */
public class Search {

  public static int binarySearch(int[] numbers, int neededNumber) {

    int sizeArray = numbers.length;
    int lower =
        0;
    int upper = sizeArray - 1;
    int result = -1;
    int middle = (lower + upper) / 2;
    while (lower <= upper) {
      if (numbers[middle] < neededNumber) {
        lower = middle + 1;
        middle = (lower + upper) / 2;
      }
      if (numbers[middle] > neededNumber) {
        upper = middle - 1;
        middle = (lower + upper) / 2;
      }
      if (numbers[middle] == neededNumber) {
        while (middle > 0 && numbers[middle - 1] == neededNumber) {
          middle--;
        }
        result = middle;
        break;
      }
    }
    return result;
  }

  public static int binSearch(int[] arr, int v) {
    int left = 0;
    int right = arr.length - 1;
    int middle;
    do {
      middle = (left + right) / 2;
      if (arr[middle]
          == v) {
        while (middle > 0 && arr[middle - 1] == v) {
          middle--;
        }
        return middle;
      }

      if (arr[middle] < v) {
        left = middle + 1;
      } else {
        right = middle - 1;
      }
    } while (left <= right);

    return -1;
  }

  /**
   * Find the value in input array.
   *
   * @return the first location of the value if existed, -1 otherwise.
   */
  public static int sequencesSearch(int[] numbers, int neededNumber) {
    for (int index = 0; index < numbers.length; index++) {
      if (numbers[index] == neededNumber) {
        return index;
      }
    }
    return -1;
  }
}
