package org.kh.object1;

public class ComputeEx01 {
	public static void main(String[] args) {
		Compute01 com1 = new Compute01();
		com1.fnc1();
		com1.fnc2(100);
		int a = com1.fnc3();
		System.out.println(com1.fnc3());
		System.out.println(a);
		String pass = com1.fnc4(100);
		System.out.println(pass);
	}
	public static void fnc1() {
		System.out.println();
	}
	public static void fnc2(int a) {
		System.out.println("입력 수 : "+a);
	}
	public static int fnc3() {
		return 500;	
		}	
	public static double fnc4(int radius) {
		return radius*radius*3.1415f;
	}
		
}

