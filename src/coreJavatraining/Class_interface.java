package coreJavatraining;

public class Class_interface implements Interface, Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface a = new Class_interface();
		
		a.greenGo();
		a.redStop();
		a.FlashYellow();
		
		Class_interface b = new Class_interface();
		b.walthrought();
		
		Interface2 c = new Class_interface();
		c.best();
		c.Craka();
		c.none();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("printfirst");
	}
	
	public void walthrought() {
		
		System.out.println("four");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("printsecond");
		
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("printthird");
		
	}

	@Override
	public void Craka() {
		// TODO Auto-generated method stub
		
		System.out.println("five");
		
	}

	@Override
	public void best() {
		// TODO Auto-generated method stub
		System.out.println("six");
		
	}

	@Override
	public void none() {
		// TODO Auto-generated method stub
		System.out.println("seven");
		
	}

}
