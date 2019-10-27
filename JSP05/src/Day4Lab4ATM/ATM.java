package Day4Lab4ATM;

public interface ATM {

	public boolean withdraw(int stk, double money); //so TK, so Tien
	public boolean deposit(int stk, double money);//nap vao cho ai, 
	public double queryBalance(int stk);
	public boolean login(String id, String pasw);
	public boolean logout(String id);
}
