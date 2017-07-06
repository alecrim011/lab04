package lab04;

public class Aposta {
	private String apostador;
	private int valor;
	private String previsao;
	
	public Aposta(String apostador, int valor, String previsao)throws Exception{
		if(apostador == null || apostador.trim().equalsIgnoreCase("")){
			throw new Exception("nome do apostador nao pode ser nulo ou vazio");
		}
		if(previsao == null || previsao.trim().equalsIgnoreCase("")){
			throw new Exception("previsao nao pode ser nulo ou vazia");
		}
		if(! previsao.equals("Vai acontecer") && ! previsao.equals("Não vai acontecer")) {
			throw new Exception("previsao invalida");
			
		}
		if(valor <= 0){
			throw new Exception("valor da aposta nao pode ser um valor menor ou igual a zero");
		}
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
