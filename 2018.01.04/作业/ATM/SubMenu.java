package ATM;

import java.util.Scanner;

public class SubMenu{
	private User user;
	public SubMenu(User user){
		this.user = user;
	}
	public void subMenu(){//确认 重新输入 返回主菜单
		System.out.println("1:确认" +"\n"+ "2:重新输入" +"\n"+ "3:返回主菜单"+"\n") ;
	}
	public void otherMessage(OtherUser otheruser){//她人信息

		System.out.println("姓名：苍老师"+"\n"+"银行卡号"+otheruser.getOtheraccount()+"\n"+"转账金额"+otheruser.getOthermoney()+"\n") ;
	}
	public void subMenu1(){
		System.out.println("操作成功");
		MainMenu mainmenu = new MainMenu(user);
		mainmenu.showMainMenu();
	}
	public void othersbu(){
		System.out.println("1:确认转账" +"\n"+ "2:返回上一级" +"\n"+ "3:退卡"+"\n") ;
	}
}

