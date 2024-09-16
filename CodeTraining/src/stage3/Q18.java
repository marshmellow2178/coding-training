package stage3;
import java.util.Scanner;
public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double amount = 0;
		char select = ' ';
		String convert = "";
		double answer = 0;
		
		System.out.print("C to F (press C)\nF to C (press F)");
		select = sc.nextLine().charAt(0);
		System.out.print("Enter temparture: ");
		amount = sc.nextDouble(); 
		if(select == 'C' || select == 'c') {
			answer = (amount - 32)*5/9;
			convert = "Celcius";
		}else {
			answer = (amount *9/5)+32;
			convert = "Farenheit";
		}
		System.out.printf("The answer in %s is %s", convert, answer);
	}

}
