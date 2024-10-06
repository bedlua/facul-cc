package ex06;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma = 0;
        int q = 0;
        char r;
        do {
            System.out.print("Digite a nota: ");
            double n = sc.nextDouble();
            soma += n;
            q++;
            System.out.print("Deseja inserir outra nota? Sim(S) Não(N)");
            r = sc.next().toLowerCase().charAt(0);
        } while (r == 's');
        if (q > 0) {
            double m = soma / q;
            System.out.println("Média = " + m);
        }
        
        sc.close();
    }
}