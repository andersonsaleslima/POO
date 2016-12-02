/**
 * 	Classe principal de um programa que representa um consultório médico.
 * Inicialmente é mostrado um menu com as opções ao qual desejar.
 * 
 * @author Anderson Sales Lima
 * @version 1.0
 */
package atividade3;

import java.text.ParseException;
import java.util.Scanner;
import java.lang.NullPointerException;
import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.GregorianCalendar;


public class TesteConsultorio{

	private static ColeçaoPaciente paciente = new ColeçaoPaciente();
	private static ColeçaoMedico medico = new ColeçaoMedico();
	private static ColeçaoConsulta consulta = new ColeçaoConsulta();
	
	public static void main(String[] args) throws ParseException {
		
		int op = 0, i=0;
		Scanner sc = new Scanner(System.in);
		String documento = new String();
		String nome = new String();
		String sexo = new String();
		Endereço endereço = new Endereço();
		String end = new String();
		String data = new String();
		
		do{
			System.out.println("Menu ");
			System.out.println("0- Sair");
			
			System.out.println("\nPacientes:");
			System.out.println("1- Adicionar Paciente");
			System.out.println("2- Pesquisar pelo documento");
			System.out.println("3- Remover pelo documento");
			System.out.println("4- Quantidade de paciente por sexo");
			System.out.println("5- Listar Pacientes com endereço");
			System.out.println("6- listagem de pacientes maiores de 60 anos");
		
			System.out.println("\nMedicos:");
			System.out.println("7- Adicioanr médico");
			System.out.println("8- Pesquisar pelo crm");
			System.out.println("9- Pesquisar médico por parte do nome");
		
			System.out.println("\nConsultas");
			System.out.println("10- Adicionar Consulta");
			System.out.println("11- Quantidade de Consultas por data");
			System.out.println("12- Listar Consultas");
			System.out.println("13- Quantidade de consultas por médico");
			System.out.println("14- Listar consultas por paciente");
		
			System.out.print("\nOpção: ");
			op = LerNumero();
			
			if(op==1){
				if(adicionarPaciente()){
					System.out.println("paciente adicionado com sucesso"); 
				}
			}			
			if(op==2){
				System.out.print("digite o documento: ");
				documento = LerDocumento();
				System.out.println(paciente.pesquisaPeloDocumento(documento).toString());
			}
			if(op==3){
				System.out.print("digite o documento: ");
				documento = LerDocumento();
				paciente.removePeloDocumento(documento);
			}
			if(op==4){
				paciente.qtdPacientesPorSexo();
			}
			if(op==5){
				paciente.listagemPacienteComEndereço();
			}
			if(op==6){
				paciente.listagemPacienteMaioresDe60();
			}
			
			/*Médico*/
			if(op==7){
				if(adicionarMedico()){
					System.out.println("medico adicionado com sucesso");
				}
			}
			if(op==8){
				System.out.print("digite o CRM: ");
				documento = LerDocumento();
				System.out.println(medico.pesquisaPeloCRM(documento).toString());
			}
			if(op==9){
				System.out.print("Digite parte do nome do medico: ");
				nome = LerNome();
				medico.pesquisaPorParteDoNome(nome);
			}
			
			/*Consulta*/
			if(op==10){
				if(adicionarConsulta()){
					System.out.println("Consulta adicionada com sucesso");
				}
			}
			if(op==11){
				System.out.print("Digite a data: ");
				data = LerData();
				consulta.qtdConsultasPorData(data);
			}
			if(op==12){
				consulta.listagemConsultas();
			}
			if(op==13){
				System.out.print("Digite o crm do medico: ");
				documento = LerDocumento();
				consulta.qtdConsultasPorMedico(medico.pesquisaPeloCRM(documento));
			}
			if(op==14){
				System.out.print("Digite o documento do paciente: ");
				documento = LerDocumento();
				consulta.listaConsultasPorPaciente(paciente.pesquisaPeloDocumento(documento));
			}
			
			System.out.println();
		}while(op!=0);
	}

