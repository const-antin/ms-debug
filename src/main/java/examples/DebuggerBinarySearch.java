package examples;

public class DebuggerBinarySearch {

  public static void main(String[] args) {
    int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    int target = 18;

    int index = binarySearch(array, target, 0, array.length-1);
    if (index != -1) {
      System.out.println("Found " + target + " at index " + index);
    } else {
      System.out.println(target + " not found in the array.");
    }
  }

  public static int binarySearch(int[] array, int target, int left, int right) {
    if (left <= right) {
      int mid = left + (right - left) / 2;

      if (array[mid] == target) {
        return mid;
      }

      if (array[mid] < target) {
        return binarySearch(array, target, mid + 1, right);
      } else {
        return binarySearch(array, target, left, mid - 1);
      }
    }

    return -1;
  }
}