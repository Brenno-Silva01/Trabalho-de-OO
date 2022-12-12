package pets;

public class Teste {

	public static void main(String[] args) {
		
		DonoAnimal dono = new DonoAnimal();
		Pet pet = new Pet();
		Vacina vacina = new Vacina();
		
		dono.setNome("Dono teste");
		dono.setCpf("05956981300");
		dono.setEmail("donoteste@gmail.com");
		dono.setTelefone("619123456");
		
		pet.setNome("Caramelo");
		pet.setDataNascimento("23 de agosto de 2018");
		pet.setCastrado(false);
		pet.setPelagem("Curta");
		pet.setTemperamento("Calmo");
		pet.setAdotado(true);
		//atributos herdados de Animal.
		pet.setEspecie("Canina");
		pet.setRaca("Vira-lata");
		pet.setSexo("Macho");
		
		vacina.setNome("Antirrabica");
		vacina.setDataVacinacao("23 de novembro de 2022");
		vacina.setLaboratorio("Desconhecido");
		vacina.setRevacina(false);
		
		
		
		System.out.println("Nome: " + dono.getNome());
		System.out.println("Cpf: " + dono.getCpf());
		System.out.println("Email: " + dono.getEmail());
		System.out.println("Telefone: " + dono.getTelefone());
		System.out.println("");
		System.out.println("Nome: " + pet.getNome());
		System.out.println("Data de Nascimento: " + pet.getDataNascimento());
		System.out.println("Catrado: " + pet.isCastrado());
		System.out.println("Pelagem: " + pet.getPelagem());
		System.out.println("Adotado: " +pet.isAdotado());
		System.out.println("Especie: " + pet.getEspecie());
		System.out.println("Raca: " + pet.getRaca());
		System.out.println("Sexo: " + pet.getSexo());
		System.out.println("");
		System.out.println("Nome: " + vacina.getNome());
		System.out.println("Data de Vacinacao: " + vacina.getDataVacinacao());
		System.out.println("Laboratorio: " + vacina.getLaboratorio());
		System.out.println("Revacinar: " + vacina.isRevacina());
		
	}

}
