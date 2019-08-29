package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
  public static void main(String[] args) {
    DateAndPlaceOfBirth placeDOB = new DateAndPlaceOfBirth(1999, 04, 19,
                                      "New York", "New York", "USA");
    StreetUSAddress address = new StreetUSAddress("505 Murray Hill Road",
                                    "Vestal", "NY", "13850");
    Person pers = new Person("Hank", "Stein", "12345678", placeDOB, address);

    System.out.println(pers);

    try(var output = new PrintWriter(new FileOutputStream(
    new File("output.txt"), true))){
      output.println("\nTESTS FOR Person.java");

      DateAndPlaceOfBirth placeDOB2 = new DateAndPlaceOfBirth(1999, 04, 19,
                                        "New York", "New York", "USA");
      StreetUSAddress address2 = new StreetUSAddress("505 Murray Hill Road",
                                      "Vestal", "NY", "13850");
      Person pers2 = new Person("Hank", "Stein", "12345678", placeDOB2, address2);

      output.println(pers2);
    } catch(FileNotFoundException e) {
       e.printStackTrace();
    }
  }
}
