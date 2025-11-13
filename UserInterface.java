package tassu;
import java.util.*;
public class UserInterface {
	private static int status;
	public static void main(String[] args) {
		AtmOperation imp1=new AtmOperation();
		Scanner sc = new Scanner(System.in);
		int atmNumber=123456;
		int atmPin=123;
		System.out.println("ENTER THE ATM NUMBER");
		int atmnum2=sc.nextInt();
		System.out.println("ENTER THE ATM PIN");
		int atmpin2=sc.nextInt();
		if(atmNumber==atmnum2 && atmPin==atmpin2) {
			while(true) {
				
				System.out.println(" 1.viewAvailable\n 2.withdrawAmount\n 3.DepositAmount\n 4.viewMinistatement\n 5.exit");
				System.out.println("Enter  the option");
				int ch=sc.nextInt();
				if(ch==1) {
					imp1.viewBalance();
				}
				else if(ch==2) {
					System.out.println("Enter the amount to withdraw");
					double withdrawamount=sc.nextDouble();
					imp1.withdrawAmount(withdrawamount);
					
				}
				else if(ch==3) {
					System.out.println("Enter the amount to be deposit: ");
					double depositAmount1=sc.nextDouble();
					imp1.depositAmount(depositAmount1);
				}
				else if(ch==4) {
					imp1.viewMinistatement();
				}
				else if(ch==5) {
					System.out.println("collect your  Atm card\n thank you for visiting");
					System.exit(status);
				}
			}
				
			
			
		}
		else {
			System.out.println("INCORRECT ATM AND PIN NUMBER");
		}
		
	}

}
