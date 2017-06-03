import java.util.Scanner;


public class Task10 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter the volume of water - number from 10 to 9999");
	int volume = sc.nextInt();
	
	if(volume >=10 && volume <=9999){
		
		int totalBuckets = volume/5;	
		int remainder = volume%5;
		
		if(remainder == 0){
			System.out.println(totalBuckets + " buckets of 3 liters");
			System.out.println(totalBuckets + " buckets of 2 liters");
		}
		if(remainder == 1){
			totalBuckets -= 5;
			System.out.println(totalBuckets + " buckets of 3 liters");
			System.out.println(totalBuckets + " buckets of 2 liters");
			System.out.println("Additionally 2 buckets of 3 liters");
		}
		if(remainder ==2){
			System.out.println(totalBuckets + " buckets of 3 liters");
			System.out.println(totalBuckets + " buckets of 2 liters");
			System.out.println("Additionally 1 bucket of 2 liters");
		}
		if(remainder == 3){
			System.out.println(totalBuckets + " buckets of 3 liters");
			System.out.println(totalBuckets + " buckets of 2 liters");
			System.out.println("Additionally 1 bucket of 3 liters");
		}
		if(remainder == 4){
			System.out.println(totalBuckets + " buckets of 3 liters");
			System.out.println(totalBuckets + " buckets of 2 liters");
			System.out.println("Additionally 2 buckets of 2 liters");
		}
		
	}
	else {
		System.out.println("The volume is not from 10 to 9999" + '\n' + "Please enter a number from 10 to 9999");
	}	
}
}
