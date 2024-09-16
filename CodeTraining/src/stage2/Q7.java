package stage2;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double c = 0.09290304;
		Scanner sc = new Scanner(System.in);
		int area = 0;
		System.out.print("What is the length of the room in feet?");
		area = sc.nextInt();
		System.out.print("What is the width of the room in feet?");
		area *= sc.nextInt();
		System.out.println("The area is");
		System.out.printf("%d square feet\n", area);
		System.out.printf("%f square meters", c*area);
	}

}
