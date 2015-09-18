import java.sql.Time;
import java.util.Date;

public class Zootecnico extends Funcionario implements Edit_Animals{
	//Construtor
	public Zootecnico(String nome, String cpf, String email,
			double salario, int carga_horaria, long telefone) {
		super(nome, cpf, email, salario, carga_horaria, telefone);
		// TODO Auto-generated constructor stub
	}

	//Metodos
	public int Recebe_salario()
	{
		return 3000;
	}
}

