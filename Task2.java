import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter an integer:");
	int a = sc.nextInt();
	System.out.println("Please enter a second integer:");
	int b = sc.nextInt();
	
	int sum = a+b;
	int differ = Math.abs(a-b);
	int multipl = a*b;
	int remainder = a%b;
	int division = a/b;	
	
	System.out.println("Sum: " + sum);
	System.out.println("Difference: " + differ);
	System.out.println("Multiplication: " + multipl);
	System.out.println("Remainder of division: " + remainder);
	System.out.println("Integer division: " + division);
	
}
}
