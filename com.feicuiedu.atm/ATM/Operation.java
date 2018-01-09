package ATM;
import java.util.Scanner;

public class Operation{
	private User user;
	public Operation(User user){
		this.user = user;
	}
	public void showOperation(){
			System.out.println("请输入存款的金额：");
			double opera = new Scanner(System.in).nextDouble();
				SubMenu submenu = new SubMenu(user);
				submenu.subMenu();
				int input1 = new Scanner(System.in).nextInt();
				if(input1==1){
					user.setBalance(user.getBalance()+opera);
					submenu.subMenu1();
				}
				if(input1==2){
					showOperation();
				}
				if(input1==3){
					submenu.subMenu1();
				}

	}
}
