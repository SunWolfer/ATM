package ATM;

public class Atm{
	private User[] users = new User[]{
		new User("370120180104","翡翠侠","1000","123456"),
		new User("370120180108","钢铁侠","1000","654321")
	}
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
	public int Finduser(User user){
		for(int i = 0;i<users.length;i++){
			if(user.getAccount().equals(User[i].getAccount()))
				return i;
		}
		return -1;
	}
	public boolean Login(User user){
		int result = Finduser(user);
		if(result==-1){
			return false;
		}else{
			if(users[result].getPassword().equals(user.getPassword()){
				this.user = users[result];
				return true;
			}
		}
	}
}
