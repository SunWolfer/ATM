
public class User{
	private String account;//���˿���
	private String password;
	private String name;//��������
	private double balance;//���
	private String otheraccount;//���˿���
	private double othermoney;//ת�˽��

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
			System.out.println("�˺Ŵ�������������:");
			return false;
		}
	}
	public boolean VerifyPassword(String password){
		if(password.equals(this.password)){
			return true;
		}else{
			System.out.println("�����������������:");
			return false;
		}
	}
	public String toString(){
		return "�˵�-ѡ��Ҫ�����ҵ��"+"\n"+"1:��ѯ"+"\n"+"2:ת��"+"\n"
		+"3:ȡ��"+"\n"+"4:���"+"\n"+"5:�˿�"+"\n";
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
		return "����" + name + "�˻����"  + balance;
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
			System.out.println("�˺Ŵ�������������:");
			return false;
		}
	}
	public String subMenu(){//ȷ�� �������� �������˵�
		return "1:ȷ��" +"\n"+ "2:��������" +"\n"+ "3:�������˵�"+"\n";
	}
	public String otherMessage(){//������Ϣ
		return "����������ʦ"+"\n"+"���п���"+otheraccount+"\n"+"ת�˽��"+othermoney+"\n";
	}
	public String subMenu1(){//ȷ�� ������һ�� �˿�
		return "1:ȷ��"+ "\n"+"2:������һ��"+"\n"+"3:�˿�"+"\n";
	}
}


