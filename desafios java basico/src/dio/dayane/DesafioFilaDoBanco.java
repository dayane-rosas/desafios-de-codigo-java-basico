/*Elabore um programa que simule uma fila de atendimento bancário. 
*O programa deve ler o nome de 3 pessoas (clientes do banco), 
*armazenando-os em uma fila.
A entrada será o nome de três pessoas (clientes do banco).
O programa deve imprimir como saída na tela o nome da pessoa e sua posição na fila.*/

//Dayane Rosas

package dio.dayane;

import java.util.Scanner;

public class DesafioFilaDoBanco {

    public static void main(String[] args) {

        String[] nomesFila = new String[3];
        Scanner nome = new Scanner(System.in);

        for (int count = 0; count <= nomesFila.length - 1; count++) {

            nomesFila[count] = nome.next();

            System.out.println(nomesFila[count] + " - esta na posicao: " + (count + 1));
        }
    }
}