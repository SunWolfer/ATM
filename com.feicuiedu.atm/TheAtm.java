import ATM.*;

public class TheAtm{
	public static void main(String[] args) {
		User user = new User();
		Login login = new Login(user);
		login.login();
	}
}
