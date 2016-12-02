/**
 * 	Coleção que gera consulta
 * 
 * @author Anderson Sales Lima
 * @version 1.0
 */
package atividade3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class ColeçaoConsulta {
	private List<Consulta> consulta;
	
	public ColeçaoConsulta(){
		this.consulta = new ArrayList<Consulta>();
	}
	
	public boolean adicionarConsulta(Paciente paciente , Medico medico, String data){
		if((paciente != null)&&(medico != null) &&(data != null)){
		
			this.consulta.add(new Consulta(paciente, medico, data));
			return true;
		}
		return false;
	}
	
	public void qtdConsultasPorData(String data){
		int i=0, qtdConsultas=0;
		
		for(i = 0; i< this.consulta.size(); i++){
			Consulta consulta  = this.consulta.get(i);
			if(consulta.getDataHora().split(" ")[0].equals(data)){
				qtdConsultas++;
			}
		}
		System.out.println("Quantidade de consultas para o dia: " + data + " = " + qtdConsultas);
	}
	
	public void listagemConsultas(){
		System.out.println();
		for(int i = 0; i< this.consulta.size(); i++){
			System.out.println(this.consulta.get(i));
		}
	}
	
	public void qtdConsultasPorMedico(Medico medico){
		int qtdConsultas=0;
		
		System.out.println();
		for(int i = 0; i< this.consulta.size(); i++){
			Consulta consulta  = this.consulta.get(i);
			if(consulta.getMedico().equals(medico)){
				qtdConsultas++;
			}
		}
		System.out.println("Quantidade de consultas para o medico " + medico.getNome() + ": " + qtdConsultas);
	}
	
	public void listaConsultasPorPaciente(Paciente paciente){
		System.out.println();
		for(int i = 0; i< this.consulta.size(); i++){
			Consulta consulta  = this.consulta.get(i);
			if(consulta.getPaciente().equals(paciente)){
				System.out.println(this.consulta.get(i));
			}
		}
	}
}
