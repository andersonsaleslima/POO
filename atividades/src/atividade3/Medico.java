/**
 * Classe Médico
 * 
 * @author Anderson Sales Lima
 * @version 1.0
 */
package atividade3;

public class Medico {

	private String crm;
	private String nome;
	private String especialidade;
	
	/**
	 * @param nome
	 * @param crm
	 * @param especialidade
	 */
	public Medico(String crm, String nome, String especialidade) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.especialidade = especialidade;
	}

	/**
	 * @return the crm
	 */
	public String getCrm() {
		return crm;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	

	/**
	 * @return the especialidade
	 */
	public String getEspecialidade() {
		return especialidade;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Medico [crm=" + crm + ", nome=" + nome + ", especialidade=" + especialidade + "]";
	}
	
}
