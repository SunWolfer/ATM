package ATM;
import java.util.Scanner;

public class DrawMoney{
	private User user;
	public  DrawMoney(User user){
		this.user = user;
	}
	public void showDraw(){
			System.out.println("������ȡ��Ľ�");
			double draw = new Scanner(System.in).nextDouble();

			if(draw<=user.getBalance()){
				SubMenu submenu = new SubMenu(user);
				submenu.subMenu();
				int input = new Scanner(System.in).nextInt();
				if(input==1){
					user.setBalance(user.getBalance()-draw);
					submenu.subMenu1();
				}
				if(input==2){
					showDraw();
				}
				if(input==3){
					submenu.subMenu1();
				}
			}else{
				System.out.println("���㣬����������");
				showDraw();
			}

	}
}
