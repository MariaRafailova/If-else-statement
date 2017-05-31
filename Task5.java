import java.util.Scanner;


public class Task5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a number");
	double a = sc.nextDouble();
	System.out.println("Please enter a second number");
	double b = sc.nextDouble();
	System.out.println("Please enter a third number");
	double c = sc.nextDouble();
	
	if(a>b && b>c){
		System.out.println(a + " " + b + " " + c);
	}
	if(a>c && c>b){
		System.out.println(a + " " + c + " " + b);
	}
	if(c>a && a>b){
		System.out.println(c + " " + a + " " + b);
	}
	if(c>b && b>a){
		System.out.println(c + " " + b + " " + a);
	}
	if(b>a && a>c){
		System.out.println(b + " " + a + " " + c);
	}
	if(b>c && c>a){
		System.out.println(b + " " + c + " " + a);
	}
		
}
}
