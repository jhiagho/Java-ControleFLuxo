/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author jhiag
 */
public class Contador {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            Contar(parametroUm,parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void Contar(int parametroUm, int paramentroDois) throws ParametrosInvalidosException {
        //Validar se paramentroUm e maior que paramentroDois e lançar a exceed.
        if (parametroUm > paramentroDois) {
            throw new ParametrosInvalidosException();
        }

        int contador = 0;
        for (int i = parametroUm; i <= paramentroDois; i++) {
            System.out.println("Imprimindo o número: " + i);
        }

    }
}
