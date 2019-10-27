package Day3;

import java.util.Scanner;

public class Ab {
	int a,b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please input a: "); 
		Scanner inputa = new Scanner(System.in);
    	int a = inputa.nextInt();
    	
    	System.out.println("Please input b: "); 
		Scanner inputb = new Scanner(System.in);
    	int b = inputb.nextInt();
    	
    	System.out.println("a+b= " +(a+b));
    	System.out.println("a-b= " +(a-b));
    	System.out.println("a%b= " +(a%b));
    	System.out.println("a/b= " +(a/b));
    	System.out.println("a++= " +(a++));
    	System.out.println("b--= " +(b--));
    	
    	if(a>b)
    		System.out.println("a>b");
    	else
    		System.out.println("a<=b");
	}

}
