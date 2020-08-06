package coreJavatraining;

public class stringclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String: it is one fo the prebuilt class in java
		/* 1. String literal
		 * 2. by creating object of string
		 */
		
		String a = "hello"; //string
		String b = "hello";
		/* esto no se debe hacer en java a pesar de que son dos
		 * variables, java revisa primero que una variable no a sido
		 * creada antes de modo que en este caso la variable b no se crea
		 * porque ya a es igual por lo que se tiene que definir con new.
		 */
		
		String a1 = new String ("hello"); //string
		String b1 = new String("hello");
		
		System.out.println(b);
		System.out.println(a);
		
		String a2 = " javatraining";
		
		System.out.println(a2.charAt(2));
		System.out.println(a2.indexOf("a"));
		System.out.println(a2.substring(3));
		System.out.println(a2.substring(2, 5));
		System.out.println(a2.concat(" rahul teaches"));
		System.out.println(a2.trim());
		System.out.println(a2.toUpperCase());
		System.out.println(a2.toLowerCase());
		String[] sp = a2.split("t");
		System.out.println(sp[0]);
		System.out.println(sp[1]);
		System.out.println(a2.replace("v", "x"));

	}

}
