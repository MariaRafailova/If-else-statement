import java.util.Scanner;


public class Task8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Моля въведете 4-цифрено число:");
	int abcd = sc.nextInt();
	
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
}
