import java.util.Scanner;

public class Test{

	public static void main(String[] args)   {
		s:while(true){
			User user = new User("370120180104","123456");
			Scanner sc = new Scanner(System.in);
			while(true){
				System.out.println("�������˺�:");

				String Account = sc.nextLine();
				if(user.VerifyAccount(Account)){
					break;
				}
			}

			while(true){
				System.out.println("����������");
				String Password = sc.nextLine();
				if(user.VerifyPassword(Password)){
					break;
				}
			}
			user.setName("zhy");     //�˻�����ѯ
			user.setBalance(1000.00);

			a:while(true){//���˵�
				System.out.print(user);
				System.out.println("��������Ҫѡ���ҵ��");

				String num = sc.nextLine();
				if(num.equals("1")){//��ѯҵ��
					while(true){

						System.out.println(user.getName());
						System.out.println("1:�������˵�");
						int num1 = sc.nextInt();
						if(num1==1){
						break;
						}
					}

				}

				if(num.equals("2")){//ת��ҵ��
					while(true){
					System.out.println("������Է��Ŀ���:");
					String otheraccount = sc.nextLine();
					if(user.VerifyOtheraccount(otheraccount)){
							break;
						}
					}
					b:while(true){//ת��ҵ��˵�
						System.out.println("������ת�˽��");
						double othermoney = sc.nextDouble();
						System.out.println(user.subMenu());
						while(true){

						String num1 = sc.nextLine();
							if(num1.equals("1")){//ת��ҵ��˵�
								user.setOthermoney(othermoney);
								System.out.println(user.otherMessage());

								while(true){

									System.out.println(user.subMenu1());
									String num2 = sc.nextLine();

									if(num2.equals("1")){
										if(othermoney<=user.getBalance()){
										System.out.println("ת�˳ɹ�!");
										user.setBalance(user.getBalance()-othermoney);
										continue a ;
										}else{
											System.out.println("���㣬���������룺");
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
				if (num.equals("3")){//ȡ��ҵ��


					c:while(true){
						System.out.println("������Ҫȡ��Ľ�");
						double takemoney = sc.nextDouble();
						System.out.println(user.subMenu());
						while(true){

							String num1 = sc.nextLine();
							if(num1.equals("1")){
								if(takemoney<=user.getBalance()){
									user.setBalance(user.getBalance()-takemoney);
									continue a;
								}else{
										System.out.println("���㣬���������룺");
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
				if(num.equals("4")){//���ҵ��
					d:while(true){
						System.out.println("��������Ҫ���Ľ��:");
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


