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
	//Cada funcionário tem: nome, cpf, data de nascimento, email, telefone, cargo ou função, salário bruto,
	//salário líquido, banco, conta corrente e agência bancaria, dia e horário de trabalho.
	
	public Funcionario(String nome,long cpf, String email, Date nascimento,
			double salario, int carga_horaria, long telefone, Time horaDeChegar,
			Time horaDeSair) {
		super(nome, cpf, email, nascimento);
		this.salario = salario;
		this.carga_horaria = carga_horaria;
		this.telefone = telefone;
		this.horaDeChegar = horaDeChegar;
		this.horaDeSair = horaDeSair;
	}


	//Metodos
	public abstract int Recebe_salario();
}
