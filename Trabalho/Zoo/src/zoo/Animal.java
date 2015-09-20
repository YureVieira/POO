package zoo;
public abstract class  Animal {
	private String nome;
        private String especie;
	private String tipo_alimentacao;
        public static int FEMEA = 0;
        public static int MACHO = 1;
        private int sexo;
	private int idade;
	private String msg = "";
	private boolean doente;
	private boolean fome;	
	
	public Animal(String nome, String especie,int sexo, String tipo_alimentacao, int idade,String msg) {
		super();
		this.nome = nome;
		this.tipo_alimentacao = tipo_alimentacao;
		this.idade = idade;
		this.msg = msg;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo_alimentacao() {
		return tipo_alimentacao;
	}

	public void setTipo_alimentacao(String tipo_alimentacao) {
		this.tipo_alimentacao = tipo_alimentacao;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	public boolean isDoente() {
		return doente;
	}

	public void setDoente(boolean doente) {
		this.doente = doente;
	}

	public boolean isFome() {
		return fome;
	}

	public void setFome(boolean fome) {
		this.fome = fome;
	}

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
        
    public String idadeToString() {
        return "" + idade;
    }
	public void Comer(){
		System.out.println("Comendo");		
	}
	
	public void cura(){
		System.out.println("Curado");	
	}
        
}
