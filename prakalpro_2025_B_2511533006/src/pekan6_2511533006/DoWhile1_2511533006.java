package pekan6_2511533006;

import java.util.Scanner;

public class DoWhile1_2511533006 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
			String phrase;
			do {
				System.out.print("Input Password: ");
				phrase = console.next();
			} while (!phrase.equals("abcd"));
	}

}
