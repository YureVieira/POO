import java.sql.Time;
import java.util.Date;

public abstract class Funcionario extends Pessoa{
	//Atributos
	double salario;
	int carga_horaria;
	long telefone;
	Time horaDeChegar;
	Time horaDeSair;

	//Construtor
	public Funcionario(String nome,String sobrenome, int cpf, String email, Date nascimento,
			double salario, int carga_horaria, long telefone, Time horaDeChegar,
			Time horaDeSair) {
		super(nome,sobrenome, cpf, email, nascimento);
		this.salario = salario;
		this.carga_horaria = carga_horaria;
		this.telefone = telefone;
		this.horaDeChegar = horaDeChegar;
		this.horaDeSair = horaDeSair;
	}


	//Metodos
	public abstract int Recebe_salario();
}
