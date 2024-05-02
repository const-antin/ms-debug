package exercises;

import exercises.tools.GreetingGenerator;

public class FindCallerExercise {
  public static void main (String[] args) {
    GreetingGenerator.greet(FindCallerExercise::displayText);
  }


  // Displays text on our custom screen. Note that only 20 characters can be displayed
  // on the screen at a time.
  public static void displayText(String text) {
    if (text.length() > 20) { // TODO: Find the caller that passes an illegal argument into this function.
      throw new RuntimeException("Message is too long!");
    }
    System.out.println(text);
  }
}
