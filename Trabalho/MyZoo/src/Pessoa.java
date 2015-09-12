import java.util.Date;
public abstract class Pessoa {
	//Atributos
	String nome;
	long cpf;
	String email;
	Date nascimento;
	//Construtor
	public Pessoa(String nome, long cpf, String email, Date nascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.nascimento = nascimento;
	}
	
	
}
