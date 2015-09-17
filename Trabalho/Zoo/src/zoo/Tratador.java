import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Tratador extends Funcionario {
	ArrayList<Setores> setores;
	
	public Tratador(String nome,String cpf, String email,
			double salario, int carga_horaria, long telefone) {
		super(nome, cpf, email, salario, carga_horaria, telefone);
		// TODO Auto-generated constructor stub
	}


	public int Recebe_salario() {
		// TODO Auto-generated method stub
		return 0;
	}

}
