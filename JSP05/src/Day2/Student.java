package Day2;

public class Student {
	//static String name;
	//static String gender;
	//static int age;
	//public Student(String na, int ag, String ge) {
			//name = na;
			//age = ag;
			//gender = ge;
	//}
	//public Student(String name, int age, String gender) {
		
	//}
		//public static void main(String []args) {
		//Student studentA = new Student("Dave", 6, "Boy");
		//System.out.println("StudentA: " +name+" "+gender+" "+age); 
				
		//Student studentB = new Student("Join", 7, "Boy");
		//System.out.println("StudentB: " +name+" "+gender+" "+age); 
		
		//Student studentC = new Student("Juli", 6, "Girl");
		//System.out.println("StudentC: " +name+" "+gender+" "+age); 
	//}
//}
	//------------------
	//String name;
	//String gender;
	//int age;
	

	/*public Student(String name, int age, String gender) {
	/	System.out.println(name+" "+gender+" "+age); 
	/}
	/	public static void main(String []args) {
	/	Student studentA = new Student("Dave", 6, "Boy");
	/	Student studentB = new Student("Join", 7, "Boy");
	/	Student studentC = new Student("Juli", 6, "Girl");
	/	}
	*/
	//----------gv giai------------------
	
	public String name;
	public int age;
	public String gender;
	
	public Student(String name, String gender, int age) {
		this.name = name; //thuá»™c tÃ­nh cá»§a nÃ³ this.name báº±ng giÃ¡ trá»‹ nÃ³ truyá»�n vÃ o contrustor
		this.gender = gender;
		this.age = age;
	}
	//khai bÃ¡o trong hÃ m main

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
