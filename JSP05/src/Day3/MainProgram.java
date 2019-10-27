package Day3;

import java.util.LinkedList;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		/*String arrThongTin[]; //mảng lưu trữ thông tin NV
		LinkedList<String> employeeList = new LinkedList<>();*/
		
		Job job1 = new Job(1,"HR");
		//Job job2 = new Job(2,"BA");
		//Job job3 = new Job(3,"Tester");
		//Job job4 = new Job(4,"Developer");
		//Job job5 = new Job(5,"CEO");
		
		Employee employee1 = new Employee(1, "Nguyen Van A",3000, job1); //nó cần kiểu Job nên phải tạo constructor của thằng Job trong class Job
		//Employee employee1 = new Employee(1, "Nguyen Van A",3000, new Job(1,"HR"));
		Employee employee2 = new Employee(2, "Nguyen Van B",4000, new Job(2,"BA"));
		Employee employee3 = new Employee(3, "Nguyen Van C",5000, new Job(3,"Tester"));
		Employee employee4 = new Employee(4, "Nguyen Van D",6000, new Job(4,"Developer"));
		Employee employee5 = new Employee(5, "Nguyen Van E",7000, new Job(5,"CEO"));
		
		//Object[] objects = new Object[5];
		//Object[0]= employee1;
		Employee[] employeeArray = new Employee[5];
		employeeArray[0] = employee1; //gán giá trị cho từng phàn tử
		employeeArray[1] = employee2;
		employeeArray[2] = employee3;
		employeeArray[3] = employee4;
		employeeArray[4] = employee5;
		
		//in ra màn hình phần tử cuối cùng
		System.out.println("Employee information: ");
		System.out.println("ID: " +employeeArray[4].id);
		//------ dùng lệnh .length để lấy số cuối, --- thay thế cho cái trên  ---------------
		//System.out.println(+employeeArray[employeeArray.length-1].id);   ------------------
		System.out.println("Name: " +employeeArray[4].name);
		System.out.println("Salary: " +employeeArray[4].salary);
		//System.out.println("Job: " +employeeArray[4].job); //mặc định ..[4].job sẽ in ra địa chỉ vùng nhớ (nó chỉ in ra đối tượng chứ không phải là thông tin thuộc tính của đối tượng)
		System.out.println("Job: " +employeeArray[4].job.name);
	}

}
