package coreJavatraining;

public class inheritanceChildClassDemo extends inheritanceParentClassDemo{
	
	//solo se puede heredar un padre
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
		
		inheritanceChildClassDemo c = new inheritanceChildClassDemo();
		
		c.colour();
		c.audiosystem();
		c.brakes();
		c.engine();
		c.Gear();

	}

}
