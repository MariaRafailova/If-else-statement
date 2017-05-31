import java.util.Scanner;


public class Task4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a number:");
	double a = sc.nextDouble();
	System.out.println("Please enter a second number:");
	double b = sc.nextDouble();
	
	if(a>=b){
		System.out.println(b + " " + a);
	}
	else{
		System.out.println(a + " " + b);
	}
	
	//without if()
	//System.out.println(Math.min(a, b)+ " " + Math.max(a, b));
}
}
