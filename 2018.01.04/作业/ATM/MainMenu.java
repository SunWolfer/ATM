package ATM;
import java.util.Scanner;


public class MainMenu{
	private User user;
	public MainMenu(User user){
		this.user = user;
	}

	public void showMainMenu(){
		System.out.println("�˵�����ѡ��Ҫ�����ҵ��");
		System.out.println("1:��ѯ");
		System.out.println("2:ת��");
		System.out.println("3:ȡ��");
		System.out.println("4:���");
		System.out.println("5:�˿�");

		int num = new Scanner(System.in).nextInt();
		if(num==1){
			QueryMenu querymenu = new QueryMenu(user);
			querymenu.showQueryMenu();
		}
		if(num==2){
			Transfer transfer = new Transfer(user);
			transfer.Transfer();
		}
		if(num==3){
			DrawMoney drawmoney = new DrawMoney(user);
			drawmoney.showDraw();
		}
		if(num==4){
			Operation operation = new Operation(user);
			operation.showOperation();
		}
		if(num==5){
			Login login = new Login(user);
			login.login();
		}

	}
}
