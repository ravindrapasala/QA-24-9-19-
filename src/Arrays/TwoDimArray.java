package Arrays;

public class TwoDimArray {

	public static void main(String[] args) {
		int a[]= {9,8,7,6};
		int b[]={6,3,2,6};
		int c[]={9,4,2,4};
		
		int d[][]= {
				{9,8,7,6},
				{6,3,2,6},
				{9,4,2,4}
				}; 
		//i means rows and j means coloums;
		
		
		
		for(int i=0;i<3;i++){
		
			for(int j=0;j<4;j++){
				System.out.print(" "+d[i][j]);
				}
		System.out.println();	
		}			
	}

}
