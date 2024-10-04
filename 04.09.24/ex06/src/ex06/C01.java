package ex06;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um número inteiro:");
		int n = sc.nextInt();
		int ant = n-1;
		int suc = n+1;
		System.out.println("O sucessor de "+n+" é "+suc+", o antecessor é "+ant+".");
		sc.close();
	}

}
