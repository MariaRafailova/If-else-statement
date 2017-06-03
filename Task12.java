//	import java.text.SimpleDateFormat;
//	import java.time.format.DateTimeFormatter;
//	import java.util.Calendar;
//	import java.util.Date;
import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter day");
		int day = sc.nextInt();
		System.out.println("Please enter month");
		int month = sc.nextInt();
		System.out.println("Please enter year");
		int year = sc.nextInt();

		if (day == 28 && month == 2 && year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("29,2," + year);
				} else {
					System.out.println("1,3," + year);
				}
			}
			else {
				System.out.println("29,2," + year);
			}
		}
		if (day == 29 && month == 2) {
			System.out.println("1,3," + year);
		} else if (day == 31 && month == 12) {
			year += 1;
			System.out.println("1,1," + year);
		} else if (day == 30
				&& (month == 4 || month == 6 || month == 9 || month == 11)) {
			System.out.println("1," + (month + 1) + "," + year);
		} else if (day == 31
				&& (month == 1 || month == 3 || month == 5 || month == 7
						|| month == 8 || month == 10)) {
			System.out.println("1," + (month + 1) + "," + year);
		} else if (day != 28 && month != 2) {
			day += 1;
			System.out.println(day + "," + month + "," + year);
		}

	}
}
