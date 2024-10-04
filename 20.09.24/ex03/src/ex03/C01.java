package ex03;

import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de funcionários: ");
        int f = sc.nextInt();
        double[] s = new double[f];
        double soma = 0;
        for (int i = 0; i < f; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            s[i] = sc.nextDouble();
            soma += s[i];
        }
        double media = soma/f;
        System.out.printf("A média salarial da empresa é: %.2f\n", media);
    }
}
