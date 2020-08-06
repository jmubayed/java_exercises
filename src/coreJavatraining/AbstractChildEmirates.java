package coreJavatraining;

public class AbstractChildEmirates extends AbstractParentAirCraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//no se puede llamar al abstract directament tiene que ser desde la clase
		//AbstractParentAirCraft a = new AbstractParentAirCraft();
		
		AbstractChildEmirates b = new AbstractChildEmirates();
		
		b.engine();
		b.safetyGuidelines();
		b.bodyColor();
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("three");
		
	}

}
