import java.util.Scanner;


public class Task9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter two-digit number:");
	int first = sc.nextInt();
	System.out.println("Please enter second two-digit number:");
	int second = sc.nextInt();
	
	int multipl = first*second;
	
	int last = multipl%10;
	
	if(last%2 == 0){
		System.out.printf("%d, %d even", multipl, last);
	}
	else{
		System.out.printf("%d, %d odd", multipl, last);
	}
	
}
}
