package lab04;

public class Aposta {
	private String apostador;
	private int valor;
	private String previsao;
	
	public Aposta(String apostador, int valor, String previsao){
		this.apostador =  apostador;
		this.valor = valor;
		this.previsao =  previsao;
	}

	public String getApostador() {
		return apostador;
	}

	public void setApostador(String apostador) {
		this.apostador = apostador;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getPrevisao() {
		return previsao;
	}

	public void setPrevisao(String previsao) {
		this.previsao = previsao;
	}

	@Override
	public String toString() {
		return apostador +" - " + valor + " - " + previsao;
	}
	
	

}
