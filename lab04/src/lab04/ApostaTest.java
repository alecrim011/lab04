package lab04;

import static org.junit.Assert.*;

import org.junit.Test;

public class ApostaTest {

	@Test
	public void ContrutortestException() throws Exception {
		try {
			Aposta aposta = new Aposta(null,10, "Vai acontecer");
			fail("esperava a  excecao de nome nulo");
		}catch(Exception e){
			assertEquals("mensagem errada", "nome do apostador nao pode ser nulo ou vazio", e.getMessage());
		}
		
		try {
			Aposta a = new Aposta("", 10, "Vai acontecer");
			fail("esperava excecao de nome vazio");
		}catch(Exception e){
			assertEquals("mensagem errada", "nome do apostador nao pode ser nulo ou vazio", e.getMessage());
		}
		try {
			Aposta b = new Aposta("iago", 0, "Vai acontecer");
			fail("esperava excecao de valor da posta menor que zero");
		}catch(Exception e){
			assertEquals("mensagem errada", "valor da aposta nao pode ser um valor menor ou igual a zero", e.getMessage());
		}
		
		try {
			Aposta c = new Aposta("iaago", 20,  "");
			fail("esperava a excecao de previsao nula ou vazia");
		}catch(Exception e){
			assertEquals("mensagem errada", "previsao nao pode ser nulo ou vazia", e.getMessage());
		}
		try{
			Aposta d = new Aposta("iiaggo", 40, "ira acontecer");
			fail("esperva excecao de previsao invalida");
		}catch(Exception e){
			assertEquals("mensagem errada", "previsao invalida", e.getMessage());
		}
		
				
	}
	@Test
	public void ConstrutorTest() throws Exception{
		Aposta aposta = new Aposta("iago", 50, "vai acontecer");
		assertEquals("nome do apostador errado", "iago", aposta.getApostador());
		assertEquals("valor da aposta errada", 50, aposta.getValor());
		assertEquals("previsao errada", "vai acontecer" , aposta.getPrevisao());
	}

}
