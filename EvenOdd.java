import java.util.*;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even number yeahhhhhhh.");
        else
            System.out.println(num + " is odd number opps...");
    }
}
