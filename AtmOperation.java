package tassu;
import java.util.*;
public class AtmOperation  implements AtmInterface{
	Atm a= new Atm();
	Map<Double,String> mini= new HashMap<Double, String>();
	public void viewBalance() {
		System.out.println("AvailableBalance:"+a.getBalance());
	}
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500==0) {
			if(withdrawAmount<=a.getBalance()) {
				System.out.println("collect the cash"+withdrawAmount);
				a.setBalance(a.getBalance()-withdrawAmount);
				mini.put(withdrawAmount, "Amount withdrawn");
				viewBalance();
			}
			else {
				System.out.println("Insufficent Balance");
			}
		}
		else {
			System.out.println("Enter the amount in terms of 500");
		}	
	}
	public void depositAmount(double depositAmount) {
		System.out.println("depositedAmount is:"+depositAmount);
		a.setBalance(a.getBalance()+depositAmount);
		mini.put(depositAmount,"Deposited successfully");
		viewBalance();
	}
	public void viewMinistatement() {
		Set<Double> set=mini.keySet();
		for(Double d:set) {
			System.out.println(d+"="+mini.get(d));
		}		
	}

}


