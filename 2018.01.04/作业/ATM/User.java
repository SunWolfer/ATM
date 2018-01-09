package ATM;

public class User{

	private String account;
	private String name;
	private double balance;
	private String password;

	public User(String account,String name,double balance,String password){
		this.account = account;
		this.name = name;
		this.balance = balance;
		this.password = password;
	}

	public String  getAccount() {

		return account;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance() {

		return balance;
	}
2
	public String getName() {
		return name;
	}

	public String getPassword() {

		return password;
	}
/*	public boolean VerifyAccount(String account){
		if (account.equals(this.account)){
			return true;
		}else{
			System.out.println("ÕËºÅ´íÎó£¬ÇëÖØĞÂÊäÈë:");
			return false;
		}
	}
	public boolean VerifyPassword(String password){
		if(password.equals(this.password)){
			return true;
		}else{
			System.out.println("ÃÜÂë´íÎó£¬ÇëÖØĞÂÊäÈë:");
			return false;
		}
	}*/
}
