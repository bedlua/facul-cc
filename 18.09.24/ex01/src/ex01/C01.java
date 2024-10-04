package ex01;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		double c = sc.nextDouble();
		double k = c + 273.15;
		double re = c * 0.8;
		double ra = c * 1.8 + 32 + 459.67;
		double f = c * 1.8 + 32;
		System.out.println("Kelvin:"+k);
		System.out.println("Réaumur:"+re);
		System.out.println("Rankine:"+ra);
		System.out.println("Fahrenheit:"+f);
	}

}
