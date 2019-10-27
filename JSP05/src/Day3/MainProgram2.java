package Day3;
import java.util.Scanner;

public class MainProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee employee1 = new Employee(1, "Nguyen Van A",3000, new Job(1,"HR"));
		Employee employee2 = new Employee(2, "Nguyen Van B",4000, new Job(2,"BA"));
		Employee employee3 = new Employee(3, "Nguyen Van C",5000, new Job(3,"Tester"));
		Employee employee4 = new Employee(4, "Nguyen Van D",6000, new Job(4,"Developer"));
		Employee employee5 = new Employee(5, "Nguyen Van E",7000, new Job(5,"CEO"));
		
		System.out.print("Please input size of array: ");  //nhập vào từ bàn phím
		Scanner input = new Scanner(System.in);
    	int number = input.nextInt();
    	
		Employee[] employeeArray = new Employee[number];
		employeeArray[0] = employee1; //gán giá trị cho từng phàn tử
		employeeArray[1] = employee2;
		employeeArray[2] = employee3;
		employeeArray[3] = employee4;
		employeeArray[4] = employee5;
		
		//in ra màn hình phần tử cuối cùng
		System.out.println("Employee information: ");
		System.out.println(+employeeArray[employeeArray.length-1].id); 
		System.out.println("Name: " +employeeArray[employeeArray.length-1].name);
		System.out.println("Salary: " +employeeArray[employeeArray.length-1].salary);
		System.out.println("Job: " +employeeArray[employeeArray.length-1].job.name);
		
		//Dùng vòng lặp for để in tất cả các phần tử của mảng
		for(int i=0; i<=employeeArray.length-1; i++) {
			System.out.println("Employee information: ");
			System.out.println(+employeeArray[i].id); 
			System.out.println("Name: " +employeeArray[i].name);
			System.out.println("Salary: " +employeeArray[i].salary);
			System.out.println("Job: " +employeeArray[i].job.name);
		}
	}

}
