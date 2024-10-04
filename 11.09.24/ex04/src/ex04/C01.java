package ex04;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um número para exibir os pares até ele: ");
		int n = sc.nextInt();
		for (int i = 0; i <= n ; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}

	}

}
