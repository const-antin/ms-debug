package exercises.tools;

import java.time.LocalTime;
import java.util.function.Consumer;

// Calls a function with a greeting as a parameter
public class GreetingGenerator {
  public static void greet(Consumer<String> outputFunction) {
    LocalTime currentTime = LocalTime.now();
    int hour = currentTime.getHour();

    if (hour >= 6 && hour < 18) {
      displayMorningGreeting(outputFunction);
    } else {
      displayEveningGreeting(outputFunction);
    }
  }

  public static void displayMorningGreeting(Consumer<String> outputFunction) {
    outputFunction.accept("Guten Tag");
  }

  public static void displayEveningGreeting(Consumer<String> outputFunction) {
    outputFunction.accept("Eine gute Nacht wünsche ich!");
  }
}
