package stage2;
import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int C = 9;
		int area = 0;
		System.out.print("Enter width: ");
		area = sc.nextInt();
		System.out.print("Enter height: ");
		area *= sc.nextInt();
		System.out.printf("You will need to purchase %d liters of \n"
				+ "paint to cover %d square meters", (area/C) + (area%C), area);
	}

}
