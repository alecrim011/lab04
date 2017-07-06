package lab04;

import java.util.ArrayList;

public class Controller {
	
private ArrayList<Cenario> cenarios;
	
	public Controller(){
		cenarios = new ArrayList<>();
	}
	
	public int cadastrasCenario(String descricao) throws Exception{
		int numeracao = cenarios.size() + 1;
		Cenario cenario = new Cenario(numeracao, descricao);
		cenarios.add(cenario);
		return numeracao;
		
	}
	
	public Cenario buscaCenario(int numeracao){
		for (Cenario cenario : cenarios) {
			if(cenario.getNumeracao() == numeracao){
				return cenario;
			}
			
		}
		return null;
	}
	
	public String exibirCenario(int numeracao){
		Cenario cenario = buscaCenario(numeracao);
		return cenario.toString();
	}
	
	public String exibirCenarios(){
		String listaCenarios = "";
		for (Cenario cenario : cenarios) {
			listaCenarios += cenario.toString() + System.lineSeparator();
			
		}
		
		return listaCenarios;
	}
	
	public void cadastraAposta(int numeracao, String apostador, int valor, String previsao) throws Exception{
		Aposta aposta = new Aposta(apostador, valor, previsao);
		Cenario cenario = buscaCenario(numeracao);
		cenario.cadastrasAposta(aposta);
		
	}
	
	public int valorTotalDeApostas(int numeracao){
		Cenario cenario = buscaCenario(numeracao);
		return cenario.totalDeApostas();
	}
	
	public String exibeApostas(int numeracao){
		Cenario cenario = buscaCenario(numeracao);
		return cenario.exibeApostas();
	}
	
	
	
	
	

}
