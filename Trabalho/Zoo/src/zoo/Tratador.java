package zoo;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Tratador extends Funcionario {
	ArrayList<Setores> setores;
	
	public Tratador(String nome,String cpf, String email,
			double salario, int carga_horaria, String telefone,String login) {
		super(nome, cpf, email, salario, carga_horaria, telefone,login);
		// TODO Auto-generated constructor stub
	}


	public int Alimentar() {
		// TODO Auto-generated method stub
		return 2;
	}

}
