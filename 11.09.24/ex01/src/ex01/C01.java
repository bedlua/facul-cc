package ex01;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para mostrar sua tabuada: ");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++)
		System.out.println(n+"x"+i+"="+(n*i));
		sc.close();
	}

}
