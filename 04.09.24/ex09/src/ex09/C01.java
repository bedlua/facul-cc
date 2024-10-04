package ex09;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite sua nota de 0 a 100:");
		int n = sc.nextInt();
		if (n>=90 & n<=100) {
			System.out.println("Classificação A.");
		} else if (n>=80 & n<=89) {
			System.out.println("Classificação B.");
		} else if (n>=70 & n<=79) {
			System.out.println("Classificação C.");
		} else if (n>=60 & n<=69) {
			System.out.println("Classificação D.");
		} else if (n>=0 & n<=59) {
			System.out.println("Classificação F.");
		} else
			System.out.println("Número inválido.");
		sc.close();
	}

}