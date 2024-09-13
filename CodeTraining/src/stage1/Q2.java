package stage1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the input String?");
		input = sc.nextLine();
		
		while(input.equals("")) {
			System.out.println("Enter something");
			input = sc.nextLine();
		}
		
		System.out.println(input + " has "+ input.length()+" characters.");
	}

}
