package ATM;

public class Atm{
	private User[] users = new User[]{
		new User("370120180104","�����",1000,"123456"),
		new User("370120180108","������",1000,"654321")
	};
	private User user;
	public User getUser(){
		return user;
	}
	public void DrawBusiness(){

		user.setBalance(user.getBalance()-user.getDraw());
	}
	public void OperaBusiness(){
		user.setBalance(user.getBalance()+user.getOpera());
	}
	public void OtherBusiness(User otheruser){
		user.setBalance(user.getBalance()-user.getOthermoney());
		otheruser.setBalance(otheruser.getBalance()+user.getOthermoney());
	}
	public User Finduser(User user){//��֤�˻�
		for(int i = 0;i<users.length;i++){
			if(user.getAccount().equals(users[i].getAccount()))
				return users[i];
		}
		return null;
	}
	public static boolean checkAccount(String Account){
		return Account.matches("[0-9]{12}"); //��֤�˻����Ȳ�ֻ��������	
	}
	
	public boolean Login(User user){
		User result = Finduser(user);
		if(result==null){
			return false;
		}else{
			if(result.getPassword().equals(user.getPassword())){
				this.user = result;
				return true;
			}
		}
		return false;
	}
}
