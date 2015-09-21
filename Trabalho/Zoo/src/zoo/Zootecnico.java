package zoo;
import java.sql.Time;
import java.util.Date;

public class Zootecnico extends Funcionario {
	//Construtor
	public Zootecnico(String nome, String cpf, String email,
			double salario, int carga_horaria, String telefone,String login) {
		super(nome, cpf, email, salario, carga_horaria, telefone,login);
		// TODO Auto-generated constructor stub
	}

	//Metodos
	public int Alimentar()
	{
		return 10;
	}
}

