/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author Micro
 */
public class Funcionario extends Pessoa{
	//Atributos
	double salario;
	int carga_horaria;
	long telefone;
        String login;
//	Time horaDeChegar;
//	Time horaDeSair;

	//Construtor
	//Cada funcion�rio tem: nome, cpf, data de nascimento, email, telefone, cargo ou fun��o, sal�rio bruto,
	//sal�rio l�quido, banco, conta corrente e ag�ncia bancaria, dia e hor�rio de trabalho.
	
	public Funcionario(String nome,String cpf, String email,
			double salario, int carga_horaria, long telefone,String login) {
		super(nome, cpf, email);
		this.salario = salario;
		this.carga_horaria = carga_horaria;
		this.telefone = telefone;
                this.login = login;
	}
        public Funcionario(){
            super("","","");
        }
        

	//Metodos

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
