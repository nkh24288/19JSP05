package Day2;

public class MainDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog("Fox", "Yellow", "Male");
		Dog dog2 = new Dog("Xù", "Black", "Female");
		Dog dog3 = new Dog("Bin", "Gray", "Male");
		
		print(dog1,1);
		Dog.wagging("Không đuôi");
		Dog.barking("Sủa rát to");
		Dog.eating("Ăn nhiều");
		
		print(dog2,2);
		Dog.wagging("..");
		Dog.barking("---");
		Dog.eating(":::::");
		
		print(dog3,3);
		Dog.wagging("+++");
		Dog.barking("/////");
		Dog.eating("$$$$");
	}
	
	public static void print(Dog dog, int id) {
		System.out.println("Student"+id+" " +dog.name+" "+dog.color+ " " +dog.gender);
	}

}
