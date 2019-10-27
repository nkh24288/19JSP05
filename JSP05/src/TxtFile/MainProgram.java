package TxtFile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("C:\\temp\\test.txt"));
			System.out.println("Read file using readLine() method");
			String textInAline;
			while  ((textInAline = br.readLine()) !=null) {
				System.out.println(textInAline);
				textInAline = br.readLine();
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
