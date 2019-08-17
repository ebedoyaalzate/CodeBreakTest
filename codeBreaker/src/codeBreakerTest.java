import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class codeBreakerTest {
	
	codeBreaker codeBreaker;
	
	@Test
	void adivinarTodosPasan() {
		codeBreaker = new codeBreaker("1234");
		String respuesta = codeBreaker.adivinar("1234");
		assertEquals("XXXX", respuesta);
	}
	
	@Test
	void adivinarPrimeroBueno() {
		codeBreaker = new codeBreaker("1234");
		String respuesta = codeBreaker.adivinar("1000");
		assertEquals("X", respuesta);
	}
	
	@Test
	void adivinarDosPrimerosBuenos() {
		codeBreaker = new codeBreaker("1234");
		String respuesta = codeBreaker.adivinar("1200");
		assertEquals("XX", respuesta);
	}
	
	@Test
	void adivinarTresPrimerosBuenos() {
		codeBreaker = new codeBreaker("1234");
		String respuesta = codeBreaker.adivinar("1230");
		assertEquals("XXX", respuesta);
	}
	
	@Test
	void adivinarCuatroBuenos() {
		 codeBreaker = new codeBreaker("1234");
		String respuesta = codeBreaker.adivinar("1234");
		assertEquals("XXXX", respuesta);
	}
	
	@Test
	void adivinarUnaCoincidenciaEnDiferentePosicion() {
		 codeBreaker = new codeBreaker("1234");
		String respuesta = codeBreaker.adivinar("0100");
		assertEquals("_", respuesta);
	}
	
	@Test
	void adivinarDosCoincidenciasEnDiferentePosicion() {
		codeBreaker = new codeBreaker("1234");
		String respuesta = codeBreaker.adivinar("0120");
		assertEquals("__", respuesta);
	}
	
	@Test
	void adivinarTresCoincidenciasEnDiferentePosicion() {
		codeBreaker = new codeBreaker("1234");
		String respuesta = codeBreaker.adivinar("0123");
		assertEquals("___", respuesta);
	}
	
	@Test
	void adivinarCuatroCoincidenciasEnDiferentePosicion() {
		codeBreaker = new codeBreaker("1234");
		String respuesta = codeBreaker.adivinar("4123");
		assertEquals("____", respuesta);
	}
	
	@Test
	void adivinarUnoCoincideOtroEnDiferentePosicion() {
		codeBreaker = new codeBreaker("1234");
		String respuesta = codeBreaker.adivinar("1478");
		assertEquals("X_", respuesta);
	}
	
	@Test
	void adivinarDosCoincidenOtroEnDiferentePosicion() {
		codeBreaker = new codeBreaker("1234");
		String respuesta = codeBreaker.adivinar("1245");
		assertEquals("XX_", respuesta);
	}
	
	@Test
	void adivinarErrorTamano() {
		codeBreaker = new codeBreaker("1234");
		String respuesta = codeBreaker.adivinar("12345");		
		assertEquals("Error de entrada", respuesta);
	}
	
	@Test
	void adivinarErrorTipoDato() {
		codeBreaker = new codeBreaker("1234");
		String respuesta = codeBreaker.adivinar("123A");		
		assertEquals("Error de entrada", respuesta);
	}
}
