package ex11;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Crie sua senha: ");
		String senha = sc.next();
		String resp;
		do {
			System.out.println("------------------------------------------");
			System.out.println("|           Seja Bem-vindo(a)            |");
			System.out.println("------------------------------------------");
			System.out.println("Digite sua senha:");
			resp = sc.nextLine();
			if (!resp.equals(senha)) {
				System.out.println("Senha incorreta.");
			}
			
		} while (!resp.equals(senha));
		
		System.out.println("Senha correta.");
	}

}
