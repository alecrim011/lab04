package lab03;

import java.util.HashSet;
import java.util.Set;

public class AlunoController {
	private Set<Aluno> alunos;
	private Set<Grupo> grupos;
	
	public AlunoController(){
		alunos = new HashSet<>();
	}
	
	public String cadastraAluno(String nome, String matricula, String curso) throws Exception{
		Aluno aluno =  new Aluno(nome, matricula, curso);
		alunos.add(aluno);
		return "CADASTRO REALIZADO";
	}
	
	public Grupo buscaGrupo(String nome){
		for (Grupo grupo : grupos) {
			if(grupo.getNome().equalsIgnoreCase(nome)){
				return grupo;
			}
		}
		
		return null;
	}
	
	public Aluno buscaAluno(String matricula){
		for (Aluno aluno : alunos) {
			if (aluno.getMatricula().equals(matricula)){
				return aluno;
			}
			
		}
		return null;
	}
	
	public String consultaAluno(String matricula)throws Exception{
		Aluno aluno = buscaAluno(matricula);
		if(aluno == null){
			throw new Exception("Aluno não cadastrado.");
		}
		
		return aluno.toString();
	}
	
	public String cadastraGrupo(String nome){
		Grupo grupo =  new Grupo(nome);
		grupos.add(grupo);
		return "CADASTRO REALIZADO";
	}
	
	public String alocaAlunoGrupo(String matricula, String nome)throws Exception{
		Aluno aluno = buscaAluno(matricula);
		Grupo grupo = buscaGrupo(nome);
		if(aluno == null){
			throw new Exception("aluno nao cadastrado");
		}
		if(grupo == null){
			throw new Exception("grupo nao cadastrado");
		}
		grupo.
		
	}
	
	
	
	
	
	
	
	

}
