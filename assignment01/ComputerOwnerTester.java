package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
  public static void main(String[] args) {
    DateAndPlaceOfBirth placeDOB = new DateAndPlaceOfBirth(1999, 04, 19,
                                                            "New York", "New York", "USA");
    StreetUSAddress address = new StreetUSAddress("505 Murray Hill Road",
                                                    "Vestal", "NY", "13850");
    Person pers = new Person("Hank", "Stein", "12345678", placeDOB, address);
    Computer comp1 = new Computer("Dell", "CPU1", 36, 1005, true, 1000.0);
    Computer comp2 = new Computer("Dell", "CPU2", 36, 1005, false, 1000.0);
    Computer comp3 = new Computer("Dell", "CPU3", 36, 600, true, 1000.0);
    Computer comp4 = new Computer("Dell", "CPU4", 36, 600, false, 1000.0);

    ComputerOwner persOwner = new ComputerOwner(pers);
    persOwner.addComputer(comp1);
    persOwner.addComputer(comp2);
    persOwner.addComputer(comp3);
    persOwner.addComputer(comp4);

    System.out.println(persOwner);

    persOwner.removeComputer(0);
    persOwner.removeComputer(0);
    System.out.println(persOwner);
    try(var output = new PrintWriter(new FileOutputStream(new File("output.txt"),
        true))) {
          output.println("\nTESTS FOR ComputerOwner.java:");
          DateAndPlaceOfBirth placeDOB2 = new DateAndPlaceOfBirth(1999, 04, 19,
                                                            "New York", "New York", "USA");
          StreetUSAddress address2 = new StreetUSAddress("505 Murray Hill Road",
                                                    "Vestal", "NY", "13850");
          Person pers2 = new Person("Hank", "Stein", "12345678", placeDOB2, address2);
          Computer comp12 = new Computer("Dell", "CPU1", 36, 1005, true, 1000.0);
          Computer comp22 = new Computer("Dell", "CPU2", 36, 1005, false, 1000.0);
          Computer comp32 = new Computer("Dell", "CPU3", 36, 600, true, 1000.0);
          Computer comp42 = new Computer("Dell", "CPU4", 36, 600, false, 1000.0);

          ComputerOwner persOwner2 = new ComputerOwner(pers2);
          persOwner2.addComputer(comp12);
          persOwner2.addComputer(comp22);
          persOwner2.addComputer(comp32);
          persOwner2.addComputer(comp42);

          output.println(persOwner2);

          persOwner2.removeComputer(0);
          persOwner2.removeComputer(1);
          output.println(persOwner2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
  }
}
