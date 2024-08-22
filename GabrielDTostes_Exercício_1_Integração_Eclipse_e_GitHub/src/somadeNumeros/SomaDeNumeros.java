package somadeNumeros;
import java.util.*;

 class SomaDeNumeros {
	     public static Scanner sc = new Scanner(System.in);

	     public static void main (String[] args){
	         
	         int num1, num2, soma;
	         System.out.println("Aluno: Gabriel Dias Tostes\nTurma: 473100 \nCurso: Ciências da Computação \nData: 19/08/2024\n");
	         
	         System.out.println("Este programa tem o objetivo calcular o valor da soma de dois (2) números inteiros.\n");
	         
	         System.out.println("Primeiro número: ");
	         num1 = sc.nextInt();

	         System.out.println("Segundo número inteiro: ");
	         num2 = sc.nextInt();

	         soma = num1 + num2;

	         System.out.println("\nA soma dos dois números é: " + soma);
	     }
	 }

