package ex09;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um número inteiro para calcular seu fatorial: ");
		int n = sc.nextInt();
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f = f*i;
		}
		System.out.println("O fatorial de " + n + " é igual a: " + f);
	}
}