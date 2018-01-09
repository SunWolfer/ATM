package ATM;
import java.util.Scanner;

public class Login extends Virtual{


	public Virtual show(){
		Scanner sc = new Scanner(System.in);
			System.out.println("请输入账号:");
			String Account = sc.nextLine();
			User user = new User(Account,null);
			if(Account.length()!=12){
				System.out.println("账号必须为12位");
				return new Login();
			}
			if(atm.Finduser(user)==null){
				System.out.println("用户不存在");
				return new Login();
			}

			System.out.println("请输入密码");
			String Password = sc.nextLine();
			user.setPassword(Password);
			if(!atm.Login(user)){
				System.out.println("密码错误");
				return new Login();
			}

			return new MainMenu();
	}
}
