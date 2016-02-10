package Lab7;

public class CheckBank
{
	public static void main(String args[])
	{
		BankAccount one = new BankAccount("Aiden","Current",123456,1234);
		one.lodgeMoney(200);
		//System.out.println(one.getBalance());
		one.checkBalance(1234);
		one.changePin(1234,5485);
		System.out.println(one.getPin());


	}
}
