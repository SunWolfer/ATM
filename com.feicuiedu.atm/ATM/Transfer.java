package ATM;
import java.util.Scanner;

public class Transfer extends Virtual{

	public Virtual show(){
		Scanner sc = new Scanner(System.in);
		SubMenu submenu = new SubMenu();
		System.out.println("������Է�����");
		String Account = sc.nextLine();
		User user1 = atm.Finduser(new User(Account,null));
		if(Account.length()!=12){
				System.out.println("�˺ű���Ϊ12λ");
				return this;
			}
		if(user1==null){
				System.out.println("�û�������");
				return this;
			}
		System.out.println("������ת�˽��");
		double othermoney = Double.valueOf(sc.nextLine());
		submenu.subMenu();

		String number2 = sc.nextLine();
		if(number2.equals("1")){//ת��ҵ��˵�
			submenu.otherMessage(user1,othermoney);
				submenu.othersbu();
				String number3 = sc.nextLine();
					if(number3.equals("1")){
						if(othermoney<=user.getBalance()){
							System.out.println("ת�˳ɹ�!");
							atm.OtherBusiness(othermoney,user1);
							submenu.subMenu1();
							return new MainMenu();
						}else{
							System.out.println("���㣬���������룺");
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
