package ATM;
import java.util.Scanner;

public class OtherUser{
	private String otheraccount;
	private double othermoney;
	public void setOthermoney(double othermoney){
		this.othermoney=othermoney;
	}
	public double getOthermoney(){
		return othermoney;
	}
	public String getOtheraccount(){
		return otheraccount;
	}
	public boolean VerifyOtheraccount(String otheraccount){
		if (otheraccount.length()==12){
			this.otheraccount = otheraccount;
			return true;
		}else{
			System.out.println("�˺Ŵ�����������:");
			return false;
		}
	}
	public void otheruser(){
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("������Է�����:");
		String otheraccount = sc.nextLine();
		if(VerifyOtheraccount(otheraccount)){
				break;
			}
		}
	}

}
