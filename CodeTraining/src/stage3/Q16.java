package stage3;
import java.util.Scanner;
public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int age = 0;
		System.out.print("What is your age?");
		age = sc.nextInt();
		String msg = (age>=16) ? "You are old enough to legally drive" :  "You are not old enough to legally drive";
		System.out.print(msg);

	}

}
