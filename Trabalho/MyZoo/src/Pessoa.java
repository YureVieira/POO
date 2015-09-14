import java.util.Date;
public abstract class Pessoa {
	//Atributos
	String nome;
	String cpf;
	String email;
	Date nascimento;
	String login;
	//Construtor
	public Pessoa(String nome, String cpf, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	
	
}
