package Day3Homework2;

import java.util.Scanner;

public class Main {

	
	

	

	public static void displayMenu() {
		
		do {
			System.out.println("--- --- MENU --- ---");
			System.out.println("1. Create employee");
			System.out.println("2. Show the existing");
			System.out.println("3. Exit");
			System.out.println("--- --- --- --- ---");
			System.out.println("Enter your choice: ");
			
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Create employee");
				break;
			case 2:
				System.out.println("Show the existing");
				break;
			case 3:
				System.exit(0);
				break;
			default:
				displayMenu();
			}
		    
		}while(choice != 3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
