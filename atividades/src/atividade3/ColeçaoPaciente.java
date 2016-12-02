/**
 * Coleção que gera Paciente
 * 
 * @author Anderson Sales Lima
 * @version 1.0
 */
package atividade3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ColeçaoPaciente {
	private List<Paciente> paciente;
	
	public ColeçaoPaciente(){
		this.paciente = new ArrayList<Paciente>();
	}
	
	public boolean adicionarPaciente(String documento, String nome, String sexo, Endereço endereço, String dataDeNascimento){
		
		if(documento != null){
		
			this.paciente.add(new Paciente(documento, nome, sexo, endereço, dataDeNascimento));
			return true;
		}
		return false;
	}
	
	public Paciente pesquisaPeloDocumento(String documento){
		int i;
		Paciente paciente;

		for( i = 0; i < this.paciente.size(); i++){
			paciente = this.paciente.get(i);
			if(paciente.getDocumento().equals(documento)){
				//System.out.println(this.paciente.get(i));
				return paciente;
			}
		}
		return null;
	}
	
	public boolean removePeloDocumento(String documento){
		int i;
		for( i = 0; i < this.paciente.size(); i++){
			Paciente paciente = this.paciente.get(i);
			if(paciente.getDocumento().equals(documento)){
				this.paciente.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void qtdPacientesPorSexo(){
		int i=0, qtdMasc=0, qtdFem=0;
		
		for(i = 0; i< this.paciente.size();i++){
			Paciente paciente = this.paciente.get(i);
			if(paciente.getSexo().toUpperCase().equals("MASCULINO")){
				qtdMasc++;
			}
			if(paciente.getSexo().toUpperCase().equals("FEMININO")){
				qtdFem++;
			}		
		}
		System.out.println("Masculino: " + qtdMasc);
		System.out.println("Feminino: " + qtdFem);
		
	}
	
	public void listagemPacienteComEndereço(){
		Paciente paciente ;
		
		System.out.println();
		for(int i = 0; i< this.paciente.size(); i++){
			paciente = this.paciente.get(i);
			System.out.println(paciente.nomeFormatado() + " - " + paciente.getEndereço());
		}
	}
	
	public void listagemPacienteMaioresDe60() throws ParseException{
		Paciente paciente ;
		int idade = 0 ;
		int qtd = 0 ;
		
		System.out.println();
		for(int i = 0; i< this.paciente.size(); i++){
			paciente = this.paciente.get(i);
			idade = paciente.idadeDoPaciente();
			if(idade > 60){
				System.out.println(paciente.nomeFormatado() + " - " + paciente.idadeDoPaciente());
			}
		}
	}
}
