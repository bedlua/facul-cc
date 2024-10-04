package ex04;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a altura da parede: ");
		double hp = sc.nextDouble();
		System.out.println("Digite a largura da parede: ");
		double lp = sc.nextDouble();
		System.out.println("Digite a altura do azulejo: ");
		double ha = sc.nextDouble();
		System.out.println("Digite a largura do azulejo: ");
		double la = sc.nextDouble();
		double x = (hp*lp)/(ha*la);
		int xx = (int) Math.ceil(x);
		System.out.println("Será necessário "+xx+" azulejos para cobrir a parede.");
	}

}
