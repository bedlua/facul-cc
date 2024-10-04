package ex10;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("------------------------------------------");
		System.out.println("|       Conversão de temperaturas        |");
		System.out.println("------------------------------------------");
		System.out.println("| Digite a temperatura em Celsius:       |");
		double c = sc.nextDouble();
		System.out.println("------------------------------------------");
		System.out.println("| 1 - Converter para Fahrenheit          |");
		System.out.println("| 2 - Converter para Kelvin              |");
		System.out.println("------------------------------------------");
		System.out.println("| Digite a opção desejada:               |");
		int opcao = sc.nextInt();
		double temp;
		switch (opcao) {
		case 1:
			temp = (c*9/5) + 32;
            System.out.println(c + "°C é igual a " + temp + "°F.");
            break;
		case 2:
			temp = c + 273.15;
            System.out.println(c + "°C é igual a " + temp + "K.");
            break;
		}
	}
}