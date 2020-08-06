package coreJavatraining;

public class constructDemo {
	
	//Default
	public constructDemo()
	{
		System.out.println("I am in the constructor");
	}
	
	//Parameterized constructor
	public constructDemo(int a, int b)
	{
		System.out.println("I am in the parameterized constructor");
	}
	
	public constructDemo(String str) {
	
		System.out.println(str);
		
	}
	public void getdata()
	{
		System.out.println("I am the method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructDemo cd = new constructDemo();
		constructDemo c = new constructDemo(4,5);
		constructDemo a = new constructDemo("hello");

	}

}
