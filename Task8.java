import java.util.Scanner;


public class Task8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Моля въведете 4-цифрено число от 1000 до 9999:");
	int abcd = sc.nextInt();
	
	if(abcd >= 1000 && abcd <=9999){
		
		int d = abcd%10;
		int abc = abcd/10;
		int c = abc%10;
		int ab = abc/10;
		int b = ab%10;
		int a = ab/10;
		
		int ad = a*10 + d;
		int bc = b*10 + c;
		
		if(ad<bc){
			System.out.println("по-малко (" + ad + "<" + bc +")");
		}
		if(ad==bc){
			System.out.println("равни (" + ad + "=" + bc +")");
		}
		if(ad>bc){
			System.out.println("по-голямо (" + ad + ">" + bc +")");
		}
		
	}
	else {
		System.out.println("Грешно число." + '\n' +"Моля въведете 4-цифрено число от 1000 до 9999:");
	}	
	
}
}
