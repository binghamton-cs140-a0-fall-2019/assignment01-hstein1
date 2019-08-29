package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {
  public static void main(String[] args) {
    StreetUSAddress address1 = new StreetUSAddress("505 Murray Hill Road",
                                    "Vestal", "NY", "13850");
    StreetUSAddress address2 = new StreetUSAddress("4 E 95th St", "Apt. 7B",
                                    "New York", "NY", "10128");

    System.out.println(address1);
    System.out.println(address2);

    try(var output = new PrintWriter(new FileOutputStream(
    new File("output.txt"), true))){
      output.println("\nTESTS FOR StreetUSAddress.java");

      StreetUSAddress address12 = new StreetUSAddress("505 Murray Hill Road",
                                      "Vestal", "NY", "13850");
      StreetUSAddress address22 = new StreetUSAddress("4 E 95th St", "Apt. 7B",
                                      "New York", "NY", "10128");

      output.println(address12);
      output.println(address22);
    } catch(FileNotFoundException e) {
       e.printStackTrace();
    }
  }
}
