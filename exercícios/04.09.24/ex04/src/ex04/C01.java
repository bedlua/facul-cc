package ex04;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a porcentagem do IPI:");
		double IPI = sc.nextDouble();
		System.out.println("Digite o valor e a quantidade da peça 1:");
		double v1 = sc.nextDouble();
		double q1 = sc.nextDouble();
		System.out.println("Digite o valor e a quantidade da peça 2:");
		double v2 = sc.nextDouble();
		double q2 = sc.nextDouble();
		double vt = (v1*q1+v2*q2)*(IPI/100+1);
		System.out.println("Valor total: R$"+ vt);
		sc.close();
	}

}