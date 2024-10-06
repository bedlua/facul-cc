package ex02;

import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[10];
        String[] s = new String[10];
        double ma = Double.MIN_VALUE;
        double me = Double.MAX_VALUE;
        double somah = 0;
        int qh = 0;
        int qm = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a altura da pessoa " + (i + 1) + ": ");
            a[i] = sc.nextDouble();
            System.out.println("Digite o sexo da pessoa " + (i + 1) + " (M/F): ");
            s[i] = sc.next().toUpperCase();
            if (a[i] > ma) {
                ma = a[i];
            }
            if (a[i] < me) {
                me = a[i];
            }
            if (s[i].equals("M")) {
                somah += a[i];
                qh++;
            } else if (s[i].equals("F")) {
                qm++;
            }
        }
        double mediah = (qh > 0) ? (somah / qh) : 0;
        System.out.println("Maior altura: " + ma);
        System.out.println("Menor altura: " + me);
        System.out.println("Média de altura dos homens: " + mediah);
        System.out.println("Número de mulheres: " + qm);
    }
}
