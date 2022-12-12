package pets;

public abstract class Animal {
	
	private String especie;
	private String raca;
	private String sexo;
	
	// gets e sets de espécie;
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	// gets e sets de raça;
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	// gets e sets de sexo;
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	

}
