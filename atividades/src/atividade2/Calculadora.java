/**
 * 	Classe que representa uma Calculadora. Possui um único atributo
 * chamado valor, que inicia com ZERO na qual é manipulado pelas 
 * diversas operções. As operações são feitas com o atributo valor 
 * e pelos parâmetros passados nos métodos, o resultado das operações 
 * é passado para o atributo valor, que agora irá conter o resultado 
 * da operação. Os métodos incluem: 
 *  -soma: método que executa soma entre o atributo valor e o passado 
 *  pelo parâmetro.
 *  -subtracão: método que é subtraí o atributo valor pelo valor passado 
 *  como parâmetro.
 *  -multiplicacao: método que multiplica o atributo valor pelo valor 
 *  passado parâmetro como parâmetro.
 *  -divisao: método que divide o atributo valor pelo valor 
 *  passado parâmetro como parâmetro.
 *  
 *  Os métodos equals e toString mantém o padrão do java.
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
			System.out.println("Erro na operação, divisao com 0.");
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
