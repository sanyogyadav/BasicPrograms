import java.util.*;

public class CoinFlip {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter No of time you want to flip a coin : ");
		int flipCoin=scanner.nextInt();
		int countTail=0;
		int countHead=0;
		for(int i=0;i<flipCoin;i++)
		{
			if(Math.random()>0.5)
			{
				System.out.println("It is a Heads");
				countHead++;
			}
			else
			{
				System.out.println("It is a Tails");
				countTail++;
			}
		}
		System.out.println("Number of times Tail Occured : "+countTail);
		System.out.println("Number of times Head Occured : "+countHead);

		int headPercent=(countHead*100)/flipCoin;
		int tailPercent=(countTail*100)/flipCoin;

		System.out.println("Percentage of Tail & Head is : Tail "+tailPercent+"% Vs Head "+headPercent+"%");

	}

}
