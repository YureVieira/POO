import java.sql.Time;
import java.util.Date;


public class Zootecnico extends Funcionario {
	//Construtor
	public Zootecnico(String nome,String sobrenome, int cpf, String email, Date nascimento,
			double salario, int carga_horaria, long telefone, Time horaDeChegar,
			Time horaDeSair) {
		super(nome,sobrenome, cpf, email, nascimento, salario, carga_horaria, telefone,
				horaDeChegar, horaDeSair);
		// TODO Auto-generated constructor stub
	}

	//Metodos
	public int Recebe_salario()
	{
		return 3000;
	}
}

