package lab04;

import static org.junit.Assert.*;

import org.junit.Test;

public class CenarioTest {

	@Test
	public void ConstutortestException() {
		try{
			Cenario cenario = new Cenario(-1 , "blabla");
			fail("esperava e excecao de descricao menor ou igual a zero");
		}catch(Exception e){
			assertEquals("mensagem errada", "numeracao nao pode ser um valor menor ou igual a zero", e.getMessage());
		}
		try{
			Cenario c = new Cenario(10, null);
			fail("esperava a excecao de descricao nula");
					
		}catch(Exception e){
			assertEquals("mensagem errada", "descricao nao pode ser nulo ou vazia", e.getMessage());
		}
		try {
			Cenario a = new Cenario(10, "");
			fail("esperava a excecao de descricao vazia");
		}catch(Exception e){
			assertEquals("mensagem errada", "descricao nao pode ser nulo ou vazia", e.getMessage());
		}
		
	}
	
	@Test
	public void CadastraApostaTest() throws Exception{
		Aposta a = new Aposta("iago", 10, "Vai acontecer");
		Cenario c = new Cenario(1, "blabla");
		assertTrue("aposta cadastrada", c.cadastrasAposta(a));
	}
	
	@Test
	public void TotalDeApostasTest() throws Exception{
		Aposta a = new Aposta("iagoo", 10, "Vai acontecer");
		Aposta c = new Aposta("iago", 10, "Vai acontecer");
		Aposta b = new Aposta("iagooo", 100, "Vai acontecer");
		Cenario ce = new Cenario(1, "blabla");
		ce.cadastrasAposta(a);
		ce.cadastrasAposta(b);
		ce.cadastrasAposta(c);
		assertEquals("valor total errado", 120, ce.totalDeApostas());
		
	}
	
	@Test
	public void ExibeApostasTest() throws Exception{
		Aposta a = new Aposta("iagoo", 10, "Vai acontecer");
		Aposta c = new Aposta("iago", 10, "Vai acontecer");
		Aposta b = new Aposta("iagooo", 100, "Vai acontecer");
		Cenario ce = new Cenario(1, "blabla");
		ce.cadastrasAposta(a);
		ce.cadastrasAposta(b);
		ce.cadastrasAposta(c);
		assertEquals("exibicao errada", "iagoo - 10 - Vai acontecer" + System.lineSeparator()+ "iagooo - 100 - Vai acontecer" + System.lineSeparator() + "iago - 10 - Vai acontecer" + System.lineSeparator(), ce.exibeApostas());
	}

}
