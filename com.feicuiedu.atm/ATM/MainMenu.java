package ATM;
import java.util.Scanner;


public class MainMenu{
	private User user;
	public MainMenu(User user){
		this.user = user;
	}

	public void showMainMenu(){
		System.out.println("菜单——选择要办理的业务");
		System.out.println("1:查询");
		System.out.println("2:转账");
		System.out.println("3:取款");
		System.out.println("4:存款");
		System.out.println("5:退卡");

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
