package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
  public static void main(String[] args) {
    DateAndPlaceOfBirth test1 = new DateAndPlaceOfBirth(1999, 04, 19,
                                      "New York", "New York", "USA");
    DateAndPlaceOfBirth test2 = new DateAndPlaceOfBirth(1989, 02, 25,
                                      "Tallahassee", "Florida", "USA");
    DateAndPlaceOfBirth test3 = new DateAndPlaceOfBirth(1999, 04, 19,
                                      "Indianapolis", "Indiana", "USA");
    DateAndPlaceOfBirth test4 = new DateAndPlaceOfBirth(2001, 11, 03,
                                      "Seville", "Spain");
    DateAndPlaceOfBirth test5 = new DateAndPlaceOfBirth(1964, 04, 19,
                                      "Johannesburg", "South Africa");
    System.out.println(test1);
    System.out.println(test2);
    System.out.println(test3);
    System.out.println(test4);
    System.out.println(test5);

    System.out.println(test1.hasSameBirthDayAs(test2));
    System.out.println(test1.hasSameBirthDayAs(test3));
    System.out.println(test1.hasSameBirthDayAs(test4));
    System.out.println(test1.hasSameBirthDayAs(test5));

    System.out.println(test2.hasSameBirthDayAs(test1));
    System.out.println(test2.hasSameBirthDayAs(test3));
    System.out.println(test2.hasSameBirthDayAs(test4));
    System.out.println(test2.hasSameBirthDayAs(test5));

    System.out.println(test3.hasSameBirthDayAs(test1));
    System.out.println(test3.hasSameBirthDayAs(test2));
    System.out.println(test3.hasSameBirthDayAs(test4));
    System.out.println(test3.hasSameBirthDayAs(test5));

    System.out.println(test4.hasSameBirthDayAs(test1));
    System.out.println(test4.hasSameBirthDayAs(test2));
    System.out.println(test4.hasSameBirthDayAs(test3));
    System.out.println(test4.hasSameBirthDayAs(test5));

    System.out.println(test5.hasSameBirthDayAs(test1));
    System.out.println(test5.hasSameBirthDayAs(test2));
    System.out.println(test5.hasSameBirthDayAs(test3));
    System.out.println(test5.hasSameBirthDayAs(test4));

    System.out.println(test1.hasSameBirthDateAs(test2));
    System.out.println(test1.hasSameBirthDateAs(test3));
    System.out.println(test1.hasSameBirthDateAs(test4));
    System.out.println(test1.hasSameBirthDateAs(test5));

    System.out.println(test2.hasSameBirthDateAs(test1));
    System.out.println(test2.hasSameBirthDateAs(test3));
    System.out.println(test2.hasSameBirthDateAs(test4));
    System.out.println(test2.hasSameBirthDateAs(test5));

    System.out.println(test3.hasSameBirthDateAs(test1));
    System.out.println(test3.hasSameBirthDateAs(test2));
    System.out.println(test3.hasSameBirthDateAs(test4));
    System.out.println(test3.hasSameBirthDateAs(test5));

    System.out.println(test4.hasSameBirthDateAs(test1));
    System.out.println(test4.hasSameBirthDateAs(test2));
    System.out.println(test4.hasSameBirthDateAs(test3));
    System.out.println(test4.hasSameBirthDateAs(test5));

    System.out.println(test5.hasSameBirthDateAs(test1));
    System.out.println(test5.hasSameBirthDateAs(test2));
    System.out.println(test5.hasSameBirthDateAs(test3));
    System.out.println(test5.hasSameBirthDateAs(test4));

    System.out.println(test1.olderThan(test2));
    System.out.println(test1.olderThan(test3));
    System.out.println(test1.olderThan(test4));
    System.out.println(test1.olderThan(test5));

    System.out.println(test2.olderThan(test1));
    System.out.println(test2.olderThan(test3));
    System.out.println(test2.olderThan(test4));
    System.out.println(test2.olderThan(test5));

    System.out.println(test3.olderThan(test1));
    System.out.println(test3.olderThan(test2));
    System.out.println(test3.olderThan(test4));
    System.out.println(test3.olderThan(test5));

    System.out.println(test4.olderThan(test1));
    System.out.println(test4.olderThan(test2));
    System.out.println(test4.olderThan(test3));
    System.out.println(test4.olderThan(test5));

    System.out.println(test5.olderThan(test1));
    System.out.println(test5.olderThan(test2));
    System.out.println(test5.olderThan(test3));
    System.out.println(test5.olderThan(test4));

    System.out.println(test1.youngerThan(test2));
    System.out.println(test1.youngerThan(test3));
    System.out.println(test1.youngerThan(test4));
    System.out.println(test1.youngerThan(test5));

    System.out.println(test2.youngerThan(test1));
    System.out.println(test2.youngerThan(test3));
    System.out.println(test2.youngerThan(test4));
    System.out.println(test2.youngerThan(test5));

    System.out.println(test3.youngerThan(test1));
    System.out.println(test3.youngerThan(test2));
    System.out.println(test3.youngerThan(test4));
    System.out.println(test3.youngerThan(test5));

    System.out.println(test4.youngerThan(test1));
    System.out.println(test4.youngerThan(test2));
    System.out.println(test4.youngerThan(test3));
    System.out.println(test4.youngerThan(test5));

    System.out.println(test5.youngerThan(test1));
    System.out.println(test5.youngerThan(test2));
    System.out.println(test5.youngerThan(test3));
    System.out.println(test5.youngerThan(test4));

    try(var output = new PrintWriter(new FileOutputStream(
    new File("output.txt"), true))){
      output.println("\nTESTS FOR DateAndPlaceOfBirth.java");

      DateAndPlaceOfBirth test12 = new DateAndPlaceOfBirth(1999, 04, 19,
                                        "New York", "New York", "USA");
      DateAndPlaceOfBirth test22 = new DateAndPlaceOfBirth(1989, 02, 25,
                                        "Tallahassee", "Florida", "USA");
      DateAndPlaceOfBirth test32 = new DateAndPlaceOfBirth(1999, 04, 19,
                                        "Indianapolis", "Indiana", "USA");
      DateAndPlaceOfBirth test42 = new DateAndPlaceOfBirth(2001, 11, 03,
                                        "Seville", "Spain");
      DateAndPlaceOfBirth test52 = new DateAndPlaceOfBirth(1964, 04, 19,
                                        "Johannesburg", "South Africa");
      output.println(test12);
      output.println(test22);
      output.println(test32);
      output.println(test42);
      output.println(test52);

      output.println(test12.hasSameBirthDayAs(test22));
      output.println(test12.hasSameBirthDayAs(test32));
      output.println(test12.hasSameBirthDayAs(test42));
      output.println(test12.hasSameBirthDayAs(test52));

      output.println(test22.hasSameBirthDayAs(test12));
      output.println(test22.hasSameBirthDayAs(test32));
      output.println(test22.hasSameBirthDayAs(test42));
      output.println(test22.hasSameBirthDayAs(test52));

      output.println(test32.hasSameBirthDayAs(test12));
      output.println(test32.hasSameBirthDayAs(test22));
      output.println(test32.hasSameBirthDayAs(test42));
      output.println(test32.hasSameBirthDayAs(test52));

      output.println(test42.hasSameBirthDayAs(test12));
      output.println(test42.hasSameBirthDayAs(test22));
      output.println(test42.hasSameBirthDayAs(test32));
      output.println(test42.hasSameBirthDayAs(test52));

      output.println(test52.hasSameBirthDayAs(test12));
      output.println(test52.hasSameBirthDayAs(test22));
      output.println(test52.hasSameBirthDayAs(test32));
      output.println(test52.hasSameBirthDayAs(test42));

      output.println(test12.hasSameBirthDateAs(test22));
      output.println(test12.hasSameBirthDateAs(test32));
      output.println(test12.hasSameBirthDateAs(test42));
      output.println(test12.hasSameBirthDateAs(test52));

      output.println(test22.hasSameBirthDateAs(test12));
      output.println(test22.hasSameBirthDateAs(test32));
      output.println(test22.hasSameBirthDateAs(test42));
      output.println(test22.hasSameBirthDateAs(test52));

      output.println(test32.hasSameBirthDateAs(test12));
      output.println(test32.hasSameBirthDateAs(test22));
      output.println(test32.hasSameBirthDateAs(test42));
      output.println(test32.hasSameBirthDateAs(test52));

      output.println(test42.hasSameBirthDateAs(test12));
      output.println(test42.hasSameBirthDateAs(test22));
      output.println(test42.hasSameBirthDateAs(test32));
      output.println(test42.hasSameBirthDateAs(test52));

      output.println(test52.hasSameBirthDateAs(test12));
      output.println(test52.hasSameBirthDateAs(test22));
      output.println(test52.hasSameBirthDateAs(test32));
      output.println(test52.hasSameBirthDateAs(test42));

      output.println(test12.olderThan(test22));
      output.println(test12.olderThan(test32));
      output.println(test12.olderThan(test42));
      output.println(test12.olderThan(test52));

      output.println(test22.olderThan(test12));
      output.println(test22.olderThan(test32));
      output.println(test22.olderThan(test42));
      output.println(test22.olderThan(test52));

      output.println(test32.olderThan(test12));
      output.println(test32.olderThan(test22));
      output.println(test32.olderThan(test42));
      output.println(test32.olderThan(test52));

      output.println(test42.olderThan(test12));
      output.println(test42.olderThan(test22));
      output.println(test42.olderThan(test32));
      output.println(test42.olderThan(test52));

      output.println(test52.olderThan(test12));
      output.println(test52.olderThan(test22));
      output.println(test52.olderThan(test32));
      output.println(test52.olderThan(test42));

      output.println(test12.youngerThan(test22));
      output.println(test12.youngerThan(test32));
      output.println(test12.youngerThan(test42));
      output.println(test12.youngerThan(test52));

      output.println(test22.youngerThan(test12));
      output.println(test22.youngerThan(test32));
      output.println(test22.youngerThan(test42));
      output.println(test22.youngerThan(test52));

      output.println(test32.youngerThan(test12));
      output.println(test32.youngerThan(test22));
      output.println(test32.youngerThan(test42));
      output.println(test32.youngerThan(test52));

      output.println(test42.youngerThan(test12));
      output.println(test42.youngerThan(test22));
      output.println(test42.youngerThan(test32));
      output.println(test42.youngerThan(test52));

      output.println(test52.youngerThan(test12));
      output.println(test52.youngerThan(test22));
      output.println(test52.youngerThan(test32));
      output.println(test52.youngerThan(test42));

    } catch (FileNotFoundException e) {
       e.printStackTrace();
    }

  }
}
