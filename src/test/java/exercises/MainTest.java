package exercises;

import examples.PrintMain;
import org.junit.jupiter.api.Test;

class MainTest {
  @Test
  void factorial() {
    assert(PrintMain.factorial(3) == 6);
    assert(PrintMain.factorial(0) == 1);
    assert(PrintMain.factorial(1) == 1);
    assert(PrintMain.factorial(10) == 3628800);
  }
}