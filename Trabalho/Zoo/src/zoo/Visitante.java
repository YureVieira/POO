package zoo;

import java.util.Date;

public class Visitante extends Pessoa {
    /*	static int lazer = 0;
     static int pesquisa = 1;
     static int projetoDePreservacao = 2;
     static int educacaoAmbiental = 3;*/

    String objetivo;
    int idade;
    String endereco;

    public Visitante(String nome, String cpf, String email, int idade, String endereco, String objetivo) {
        super(nome, cpf, email);
        this.idade = idade;
        this.endereco = endereco;
        this.objetivo = objetivo;
    }

    //Metodos
    public void setObjetivo(String x) {
        objetivo = x;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
