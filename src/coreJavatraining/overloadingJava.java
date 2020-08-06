package coreJavatraining;

public class overloadingJava {
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(String a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overloadingJava b = new overloadingJava();
		
		b.getData(5);
		b.getData("hello");

	}

}
