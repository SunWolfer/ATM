
public class User{
	private String account;//本人卡号
	private String password;
	private String name;//本人姓名
	private double balance;//余额
	private String otheraccount;//他人卡号
	private double othermoney;//转账金额

	public User(String account,String password){
		this.account = account;
		this.password = password;
	}
	public String getAccount(){
		return account;
	}
	public String getPassword(){
		return password;
	}

	public boolean VerifyAccount(String account){
		if (account.equals(this.account)){
			return true;
		}else{
			System.out.println("账号错误，请重新输入:");
			return false;
		}
	}
	public boolean VerifyPassword(String password){
		if(password.equals(this.password)){
			return true;
		}else{
			System.out.println("密码错误，请重新输入:");
			return false;
		}
	}
	public String toString(){
		return "菜单-选择要办理的业务"+"\n"+"1:查询"+"\n"+"2:转账"+"\n"
		+"3:取款"+"\n"+"4:存款"+"\n"+"5:退卡"+"\n";
	}


	public void setName(String name){
		this.name = name;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
	public String getName(){
		return "姓名" + name + "账户余额"  + balance;
	}

	public void setOthermoney(double othermoney){
		this.othermoney=othermoney;
	}
	public double getOthermoney(){
		return othermoney;
	}
	public boolean VerifyOtheraccount(String otheraccount){
		if (otheraccount.length()==12){
			this.otheraccount = otheraccount;
			return true;
		}else{
			System.out.println("账号错误，请重新输入:");
			return false;
		}
	}
	public String subMenu(){//确认 重新输入 返回主菜单
		return "1:确认" +"\n"+ "2:重新输入" +"\n"+ "3:返回主菜单"+"\n";
	}
	public String otherMessage(){//她人信息
		return "姓名：苍老师"+"\n"+"银行卡号"+otheraccount+"\n"+"转账金额"+othermoney+"\n";
	}
	public String subMenu1(){//确认 返回上一级 退卡
		return "1:确认"+ "\n"+"2:返回上一级"+"\n"+"3:退卡"+"\n";
	}
}


