package stage2;
import java.util.Scanner;
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		 * 유로 금액을 입력받는다
		 * 유로 > 미국 환율을 입력받는다
		 * 식을 사용해 변환한다
		 * 식 = 유로 * 유로 환율 / 100		
		 */
		int euro = 0;
		double rate = 0;
		System.out.print("How many Euros are you exchanging?");
		euro = sc.nextInt();
		System.out.print("What is the exchange rate?");
		rate = sc.nextDouble();
		System.out.printf("%d Euros at an exchange rate of %.2f is\n%.2f dollars", euro, rate, euro*rate/100);
	}

}
