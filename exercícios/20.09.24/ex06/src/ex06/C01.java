package ex06;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor da massa em kg:");
		double m = sc.nextInt();
		System.out.println("Digite o valor da altura em metros:");
		double h = sc.nextInt();
		System.out.println("Digite o valor do tempo em segundos:");
		double t = sc.nextInt();
		double cavalos = (m * h / t) / 745.6999;
		int cav = (int) Math.ceil(cavalos);
		System.out.println("Será necessário "+cav+" cavalo(s).");
	}

}
