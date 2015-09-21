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
public class Veterinario extends Funcionario{
    public Veterinario(String nome,String cpf, String email,
			double salario, int carga_horaria, String telefone,String login) {
		super(nome,cpf, email, salario, carga_horaria, telefone,login);
		// TODO Auto-generated constructor stub
	}

	public int curar() {
		// TODO Auto-generated method stub
		return 10;
	}
    
}
