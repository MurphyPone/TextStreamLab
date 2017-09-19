import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class textTester {
	//Method that returns scanner of words.txt
	//Method that returns a PrintWriter of ramblex dictionary.java
	
	public static Scanner openWords(String fname) {
		File file = new File(fname);
		Scanner input = null; 
				
		try {
			input = new Scanner(file);
		} catch (FileNotFoundException ex) {
			System.out.println("error u goob, no can do bc of " + ex.toString());
			return null;
		}
		
		return input;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 1) {
			System.out.println("No file given, not enough args");
			System.exit(1);
		}
		Scanner in = openWords(args[0]);
		System.out.println(in.nextLine());
		in.close();
	}
}
