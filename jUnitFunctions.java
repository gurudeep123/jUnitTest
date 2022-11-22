package jUnitTestPackage;

public class jUnitFunctions {



	static int AddNumbers(int a,int b) {
		return a+b;
	}
	static String AddStrings(String a,String b) {
		return a.concat(b);
	}
	public static void main(String args[]) {
		System.out.println(AddNumbers(1,2));
		System.out.println(AddStrings("Hi","Hello"));
		
		
	}


}