import java.util.Date;

public class Visitante extends Pessoa {
/*	static int lazer = 0;
	static int pesquisa = 1;
	static int projetoDePreservacao = 2;
	static int educacaoAmbiental = 3;*/
	int objetivo;
	public Visitante(String nome, long cpf, String email, Date nascimento) {
		super(nome, cpf, email, nascimento);
		// TODO Auto-generated constructor stub
	}
	
	//Metodos
	public void setObjetivo(int x)
	{
		objetivo = x;
	}
	public int getObjetivo()
	{
		return objetivo;
	}

}

