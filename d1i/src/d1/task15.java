package d1;

import java.util.Scanner;

public class task15 {

	public static void main(String[] args) {
		String password = "Tajne";
		String word;
		do {
			System.out.println("Podaj has�o:");
			word = new Scanner(System.in).next();
		} while (!password.equals(word));
		System.out.println("has�o jest ok :)");
	}
}
