package Lab7;

public class Dog
{


	//attributes
	private String breed;
	private String colour;
	private String owner;
	private boolean chases;
	private boolean ownerPresent;



	public Dog(String dogBreed,String dogColour,String dogOwner,boolean dogChases)//constructor
	{
		breed = dogBreed;
		colour = dogColour;
		owner = dogOwner;
		chases = dogChases;
		ownerPresent = true;
	}

// getter and setters declared underneath
	public String getBreed()
	{
		return breed;
	}
	public void setBreed(String breed)
	{
	    this.breed=breed;
	}
	public String getColour()
	{
	    return colour;
	}
	public void setColour(String colour)
	{
	    this.colour=colour;
	}
	public String getOwner()
	{
		return owner;
	}
	public void setOwner(String owner)
	{
	    this.owner=owner;
	}
	public boolean getChases()
	{
		return chases;
	}
	public void setChases(boolean chases)
	{
	    this.chases=chases;
	}
	public boolean getOwnerPresent()
	{
		return ownerPresent;
	}
	public void OwnerPresent(boolean ownerPresent)
	{
	    this.ownerPresent=ownerPresent;
	}
}
