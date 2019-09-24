package Exceptions;

public class ExceptionsEx1 {
	
	static int x =2;
	static int y =0;
	static void TC01_Add(){
		System.out.println("Add: "+(x+y));}
	static void TC02_Mul(){
		System.out.println("Mul: "+(x*y));}
	static void TC03_Div(){
		System.out.println("Div: "+(x/y));
	}
	
	
	

	public static void main(String[] args) {
		TC01_Add();
        TC02_Mul();
        TC03_Div();
	}

}
