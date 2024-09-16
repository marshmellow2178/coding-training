package stage3;
import java.util.Scanner;
public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		double rate = 0.73;
		char gender = 'm';
		int alchol = 0;
		double per = 0;
		double weight = 0;
		int hour = 0;
		
		System.out.print("성별: ");
		gender = sc.nextLine().charAt(0);
		if(gender != 'm') {
			rate = 0.6;
		}
		System.out.print("알코올 소비량(oz): ");
		alchol = sc.nextInt();
		System.out.print("알콜 도수: ");
		per = sc.nextDouble();
		System.out.print("몸무게: ");
		weight = sc.nextDouble();
		System.out.print("경과 시간: ");
		hour = sc.nextInt();
		
		System.out.printf("Your BAC is %.2f", per*alchol*5.14/weight*rate - (0.015*hour));
	}

}
