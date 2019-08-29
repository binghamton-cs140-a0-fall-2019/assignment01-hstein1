package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
  public static void main(String[] args) {
    Computer comp1 = new Computer("Dell", "CPU1", 36, 1005, true, 1000.0);
    Computer comp2 = new Computer("Dell", "CPU2", 36, 1005, false, 1000.0);
    Computer comp3 = new Computer("Dell", "CPU3", 36, 600, true, 1000.0);
    Computer comp4 = new Computer("Dell", "CPU4", 36, 600, false, 1000.0);

    System.out.println(comp1);
    System.out.println(comp2);
    System.out.println(comp3);
    System.out.println(comp4);

    try(var output = new PrintWriter(new FileOutputStream(new File("output.txt"),
        true))) {
          output.println("\nTESTS FOR Computer.java:");
          Computer comp12 = new Computer("Dell", "CPU1", 36, 1005, true, 1000.0);
          Computer comp22 = new Computer("Dell", "CPU2", 36, 1005, false, 1000.0);
          Computer comp32 = new Computer("Dell", "CPU3", 36, 600, true, 1000.0);
          Computer comp42 = new Computer("Dell", "CPU4", 36, 600, false, 1000.0);

          output.println(comp12);
          output.println(comp22);
          output.println(comp32);
          output.println(comp42);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
  }
}
