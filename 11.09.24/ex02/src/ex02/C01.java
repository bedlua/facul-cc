package ex02;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int n = sc.nextInt();
		int s = 0;
		int i = 1;
		while (i <= n) {
			s = s+i;
			i = i+1;
		} 
		System.out.println("A soma dos primeiros "+ n +" números é igual a: "+ s);
		sc.close();
	}

}
