package stage3;
import java.util.Scanner;
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		final double RATE = 5.5;
		double amount = 0;
		String state = "";
		double tax = 0;
		
		System.out.print("What is the order amount?");
		amount = sc.nextDouble();
		tax = RATE/100*amount; 
		sc.nextLine();
		System.out.print("What is the state?");
		state = sc.nextLine();
		if(state.equals("WI")) {
			System.out.printf("The subtotal is $%.2f\n", amount);
			System.out.printf("The tax is $%.2f\n", tax);
		}
		System.out.printf("The total is $%.2f\n", amount+tax);
	}

}
