package coreJavatraining;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5]; //5 es el tamanio del array
		a[0] =2;
		a[1]=6;
		a[2]=1;
		a[3]=9;
		a[4]=12;
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		int b[] = {1,3,4,5,6,8};
		for(int i=0; i<b.length;i++)
		{
			System.out.println(b[i]);
		}

	}

}
