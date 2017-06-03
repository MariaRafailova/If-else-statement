import java.util.Scanner;

public class Task3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter A: ");
	double a = sc.nextDouble();
	System.out.println("Please enter B: ");
	double b = sc.nextDouble();
	
	double c = a;
	a=b;
	b=c;
	
	System.out.println("A = " + a);
	System.out.println("B = " + b);
}
}
