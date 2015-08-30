import java.util.Date;
public abstract class Pessoa {
	//Atributos
	String nome;
	String sobrenome;
	int cpf;
	String email;
	Date nascimento;
	//Construtor
	public Pessoa(String nome,String sobrenome, int cpf, String email, Date nascimento) {
		super();
		this.sobrenome = sobrenome;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.nascimento = nascimento;
	}
	
	
}
