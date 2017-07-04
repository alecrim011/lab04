package lab04;

import java.util.ArrayList;

public class Cenario {
	private int numeracao;
	private String descricao;
	private String estado;
	private ArrayList<Aposta> apostas;
	
	public Cenario(int numeracao, String descricao){
		this.descricao = descricao;
		this.numeracao = numeracao;
		this.estado = "não finalizado";
		apostas = new ArrayList<>();
	
	}
	
	public void cadastrasAposta(Aposta aposta){
		apostas.add(aposta);
	}
	
	public int totalDeApostas(){
		int total = 0;
		for (Aposta aposta : apostas) {
			total += aposta.getValor();
		}
		return total;
	}
	
	public String exibeApostas(){
		String listaApostas = "";
		for (Aposta aposta : apostas) {
			listaApostas += aposta.toString() + System.lineSeparator();
		}
		return listaApostas;
		
	}

	public int getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(int numeracao) {
		this.numeracao = numeracao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cenario [numeracao=" + numeracao + ", descricao=" + descricao + ", estado=" + estado + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeracao;
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
		Cenario other = (Cenario) obj;
		if (numeracao != other.numeracao)
			return false;
		return true;
	}
	
	

}
