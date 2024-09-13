package stage1;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		System.out.println("What is the first number? ");
		x = sc.nextInt();
		System.out.println("What is the second number? ");
		y = sc.nextInt();
		System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d", 
				x, y, x+y, x, y, x-y, x, y, x*y, x, y, x/y);
	}

}
