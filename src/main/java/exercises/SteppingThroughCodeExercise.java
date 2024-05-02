package exercises;

public class SteppingThroughCodeExercise {
  // TODO: Using a debugger, step though the code.
  public static void main(String[] args) {
    start();
  }

  public static void start() {
    System.out.println("Start der Anwendung.");
    methodA();
    System.out.println("Anwendung beendet.");
  }

  public static void methodA() {
    System.out.println("Method A wurde aufgerufen.");
    methodB();
  }

  public static void methodB() {
    System.out.println("Method B wurde aufgerufen.");
    methodC();
  }

  public static void methodC() {
    System.out.println("Method C wurde aufgerufen.");
  }
}
