package ATM;
import java.util.Scanner;

public class Transfer extends Virtual{

	public Virtual show(){
		Scanner sc = new Scanner(System.in);
		SubMenu submenu = new SubMenu();
		System.out.println("请输入对方卡号");
		String Account = sc.nextLine();
		User user1 = atm.Finduser(new User(Account,null));
		if(Account.length()!=12){
				System.out.println("账号必须为12位");
				return this;
			}
		if(user1==null){
				System.out.println("用户不存在");
				return this;
			}
		System.out.println("请输入转账金额");
		double othermoney = Double.valueOf(sc.nextLine());
		submenu.subMenu();

		String number2 = sc.nextLine();
		if(number2.equals("1")){//转账业务菜单
			submenu.otherMessage(user1,othermoney);
				submenu.othersbu();
				String number3 = sc.nextLine();
					if(number3.equals("1")){
						if(othermoney<=user.getBalance()){
							System.out.println("转账成功!");
							atm.OtherBusiness(othermoney,user1);
							submenu.subMenu1();
							return new MainMenu();
						}else{
							System.out.println("余额不足，请重新输入：");
							return this;
							}
						}
						if(number3.equals("2")){
							return this;
							}
						if(number3.equals("3")){
							return new Login();
						}
					}
			if(number2.equals("2")){
				return this;
				}
			if(number2.equals("3")){
				return new MainMenu();
				}
				return this;
    }
}
