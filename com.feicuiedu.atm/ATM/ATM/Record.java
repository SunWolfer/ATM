package ATM;

public class Record extends Virtual{
	public Virtual show(){
		DrawMoney drawmoney = new DrawMoney();
		Operation operation = new Operation();
		Transfer transfer = new Transfer();
		System.out.println(user.getDrawdate()+"�ɹ�ȡ��"+user.getDraw());
		System.out.println(user.getOperationdate()+"�ɹ����"+user.getOpera());
		System.out.println(user.getTransferdate()+"�ɹ�ת��"+user.getOthermoney());
		return new MainMenu();
	}
}