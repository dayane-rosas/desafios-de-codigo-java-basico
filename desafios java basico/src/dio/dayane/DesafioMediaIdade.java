/*Desafio
* Faça um programa que peça para 3 pessoas a sua idade, 
* ao final o programa deverá verificar se a média de idade da turma 
* varia entre 0 e 25, 26 e 60 e maior que 60; e então, dizer se a turma é jovem, 
* adulta ou idosa, conforme a média calculada.
* A entrada consiste em três números inteiros que representam a idade das pessoas.
* A saída imprimirá a média de idade da turma*/

//Autora: Dayane Rosas
//em: 23 de janeiro de 2023

package dio.dayane;

import java.util.Scanner;

public class DesafioMediaIdade {

    public static void main(String[] args) {

        // write your code here

        Scanner leitor = new Scanner(System.in);

        int idade1 = leitor.nextInt();

        int idade2 = leitor.nextInt();

        int idade3 = leitor.nextInt();

        double media = (idade1 + idade2 + idade3) / 3;

        if (media <= 25) {

            System.out.println("Jovem!");

        } else if (media <= 60) {

            System.out.println("Adulta!");

        } else {
            System.out.println("Idosa!");

        }

    }

}
