package basic;

public class New {
	
	/**
	 * 
	 * new class
	 */
	public static void main(String[] args) {
		System.out.println("basic");
		
		// panggil method 3
		method3();
		
		// panggil method 2
		method2();
	}
	
	
	/*
	 * 
	 * deklarasi method 2 dan 3
	 * 
	 */
	static void method2( ) {
		System.out.println("basic, method2");
	}
	
	static void method3( ) {
		System.out.println("basic, method3");
	}
}