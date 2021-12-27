import java.util.*;

public class LeapYear {

		// Creating method after i will call this from main method to take input and run both the loops.
		void test(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year to check: ");
		int year = sc.nextInt();

		 if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
		            // Both conditions true- Print leap year
		            System.out.println(year + " is a Leap Year");
		        }
		        else {
		            // Any condition fails- Print Non-leap year
		            System.out.println(year + " is not a Leap Year");
		        }
		}
		public static void main(String[] args) {

		LeapYear leapyear = new LeapYear();
		leapyear.test();
	}
}
