package lab03;

public class Aluno {
	private String nome;
	private String matricula;
	private String curso;
	
	
	public Aluno(String nome, String matricula, String curso)throws Exception{
		if(nome == null || nome.trim().equalsIgnoreCase("")){
			throw new Exception("nome nao pode ser nulo ou vazio");
		}
		if(matricula == null || matricula.trim().equalsIgnoreCase("")){
			throw new Exception("matricula nao pode ser nulo ou vazio");
		}
		if(curso == null || curso.trim().equalsIgnoreCase("")){
			throw new Exception("curso nao pode ser nulo ou vazio");
		}
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}


	public String getNome() {
		return nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public String getCurso() {
		return curso;
	}


	@Override
	public String toString() {
		return "aluno: "+ matricula + "-" + nome + "-" + curso ;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
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
		Aluno other = (Aluno) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}
	
	
	

}
