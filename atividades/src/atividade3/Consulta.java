/**
 * Classe Consulta
 * 
 * @author Andrson Sales Lima
 * @version 1.0
 */
package atividade3;

import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.GregorianCalendar;

public class Consulta {

	private Paciente paciente;
	private Medico medico;
	private String dataHora;
	
	
	public Consulta() {
		super();
	}
	
	/**
	 * @param paciente
	 * @param medico
	 */
	public Consulta(Paciente paciente, Medico medico, String dataHora) {
		super();
		this.paciente = paciente;
		this.medico = medico;
		this.dataHora = dataHora;
		
	}


	/**
	 * @return the paciente
	 */
	public Paciente getPaciente(){
		return paciente;
	}

	/**
	 * @return the medico
	 */
	public Medico getMedico() {
		return medico;
	}

	/**
	 * @return the dataHora
	 */
	public String getDataHora() {
		return dataHora;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataHora == null) ? 0 : dataHora.hashCode());
		result = prime * result + ((medico == null) ? 0 : medico.hashCode());
		result = prime * result + ((paciente == null) ? 0 : paciente.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Consulta)) {
			return false;
		}
		Consulta other = (Consulta) obj;
		if (dataHora == null) {
			if (other.dataHora != null) {
				return false;
			}
		} else if (!dataHora.equals(other.dataHora)) {
			return false;
		}
		if (medico == null) {
			if (other.medico != null) {
				return false;
			}
		} else if (!medico.equals(other.medico)) {
			return false;
		}
		if (paciente == null) {
			if (other.paciente != null) {
				return false;
			}
		} else if (!paciente.equals(other.paciente)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return "Consulta [paciente=" + this.paciente.getNome() + ", medico=" + this.medico.getNome() + ", dataHora=" + this.dataHora + "]";
	}
	
}