package ex08;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um número para verifica-lo:");
		int n = sc.nextInt();
		if (n%2 == 0) {
			System.out.println("Número par.");
		} else {
			System.out.println("Número ímpar.");
		}
		sc.close();
	}

}
