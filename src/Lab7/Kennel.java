package Lab7;

public class Kennel
{
	public static void main(String args[])
	{
		Dog[] kennel = new Dog [5];

		kennel[0] = new Dog("German Shepard","Brown/black","Aiden",false);
		kennel[1] = new Dog("Cat","White","Denis",true);
		kennel[2] = new Dog("Husky","Grey/white","Cahal",true);
		kennel[3] = new Dog("Labradoodle","White","Aiden",false);
		kennel[4] = new Dog("Jack Russell","Brown/white","Cahal",true);

		for(int i = 0;i<=kennel.length-1;i++)
		{
			System.out.println(kennel[i].getBreed());
			System.out.println(kennel[i].getColour());
			System.out.println(kennel[i].getOwner());
			System.out.println(Boolean.toString(kennel[i].getChases()));
			System.out.println(" ");

		}
	}
}