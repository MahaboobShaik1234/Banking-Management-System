package bankpackage;

import java.util.HashMap;
import java.util.Scanner;






public  class Bankimpl implements BankAPI {
	Scanner scanner =new Scanner(System.in);

	int currentbalance=0;
	Integer x=currentbalance;
	double am;
	double ma;



	@Override
	public void bank() {
		int   password=0;

		int AcNo=0;
		HashMap<String,Integer> h=new HashMap<>();
		h.put("Mahaboob", 12345);
		h.put("Arshad", 12346);
		h.put("Umesh", 12347);
		h.put("Mounika", 12348);
		h.put("Rashmi", 12349);
		h.put("Manoj", 12341);

		System.out.println("Enter your Account Number ");
		AcNo=scanner.nextInt();
		Integer y=AcNo;

		System.out.println("if you forgot the pin enter ---Forget\n Othrwise enter No");
		String p=scanner.next();

		if(p.equalsIgnoreCase("Forget")) {
			System.out.println("Enter Account holder name without spelling mistake");
			String n=scanner.next();
			if(y==11223344) {

				System.out.println("your secret pin is "+h.get(n));				
				System.out.println("Don't share your Account details and password to anyone.");
			}else
				if(y==11223345) {				
					System.out.println("your secret pin is "+h.get(n));
					System.out.println("Don't share your Account details and password to anyone.");
				}else 
					if(y==11223346) {

						System.out.println("your secret pin is "+h.get(n));
						System.out.println("Don't share your Account details and password to anyone.");
					}else 
						if(y==11223347)	{	
							System.out.println("your secret pin is "+h.get(n));
							System.out.println("Don't share your Account details and password to anyone.");

						}else 
							if(y==11223348) {
								System.out.println("your secret pin is "+h.get(n));
								System.out.println("Don't share your Account details and password to anyone.");

							}else 
								if(y==11223349) {

									System.out.println("your secret pin is "+h.get(n));
									System.out.println("Don't share your Account details and password to anyone.");

								}else {
									System.out.println("Enter Valid user name");
								}
			if(h.get(n)==null) {
				System.out.println("Please Enter valid user Name");
			}




		}
		User u1=new User (11223344,12345);
		User u2=new User (11223345,12346);
		User u3=new User (11223346,12347);
		User u4=new User (11223347,12348);
		User u5=new User (11223348,12349);
		User u6=new User (11223349,12341);

		HashMap<User,String> hm=new HashMap<>();
		hm.put(u1,"Mahaboob" );
		hm.put(u2,"Arshad" );
		hm.put(u3,"Umesh" );
		hm.put(u4,"Mounika" );
		hm.put(u5,"Rashmi" );
		hm.put(u6,"Manoj" );



		System.out.println("Enter your secret PIN--->PIN should be 5 digits ");
		password=scanner.nextInt();
		Integer pw=password;
		User u= new User (AcNo,pw); 
		String s=hm.get(u);
try {
		if(s!=null ) {
			
		
			System.out.println("Welcome to STATE BANK OF INDIA  "+hm.get(u) );
			System.out.println("Account Holder Name is "+hm.get(u));
			System.out.println("Your account is a Savings Account");
			
			function(); 
		}else {
			System.out.println("Please Enter a Valid Account Number and Password");
		}
}catch(NullPointerException npx) {
	System.out.println("Please Enter a Valid Account Number and Password");

}

	}		
	@Override
	public void debitCard() {

		HashMap<String ,String> hm=new HashMap<>();
		hm.put("Mahaboob"," 1234");
		hm.put("Arshad"," 1235");
		hm.put("Umesh"," 1236");
		hm.put("Mounika"," 1237");
		hm.put("Rashmi"," 1238");
		hm.put("Manoj"," 1239");

		System.out.println("Enter your card Number ");
		int No=scanner.nextInt();
		Integer cNo=No;
		System.out.println("Enter your secret PIN--->PIN should be 4 digits ");

		System.out.println("if you forgot the pin enter ---Forget\n Othrwise enter No");
		String p=scanner.next();
		String n;
		if(p.equalsIgnoreCase("Forget")) {
			System.out.println("Enter Account holder name without spelling mistake");
			n=scanner.next();
			String res=hm.getOrDefault(n, "Please Enter  valid Name");
			System.out.println(res);

		}
		System.out.println("Enter your secret pin");
		int pin=scanner.nextInt();
		Debit d1 = new Debit(786786,1234);
		Debit d2 = new Debit(987654,1235);
		Debit d3 = new Debit(987655,1236);
		Debit d4 = new Debit(987656,1237);
		Debit d5 = new Debit(987657,1238);
		Debit d6 = new Debit(987658,1239);
		HashMap<Debit ,String> hmn=new HashMap<>();
		hmn.put(d1,"Mahaboob" );
		hmn.put(d2, "Arshad");
		hmn.put(d3, "Umesh");
		hmn.put(d4, "Mounika");
		hmn.put(d5, "Rashmi");
		hmn.put(d6, "Manoj");
		Debit d = new Debit(No,pin);
		String pn=hmn.get(d);

		if(pn==null) {
			System.out.println("enter a valid pin");
		}
		else{
			System.out.println("Welcome to STATE BANK OF INDIA  "+hmn.get(d));
			System.out.println("Account holder name is  "+hmn.get(d));
			System.out.println("Your card Number is  "+cNo);
			System.out.println("this is a Visa card");
			function();
		} 



	}

