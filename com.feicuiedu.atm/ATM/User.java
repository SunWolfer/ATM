package ATM;
import java.util.Date;

public class User{

	private String account;//����
	private String name;//����
	private double balance;//���
	private String password;//����
	private String drawdate;//ȡ��ʱ��
	private String operationdate;//���ʱ��
	private String transferdate;//ת��ʱ��
	private double draw;//ȡ����
	private double opera;//�����
	private double othermoney;//ת�˽��
	private StringBuffer sb = new StringBuffer();//������Ϣ

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
		sb.append("\n");//�ַ���ƴ��
	}
	

}
