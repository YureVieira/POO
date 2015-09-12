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
	//Cada funcion�rio tem: nome, cpf, data de nascimento, email, telefone, cargo ou fun��o, sal�rio bruto,
	//sal�rio l�quido, banco, conta corrente e ag�ncia bancaria, dia e hor�rio de trabalho.
	
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
