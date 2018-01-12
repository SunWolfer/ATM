package ATM;

public class Atm{
	private User[] users = new User[]{
		new User("370120180104","翡翠侠",1000,"123456"),
		new User("370120180108","钢铁侠",1000,"654321")
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
	public User Finduser(User user){//验证账户
		for(int i = 0;i<users.length;i++){
			if(user.getAccount().equals(users[i].getAccount()))
				return users[i];
		}
		return null;
	}
	public static boolean checkAccount(String Account){
		return Account.matches("[0-9]{12}"); //验证账户长度并只包含数字	
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
