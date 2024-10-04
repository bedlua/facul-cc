package ex03;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Pressione enter para começar a contagem regressiva");
		sc.nextLine();
		for (int i = 10; i >= 0; i=i-1) {
			System.out.println(i);
		}
		System.out.println("Fim da contagem");
		sc.close();
	}

}