	public void bankLoans() {
		System.out.println(" Welcome to SBI Loans\n We have different types of loans with lowest intrest rate   ");
		System.out.println("Are your intrested to take the Loan then enter[yes/no] ");
		String a =scanner.next();
		if(a.equalsIgnoreCase("yes")) {
			System.out.println("Select Loan type based on requirement\n1.Home Loan\n2.Business Loan\n3.Education Loan\n4.Gold Loan");
			int g=scanner.nextInt();
			Integer i=g;
			switch(i) {

			case 1:System.out.println("This is Home Loan--Read the below instructions carefully ");
			System.out.println("1.Loan amount 200000 (two lakh rupees)\n2.Intrest rate--11.00 %\nyour monthly income should be greater than 10000(ten thound rupees per month)");
			System.out.println("Enter your monthly income from all sources");
			long h =scanner.nextLong();
			Long s=h;
			if(s>10000) {
				System.out.println("Congrats your eligible for loan\nkindly verify your details and documents  in below Website  \nIf want this loan please confirm enter [yes/no]  ");
				String sc=scanner.next();
				if(sc.equalsIgnoreCase("yes")) {
					home();
				}

			}else {
				System.out.println("Sorry,sad to hear this your not eligible for loan");
			}
			break;
			case 2:System.out.println("This is business Loan--Read the below instructions carefully ");
			System.out.println("1.Loan amount 300000 (two lakh rupees)\n2.Intrest rate--12.00 %\nyour monthly income should be 15000(Fifteen thousand rupees per month)");
			System.out.println("Enter your monthly income from all sources");
			long j =scanner.nextLong();
			Long l =j;
			if(l>15000) {
				System.out.println("Congrats your eligible for loan\n kindly verify your details and documents  in below Website  \nIf want this loan please confirm enter [yes/no] ");
				String sc=scanner.next();
				if(sc.equalsIgnoreCase("yes")) {
					business();
				}

			}else {
				System.out.println("Sorry,sad to hear this your not eligible for loan");
			}
			break;
			case 3:System.out.println("This is education Loan--Read the below instructions carefully ");
			System.out.println("1.Loan amount 100000 (two lakh rupees)\n2.Intrest rate--8.00 %\n3.You will get 10000 Rupees extra if your eligible for this Loan");
			System.out.println("Enter your parents Annual income from all sources");
			long k =scanner.nextLong();
			long m =k;
			if(m<500000) {
				System.out.println("Congrats your eligible for loan\n kindly verify your details and documents  in below Website  \nIf want this loan please confirm enter [yes/no] ");
				String sc=scanner.next();
				if(sc.equalsIgnoreCase("yes")) {
					education();
				}

			}else {
				System.out.println("Sorry,sad to hear this your not eligible for loan");
			}
			break;
			case 4:System.out.println("This is gold Loan--Read the below instructions carefully ");
			System.out.println("1.Loan amount 150000 (one lakh fifty thousand rupees)\n2.Intrest rate--9.00 %\nyour monthly income should be 10000(ten thound rupees per month)");
			System.out.println("Enter gold you have in gram");
			long o =scanner.nextLong();
			Long n =o;
			if(n>20) {
				System.out.println("Congrats your eligible for loan\n kindly verify your details and documents  in below Website  \nIf want this loan please confirm enter [yes/no] ");
				String sc=scanner.next();
				if(sc.equalsIgnoreCase("yes")) {
					gold();
				}

			}else {
				System.out.println("Sorry,sad hear this your not eligible for loan");
			}
			break;


			}

		}
	}
	public  void function() {
		String m = null;
do {
	System.out.println("Enter the  captcha  --$haikM@-- to continue the Application");
		String 	name=scanner.next();
		if(name.equals("$haikM@"))
		{

			char ch;
			do {
				System.out.println("select a option to proceed further");
				System.out.println("1.Deposit\n2.withdrawl\n3.checkbalance\n4.Bank Loans\n5.Fixed Deposit Amount");
				int z=scanner.nextInt();
				Integer i=z;

				switch( i) 
				{
				case 1:deposit();
				break;
				case 2 :withdrawl();
				break;
				case 3:checkBalance(); 
				break;
				case 4:bankLoans();
				break;
				case 5:fixedDeposit();
				break;
				default:
					System.out.println("select a valid operation\n Enter only 1,2,3 ,4 or 5 ");
					break;
				}

				System.out.println("do you want to continue the transactions press y else press n");
				ch=scanner.next().charAt(0);
			}


			while(ch=='y'||ch=='Y');
			System.out.println("Thank you for choosing State bank of India");


		}
		else {
			System.out.println("Enter a valid captcha");
			System.out.println("do you want to re enter the captch enter 'yes' or 'no'");
			m = scanner.next();
		}
}while(m.equals("yes"));
	}