	/* opcção 1*/
	public static boolean adicionarPaciente() throws ParseException{
		int op = 0;
		Scanner sc = new Scanner(System.in);
		String documento = new String();
		String nome = new String();
		String sexo = new String();
		Endereço endereço = new Endereço();
		String end = new String();
		String data = new String();
		
		System.out.print("digite o documento do paciente: ");
		documento = LerDocumento();
		if(paciente.pesquisaPeloDocumento(documento)!= null){
			System.out.println("paciente já está cadastrado");
			return false;
		}
		System.out.print("digite o nome do paciente: ");
		nome = LerNome();
		System.out.print("digite o sexo do paciente: ");
		sexo = LerSexo();
		System.out.print("digite o endereço do paciente: ");
		System.out.print("Cep: ");
		end = sc.nextLine();
		endereço.setCep(end);
		System.out.print("rua: ");
		end = sc.nextLine();
		endereço.setRua(end);
		System.out.print("bairro: ");
		end = sc.nextLine();
		endereço.setBairro(end);
		System.out.print("Complemento: ");
		end = sc.nextLine();
		endereço.setComplemento(end);
		System.out.print("digite a data de nascimento do paciente(dd/MM/yyyy): ");
		data = LerData();
		if(!paciente.adicionarPaciente(documento, nome, sexo, endereço, data)){
			System.out.println("erro ao cadastrar paciente");
			return false;
		}
		return true;
	}
	
	/*opção 7*/
	public static boolean adicionarMedico(){
		Scanner sc = new Scanner(System.in);
		String crm;
		String nome;
		String especialidade;
		
		System.out.print("digite o crm do medico: ");
		crm = LerDocumento();
		if(medico.pesquisaPeloCRM(crm)!= null){
			System.out.println("médico já está cadastrado");
			return false;
		}
		System.out.print("digite o nome do medico: ");
		nome = LerNome();
		System.out.print("digite a especiliadade do medico: ");
		especialidade = LerNome();
		if(!medico.adicionarMedico(crm, nome, especialidade)){
			System.out.print("erro ao cadastrar medico ");
			return false;
		}
		return true;
	}
	
	/*opção 10*/
	public static boolean adicionarConsulta()throws ParseException{
		Scanner sc = new Scanner(System.in);
		String documentoPaciente;
		String crm;
		String dataHora;
		
		System.out.print("Digite o documento do paciente: ");
		documentoPaciente = LerDocumento();
		System.out.print("Digite o CRM do medico: ");
		crm = LerDocumento();
		System.out.print("Digite a data e hora no formato (dd/MM/yyyy hh:mm:ss): ");
		dataHora = sc.nextLine();
		
		if(!consulta.adicionarConsulta(paciente.pesquisaPeloDocumento(documentoPaciente), medico.pesquisaPeloCRM(crm), dataHora)){
			System.out.println("Erro ao adicioanr consulta");
			return false; 
		}
		return true;
	}
	
	public static int LerNumero(){
		Scanner sc = new Scanner(System.in);
		
		if( !sc.hasNextInt())
		{
			sc.next();
			System.out.printf("\nvoce deve digitar um numero: ");
			return LerNumero();
		}
		return sc.nextInt();
	}
	
	public static String LerDocumento(){
		Scanner sc = new Scanner(System.in);
		
		if( !sc.hasNextInt())
		{
			sc.next();
			System.out.printf("\nvoce deve digitar um numero: ");
			return LerDocumento();
		}
		return sc.nextLine();
	}
	
	public static String LerNome(){
		Scanner sc = new Scanner(System.in);
		if( sc.hasNextDouble()  ||  sc.hasNextInt() )
		{
			sc.next();
			System.out.printf("\nvoce deve digitar um nome: ");
			return LerNome();
		}
		return sc.nextLine();
	}
	
	public static String LerSexo(){
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
	
	public static String LerData()throws ParseException{
		Scanner sc = new Scanner(System.in);
		String leitor, res;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		leitor = sc.nextLine();
		if(sdf.parse(leitor)==null)
		{
			System.out.println("voce deve digitar a data no formato solicitado(dd/MM/yyyy): ");
			return LerData();
		}
		return leitor;
	}
	
}