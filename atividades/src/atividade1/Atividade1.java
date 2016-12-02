/**
 *
 * 	Sistema em Java que representa um consultório médico.
 * Após a entrada de todos os dados, aparece um menu para o usuário:
 * 1 – Imprimir na tela os dados armazenados;(relativo a função f1)
 * 2 – Imprimir a média do valor das consultas realizadas.(relativo a função f2)
 * 3 – Imprimir os dados das pessoas do sexo masculino;(relativo a função f3)
 * 4 – Imprimir o maior valor de consulta realizado por uma pessoa do sexo
 *	feminino. (relativo a função f4)
 *
 *@author Anderson Sales Lima
 *@version 1.0
 */

package atividade1;

import java.util.Scanner;

public class Atividade1{
	
	private static String[] nome = new String[100];
	private static String[] sexo = new String[100];
	private static int [] idade = new int[100];
	private static double[] valor = new double[100];
	private static int op, i=0, quant = 0;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String resposta, res;
		
		do{
			System.out.printf("\nDigite nome: ");
			nome[i] = LerNome();
			System.out.printf("\nDigite o sexo: ");
			sexo[i] = LerSexo();
			System.out.printf("\nDigite idade: ");
			idade[i] = LerIdade();
			System.out.printf("\nDigite valor: ");
			valor[i] = LerValor();
			System.out.printf("\nDeseja adicionar mais algum[S/N]: ");
			resposta = sc.next();
			//system("cls");
			res = resposta.toUpperCase();
			i++;
		}while(res.equals("S"));
		quant = i;
		
		do{
			System.out.printf("\n1-Imprimir na tela os dados armazenados;");
			System.out.printf("\n2-Imprimir a média do valor das consultas;");
			System.out.printf("\n3-Imprimir os dados das pessoas do sexo masculino;");
			System.out.printf("\n4-Imprimir o maior valor de consulta realizado por uma pessoa do sexo feminino;");
			System.out.printf("\n5-Sair;");
			System.out.printf("\nDigite a opcão desejada: ");
			op = sc.nextInt();
			
			if(op==1)
			{	
				F1();
			}
			if(op==2)
			{	
				F2();
			}
			if(op==3)
			{	
				F3();
			}
			if(op==4)
			{	
				F4();
			}
		}while(op!=5);
	}
	
	
	public static String LerNome()
	{
		Scanner sc = new Scanner(System.in);
		if( sc.hasNextDouble()  ||  sc.hasNextInt() )
		{
			sc.next();
			System.out.printf("\nvoce deve digitar um nome: ");
			return LerNome();
		}
		return sc.nextLine();
	}
	
	public static String LerSexo()
	{
		Scanner sc = new Scanner(System.in);
		String leitor, res;
		
		leitor = sc.nextLine();
		res = leitor.toUpperCase();
		if((!res.equals("MASCULINO"))&&(!res.equals("FEMININO")))
		{
			System.out.printf("\nvoce deve digitar o sexo: ");
			return LerSexo();
		}
		return leitor;
	}
	
	public static int LerIdade()
	{
		Scanner sc = new Scanner(System.in);
		if(!sc.hasNextInt())
		{
			sc.next();
			System.out.printf("\nvoce deve digitar um numero: ");
			return sc.nextInt();
		}
		return sc.nextInt();
	}
	
	public static double LerValor()
	{
		Scanner sc = new Scanner(System.in);
		if(!sc.hasNextDouble())
		{
			sc.next();
			System.out.printf("\nvoce deve digitar um numero: ");
			return LerValor();
		}
		return sc.nextDouble();
	}
	
	public static void F1()
	{
		for(i=0;i<quant;i++)
		{
			System.out.printf("\nnome:%s",nome[i]);
			System.out.printf("\nsexo:%s",sexo[i]);
			System.out.printf("\nidade:%d",idade[i]);
			System.out.printf("\nvalor:%f\n",valor[i]);
		}
	}
	
	public static void F2()
	{
		double media, total=0;
		
		for(i=0;i<quant;i++)
		{
			total += valor[i];
		}
		media = total/(i+1);
		System.out.printf("\nmedia:%f\n", media);
	}
	
	public static void F3()
	{
		String res;
		
		for(i=0; i<quant; i++)
		{
			res = sexo[i].toUpperCase();
			if(res.equals("MASCULINO"))
			{
				System.out.printf("\nnome:%s",nome[i]);
				System.out.printf("\nsexo:%s",sexo[i]);
				System.out.printf("\nidade:%d",idade[i]);
				System.out.printf("\nvalor:%f\n",valor[i]);
			}
		}
	}
	
	public static void F4()
	{
		double maior=0;
		String res;
		
		for(i=0; i<quant; i++)
		{	
			res = sexo[i].toUpperCase();
			if((res.equals("FEMININO"))&&(maior < valor[i]))
			{
				maior = valor[i];
			}
		}
		System.out.printf("\nvalor:%f\n",maior);
	}
}
