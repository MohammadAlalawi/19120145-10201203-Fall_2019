import java.util.Scanner;

public class Methods_switch {

	public static double add(double n1, double n2) {
      
		double sum = n1+n2;
		
	return sum;
	}
	public static double sub(double n1, double n2) {
 
		double sum = n1-n2;
		
	return sum;
	}
	public static double mult(double n1, double n2) {

		double sum = n1*n2;
		
	return sum;
	}
	public static double div(double n1, double n2) {

		double sum = n1/n2;
		
	return sum;
	}	
	public static double readnumber() {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter a number.");
		
		double n = s.nextDouble();
		
	return n;
	}
	
	public static void main(String[] args) {
	
		double n1 = readnumber();
		double n2 = readnumber();
	
		int choice = 0;
		double answer;
		
		while(choice != 5) {
			Scanner s=new Scanner(System.in);
		    System.out.println("1-add\n2-sub\n3-mult\n4-div\n5-quit\nPlease enter your choice.");
		
		    choice = s.nextInt();
		    
		 	switch (choice) {
			  case 1:
				  answer = add(n1, n2);
				  System.out.println(+answer);
				  
				  break;
			  case 2:
				  answer = sub(n1, n2);
				  System.out.println(+answer);
				  
				  break;
			  case 3:
				  answer = mult(n1, n2);
				  System.out.println(+answer);
				  
				  break;
			  case 4:
				  answer = div(n1, n2);
				  System.out.println(+answer);
				  
			      break;
			}  		 	
		}
	}
}
