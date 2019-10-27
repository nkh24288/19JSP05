package Day2;

/*public class Dog {
	//thuoc tinh của lớp Dog
	String name;
	String color;
	int age;
	
	//tạo phuong thuc
	static void waggingTail() {
		
	}
	static void barKing() { 
		
	}
	static void eaTing() {
		
	}
	
	public void printDog() {
		System.out.println("Name:"+ name);
		System.out.println("Age:"+ age);
		System.out.println("Color:"+ color);
		//System.out.println("Wagging:");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//waggingTail();
		//barKing();
		//eaTing();
		
		//tao 3 con cho
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		//Gán giá trị cho thuộc tính
		dog1.name = "cho 1";
		dog1.age = 2;
		dog1.color = "vàng";
		//dog1.waggingTail = "có";
		
		dog2.name = "chó 2";
		dog2.age = 3;
		dog2.color = "Đen";
		
		dog3.name = "chó 3";
		dog3.age = 4;
		dog3.color = "Đỏ";
		
		//in hành vi 3 con chó
		dog1.printDog();
		dog2.printDog();
		dog3.printDog();
	}

}*/

	public class Dog {
		protected String name;
		protected String color;
		protected String gender;
		
		public Dog(String name, String color, String gender) {
			this.name = name;
			this.color = color;
			this.gender = gender;
		}
		public static void wagging(String waggingAction) {
			System.out.println("wagging detail: " +waggingAction);
		}
		
		public static void barking(String barkingAction) {
			System.out.println("barking detail: " +barkingAction);
		}
		
		public static void eating(String eatingAction) {
			System.out.println("eating detail: " +eatingAction);
		}
	}