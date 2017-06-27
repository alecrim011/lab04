package lab03;

import static org.junit.Assert.*;

import org.junit.Test;

public class GrupoTest {

	@Test
	public void contrutortest() throws Exception {
		Grupo estudos = new Grupo("grupo1");
		assertEquals("nome errado", "grupo1", estudos.getNome());
		try{
			Grupo e = new Grupo("");
			fail("esperava excecao de nome vazio");
			
		}catch(Exception e){
			assertEquals("mensagem errada", "nome nao pode ser nulo ou vazio", e.getMessage());
		}
		
		try{
			Grupo b = new Grupo(null);
			fail("esperava excecao de nome nulo");
		}catch(Exception e){
			assertEquals("mensagem errada", "nome nao pode ser nulo ou vazio", e.getMessage());
		}
		
	
		
	}

}
