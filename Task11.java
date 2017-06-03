import java.util.Scanner;


public class Task11 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a 3-digit number:");
	int abc = sc.nextInt();
	
	int c = abc%10;
	int ab = abc/10;
	int b = ab%10;
	int a = ab/10;
	
	if( a!=0 && b!=0 && c!=0){
		if((abc%a ==0)&&(abc%b==0)&&(abc%c ==0)){
			System.out.printf("The number is divisible by its digits");
		}
		else{
			System.out.printf("The number is not divisible by its digits");
		}
	}
	else{
		System.out.println("The number contains zero");
	}
}
}
