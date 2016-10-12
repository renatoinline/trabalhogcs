package trabalhogcs.teste;
import static org.junit.Assert.*;
import org.junit.*;

import trabalhogcs.Matematica;

public class MatematicaTest {

	// Arrange
	Matematica mat = new Matematica();
	
	@Test
	public void testSomatorio() {
		
		// Arrange
		int[] arrValores = new int[5];
		arrValores[0] = 1;
		arrValores[1] = 2;
		arrValores[2] = 3;
		arrValores[3] = 4;
		arrValores[4] = 5;
		
		int somatorioEsperado1 = 15;
		int somatorioEsperado2 = 21;
		int somatorioEsperado3 = 0;
		int somatorioEsperado4 = -21;
		
		// Act
		int somatorioResultado1 = mat.somatorio(arrValores);
		int somatorioResultado2 = mat.somatorio(1,2,3,4,5,6);
		int somatorioResultado3 = mat.somatorio(0);
		int somatorioResultado4 = mat.somatorio(-1,-2,-3,-4,-5,-6);
		
		// Assert
		assertEquals("O somatório dos números: 1,2,3,4,5 deve ser 15.",
				somatorioEsperado1, somatorioResultado1);
		assertEquals("O somatório dos números: 1,2,3,4,5,6 deve ser 21.",
				somatorioEsperado2, somatorioResultado2);
		assertEquals("O somatório de 0 deve ser 0.",
				somatorioEsperado3, somatorioResultado3);
		assertEquals("O somatório de -1,-2,-3,-4,-5,-6 deve ser -21.",
				somatorioEsperado4, somatorioResultado4);
	}

}
