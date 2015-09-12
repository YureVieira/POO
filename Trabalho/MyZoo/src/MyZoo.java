import java.util.*;

public class MyZoo {
	int hora_de_fechar = 16;
	int hora_de_abrir = 8;
	int dias_uteis;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Tratador t1 = new Tratador("Yure
		// Vieira",05194613364,"yurevsa@hotmail.com");
		
		switch(menu1()){
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		}

	}
	
	public static int menu1(){
		int escolha;
		System.out.println("Bem vindo ao zoologico");
		System.out.println("1 - Administrador");
		System.out.println("2 - Visitante");
		System.out.println("3 - Funcionario");
		for(;;){
		try{
			escolha = sc.nextInt();
			break;
		}
		catch(InputMismatchException e){
			System.out.println("Entrada invalida 'm1'");
		}
		}	
		return escolha;	
	}
	public static int menuFunc(){
		int escolha;
		System.out.println("Funcionario de que tipo?");
		System.out.println("1 - Veterinario");
		System.out.println("2 - Biologo");
		System.out.println("3 - Tratador");
		System.out.println("3 - Zootecnico");
		for(;;){
		try{
			escolha = sc.nextInt();
			break;
		}
		catch(InputMismatchException e){
			System.out.println("Entrada Invalida 'm2'");
		}
		}	
		return escolha;	
	}
	

}
