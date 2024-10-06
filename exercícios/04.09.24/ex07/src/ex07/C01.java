package ex07;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um número para verifica-lo:");
		int n = sc.nextInt();
		if (n>0) {
			System.out.println("Número positivo.");
		} else if (n<0) {
			System.out.println("Número negativo.");
		} else if (n==0) {
			System.out.println("Número zero");
		}
		sc.close();
	}

}
