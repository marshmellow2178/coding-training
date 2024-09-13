package stage1;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String quote = "";
		String name = "";
		System.out.println("What is the quote?");
		quote = sc.nextLine();
		System.out.println("Who said it?");
		name = sc.nextLine();
		
		System.out.println(name + " says, \""+ quote + "\".");
	}

}
