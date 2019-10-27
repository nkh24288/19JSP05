package Day3Homework;

import java.util.Scanner;


public class MainProgram {
	
	public static void displayMenu() {
		System.out.println("--- Program Menu ---");
		System.out.println("1. Create employee");
		System.out.println("2. Show the existing employee");
		System.out.println("3. Exit");
		System.out.println("4. Please enter a choice of 1,2 or 3. Choise number 0 to display menu");
		System.out.println("--- --- --- --- ---");
	}
	
	public static int getChoice() {
		int choice;
		
		do {
			Scanner inputDevice = new Scanner(System.in);
			
			displayMenu();
			System.out.println("Please enter your choice: ");
			choice = inputDevice.nextInt();
			if(choice > 3 || choice < 1)
				System.out.println("This is an invalid choice!");
		} while (choice <=3);
		
		return choice;
	}
	
		

	
	public static void main(String[] args) {
		
		
		//------ Main Program ------ displayMenu() above 
		/*System.out.println("--- Program Menu ---");
		System.out.println("1: Create employee");
		System.out.println("2: Show the existing employee");
		System.out.println("3: Exit");
		System.out.println("--- --- --- --- ---");*/
		
		//---- Input number ----
		/*System.out.println("Please enter your choice: ");
		Scanner input = new Scanner(System.in);
		int choise = input.nextInt();*/
		//System.out.println("Your input number:" +choise);
		
		//--- Input employees number ---
		/*System.out.println("Please enter employees number: ");
		Scanner input1 = new Scanner(System.in);
		int number = input1.nextInt();*/
		
		
		
		displayMenu();
		
		Scanner inputDevice = new Scanner(System.in);
	    int choice = inputDevice.nextInt();
		
		
		//Employee[] employee = new Employee[3];
		Employee employee[]=null;
		
		//---- Choose menu ----
			
			switch(choice) {
			case 1:
				System.out.println("Please enter employee number:");
				Scanner input = new Scanner(System.in);
				int en=input.nextInt();
				
				employee = new Employee[en];
				
				for(int i=0; i<en; i++) {
					/*System.out.println("Enter employee id: ");
					int id = inputDevice.nextInt();
					System.out.println("Enter employee age: ");
					int age = inputDevice.nextInt();
					System.out.println("Enter employee name: ");
					String name = inputDevice.next();
					System.out.println("Enter employee salary: ");
					double salary = inputDevice.nextDouble();*/
						
					employee[i] = new Employee();
					employee[i].CreateEmployee();
				}
				
				break;
			case 2:
				System.out.println("Show the existing employee");
				
				if(employee.length==0) {
					System.out.println("Please create employee");
				}
				else {
					
					for(int i=0; i<=employee.length; i++) {
					
					employee[i].ShowEmployee();
					
						}
					}
				break;
			case 3:
				
				System.out.print("Goodbye!");
				System.exit(0);
				break;
			default: 
				//System.out.println("Return to main menu");
				displayMenu();
			}
		}
		
	
	public void CreateEmployee() {
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Enter employee id: ");
		id = inputDevice.nextInt();
		System.out.println("Enter employee age: ");
		this.age = inputDevice.nextInt();
		System.out.println("Enter employee name: ");
		this.name = inputDevice.next();
		System.out.println("Enter employee salary: ");
		this.salary = inputDevice.nextDouble();
	}
	
	public void ShowEmployee() {
		//System.out.println("Employee " + i + ": ");
		System.out.print("ID: " +id);
		System.out.print("Name: " +name);
		System.out.print("Age:" +age);
		System.out.print("Salary: " +salary);
	}
	
}
		
	
	


