package pets;

import java.util.List;

public class DonoAnimal {
	
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private List<Pet> pets;
	
	
	
	// gets e sets de nome.
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// gets e sets de cpf.
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	// gets e sets de email.
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// gets e sets de telefone.
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	// gets e sets da lista de pets;
	public List<Pet> getPets() {
		return pets;
	}
	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
	
	


}
