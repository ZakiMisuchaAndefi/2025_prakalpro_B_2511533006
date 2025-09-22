package pekan3;

import java.util.Scanner;

public class OperatorLogika {
	public static void main(String[] args) {
		boolean A1;
		boolean A2;
		boolean c;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input nilai boolean-1 (true / false): ");
		A1 = keyboard.nextBoolean(); // input 10
		System.out.print("Input nilai boolean-2 (true / false): ");
		A2 = keyboard.nextBoolean();
		keyboard.close();
		System.out.print("A1 =" +A1);
		System.out.print("A2 =" +A2);
		System.out.print("Konjungsi" );
		c= A1&A2;
		System.out.print("true and false = "+c);
		System.out.print("Disjungsi" );
		c= A1|A2;
		System.out.print("true or false = "+c);
		System.out.print("Negasi" );
		c= !A1;
		System.out.print("bukan true = "+c);
		

	}

}
