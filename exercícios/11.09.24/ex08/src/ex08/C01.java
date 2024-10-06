package ex08;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String string = sc.nextLine().toLowerCase();
        int vogal = 0;
        for (int i = 0; i < string.length(); i++) {
            char letra = string.charAt(i);
            switch (letra) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vogal++;
                    break;
            }
        }
        System.out.println("Número de vogais: " + vogal);
    }
}
