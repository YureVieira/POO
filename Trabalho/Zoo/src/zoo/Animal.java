package zoo;

public abstract class Animal {

    private String nome;
    private String especie;
    private String tipo_alimentacao;
    public static int FEMEA = 0;
    public static int MACHO = 1;
    private int sexo;
    private int idade;
    private String msg = "";
    private int saude = 50;
    private int fome = 50;
    private int higiene = 50;


    public Animal(String nome, String especie, int sexo, String tipo_alimentacao, int idade, String msg) {
        super();
        this.nome = nome;
        this.especie = especie;
        this.sexo = sexo;
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

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
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
    
    public int getHigiene() {
        return higiene;
    }

    public void setHigiene(int higiene) {
        this.higiene = higiene;
    }
    
    public void comer() {
        this.fome = this.fome - 5; 
        System.out.println("Comendo");
    }

    public void cura() {
        this.saude = this.saude + 5;
        System.out.println("Curando");
    }
    
    public void lavar(){
        this.higiene = this.higiene + 5;
        System.out.println("Limpando");
    }
}
