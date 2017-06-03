import java.util.Scanner;


public class Task9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter two-digit number from 10 to 99:");
	int first = sc.nextInt();
	System.out.println("Please enter second two-digit number from 10 to 99:");
	int second = sc.nextInt();
	
	if((first >= 10 && first<=10) && (second>=10 && second<=10)){
		
		int multipl = first*second;
		
		int last = multipl%10;
		
		if(last%2 == 0){
			System.out.printf("%d, %d even", multipl, last);
		}
		else{
			System.out.printf("%d, %d odd", multipl, last);
		}
		
	}
	else {
		System.out.println("The first or the second number is not from 10 to 99");
	}
	
}
}
