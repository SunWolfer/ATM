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

	public User(String account,String password){
		this.account = account;
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
	public String getName() {
		return name;
	}
	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword() {

		return password;
	}
/*	public boolean VerifyAccount(String account){
		if (account.equals(this.account)){
			return true;
		}else{
			System.out.println("’À∫≈¥ÌŒÛ£¨«Î÷ÿ–¬ ‰»Î:");
			return false;
		}
	}
	public boolean VerifyPassword(String password){
		if(password.equals(this.password)){
			return true;
		}else{
			System.out.println("√‹¬Î¥ÌŒÛ£¨«Î÷ÿ–¬ ‰»Î:");
			return false;
		}
	}*/
}
