package ATM;
import java.util.Scanner;

public class Operation extends Virtual{

	public Virtual show(){
			System.out.println("��������Ľ�");
			double opera = new Scanner(System.in).nextDouble();
				SubMenu submenu = new SubMenu();
				submenu.subMenu();
				int input1 = new Scanner(System.in).nextInt();
				if(input1==1){
					atm.OperaBusiness(opera);
					submenu.subMenu1();
					return new MainMenu();
				}
				if(input1==2){
					return this;
				}
				if(input1==3){
					submenu.subMenu1();
					return new MainMenu();
				}
				return this;
	}
}
