/**
 * 	Classe que representa uma Calculadora. Possui um �nico atributo
 * chamado valor, que inicia com ZERO na qual � manipulado pelas 
 * diversas oper��es. As opera��es s�o feitas com o atributo valor 
 * e pelos par�metros passados nos m�todos, o resultado das opera��es 
 * � passado para o atributo valor, que agora ir� conter o resultado 
 * da opera��o. Os m�todos incluem: 
 *  -soma: m�todo que executa soma entre o atributo valor e o passado 
 *  pelo par�metro.
 *  -subtrac�o: m�todo que � subtra� o atributo valor pelo valor passado 
 *  como par�metro.
 *  -multiplicacao: m�todo que multiplica o atributo valor pelo valor 
 *  passado par�metro como par�metro.
 *  -divisao: m�todo que divide o atributo valor pelo valor 
 *  passado par�metro como par�metro.
 *  
 *  Os m�todos equals e toString mant�m o padr�o do java.
 *  
 *  @author Anderson Sales Lima
 *  @version 1.0
 */

package atividade2;

import java.math.BigInteger;;

public class Calculadora {

	private BigInteger valor = new BigInteger("0");

	/*public Calculadora(BigInteger valor2) {
		super();
		this.valor = valor2;
	}*/
	
	public Calculadora() {
		super();
		this.valor=BigInteger.ZERO;
	}

	public void soma(BigInteger valor2){
		this.valor = this.valor.add(valor2);
	}

	public void subtracao(BigInteger valor2){
		this.valor = this.valor.subtract(valor2);
	}
	
	public void multiplicacao(BigInteger valor2){
		this.valor = this.valor.multiply(valor2);
	}
	
	public void divisao(BigInteger valor2){
		if(valor2.equals(0)){
			System.out.println("Erro na opera��o, divisao com 0.");
		}
		else{
			this.valor = this.valor.divide(valor2);
		}
	}
	
	public void potencia(int valor2){
		this.valor = this.valor.pow(valor2);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Calculadora [valor=" + valor + "]";
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
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
		if (!(obj instanceof Calculadora)) {
			return false;
		}
		Calculadora other = (Calculadora) obj;
		if (valor == null) {
			if (other.valor != null) {
				return false;
			}
		} else if (!valor.equals(other.valor)) {
			return false;
		}
		return true;
	}
	
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}*/
}
