import java.sql.Time;
import java.util.Date;


public class MedicoVet extends Funcionario implements Edit_Animals{

	public MedicoVet(String nome,String cpf, String email,
			double salario, int carga_horaria, long telefone) {
		super(nome,cpf, email, salario, carga_horaria, telefone);
		// TODO Auto-generated constructor stub
	}

	public int Recebe_salario() {
		// TODO Auto-generated method stub
		return 8000;
	}
	
	public static int add_animal() {
		System.out.println("=========Escolha o tipo de animal=========");
		System.out.println("1 -> Mamifero");
		System.out.println("1 -> Ave");
		System.out.println("1 -> Reptil");
		System.out.println("1 -> Anfibio");
		System.out.println("1 -> Invertebrado");
		int escolha;
		try {
			escolha = sc.nextInt();
			switch(escolha){
			case 1:
				System.out.print("Nome: ");
				String nome = sc.next();
				
				for(;;){	//Loop infinito
					String tipo_alimento;
				System.out.print("Onivoro?(s/n)");
				String resp = sc.next();
				
				if(resp == "n"){	
					System.out.print("Herbivoro?(s/n) ");
					resp = sc.next();
					if(resp == "n"){
						System.out.print("Carnivoro?(s/n) ");
						resp = sc.next();
						if(resp == "n")System.out.print("Se animal não come não?");
						else if(resp == "s"){ 
							tipo_alimento = "Carnivoro";
							break;	//Sai do loop
						}
						else System.out.println("Resposta invalida");
					}
					else if(resp == "s"){
						tipo_alimento = "Herbivoro";
						break;	//Sai do loop
					}
					else System.out.println("Resposta invalida");
				}
				else if(resp == "s"){
					tipo_alimento = "Onivoro";
					break;	//Sai do loop
				}
				else System.out.println("Resposta invalida");
				}
				System.out.print("Idade em anos:");
				int idade = sc.nextInt();
				
				System.out.println("Escreva um mensagem, uma descrição do animal:");
				String msg = sc.next();
				
				Mamifero bixinho = new Mamifero(nome,tipo_alimento,idade,msg);
				setorM.add(bixinho);
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("Entrada Invalida 'm2'");
			return -1;
		}

}