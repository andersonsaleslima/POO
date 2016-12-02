/**
 * Classe Paceinte
 * 
 * @author Anderson Sales Lima
 * @version 1.0
 */
package atividade3;

import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Paciente {
	
	private String documento = new String();
	private String nome = new String();
	private String sexo = new String();
	private Endereço endereço = new Endereço();
	private String dataDeNascimento = new String();
	

	public Paciente() {
		super();
	}

	/**
	 * @param documento
	 */
	public Paciente(String documento , String nome, String sexo, Endereço endereço, String dataDeNascimento) {
		super();
		this.documento = documento;
		this.nome = nome;
		this.endereço = endereço;
		this.sexo = sexo;
		this.dataDeNascimento = dataDeNascimento;
	}
	
	

	/**
	 * @return the documento
	 */
	public String getDocumento() {
		return documento;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}


	/**
	 * @return the end
	 */
	public Endereço getEndereço() {
		return this.endereço;
	}
	
	

	/**
	 * @return the dataDeNascimento
	 */
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Paciente [documento=" + documento + ", nome=" + nome + ", sexo=" + sexo + ", endereço=" + endereço
				+ ", dataDeNascimento=" + dataDeNascimento + "]";
	}
	

	/*ou public char[] NomeFormatado() - para caso de uso do char*/
	public String nomeFormatado(){
				
		String[] nomesplit = this.nome.split(" ");
		//char[] nomef = new char[100]; 
		String nomef = new String();
		
		int tamanho, tam;
		int i=0, j=0; /*contadores*/
		
		tamanho = nomesplit.length;
		
		nomef = nomesplit[tamanho-1] + ", ";
		if(tamanho>1){		
			for(i=0;i<tamanho-1;i++){
				nomef = nomef + nomesplit[i].charAt(0) + ". ";
			}
		}
		return nomef;
		
		/*for(char aux: nomesplit[tamanho-1].toCharArray())
		{
			nomef[i] = aux;
			i++;
		}
		nomef[i] = ',';
		i++;
		nomef[i+1] = ' ';
		i++;
		
		for(j=0; j<tamanho-1; j++){
			nomef[i] = nomesplit[j].charAt(0);
			i++;
			nomef[i]='.';
			i++;
			nomef[i]=' ';
		}
		return (nomef);*/
		
	}
	
	public int idadeDoPaciente()throws ParseException{
		
		int k, idade;
		Date dataAtual = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		k = (int)( ( (dataAtual.getTime()) - (sdf.parse(this.dataDeNascimento).getTime()) ) / 86400000L );
		idade = k / 365;

		return idade;
	}
}