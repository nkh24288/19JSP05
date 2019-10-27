package Day3;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the input number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println("Your input number:" +number);
		
		
		switch(number) {
		case 1:
			System.out.println("Create employee");
			break;
		case 2:
			System.out.println("show the exissting employee");
			break;
		case 3:
			System.out.println("exit");
			break;
		default:
			System.out.println("the number is strange");
			break;
		}
		
		
		
	}

}
