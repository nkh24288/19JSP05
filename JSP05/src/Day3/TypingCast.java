package Day3;

public class TypingCast {
	
	public static void main(String[] args) {
		float d = 35.8f;
		int e = (int)d +1;
		System.out.println(e);
		
		String c = "35";
		int b = Integer.parseInt(c) + 1; //dùng WRAPPER CLASS
		System.out.println(b);
		
		String h = "35.f";
		float g = Float.parseFloat(h);//trung gian
		int m = (int)g + 1;
		System.out.println(m);
	}
}
