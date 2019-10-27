package Day3;

public class Lab3_2 {
	static int i;
	static int s=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (i=0;i<=10;i++) {
			if(i%2==0) {
				s=s+i;
			}
		//System.out.println("Tong cac so chan: " +s);
		}
		System.out.println("Tong cac so chan: " +s);
	}

}
