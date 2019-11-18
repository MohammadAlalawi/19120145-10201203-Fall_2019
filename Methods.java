import java.util.Scanner;

public class Methods {
    
	public static int readnumber() {
		Scanner s=new Scanner(System.in);
		System.out.println("please enter a number");
		
		int n = s.nextInt();
		
	return n;
		
	}
	public static void main(String[] args) {
		int n1 = readnumber();
		int n2 = readnumber();
		
		System.out.print(n2+n1);
        System.out.println("hi");
		System.out.print(n2+n1);

	}

}
