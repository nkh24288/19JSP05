package DemoModifiers;

import DemoModifiers2.ClassC;

public class ClassB {
	int b1, b2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA classA = new ClassA();
		System.out.println("a=" ); //khong the .a duoc vi no la private
		System.out.println("b=" +classA.b );
		System.out.println("c=" +classA.c);
		System.out.println("d=" +classA.d);
		
		ClassC classC = new ClassC();
		System.out.println("c1=" +classC.c1);
		System.out.println("c2=" ); //khac package chi cho public thoi
	}

}
