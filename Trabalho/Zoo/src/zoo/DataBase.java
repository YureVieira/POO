package zoo;
import java.util.*;


public class DataBase {
	int hora_de_fechar = 16;
	int hora_de_abrir = 8;
	int dias_uteis;
	static ArrayList<Funcionario> quadroF = new ArrayList<Funcionario>();
	static Scanner sc = new Scanner(System.in);
	boolean acesso_funcionario = false;
	
        static Funcionario usuarioF;
        /*
	public static void main(String[] args) {
		
		//Cria o quadro de funcionarios altomaticamente
		criar_funcionarios();
		
		int escolha_func;
		for (boolean flag_loop = true; flag_loop;) {
			//Escolha do tipo de pessoa
			int escolha1 = menu1();
			
			switch (escolha1) {
			case 1:
				int tipo_func = menuFunc();
				int index = menu_login_funcionario(tipo_func);
				System.out.println("=============Editar animais=============");
				System.out.println("1 -> Adicionar animal");
				System.out.println("2 -> Remover animal");
				System.out.println("3 -> Editar animal");
				System.out.println("4 -> Ver animal");
				flag_loop = false;
				break;
			case 2:
				flag_loop = false;
				break;
			case 3:
				flag_loop = false;
				break;
			case -1: // Continuar no loop ate a entrada ser valida
				flag_loop = true;
				break;
			}
		}
	}
        */
	/********************************************************************************
	 * Menus
	 *******************************************************************************/
	public static int menu1() {
		int escolha;
		System.out.println("Bem vindo ao zoologico");
		System.out.println("1 - Funcionario");
		System.out.println("2 - Novo visitante");
		System.out.println("3 - Visitante");
		try {
			escolha = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Entrada invalida 'm1'");
			return -1;
		}
		return escolha;
	}

	public static int menuFunc() {
		int escolha;
		System.out.println("Funcionario de que tipo?");
		System.out.println("1 - Veterinario");
		System.out.println("2 - Biologo");
		System.out.println("3 - Tratador");
		System.out.println("4 - Zootecnico");
		try {
			escolha = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Entrada Invalida 'm2'");
			return -1;
		}
		return escolha;
	}

	public static int menu_login_funcionario(int func) {
		String senha, cpf;
		try {
			System.out.println("Funcionario informe o cpf e senha");
			System.out.print("CPF: ");
			cpf = sc.next();
			System.out.print("Senha: ");
			senha = sc.next();
			//Verifica se o funcionario existe.
			int index = busca_funcionario(cpf, senha,func);
			if(index < 0){	//N�o existe
				System.out.println("Usuario n�o cadastrado");
				return -1;
			}
			else{
				System.out.println("Usuario Encontrado");
				return index;
			}
		} catch (InputMismatchException e) {
			System.out.println("Entrada Invalida 'm2'");
			return -1;
		}
	}

	public static int view_animal() {
		System.out.println("Veja o animal");
		return 0;
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
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("Entrada Invalida 'm2'");
			return -1;
		}
		
		return 0;
	}

	public static int remove_animal() {
		return 0;
	}

	public static int change_animal() {
		return 0;
	}

	public static int busca_funcionario(String cpf, String senha,String func) {
		int i = 0;
		for (Funcionario p : quadroF) {
			if (p.login.equals(senha) && p.cpf.equals(cpf)){
				if(p instanceof MedicoVet && func == "Veterinario"  ||
				p instanceof Biologo && func == "Biologo"           ||
				p instanceof Tratador && func == "Tratador"         ||	
                                p instanceof Zootecnico && func == "Zootecnico"){
                                    return i;
                                }
			}
			i++;
		}
		return -1; // N�o encontrado
	}
        
        public static void  loginF(int index){
            try{
                usuarioF = quadroF.;
                System.out.println("Logado");
            }
            catch(Exception e){
                System.err.println("Erro ao logar");
            }
        }
        
	public static void criar_funcionarios() {
		MedicoVet vet1 = new MedicoVet("Yure", "05104613364", "yurevsa@hotmail.com", 2000.0, 20, 998061837);
		vet1.login = "guide123";
		MedicoVet vet2 = new MedicoVet("Yunes", "07217814383", "yuneschpl@gmail.com", 12000.0, 20, 555555555);
		vet2.login = "guide123";
		
		//quadroF = new ArrayList<Funcionario>();
		quadroF.add(vet1);
		quadroF.add(vet2);
	}

}