package ATM;
import java.util.Scanner;

public class Transfer{
	private User user;
	public Transfer(User user){
	this.user = user;
	}

	public void Transfer(){
		Scanner sc = new Scanner(System.in);
		SubMenu submenu = new SubMenu(user);
		OtherUser otheruser = new OtherUser();
		otheruser.otheruser();
		System.out.println("������ת�˽��");
		double othermoney = Double.valueOf(sc.nextLine());
		submenu.subMenu();

		String number2 = sc.nextLine();
		if(number2.equals("1")){//ת��ҵ��˵�
			otheruser.setOthermoney(othermoney);
			submenu.otherMessage(otheruser);
				submenu.othersbu();
				String number3 = sc.nextLine();
					if(number3.equals("1")){
						if(othermoney<=user.getBalance()){
							System.out.println("ת�˳ɹ�!");
							user.setBalance(user.getBalance()-othermoney);
							submenu.subMenu1();
						}else{
							System.out.println("���㣬���������룺");
							Transfer();
							}
						}
						if(number3.equals("2")){
							Transfer();
							}
						if(number3.equals("3")){
							Login login = new Login(user);
							login.login();
						}
					}
			if(number2.equals("2")){
				Transfer();
				}
			if(number2.equals("3")){
				MainMenu mainmenu = new MainMenu(user);
				mainmenu.showMainMenu();
				}

    }
}
