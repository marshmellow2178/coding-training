package stage1;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[4];
		System.out.println("Enter a noun");
		arr[0] = sc.nextLine();
		System.out.println("Enter a verb");
		arr[1] = sc.nextLine();
		System.out.println("Enter an adjective");
		arr[2] = sc.nextLine();
		System.out.println("Enter an adverb");
		arr[3] = sc.nextLine();
		
		System.out.println("Do you "+arr[1]+" your "+ arr[2]+" "+arr[0]+" "+arr[3]+"? That's hilarious!");
	}

}
