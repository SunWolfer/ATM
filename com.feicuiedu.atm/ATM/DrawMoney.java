package ATM;
import java.util.Scanner;

public class DrawMoney extends Virtual{

	public Virtual show(){
			System.out.println("������ȡ��Ľ�");
			double draw = new Scanner(System.in).nextDouble();

			if(draw<=user.getBalance()){
				SubMenu submenu = new SubMenu();
				submenu.subMenu();
				int input = new Scanner(System.in).nextInt();
				if(input==1){
					atm.DrawBusiness(draw);
					submenu.subMenu1();
					return new MainMenu();
				}
				else if(input==2){
					return this;
				}
				else if(input==3){
					return new MainMenu();
				}
				else{
					return this;
				}
			}else{
				System.out.println("���㣬����������");
				return this;
			}

	}
}
