package ex10;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite uma letra:");
		String l = sc.next().toLowerCase();
		// or || and &&
		if (l.equals("a") || l.equals("e") || l.equals("i") || l.equals("o") || l.equals("u")) {
			System.out.println("Vogal.");
		} else {
			System.out.println("Consoante.");
		}
		sc.close();
	}

}
