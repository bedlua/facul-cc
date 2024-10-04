package ex01;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite sua idade em anos, meses e dias respectivamente: ");
		int a = sc.nextInt ();
		int m = sc.nextInt ();
		int d = sc.nextInt ();
		int idade = (a*365)+(m*30)+d;
		System.out.println(idade);
		sc.close();
	}

}
