package stage3;
import java.util.Scanner;
public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String uid = "user1";
		String pwd = "1234";
		
		String login = "";
		System.out.print("What is the password: ");
		login = sc.nextLine();
		if(login.equals(pwd)) {
			System.out.print("Welcome!");
		}else {
			System.out.print("That password is incorrect");
		}
	}

}
