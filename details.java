package exam;
import java.util.Scanner;
public class details extends customer
{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			customer arr[]=new customer[10];
			customer obj1=new customer(1,"hiu","qwer",34556);
			customer obj2=new customer(3,"hjg","ytui",12344);
			customer obj3=new customer(4,"hiu","qwer",34556);
			arr[0]=obj1;
			arr[1]=obj2;
			arr[2]=obj3;
			System.out.println("enter id and password");
			String ID=sc.next();
			String Password=sc.next();
			
					
			if(ID.equals("ABCCust") && Password.equals("abc@123"));
			{
			System.out.println("enter choice");
			int choice=sc.nextInt();
			switch(choice)
				{
				case 1:
					
						int id=sc.nextInt();
						String name=sc.next();
						String email=sc.next();
						int mno=sc.nextInt();
						customer obj=new customer(id,name,email,mno);
						arr[arr.length-1]=obj;
						
				case 2:
				for(int i=0;i<arr.length-1;i++)
				{
					if(arr[i]!=null)	
					System.out.println(arr[i]);
					
						
					}
				break;
				case 3:
					System.out.println("id");
					int newid=sc.nextInt();
					String name1=sc.next();
					String email1=sc.next();
					int mno1=sc.nextInt();
					customer cust=new customer();
					for(int i=0;i<arr.length;i++)
					{
						if(arr[i].getEid()==newid)
						{
							arr[i].setEid(newid);
							arr[i].setName(name1);
							arr[i].setEmail(email1);
							arr[i].setNo(mno1);
						}
					}
					break;
				case 4:
					System.out.println("id");
					int id1=sc.nextInt();
					for(int i=0;i<arr.length;i++)
					{
						if(arr[i].getEid()==id1)
						{
							arr[i].setEid(0);
							arr[i].setName("");
							arr[i].setEmail("");
							arr[i].setNo(0);
						}
						}
							
					break;
				case 5:
					System.exit(1);
					break;
				}
			}
		}
}
