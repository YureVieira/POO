
public class Empregado {

	String primeiro_nome;
	String sobrenome;
    float salário_mensal;
    
    public String getPrimeiro_nome() {
		return primeiro_nome;
	}

	public void setPrimeiro_nome(String primeiro_nome) {
		this.primeiro_nome = primeiro_nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public float getSalário_mensal() {
		return salário_mensal;
	}

	public void setSalário_mensal(float salário_mensal) {
		this.salário_mensal = salário_mensal;
	}

	public Empregado(String primeiro_nome, String sobrenome,
			float salário_mensal) {
		super();
		this.primeiro_nome = primeiro_nome;
		this.sobrenome = sobrenome;
		this.salário_mensal = salário_mensal;
	}


}