	public  void deposit() {
		System.out.println("Enter the amount to deposit");
		int deposit=scanner.nextInt();
		x+=deposit;
		System.out.println(deposit+" Rupees deposited Successfully");
		System.out.println("Your current balance is "+x);
	}
	int w;
	public void withdrawl() {
		System.out.println("Enter the balance to withdrawl");
		 w =scanner.nextInt();
		Integer withdrawl=w; 
		if(w<=x) {
			
			if(w<50000) {
				x-=withdrawl;
				System.out.println(withdrawl+ " Rupees debited from your Account");
				System.out.println("Your current balance is "+x);
			}else {
				System.out.println("please withdraw the money less than Fifty thousand Rupees");
				System.out.println("if you want to withdraw  money less than one lakh pay--> 2% tax");
				System.out.println("Are you ready to  pay tax Enetr yes or no");
				String c=scanner.next();
				if(c.equals("yes")) {
					taxWithdraw();
				}
			}
		}else {
			System.out.println("<--Insufficient Balance-->Plese check your current balance");
		}
	}
	public void taxWithdraw() {
		if(w<=100000) {
			int y=w/100*2;
			int z=w+y;
			if(z<x) {
			x-=z;
			System.out.println(z+"Rupees debited from your Account");
			System.out.println("Your current balance is "+x);
			}else {
				System.out.println("Insufficient Balance");
			}
			
		}
	}


	public  void checkBalance() {

		System.out.println("your current balance is"+x); }
	

