package ex05;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor do salário mínimo:");
		int sm = sc.nextInt();
		System.out.println ("Digite seu salário:");
		int s = sc.nextInt();
		int r = s/sm;
		System.out.println("Você ganha " + r + " salários mínimos.");
		sc.close();
	}

}
