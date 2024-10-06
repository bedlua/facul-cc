package ex05;

import java.util.Scanner;
import java.util.Date;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.println("|                  MENU                  |");
		System.out.println("------------------------------------------");
		System.out.println("| OPÇÃO 1: Exibir uma mensagem           |");
		System.out.println("| OPÇÃO 2: Exibir data atual             |");
		System.out.println("| OPÇÃO 3: Sair do programa              |");
		System.out.println("------------------------------------------");
		System.out.println("Digite a opção:");
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Olá seja bem vindo."); break;
		case 2:
			long tempo = System.currentTimeMillis();
			Date data = new Date(tempo);
			System.out.println("Data atual: "+ data); break;
		case 3:
			System.out.println("Saindo..."); break;
		}

	}

}
