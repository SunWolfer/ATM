package ATM;
import java.util.Date;

public class User{

	private String account;//卡号
	private String name;//姓名
	private double balance;//余额
	private String password;//密码
	private String drawdate;//取款时间
	private String operationdate;//存款时间
	private String transferdate;//转账时间
	private double draw;//取款金额
	private double opera;//存款金额
	private double othermoney;//转账金额
	private StringBuffer sb = new StringBuffer();//交易信息

	public User(String account,String name,double balance,String password){
		this.account = account;
		this.name = name;
		this.balance = balance;
		this.password = password;
	}
	public String getSb(){
		return sb.toString();
	}

	public User(String account,String password){
		this.account = account;
		this.password = password;
	}
	public void setDraw(double draw){
		this.draw = draw;
	}
	public double getDraw(){
		return draw;
	}
	
	public void setOpera(double opera){
		this.opera = opera;
	}
	public double getOpera(){
		return opera;
	}
	
	public void setOthermoney(double othermoney){
		this.othermoney = othermoney;
	}
	public double getOthermoney(){
		return othermoney;
	}
	
	public void setDrawdate(String drawdate){
		this.drawdate=drawdate;
	}
	public String getDrawdate(){
		return drawdate;
	}
	
	public void setOperationdate(String operationdate){
		this.operationdate=operationdate;
	}
	public String getOperationdate(){
		return operationdate;
	}

	public void setTransferdate(String transferdate){
		this.transferdate = transferdate;
	}
	
	public String getTransferdate(){
		return transferdate;
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
	
	public void Record(String date,String record,double amount){
		sb.append(date);
		sb.append(" ");
		sb.append(record);
		sb.append(" ");
		sb.append(amount);
		sb.append("\n");//字符串拼接
	}
	

}
