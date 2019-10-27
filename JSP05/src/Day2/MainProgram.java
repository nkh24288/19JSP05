package Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Dave", "Boy", 6);
		Student student2 = new Student("Join", "Boy", 7);
		Student student3 = new Student("Juli", "Girl", 6);
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		for (int i = 0; i< students.size(); i++) {
			print(students.get(i),i+1);
		}
		
		System.out.println("-----------------------");
		
		//hay dung cach duoi de in 
		int i=0;
		for (Student item:students) {
			print(item, i+1);
			i++;
		}
		
		//tim kiem , nho ham searchByName o phia duoi
		System.out.println("----------------------------------");
		System.out.println("Enter the name want to search: ");
		Scanner scanner = new Scanner(System.in);
		String keySearch = scanner.nextLine();
		Student student = searchByName(students, keySearch);
		printSearch(student);
		
		
		
//		System.out.println("Student1:" +student1.name+" "+student1.gender+ " " +student1.age);
//		System.out.println("Student2:" +student2.name+" "+student2.gender+ " " +student2.age);
//		System.out.println("Student1:" +student3.name+" "+student3.gender+ " " +student3.age);
		
		//print(student1, 1);
		//print(student2, 2);
		//print(student3, 3);
	}
	
	public static void print(Student student, int id) {
		System.out.println("Student:"+id+" " +student.name+" "+student.gender+ " " +student.age);
	}
	
	public static void printSearch(Student student) {
		System.out.println("Student found" +student.getName() + " " +student.getAge()+ " " +student.getGender());
	}
	
	public static Student searchByName(List<Student> students, String keySearch) {
		for (Student student:students) {
			if(keySearch.equals(student.getName())) {
				return student;
			}
		}
		return null;
	}
}
