package ATM;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Transfer extends Virtual{

	public Virtual show(){
		Scanner sc = new Scanner(System.in);
		SubMenu submenu = new SubMenu();
		Date date = new Date();
		System.out.println("������Է�����");
		String Account = sc.nextLine();
		User user1 = atm.Finduser(new User(Account,null));
		if(!atm.checkAccount(Account)){
				System.out.println("�˺ű���Ϊ12λ����");
				return this;
			}
		if(user1==null){
				System.out.println("�û�������");
				return this;
			}
		System.out.println("������ת�˽��");
		user.setOthermoney(Double.valueOf(sc.nextLine()));
		submenu.subMenu();

		String number2 = sc.nextLine();
		if(number2.equals("1")){//ת��ҵ��˵�
			submenu.otherMessage(user1,user.getOthermoney());
				submenu.othersbu();
				String number3 = sc.nextLine();
					if(number3.equals("1")){
						if(user.getOthermoney()<=user.getBalance()){
							System.out.println("ת�˳ɹ�!");
							atm.OtherBusiness(user1);
							SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy��MM��dd��HHʱmm��ss��"); //ת�˳ɹ�ʱ��
							user.setTransferdate(sdf3.format(date));
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