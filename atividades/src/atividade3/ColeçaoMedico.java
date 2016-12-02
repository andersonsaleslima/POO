/**
 * Coleção que gera Medico
 * 
 * @author Anderson Sales Lima
 * @version 1.0
 */

package atividade3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class ColeçaoMedico {
	private List<Medico> medico;

	public ColeçaoMedico(){
		this.medico = new ArrayList<Medico>();
	}
	
	public boolean adicionarMedico(String crm, String nome, String especialidade){
		if(crm != null){
			this.medico.add(new Medico(crm, nome, especialidade));
			return true;
		}
		return false;
	}
	
	public Medico pesquisaPeloCRM(String crm){
		int i;
		Medico medico;
		
		for( i = 0; i < this.medico.size(); i++){
			medico = this.medico.get(i);
			if(medico.getCrm().equals(crm)){
				//System.out.println(this.medico.get(i));
				return medico;
			}
		}
		return null;
	}
	
	public Medico pesquisaPorParteDoNome(String nome){
		int i;
		Medico medico;
		String[] nomeSplit;
		String[] nomeSplit2;
		
		for( i = 0; i <= this.medico.size(); i++){
			medico = this.medico.get(i);
			nomeSplit = medico.getNome().split(" ");
			nomeSplit2 = nome.split(" ");
			for(int j = 0; j < nomeSplit.length ; j++){
				for(int k = 0; k < nomeSplit2.length; k++){
					if(nomeSplit[j].equals(nomeSplit2[k])){
						System.out.println(medico.toString());
						return medico;
					}
				}
			}
		}
		return null;
	}
	
}
