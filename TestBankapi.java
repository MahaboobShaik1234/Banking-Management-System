package bankpackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestBankapi {

	public static void main(String[] args) throws InputMismatchException {
		
		 Scanner scanner=new Scanner(System.in);
System.out.println("       <-- Welcome to STATE BANK OF INDIA -->   ");
 String  sa;
do {
	try {	
Bankimpl bank=new Bankimpl();


		System.out.println("If you want to do the transactions with Your Account\n Select  option 1.Bank API ");
		System.out.println("If you want to do the transactions with Your debit card\n Select option  2.Debit Card\n3.Exit");
		System.out.println("Enter 1 ,2 or 3 \nNote: please Login with  only one user details ");
		String so;
		
		 int l=scanner.nextInt();
		 Integer k=l;
		
		switch( k) {
		case 1:bank.bank();	
		break;
		case 2:bank.debitCard();
		break;
		case 3:if (k==3) {					
			System.out.println("Exited Successfully");
			System.exit(0);
		}
		
		default:System.out.println("Select a valid Option");
		break;
		}
		
	}catch(InputMismatchException e) {
System.out.println(e);
System.out.println("Pleas enter Integer Value ");
	}
	
	
	System.out.println("do you want to continue the app enter [yes/no]");
	 sa=scanner.next();
}while(sa.equalsIgnoreCase("yes"));
System.out.println("Please be aware of fraud calls and messages SBI doesn't ask any information ");
System.out.println("<----Thankyou for choosing   STATE BANK OF INDIA---->");
	}

}
