package Day4Lab4ATM;

public class ATMImpl implements ATM{
	int idATM;
	int accountId;
		
	
	public int getIdATM() {
		return idATM;
	}
	public void setIdATM(int idATM) {
		this.idATM = idATM;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
		
	}
	@Override
	public boolean withdraw(int stk, double money) {
		if (stk!=accountId)
			return false;
		return true;
	}
	@Override
	public boolean deposit(int stk, double money) {
		
		return false;
	}
	@Override
	public double queryBalance(int stk) {
		
		return 0;
	}
	@Override
	public boolean login(String id, String pasw) {
		
		return false;
	}
	@Override
	public boolean logout(String id) {
		
		return false;
	}
}
