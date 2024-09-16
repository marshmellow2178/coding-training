package stage2;
import java.util.Scanner;
public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		 * 원금 입력 받기
		 * 연이율 입력 받고 100으로 나누어 저장하기
		 * 연단위 기간 입력 받기
		 * 식에 따라 원리금 계싼하기
		 * 식 = 원금(1+연이율*기간)
		 */
		int principal = 0;
		double rate = 0;
		int year = 0;
		System.out.print("Enter the principal: ");
		principal = sc.nextInt();
		System.out.print("Enter the rate of interest: ");
		rate = sc.nextDouble();
		System.out.print("Enter the number of years: ");
		year = sc.nextInt();
		
		System.out.printf("After %d years at %s%%, the investment will be worth $%d"
				, year, rate, (int)((rate/100*year+1)*principal));
		/*
		 * % 는 %% 로 출력할 수 있다
		 * 소수점 아래 0을 삭제해서 출력하려면 printf > %s
		 * (int)로 반올림 
		 */
	}

}
