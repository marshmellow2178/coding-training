package stage1;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.println("What's your name?");
		name = sc.nextLine();
		
		System.out.println("Hello, "+name+", nice to meet you!");
	}
}