package stage1;
import java.time.LocalDate;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = 0;
		int retire = 0;
		int answer = 0;
		int year = LocalDate.now().getYear();
		System.out.println("What's your current age?");
		age = sc.nextInt();
		System.out.println("What age would you like to retire?");
		retire = sc.nextInt();
		answer = retire - age;
		System.out.printf("You have %d years left until you can retire.\nIt's %d, so you can retire in %d", 
				answer, year, year+answer);
	}

}
