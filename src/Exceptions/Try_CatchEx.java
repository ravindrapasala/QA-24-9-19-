package Exceptions;

public class Try_CatchEx {
	static int x = 1;
	static int y = 0;
	static void Add(){
		System.out.println("Add: "+(x+y));}
	static void Mul(){
		System.out.println("Mul: "+(x*y));}
	
	
	
	
	static void Div(){
		try{System.out.println("Div: "+(x/y));}
		catch(Exception e){
			System.out.println(e.getMessage());
		//e.printStackTrace();
		}
	
		
		
		
		
		}
	
	
	
	
	

	public static void main(String[] args) {
	Add();
	Mul();
	Div();
	
	

	}

}
