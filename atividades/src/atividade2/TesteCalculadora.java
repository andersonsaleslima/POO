/**
 * 	Classe principal para uso da classe Calculadora. Op��es das opera��es que 
 * deseja usar da Calculadora s�o mostradas logo no inicio do programa.
 * 	Ap�s a escolha da op��o � solicitado o que se digite o n�mero e novamente 
 * � mostrado as op��es para qual opera��o deseja efetuar, o resultado da 
 * opera��o � passado para a variavel valor1 do tipo calculadora, que no 
 * inicio do programa come�a com zero, recebe o resultado da ultima opera��o
 * executada.    
 * 
 * @author Anderson Sales Lima
 * @version 1.0
 */

package atividade2;

import java.util.Scanner;
import java.math.BigInteger;

public class TesteCalculadora {
	
	public static void main(String[] args){
		int op;
		Calculadora valor1 = new Calculadora();
		BigInteger valor2;
		String resultado;
		int valor3;
		
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("\n1-soma");
			System.out.println("2-subtracao");
			System.out.println("3-multiplicacao");
			System.out.println("4-divisao");
			System.out.println("5-potencia");
			System.out.println("6-igualdade");
			System.out.println("0-resultado e sair");
			System.out.println("Digite a opc�o desejada: ");
			op = sc.nextInt();
			
			if(op==1){
				System.out.printf("\nDigite o valor: ");
				valor2 = sc.nextBigInteger();
				valor1.soma(valor2);
				resultado = valor1.toString();
				System.out.println(resultado);
			}
			if(op==2){
				System.out.printf("\nDigite o valor: ");
				valor2 = sc.nextBigInteger();
				valor1.subtracao(valor2);
				resultado = valor1.toString();
				System.out.println(resultado);
			}
			if(op==3){
				System.out.printf("\nDigite o valor: ");
				valor2 = sc.nextBigInteger();
				valor1.multiplicacao(valor2);
				resultado = valor1.toString();
				System.out.println(resultado);
			}
			if(op==4){
				System.out.printf("\nDigite o valor: ");
				valor2 = sc.nextBigInteger();
				valor1.divisao(valor2);
				resultado = valor1.toString();
				System.out.println(resultado);
			}
			if(op==5){
				System.out.printf("\nDigite o valor: ");
				valor3 = sc.nextInt();
				valor1.potencia(valor3);
				resultado = valor1.toString();
				System.out.println(resultado);
			}
			/*if(op==6){
				System.out.printf("\nDigite o valor: ");
				valor2 = sc.nextBigInteger();
				valor1.equals(valor2);
				resultado = valor1.toString();
				System.out.println(resultado);
			}*/
			
		}while(op!=0);
	}
}
