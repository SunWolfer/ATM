package ATM;
import java.util.Scanner;

public class QueryMenu{
	private User user;
	public  QueryMenu(User user){
		this.user = user;
	}
	public void showQueryMenu(){
		System.out.println("�˻�����"+user.getName());
		System.out.println("�˻����"+user.getBalance());
		System.out.println("1:�������˵�");

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		while(true){
			if(num1==1){
			MainMenu mainmenu = new MainMenu(user);
			mainmenu.showMainMenu();
			break;
			}
			else{
				continue;
			}
		}

	}
}
