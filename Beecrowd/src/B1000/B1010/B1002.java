package B1000.B1010;

import java.util.Scanner;

public class B1002 {

	public static void main(String[] args) {
		var scan = new Scanner(System.in);

		final double PI = 3.14159;
		double raio = scan.nextDouble();

		double result = Math.pow(raio, 2) * PI;
		System.out.printf("A=%.4f\n", result);

		scan.close();

	}

}
