package ATM;
import java.util.Scanner;

public class Login{
	private User user;
	public Login(User user){
		this.user = user;
	}
	public void login(){
		Scanner sc = new Scanner(System.in);
		while(true){
				System.out.println("«Î ‰»Î’À∫≈:");
				String Account = sc.nextLine();
				/*if(user.VerifyAccount(Account)){
					break;
				}*/
			}

		while(true){
			System.out.println("«Î ‰»Î√‹¬Î");
			String Password = sc.nextLine();
			/*if(user.VerifyPassword(Password)){
				break;
			}*/
		}
		MainMenu mainmenu = new MainMenu(user);
		mainmenu.showMainMenu();
	}
}
