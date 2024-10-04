package ex03;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o saldo para reajuste:");
		double saldo = sc.nextDouble();
		double saldorj = (saldo*0.025) + saldo ;
		System.out.println("Seu novo saldo é: " + saldorj);
		sc.close();
	}

}
