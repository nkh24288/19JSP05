package Day3;

import java.util.Scanner;

public class Employee {
	String name;
	int id;
	int age;
	double salary;
	boolean married;
	Job job; //job là kiểu dữ liệu trong employee
	
	//dùng chuột phải -> source -> creat contructor and filee
	public Employee(int id, String name, double salary, Job job) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.job = job;
	}
	
	
	
	
//	
//	Scanner scanner = new Scanner(System.in);
//	
//	public Employee() {
//		super();
//	}
//	
//	public Employee(String name, int id, int age, double salary, boolean married, Job job) {
//		super();
//		this.name=name;
//		this.id=id;
//		this.age=age;
//		this.salary=salary;
//		this.married=married;
//		this.job=job;
//	}
//	
//	public String getname() {
//		return name;
//	}
//	
//	public void setname(String name) {
//		this.name=name;
//	}
//	
//	public int getid() {
//		return id;
//	}
//	
//	public void setid(int id) {
//		this.id=id;
//	}
//	
//	public int getage() {
//		return age;
//	}
//	
//	public void setage(int age) {
//		this.age=age;
//	}
//	
//	public double getsalary() {
//		return salary;
//	}
//	
//	public void setsalary(double salary) {
//		this.salary=salary;
//	}
//	
//	public boolean getmarried() {
//		return married;
//	}
//	
//	public void setmarried(boolean married) {
//		this.married=married;
//	}
//	
//	public Job getjob() {
//		return job;
//	}
//	
//	public void setjob(Job job) {
//		this.job=job;
//	}
//	
//	public void nhap() {
//		System.out.print("Nhập tên nhân viên: ");
//		name = scanner.nextLine();
//		System.out.print("Nhập tuổi nhân viên: ");
//		age = scanner.nextInt();
//		System.out.print("Nhập id nhân viên: ");
//		id = scanner.nextInt();
//		System.out.print("Nhập tiền lương: ");
//		salary = scanner.nextDouble();
//		System.out.print("Nhập tình trạng hôn nhân: ");
//		married = scanner.nextBoolean();
//		System.out.print("Nhập công việc: ");
//		//job = scanner.nextjob();
//		
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//Job job = new Job();
//		
//		String[] job = new String[] {"HR","Developer","CEO","Tester","BA"};
//	
//		for(String jo : job) {
//			System.out.println(jo);
//		}
//	}

}
