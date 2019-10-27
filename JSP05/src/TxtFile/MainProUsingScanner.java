package TxtFile;
import java.io.File;
import java.util.Scanner;

public class MainProUsingScanner {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		// pass the path to the file as a parameter
		File file = new File ("C:\\temp\\test.txt");
		System.out.println("Read file using Scanner method");
		Scanner sc = new Scanner(file);
		
		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
	}

}
