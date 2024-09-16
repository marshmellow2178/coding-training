package stage3;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double weight = 0;
		double height = 0;
		System.out.print("몸무게 : ");
		weight = sc.nextDouble();
		System.out.print("키: ");
		height = sc.nextDouble()/100;
		
		double bmi = weight/(height*height);
		System.out.printf("BMI: %.2f\n", bmi);
		if(18.5<=bmi && bmi <=32.5) {
			System.out.print("You are within the ideal weight range.");
		}else {
			if(bmi<18.5) {
				System.out.print("You are underweight. ");
			}else if(bmi>32.5) {
				System.out.print("You are overweight. ");
			}
			System.out.print("You should see your doctor.");
		}
		
	}

}
