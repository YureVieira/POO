import java.sql.Time;
import java.util.Date;

public class Funcionario extends Pessoa{
	//Atributos
	double salario;
	int carga_horaria;
	long telefone;
	Time horaDeChegar;
	Time horaDeSair;

	//Construtor
	//Cada funcion�rio tem: nome, cpf, data de nascimento, email, telefone, cargo ou fun��o, sal�rio bruto,
	//sal�rio l�quido, banco, conta corrente e ag�ncia bancaria, dia e hor�rio de trabalho.
	
	public Funcionario(String nome,String cpf, String email,
			double salario, int carga_horaria, long telefone) {
		super(nome, cpf, email);
		this.salario = salario;
		this.carga_horaria = carga_horaria;
		this.telefone = telefone;
	}
        public Funcionario(){
            super("","","");
        }

	//Metodos
}
