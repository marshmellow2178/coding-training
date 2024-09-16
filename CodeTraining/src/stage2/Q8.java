package stage2;
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int pizza = 0;
		int people = 0;
		int piece = 0;
		System.out.print("How many people?");
		people = sc.nextInt();
		System.out.print("How many pizzas do you have?");
		pizza = sc.nextInt();
		System.out.print("How many pieces are in a pizza?");
		piece = pizza * sc.nextInt();
		
		System.out.printf("%d people with %d pizzas\n", people, pizza);
		System.out.printf("Each person gets %d pieces of pizza.\n", piece/people);
		System.out.printf("There are %d leftover pieces", piece%people);
	}

}
