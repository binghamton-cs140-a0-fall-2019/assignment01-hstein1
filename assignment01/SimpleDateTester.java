package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester {
	public static void main(String[] args) {
		SimpleDate base = SimpleDate.of(2019, 8, 29);
		SimpleDate tester1 = SimpleDate.of(2019, 8, 28);
		SimpleDate tester2 = SimpleDate.of(2019, 8, 30);
		SimpleDate tester3 = SimpleDate.of(2019, 8, 29);
		
		System.out.println("Expected: false");
		System.out.println(base.before(tester1));
		System.out.println("Expected: true");
		System.out.println(base.before(tester2));
		System.out.println("Expected: false");
		System.out.println(base.before(tester3));
		
		try(var output = new PrintWriter(new FileOutputStream(new File("output.txt"),
		        true))) {
		          output.println("\nTESTS FOR SimpleDate.java:");
		          SimpleDate base2 = SimpleDate.of(2019, 8, 29);
		  		  SimpleDate tester12 = SimpleDate.of(2019, 8, 28);
		  		  SimpleDate tester22 = SimpleDate.of(2019, 8, 30);
		  		  SimpleDate tester32 = SimpleDate.of(2019, 8, 29);
		  		
		  		  output.println("Expected: false");
		  		  output.println(base2.before(tester12));
		  		  output.println("Expected: true");
		  		  output.println(base2.before(tester22));
		  		  output.println("Expected: false");
		  		  output.println(base2.before(tester32));
		        } catch (FileNotFoundException e) {
		            e.printStackTrace();
		        }
		
		
	}
}
