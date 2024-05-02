package examples;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggingMain {
  private static final Logger logger = Logger.getLogger(LoggingMain.class.getName());

  private static void initLogger() {
    try {
      FileHandler fileHandler = new FileHandler("app.log");
      fileHandler.setFormatter(new SimpleFormatter());
      logger.addHandler(fileHandler);
    } catch (IOException e) {
      throw new RuntimeException("Could not create file for logging!");
    }
  }

  public static void main(String[] args) {
    initLogger();
    String filename = "nonExistantFile.txt";
    try {
      openFile(filename);
    } catch (IOException e) {
      System.out.println("File " + filename + " could not be opened.");
    }
  }

  private static void openFile(String fileName) throws IOException {
    File file = new File(fileName);
    try {
      if (!file.exists()) {
        throw new IOException("File does not exist: " + fileName);
      }
    } catch (IOException e) {
      logger.severe("Error opening file: " + e.getMessage());
      throw e;
    }
  }
}