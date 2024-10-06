package ex11;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o primeiro, segundo e terceiro lado do triângulo, respectivamente:");
		double l1 = sc.nextInt();
		double l2 = sc.nextInt();
		double l3 = sc.nextInt();
		if (l1==l2 && l2==l3) {
			System.out.println("Triângulo equilátero.");
		} else if (l1==l2 || l2==l3 || l3==l2) {
			System.out.println("Triângulo isósceles.");
		} else if (l1!=l2 && l2!=l3 && l3!=l1) {
			System.out.println("Triângulo escaleno.");
		}
		sc.close();
	}

}