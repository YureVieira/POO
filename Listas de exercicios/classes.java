/**************************************************************************************************
* 4º Questão
***************************************************************************************************/
public class DVD {
	String marca;
	String modelo;
	float peso;
	boolean slim ;
	float preço;
	
	public DVD(String marca, String modelo, float peso, boolean slim,
			float preço) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.peso = peso;
		this.slim = slim;
		this.preço = preço;
	}
	
}

/**************************************************************************************************
* 7º Questão
***************************************************************************************************/
public class Empregado {

	String primeiro_nome;
	String sobrenome;
	float salário_mensal;

	public String getPrimeiro_nome() {
		returnprimeiro_nome;
	}

	public void setPrimeiro_nome(String primeiro_nome) {
		this.primeiro_nome = primeiro_nome;
	}

	public String getSobrenome() {
		returnsobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public float getSalário_mensal() {
		returnsalário_mensal;
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

/**************************************************************************************************
* 8º Questão
***************************************************************************************************/
public classA{
	int atributo1;
	char atributo2;
	public A(intatributo1,charatributo2){
		super();
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
	}
}

public classC{
	String atributo1;
	char atributo2;
	public C(String atributo1,charatributo2){
		super();
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
	}
}

public classB{
	A atributo1;
	C atributo2;
	publicC(A atributo1,C atributo2){
		super();
		this.atributo1 = newA(atributo1);
		this.atributo2 = newC(atributo2);
	}
}

/**************************************************************************************************
* 9º Questão
***************************************************************************************************/
import java.util.*;
public class A {

	static int a;
	public A() {
		a=0;
	}

	public static void main(String[] args) {
		intaux;
		Scanner sc = newScanner(System.in);
		System.out.println("Entre com um inteiro");//Saida de dados.
		aux = sc.nextInt();
		
		if(m(aux)){
			a = aux*10;
			System.out.println("a = "+a);
		}
		else{
			System.out.println("Valor invalido!");
		}
		
	}
	
	public static boolean m(intvalor){
		if(valor>0) return true;
		else return false;
	}

}
