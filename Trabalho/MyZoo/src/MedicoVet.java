import java.sql.Time;
import java.util.Date;

public class MedicoVet extends Funcionario implements Edit_Animals {

	public MedicoVet(String nome, String cpf, String email, double salario, int carga_horaria, long telefone) {
		super(nome, cpf, email, salario, carga_horaria, telefone);
		// TODO Auto-generated constructor stub
	}

	public int Recebe_salario() {
		// TODO Auto-generated method stub
		return 8000;
	}

	public static int add_animal(Animal bixinho) {//Lembrar de adaptar na classe zoo 
		if(bixinho instanceof Mamifero)		setorM.add(bixinho);
		if(bixinho instanceof Ave)			setorAv.add(bixinho);
		if(bixinho instanceof Reptil)		setorR.add(bixinho);
		if(bixinho instanceof Anfibio)		setorAn.add(bixinho);
		if(bixinho instanceof Invertebrado)	setorI.add(bixinho);
	}
}