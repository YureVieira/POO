
public class Empregado {

	String primeiro_nome;
	String sobrenome;
    float sal�rio_mensal;
    
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

	public float getSal�rio_mensal() {
		return sal�rio_mensal;
	}

	public void setSal�rio_mensal(float sal�rio_mensal) {
		this.sal�rio_mensal = sal�rio_mensal;
	}

	public Empregado(String primeiro_nome, String sobrenome,
			float sal�rio_mensal) {
		super();
		this.primeiro_nome = primeiro_nome;
		this.sobrenome = sobrenome;
		this.sal�rio_mensal = sal�rio_mensal;
	}


}
