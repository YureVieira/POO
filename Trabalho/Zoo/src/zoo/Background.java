/*
*
 */
package zoo;

import java.util.*;

/**
 *
 * @author Micro
 */

public class Background {
	static int hora_de_fechar = 16;
	static int hora_de_abrir = 8;
	int dias_uteis;
	//static ArrayList<Funcionario> quadroF = new ArrayList<Funcionario>();
        static ArrayList<Funcionario> quadroF = new ArrayList<Funcionario>();
	static Scanner sc = new Scanner(System.in);
        static Funcionario usuarioF = new Funcionario();
	static boolean acesso_funcionario = false;
	
        static ArrayList<Visita> visitas = new ArrayList<Visita>();
        
        public Background(){}

	public static int busca_funcionario(String cpf, String senha,String func) {
		int i = 0;
		for (Funcionario p : quadroF) {
			if (p.login.equals(senha) && p.cpf.equals(cpf)){
				if((p instanceof Veterinario && func.equals("Veterinario"))  ||
				(p instanceof Biologo && func.equals("Biologo"))           ||
				(p instanceof Tratador && func.equals("Tratador"))         ||	
                                (p instanceof Zootecnico && func.equals( "Zootecnico"))){
                                    System.out.println("Ok");
                                    return i;
                                }
			}
			i++;
		}
                System.out.println("Falha");
		return -1; // N�o encontrado
	}
        public static Funcionario busca_funcionario(String nome,String func) {
		for (Funcionario p : quadroF) {
			if (p.getNome().equals(nome)){
				if((p instanceof Veterinario && func.equals("Veterinarios"))  ||
				(p instanceof Biologo && func.equals("Biologos"))           ||
				(p instanceof Tratador && func.equals("Tratadores"))         ||	
                                (p instanceof Zootecnico && func.equals( "Zootecnicos"))){
                                    return p;
                                }
			}
		}
                System.out.println("Falha");
		return null; // N�o encontrado
	}
        
        public static boolean loginF(int index){
            try{
                usuarioF = (Funcionario)quadroF.get(index);
                System.out.println("Logado");
                return true;
            }
            catch(Exception e){
                System.err.println("Erro ao logar");
                return false;
            }
        }
        
	public static void criar_funcionarios() {
            try{		
		Admin admin = new Admin("Admin", "222.222.222-22", "admin@gmail.com", 0.0, 20, "555555555","123");
                Veterinario vet1 = new Veterinario("Yure", "123.456.789-00", "yurevsa@hotmail.com", 2000.0, 20, "847329100","123");
                Biologo bio1 = new Biologo("Ju", "123.456.789-11", "ju@hotmail.com", 2000.0, 20, "873628817","123");
		Tratador trat1 = new Tratador("John", "123.456.789-22", "jonh@hotmail.com", 2000.0, 20, "123456789","123");
                trat1.setores.add("Mamiferos");
                trat1.setores.add("Aves");
                trat1.setores.add("Repteis");
                Tratador trat2 = new Tratador("Paulo", "123.456.789-33", "paulo@hotmail.com", 2000.0, 20, "123456789","123");
                trat2.setores.add("Invertebrados");
                trat2.setores.add("Aves");
                trat2.setores.add("Anfibios");
                Zootecnico zoot1 = new Zootecnico("Jorge", "123.456.789-44", "jorge@hotmail.com", 2000.0, 20, "123456789","123");
                Zootecnico zoot2 = new Zootecnico("Ana", "123.456.789-55", "ana@hotmail.com", 2000.0, 20, "123456789","123");
                
                
		//quadroF = new ArrayList<Funcionario>();
		quadroF.add(admin);
                quadroF.add(vet1);
                quadroF.add(bio1);
                quadroF.add(trat1);
                quadroF.add(trat2);
                quadroF.add(zoot1);
                quadroF.add(zoot2);
            }
            catch(Exception e){
                System.err.println(e);
            }
                
	}
        
        public static Visita buscar_visita(String id){
            for(Visita v:visitas){
                if(v.getId().equals(id))return v;
            }
            return null;
        }
}
