package ATM;
import java.util.Scanner;

public class Login extends Virtual{


	public Virtual show(){
		Scanner sc = new Scanner(System.in);
			System.out.println("�������˺�:");
			String Account = sc.nextLine();
			User user = new User(Account,null);
			if(Account.length()!=12){
				System.out.println("�˺ű���Ϊ12λ");
				return new Login();
			}
			if(atm.Finduser(user)==null){
				System.out.println("�û�������");
				return new Login();
			}

			System.out.println("����������");
			String Password = sc.nextLine();
			user.setPassword(Password);
			if(!atm.Login(user)){
				System.out.println("�������");
				return new Login();
			}

			return new MainMenu();
	}
}
