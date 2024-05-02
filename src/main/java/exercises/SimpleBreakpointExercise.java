package exercises;

public class SimpleBreakpointExercise {
  public static void main(String[] args) {
    int result = calculate(5, 3);
    System.out.println("The result of the calculation is: " + result);
  }

  public static int calculate(int a, int b) {
    int sum = 0;

    // TODO: Set a breakpoint on the following line
    for (int i = 0; i < 5; i++) {
      sum += a * b; // Breakpoint set here
      System.out.println("Intermediate result: " + sum);
    }

    return sum;
  }
}
