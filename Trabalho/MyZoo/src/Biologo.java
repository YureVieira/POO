import java.sql.Time;
import java.util.Date;

public class Biologo extends Funcionario implements Edit_Animals{
	// Construtor
	public Biologo(String nome, String cpf, String email, double salario, int carga_horaria, long telefone) {
		super(nome, cpf, email, salario, carga_horaria, telefone);
		// TODO Auto-generated constructor stub
	}

	// Metodos
	public int Recebe_salario() {
		return 6000;
	}
}
