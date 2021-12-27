import java.util.*;
class Swapping {
	public static void main(String[] args) {
       	int x, y;
	int swap;

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of X and Y");
       x = sc.nextInt();
       y = sc.nextInt();
       System.out.println("before swapping numbers: "+x +"  "+ y);

       swap = x;
       x = y;
       y = swap;
       System.out.println("After swapping: "+x +"   " + y);
       System.out.println( );
    }
}
