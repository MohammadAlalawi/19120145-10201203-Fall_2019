import java.util.Scanner;

public class Rhombus {

	public static void main(String[] args) {
		
	    Scanner s = new Scanner(System. in);
	    
		System.out.println("please enter a number:");
		
		int number = s.nextInt();

		int space =number-1;
		
	    
	    System.out.println("Rhombus:");
        for(int i=1; i<=number; i++){
           
            for(int k=1; k<=space; k++) {
                System.out.print(" ");
            }
            
            for(int k=1; k<=i; k++) {
                System.out.print("* ");
            }
            
            System.out.println();
            space--;
             
        }
        for(int i= number-1; i >= 0; i--) {
        	
        	 for(int k=1; k<=space+2; k++) {
                 System.out.print(" ");
             }
             
             for(int k=1; k<=i; k++) {
            	 
                 System.out.print("* ");
             }
             
             System.out.println();
             space++;
        	
        }

	}
}
		      

	