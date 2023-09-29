package B3S.Calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero1, numero2, risultato;
        char operatore;

        System.out.print("Inserisci il primo numero: ");
        numero1 = input.nextDouble();

        System.out.print("Inserisci un operatore (+, -, *, /): ");
        operatore = input.next().charAt(0);

        System.out.print("Inserisci il secondo numero: ");
        numero2 = input.nextDouble();

        switch (operatore) {
            case '+':
                risultato = numero1 + numero2;
                System.out.println("Risultato: " + risultato);
                break;
            case '-':
                risultato = numero1 - numero2;
                System.out.println("Risultato: " + risultato);
                break;
            case '*':
                risultato = numero1 * numero2;
                System.out.println("Risultato: " + risultato);
                break;
            case '/':
                if (numero2 != 0) {
                    risultato = numero1 / numero2;
                    System.out.println("Risultato: " + risultato);
                } else {
                    System.out.println("Impossibile dividere per zero.");
                }
                break;
            default:
                System.out.println("Operatore non valido.");
        }

        input.close();
    }
}
