package stage2;
import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		final double PER = 0.055;
		double subtotal = 0;
		double tax = 0;
		
		for(int i = 0;i<3;i++) {
			int item = 0;
			System.out.printf("Price of item%d: ", i+1);
			item = sc.nextInt();
			System.out.printf("Quantity of item%d: ", i+1);
			item *= sc.nextInt();
			subtotal += item;
		}
		tax = PER * subtotal;
		System.out.printf("Subtotal : $%.2f\n", subtotal);
		System.out.printf("Tax: $%.2f\n", tax);
		System.out.printf("Total: $%.2f", tax + subtotal);
	}

}
