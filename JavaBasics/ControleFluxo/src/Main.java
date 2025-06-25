import exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int fistParam = sc.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int secondParam = sc.nextInt();

        try {
            contar(fistParam, secondParam);
        } catch (ParametrosInvalidosException ex) {
            System.out.printf(ex.getMessage());
        }
    }

    private static void contar(int firstParam, int secondParam) throws ParametrosInvalidosException {

        if(firstParam > secondParam) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        int contagem = secondParam - firstParam;

        for (int i = 1; i <= contagem; i++) {
            System.out.printf("Imprimindo o número %d\n", i);
        }

    }
}