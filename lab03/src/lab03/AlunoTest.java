package lab03;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlunoTest {

	@Test
	public void construtortest() throws Exception {
		Aluno a = new Aluno("iago" , "12345" , "computacao");
		assertEquals("nome errado", "iago", a.getNome());
		assertEquals("matricula errada", "12345", a.getMatricula());
		assertEquals("nome do curso errado", "computacao" , a.getCurso());
		
	}
	
	@Test
	public void contrutorTest2() throws Exception{
		
		try{
			Aluno a =  new Aluno("", "12345" , "computacao");
			fail("esperava excecao de nome vazio");
			
			
		} catch (Exception e){
			assertEquals("mensagem errada", "nome nao pode ser nulo ou vazio", e.getMessage());
		}
		
		try {
			Aluno b = new Aluno(null, "12345", "computacao");
			fail("esperava excecao de nome nulo");
		}catch (Exception e){
			assertEquals ("mensagem errada", "nome nao pode ser nulo ou vazio", e.getMessage());
		}
		
		try {
			Aluno c = new Aluno("iago", "", "computacao");
			fail("esperava excecao de matricula vazia");
		}catch (Exception e){
			assertEquals ("mensagem errada", "matricula nao pode ser nulo ou vazio", e.getMessage());
		}
		
		try{
			Aluno d = new Aluno("iago", null, "computacao");
			fail("esperava a excecao de matricula nula");
		}catch(Exception e){
			assertEquals("mensagem errada", "matricula nao pode ser nulo ou vazio", e.getMessage());
		}
		try {
			Aluno f = new Aluno("iago", "12345", "");
			fail("esperava excecao de curso vazio");
		}catch (Exception e){
			assertEquals ("mensagem errada", "curso nao pode ser nulo ou vazio", e.getMessage());
		}
		try {
			Aluno g = new Aluno("iago", "12345", null);
			fail("esperava excecao de curso nulo");
		}catch (Exception e){
			assertEquals ("mensagem errada", "curso nao pode ser nulo ou vazio", e.getMessage());
		}
		
		
		
	}
	
	
	

}
