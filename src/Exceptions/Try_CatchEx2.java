package Exceptions;

public class Try_CatchEx2 {

	static int x = 2;
	static int y = 0;
	static void Add(){
		System.out.println("Add: "+(x+y));}
	static void sub(){
		System.out.println("Sub: "+(x-y));}
	static void div(){
		try{System.out.println("Div: "+(x/y));}
	
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	

	
	}
	
	
	
	
	public static void main(String[] args) {
		Add();
		sub();
div();
	}

}
