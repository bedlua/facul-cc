package ex07;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para verificar se ele é primo: ");
		int n = sc.nextInt();
		boolean np = true;
		if (n<=1) {
			np = false;
		} else {
			for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    np = false;
                    break;
                }
			}
		}
        if (np) {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " não é primo.");
        }
    }
}
			