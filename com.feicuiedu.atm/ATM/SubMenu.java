package ATM;

import java.util.Scanner;

public class SubMenu{
	private User user;
	public SubMenu(User user){
		this.user = user;
	}
	public void subMenu(){//ȷ�� �������� �������˵�
		System.out.println("1:ȷ��" +"\n"+ "2:��������" +"\n"+ "3:�������˵�"+"\n") ;
	}
	public void otherMessage(OtherUser otheruser){//������Ϣ

		System.out.println("����������ʦ"+"\n"+"���п���"+otheruser.getOtheraccount()+"\n"+"ת�˽��"+otheruser.getOthermoney()+"\n") ;
	}
	public void subMenu1(){
		System.out.println("�����ɹ�");
		MainMenu mainmenu = new MainMenu(user);
		mainmenu.showMainMenu();
	}
	public void othersbu(){
		System.out.println("1:ȷ��ת��" +"\n"+ "2:������һ��" +"\n"+ "3:�˿�"+"\n") ;
	}
}

