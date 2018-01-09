package ATM;

public class Atm{
	private User[] users = new User[]{
		new User("370120180104","Ù‰¥‰œ¿",1000,"123456"),
		new User("370120180108","∏÷Ã˙œ¿",1000,"654321")
	};
	private User user;
	public User getUser(){
		return user;
	}
	public void DrawBusiness(double draw){

		user.setBalance(user.getBalance()-draw);
	}
	public void OperaBusiness(double opera){
		user.setBalance(user.getBalance()+opera);
	}
	public void OtherBusiness(double othermoney,User otheruser){
		user.setBalance(user.getBalance()-othermoney);
		otheruser.setBalance(otheruser.getBalance()+othermoney);
	}
	public User Finduser(User user){
		for(int i = 0;i<users.length;i++){
			if(user.getAccount().equals(users[i].getAccount()))
				return users[i];
		}
		return null;
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
