package stage2;
import java.util.Scanner;
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 투자금, 연이율, 기간, 지급횟수를 입력받는다
		 * 식에 따라 계산한다
		 * 식 = 원금 * (1 + 연이율/지급횟수)^지급횟수*기간
		 */
		
		int principal = 0;
		double rate = 0;
		int year = 0;
		int time = 0;
		double answer = 0;
		
		System.out.print("What is the principal amount?: ");
		principal = sc.nextInt();
		System.out.print("What is the rate?: ");
		rate = sc.nextDouble();
		System.out.print("What is the number of years?: ");
		year = sc.nextInt();
		System.out.print("What is the number of times the interest is compounded per year?: ");
		time = sc.nextInt();
		
		answer = Math.pow((rate/100/time+1), time*year)*principal;
		System.out.printf("$%d invested at %s%% for %d years compounded %d times per year is $%.2f", 
				principal, rate, year, time, answer);
	}

}
