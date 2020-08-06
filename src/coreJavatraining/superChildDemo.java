package coreJavatraining;

public class superChildDemo extends superParentDemo{
	
	
	public superChildDemo()
	{
		super();
		System.out.println("Child constructor");
	}
	
	String name = "QAClickAcademy";
	public void getStringdata()
	{
		System.out.println(name);
		System.out.println(super.name);
		
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("I am in the child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		superChildDemo cd = new superChildDemo();
		
		cd.getStringdata();
		cd.getData();
		
	}

}
