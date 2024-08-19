						/*
							ACCOUNT CLASS
								Account No
								Account Name
								Balance

								validation on these and updation on new entry.

							/// use of Getter and Setter Method ///
						*/
import java.util.*;
public class account
{
	int accountno;
	double balance;
	String name;

	account(int accountno,double balance,String name)
	{
		
		if(setAccountNo(accountno))
		{
			this.accountno=accountno;
		}
		if(setBalance(balance))
		{
			this.balance=balance;
		}
		if(setAccountName(name))
		{
			this.name=name;
		}
		display();
	}
	int getAccountNo()
	{
		return accountno;
	}

	// SETTER METHOD FOR ACCOUNT NO
	boolean setAccountNo(int no)
	{
		//VALIDATION CHECK FOR ACCOUNT NO:- 
		String value=Integer.toString(no);
		if(value.length()<5 && value.length()>9)
			throw new IllegalArgumentException("please enter no of length b/w 5 to 9!!");
		if(no<0)
			throw new IllegalArgumentException("please enter positive no!!!");
		return true;
	}
	boolean setAccountName(String value)
	{
		// validation for name:-  should be morethan 4 character and have 0 or 1 space

		if(value.length()<4)
			throw new IllegalArgumentException("Not A Valid Account Name:- min 4 characters are required");
		if(value.length()>=4)
		{
			int count=0;
			for(int i=0; i<value.length(); i++)
			{
				if(value.charAt(i)==' ' && value.charAt(i+1)==' ')
				{
					count=count+2;
				}
			}
			if(count>2)
				throw new IllegalArgumentException("Not A Valid Account Name:- only one space is allowed");

		}
		return true;
	}
	String getAccountName()
	{
		return name;
	}

	//SETTER METHOD FOR BALANCE
	boolean setBalance(double amount)
	{
		// VALIDATION CHECK
		double value=Math.round(amount*100.0)/100.0;
		if(amount!=value)	// A METHOD IS USED TO CONVERT THE DECIMAL UPTO 2 FLOATING POINTS:-  String.format("%.2f",value);
			throw new IllegalArgumentException("Please Enter valid number upto 2 decimals!!!");
		return true;
	}
	double getBalance()
	{
		return balance;
	}

	

	/*public String toString()
	{
		//return getAccountName()+" "+getAccoutNo()+" "+getBalance();
	}*/

	void display()
	{
		System.out.println("Account Name:- "+getAccountName());
		System.out.println("Account Number:- "+getAccountNo());
		System.out.println("Balance:- "+getBalance());
	}
	public static void main(String ar[])
	{
		account obj1=new account(2,-245.25,"jarvis prashant 1997");
		
	}
}