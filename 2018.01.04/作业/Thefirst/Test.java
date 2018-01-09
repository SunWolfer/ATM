import java.util.Scanner;

public class Test{

	public static void main(String[] args)   {
		s:while(true){
			User user = new User("370120180104","123456");
			Scanner sc = new Scanner(System.in);
			while(true){
				System.out.println("请输入账号:");

				String Account = sc.nextLine();
				if(user.VerifyAccount(Account)){
					break;
				}
			}

			while(true){
				System.out.println("请输入密码");
				String Password = sc.nextLine();
				if(user.VerifyPassword(Password)){
					break;
				}
			}
			user.setName("zhy");     //账户余额查询
			user.setBalance(1000.00);

			a:while(true){//主菜单
				System.out.print(user);
				System.out.println("请输入你要选择的业务：");

				String num = sc.nextLine();
				if(num.equals("1")){//查询业务
					while(true){

						System.out.println(user.getName());
						System.out.println("1:返回主菜单");
						int num1 = sc.nextInt();
						if(num1==1){
						break;
						}
					}

				}

				if(num.equals("2")){//转账业务
					while(true){
					System.out.println("请输入对方的卡号:");
					String otheraccount = sc.nextLine();
					if(user.VerifyOtheraccount(otheraccount)){
							break;
						}
					}
					b:while(true){//转账业务菜单
						System.out.println("请输入转账金额");
						double othermoney = sc.nextDouble();
						System.out.println(user.subMenu());
						while(true){

						String num1 = sc.nextLine();
							if(num1.equals("1")){//转账业务菜单
								user.setOthermoney(othermoney);
								System.out.println(user.otherMessage());

								while(true){

									System.out.println(user.subMenu1());
									String num2 = sc.nextLine();

									if(num2.equals("1")){
										if(othermoney<=user.getBalance()){
										System.out.println("转账成功!");
										user.setBalance(user.getBalance()-othermoney);
										continue a ;
										}else{
											System.out.println("余额不足，请重新输入：");
												continue b;
										}
									}
									if(num2.equals("2")){
										continue b;
									}
									if(num2.equals("3")){
										continue s;
									}
								}

							}
							if(num1.equals("2")){
								continue b;
							}
							if(num1.equals("3")){
							continue a;
							}
						}
					}



				}
				if (num.equals("3")){//取款业务


					c:while(true){
						System.out.println("请输入要取款的金额：");
						double takemoney = sc.nextDouble();
						System.out.println(user.subMenu());
						while(true){

							String num1 = sc.nextLine();
							if(num1.equals("1")){
								if(takemoney<=user.getBalance()){
									user.setBalance(user.getBalance()-takemoney);
									continue a;
								}else{
										System.out.println("余额不足，请重新输入：");
										continue c;
								}
							}
							if(num1.equals("2")){
								continue c;
							}
							if(num1.equals("3")){
							continue a;
							}
						}

					}
				}
				if(num.equals("4")){//存款业务
					d:while(true){
						System.out.println("请输入你要存款的金额:");
						double savemoney = sc.nextDouble();
						System.out.println(user.subMenu());
						while(true){

							String num3 = sc.nextLine();
							if(num3.equals("1")){
								user.setBalance(user.getBalance()+savemoney);
								continue a;
							}
							if(num3.equals("2")){
								continue d;
							}
							if(num3.equals("3")){
							continue a;
							}
						}
					}

				}
				if(num.equals("5")){
					continue s;
				}

				continue;
			}
		}

	}
}


