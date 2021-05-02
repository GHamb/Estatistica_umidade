package EstUmidadeTdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class EstUmidadeTest {

	@Test
	public void MediaTest() {
		double[] array  = {15,7,8.5,6.5};
		EstatisticasUmidade eu = new EstatisticasUmidade(array);
		assertEquals(9.25,eu.media(),0.1);
	}
	@Test
	public void DpTest() {
		double[] array  = {15,7,8.5,6.5};
		EstatisticasUmidade eu = new EstatisticasUmidade(array);
		assertEquals(3.40,eu.desvioPadrao(),0.1);
	}

}
