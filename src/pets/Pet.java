package pets;

import java.util.List;

public class Pet extends Animal{
	
	private String nome;
	private String dataNascimento;
	private String pelagem;
	private String temperamento;
	private boolean castrado;
	private boolean adotado;
	private List<Vacina>vacinas;
	private List<Banho>banhos;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	public String getPelagem() {
		return pelagem;
	}
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	
	
	public String getTemperamento() {
		return temperamento;
	}
	public void setTemperamento(String temperamento) {
		this.temperamento = temperamento;
	}
	
	
	public boolean isCastrado() {
		return castrado;
	}
	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	
	
	public boolean isAdotado() {
		return adotado;
	}
	public void setAdotado(boolean adotado) {
		this.adotado = adotado;
	}
	
	
	public List<Vacina> getVacinas() {
		return vacinas;
	}
	public void setVacinas(List<Vacina> vacinas) {
		this.vacinas = vacinas;
	}
	
	
	public List<Banho> getBanhos() {
		return banhos;
	}
	public void setBanhos(List<Banho> banhos) {
		this.banhos = banhos;
	}
}
