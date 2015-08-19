public class Assistente extends Funcionario {
	long matricula;
	public Assistente(String n,long m,float s) {
		// TODO Auto-generated constructor stub
		super(n,s);
		matricula = m;
	}
	void exibeDados(){
		System.out.println("O funcionario de nome "+nome+" matrinula nº "+matricula+" recebe salario de R$"+salario);
	}

}
