package ex;

import java.util.Scanner;
import java.util.Random;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("------------------------------------------");
		System.out.println("|                  MENU                  |");
		System.out.println("------------------------------------------");
		System.out.println("| OPÇÃO 1: Jogar adivinhe o número       |");
		System.out.println("| OPÇÃO 2: Imprimir de 0 a 100 (ímpares) |");
		System.out.println("| OPÇÃO 3: Imprimir de 0 a 100 (pares)   |");
		System.out.println("| OPÇÃO 4: SAIR                          |");
		System.out.println("------------------------------------------");
		System.out.println("Digite a opção:");
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1: 
			int nx = rd.nextInt(11);
			System.out.println ("Escolha um número de 0 a 10: ");
			int n = sc.nextInt();
			System.out.println("O número escolhido é: " + nx); break;
		case 2:
			for (int i = 0; i <= 100 ; i++) {
				if (i%2 != 0) {
					System.out.println(i);
				}
			}
			break;
		case 3:
			for (int i = 0; i <= 100 ; i++) {
				if (i%2 == 0) {
					System.out.println(i);
				}
			}
			break;
		case 4:
			System.out.println("Saindo..."); 
			break;
		default:
			System.out.println("Opção inválida.");
		}
			
		sc.close();
	}

}
