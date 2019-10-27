package Day3Homework;

import java.util.Scanner;

public class Employee {
	int id;
	int age;
	String name;
	double salary;
	
	public Employee(int id, int age, String name, double salary) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		
	}
	
	public void CreateEmployee() {
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Enter employee id: ");
		this.id = inputDevice.nextInt();
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
