package lineComarision;

import java.util.Scanner;

public class Uc_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to line computation program");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the x1 value");
		double x1 = scanner.nextDouble();

		System.out.println("Enter the x2 value");
		double x2 = scanner.nextDouble();

		System.out.println("Enter the y1 value");
		double y1 = scanner.nextDouble();

		System.out.println("Enter the y2 value");
		double y2 = scanner.nextDouble();

		double line1 = Math.sqrt((x2 - x1) + (y2 - y1));
		System.out.println("First line value is  " + line1);

		double line2 = Math.sqrt((x2 - x1) - (y2 - y1));
		System.out.println("Second line value is  " + line2);
	}

}
