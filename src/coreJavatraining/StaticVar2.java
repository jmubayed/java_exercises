package coreJavatraining;

public class StaticVar2 {
	
	//instance variables
	
	String name;
	String address;
	
	//class variables
	//transformo el instance en estatico para que se pueda corpatir el mismo valor con todos
	static String city;
	
	static int a;
	
	static {
		city = "Bangalore";
		a = 0;
	}
	
	//local variables
	StaticVar2(String name, String Street)
	{
		this.name = name;
		this.address = Street;
		a++;
		System.out.println(a);
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public static void getCity()
	{
		//dentro de metodos estaticos solo se puede usar valores estaticos
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVar2 obj = new StaticVar2("Bob", "Marthalli");
		StaticVar2 obj2 = new StaticVar2("Bob", "Marthalli");
		
		System.out.println(obj.name);
		
		System.out.println(obj.getAddress());
		
		System.out.println(obj.city);
		
		System.out.println("**********");
		
		getCity();

	}

}