	public    void home() {
		System.out.println("This is 2 lakh Rupees Loan");
		int deposit=200000;
		x+=deposit;
		System.out.println("Amount  deposited to your account Successfully");
		System.out.println("Your current balance is"+x);
	}
	public   void business() {
		System.out.println("This is 3 lakh Rupees Loan");
		int deposit=300000;
		x+=deposit;
		System.out.println("Amount  deposited to your account Successfully");
		System.out.println("Your current balance is "+x);
	}
	public  void education() {
		System.out.println("This is 1 lakh Rupees Loan");
		int deposit=110000;
		x+=deposit;
		System.out.println("Amount  deposited to your account Successfully");
		System.out.println("Your current balance is"+x);
	}
	public  void gold() {
		System.out.println("This is 1.5 lakh Rupees Loan");
		int deposit=150000;
		x+=deposit;
		System.out.println("Amount  deposited to your account Successfully");
		System.out.println("Your current balance is "+x);
	}
	public void fixedDeposit() {
		System.out.println("Plese select Fixed Deposit Type\n1.Cumulative\n2.Non-Cumulative\n3.If you want to see already Cumulative Fixed Deposit Amount enter 3\n3.If you want to see already Non-Cumulative Fixed Deposit Amount enter 4");
		System.out.println("plese read the below given information carefully\n1.Cumulative means you will get the total amount after tenure time with Compound Intrest--->\n(Intrest rate--10.00 %)");
		System.out.println("2.Non-cumulative means you will get the intrest after every year and you will get Simple Intrest Amount--->\n(Intrest rate--12.00 %)");

		int x=scanner.nextInt();
		Integer f=x;
		switch(f) { 
		case 1:cumulativefd();
		break;
		case 2:nonCumulativefd();
		break;
		case 3:fdamount();
		break;
		case 4:fdamount1();
		break;
		default:System.out.println("Plese select valid option");
		break;

		}
	}
	Double yx;
	Double ye;
	public void cumulativefd() {
		System.out.println("Plese Enter how much Money you want to deposit ");
		double m=scanner.nextLong();
		Double mo=m;
		System.out.println("Please enter how many years you want to deposit");
		double y=scanner.nextInt();
		yx=y;
		double r=10;
		Double rate=r;
		//long i=mo*(1+12/100)^(ye);
		double a =mo*Math.pow((1+rate/100), yx);
		Double amount=a;
		double c=(amount)-(mo);
		Double ci=c;
		System.out.println("After tenure period you will get "+ci+" Rupees Compound Intrest.");
		System.out.println("After tenure period you will get the Total Amount "+amount+" Rupees.");
		System.out.println("Are you intrested to deposit the money enter Yes or No");
		String o=scanner.next();
		if(o.equalsIgnoreCase("yes")) {
			System.out.println("Pay Money here --> PhonePay , paytm , BhartathPay and all UPI payments are Available");
			System.out.println("Enter Amount Here ");
			double om=scanner.nextDouble();
			if(om>mo) {
				Double ex=om-mo;
				Double x=om-ex;
				am=+x;
				System.out.println("Amount Deposited Successfully");
				System.out.println("The remaining "+ex+" Rupees will be Credited to your account with in 2 Days(Bank Working Days)" );
			}
			if(om==mo) {
				am=+om;
				System.out.println("Amount Deposited Successfully");
			}
			else {
				System.out.println("Please deposit total amount once\nThis amount will return to your account with in 2 days(Bank working Days)");
			}
		}



	}	

	public void nonCumulativefd() {
		System.out.println("Plese Enter how much Money you want to deposit ");
		double n=scanner.nextLong();
		Double no=n;
		System.out.println("Please enter how many years you want to deposit");
		double y=scanner.nextInt();
		ye=y;
		double r=12;
		Double rate=r;
		Double an=(no/100)*rate;
		Double na=(an)*ye;
		Double t=no+na;
		System.out.println("After every one year you will get the simple Intrest "+an+" Rupees-->if you want this money you can withdraw this money");
		System.out.println("After tenure period you will get the Total Amount "+t+" Rupees.");

		System.out.println("Are you intrested to deposit the money enter Yes or No");
		String o=scanner.next();
		if(o.equalsIgnoreCase("yes")) {
			System.out.println("Pay Money here --> PhonePay , paytm , BhartathPay and all UPI payments are Available");
			System.out.println("Enter Amount Here ");
			double om=scanner.nextDouble();
			if(om>no) {
				Double ex=om-no;
				Double z=om-ex;
				ma=+z;
				System.out.println("Amount Deposited Successfully");
				System.out.println("The remaining "+ex+" Rupees will be Credited to your account with in 2 Days(Bank Working Days)" );
			}
			if(om==no) {
				ma=+om;
				System.out.println("Amount Deposited Successfully");
			}
			else {
				System.out.println("Please deposit total amount once\nThis amount will return to your account with in 2 days(Bank working Days)");
			}
		}

	}	

	public void fdamount() {
		System.out.println("Your Fixed Deposit Amount "+am);
		System.out.println("Tenure period for this amount is"+yx+" Years");
	}

	public void fdamount1() {
		System.out.println("Your Fixed Deposit Amount "+ma);
		System.out.println("Tenure period for this amount is"+ye+" Years");
	}



}


