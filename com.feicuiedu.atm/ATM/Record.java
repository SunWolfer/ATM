package ATM;

public class Record extends Virtual{
	public Virtual show(){
		if(user.getDrawdate()==null&&user.getOperationdate()==null&&user.getTransferdate()==null){
			System.out.println("���޽�����Ϣ");
		}else{
			System.out.println(user.getSb());			  
		}
		return new MainMenu();
	}
}