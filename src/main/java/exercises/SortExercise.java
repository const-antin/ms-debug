package exercises;

public class SortExercise {

  public static void main(String[] args) {
    int[] array = {5, 2, 9, 1, 3};

    bubbleSort(array);

    for (int num : array) {
      System.out.print(num + " ");
    }
  }

  // TODO: Using a debugger, find an error in this code snippet.
  public static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n-1; i++) {
      for (int j = 0; j < n-i-1; j++) {
        if (arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }
      }
    }
  }
}