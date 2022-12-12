package pets;

public class Vacina {

	 private String nome;
	 private String dataVacinacao;
	 private String laboratorio;
	 private boolean revacina;
	 
	 
	// gets e sets de nome.
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// gets e sets de data de nascimento.
	public String getDataVacinacao() {
		return dataVacinacao;
	}
	public void setDataVacinacao(String dataVacinacao) {
		this.dataVacinacao = dataVacinacao;
	}
	
	// gets e sets de laboratório.
	public String getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	
	// gets e sets de revacina.
	public boolean isRevacina() {
		return revacina;
	}
	public void setRevacina(boolean revacina) {
		this.revacina = revacina;
	}
	 
}
