package zoo;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Tratador extends Funcionario {
	
	public Tratador(String nome,String cpf, String email,
			double salario, int carga_horaria, String telefone,String login) {
		super(nome, cpf, email, salario, carga_horaria, telefone,login);
		setores = new ArrayList<String>();
	}

        public Tratador(Funcionario fn) {
		super(fn.nome, fn.cpf, fn.email, fn.salario, fn.carga_horaria, fn.telefone,fn.login);
		setores = new ArrayList<String>();
	}
        
	public int Alimentar() {
		// TODO Auto-generated method stub
		return 2;
	}        
}
