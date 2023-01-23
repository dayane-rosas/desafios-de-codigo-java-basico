/*Faça um Programa que pergunte em que turno você estuda. 
* Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
* Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
* A entrada consiste em três números inteiros que representam a idade das pessoas.
* A saída imprimirá a média de idade da turma*/
//Autora: Dayane Rosas
//Em: 23 de janeiro de 2023.

package dio.dayane;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class DesafioQualEhSeuTurno {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char turno = leitor.next().toUpperCase().charAt(0);

        if (turno == 'M')
            System.out.println("Bom Dia!");

        else if (turno == 'V')
            System.out.println("Boa Tarde!");

        else if (turno == 'N')
            System.out.println("Boa Noite!");
        else
            System.out.println("Valor inválido!");
    }
}
