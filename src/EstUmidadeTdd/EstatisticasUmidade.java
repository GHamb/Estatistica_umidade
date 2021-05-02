package EstUmidadeTdd;

/**
 * 
 * @author Gustavo, Alan
 * @since 02/05/2021
 *
 */
public class EstatisticasUmidade {
	
	double valor_sensores [];
	
	/**
	 * 
	 * @param sensores
	 */
	public EstatisticasUmidade(double sensores[]) {
		this.valor_sensores = sensores;
	}
	/**
	 * 
	 * @return double
	 */
	public double media() {
		double soma = 0;
		for(int i=0; i< this.valor_sensores.length;i++) {
			soma += this.valor_sensores[i];
		}
		return soma/this.valor_sensores.length;
		
	}
	
	
	/**
	 * 
	 * @return double
	 */
	public double desvioPadrao() {
		double media = this.media();
		double soma = 0;
		for(int i=0; i< this.valor_sensores.length;i++) {
			soma += Math.pow((this.valor_sensores[i]-media),2);
		}
		return Math.sqrt((soma/this.valor_sensores.length));
	}
	
}
