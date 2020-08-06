package coreJavatraining;

public class StaticVar {
	
	//instance variables
	
	String name;
	String address;
	String city;
	
	//local variables
	StaticVar(String name, String Street, String city)
	{
		this.name = name;
		this.address = Street;
		this.city = city;
	}
	
	public String getAddress()
	{
		return address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVar obj = new StaticVar("Bob", "Marthalli", "Bangalore");
		
		System.out.println(obj.name);
		
		System.out.println(obj.getAddress());

	}

}
