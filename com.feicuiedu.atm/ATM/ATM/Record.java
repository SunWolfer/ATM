package ATM;

public class Record extends Virtual{
	public Virtual show(){
		DrawMoney drawmoney = new DrawMoney();
		Operation operation = new Operation();
		Transfer transfer = new Transfer();
		System.out.println(user.getDrawdate()+"成功取款"+user.getDraw());
		System.out.println(user.getOperationdate()+"成功存款"+user.getOpera());
		System.out.println(user.getTransferdate()+"成功转账"+user.getOthermoney());
		return new MainMenu();
	}
}