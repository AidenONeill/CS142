package Lab7;

public class BankAccount
{


	//attributes
	private String customerName;
	private String accountType;
	private int bic ;
	private int number = 10000 ;
	private static int balance = 120;
	private int pin = 1234 ;



	public BankAccount(String name,String type,int id,int pin1)//constructor
	{
		customerName = name;
		accountType = type;
		bic = id;
		number++;
		pin = pin1;


	}

// getter and setters declared underneath
	public String getcustomnerName()
	{
		return customerName;
	}
	public void setcustomerName(String customerName)
	{
	    this.customerName=customerName;
	}
	public String getaccountType()
	{
		return accountType;
	}
	public void setaccountType(String accountType)
	{
	    this.accountType=accountType;
	}
	public int getBic()
	{
		return bic;
	}
		public int getBalance()
	{
		return balance;
	}
	public void setBalance(int balance)
	{
	    this.balance=balance;
	}
		public int getPin()
	{
		return pin;
	}
	public void setPin(int pin)
	{
	    this.pin=pin;
	}
		public int getNumber()
	{
		return number;
	}

	//functionality

	public void lodgeMoney(int one)
	{
		balance = balance+one;
	}
	public void withdrawMoney(int one,int pin1)
	{
		if(pin1==pin)
		{
		 balance = balance-one;
		}
		else
		{
			System.out.println("Incorrect pin number");
		}
	}
	public void checkBalance(int pin1)
	{
		if(pin1==pin)
		{
		 System.out.println(balance);
		}
		else
		{
			System.out.println("Incorrect pin number");
		}
	}
	public void changePin(int pin1,int two)
	{
		if(pin1==pin)
		{
		 pin = two;
		}
		else
		{
			System.out.println("Incorrect pin number");
		}
	}








}
