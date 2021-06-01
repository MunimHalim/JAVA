package basic;

public class New_variable {
	
	public static final int z2 = 1;

	public static void main(String[] args) {
		System.out.println("Java");
		
		int x = 2;
		
		int y; //deklarasi
		y=3; //initialisasi
		
		int z;
		
		System.out.println("sebelum diubah:" + y);
		
		y = 8;
		
		System.out.println("selepas diubah:" + y);
		
		System.out.println(x);
		
		if(true) {
			z = 5;
		}
		
		System.out.println("z ="+ z);
		
		final int z1=4;
		
		System.out.println(z1);
		
		if(true) {
			System.out.println("global variable :" + z2);
		}
		}
	
	
}
