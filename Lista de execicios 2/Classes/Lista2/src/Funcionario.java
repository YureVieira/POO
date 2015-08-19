
public class Funcionario {
	String nome;
	float salario;
	public Funcionario(String n,float s) {
		// TODO Auto-generated constructor stub
		nome=n;
		salario = s;
	}
	void exibeDados(){
		System.out.println("O funcionario de nome "+nome+" recebe salario de R$"+salario);
	}
	void setSalario(float s){
		salario = s;
	}

}
