package coreJavatraining;

public class overiding extends inheritanceParentClassDemo{
	
	public void audiosystem()
	{
		System.out.println("audio child");
	}
	
	public void engine()
	{
		System.out.println("new engine");
	}
	
	public void colour()
	{
		System.out.println(colour);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overiding c = new overiding();
		
		c.colour();
		c.audiosystem();
		c.brakes();
		c.engine();
		c.Gear();

	}

}
