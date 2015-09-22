/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.*;

/**
 *
 * @author Micro
 */

public class Background {
	int hora_de_fechar = 16;
	int hora_de_abrir = 8;
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
        
        public static boolean  loginF(int index){
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
                Veterinario vet1 = new Veterinario("Yure", "051.046.133-64", "yurevsa@hotmail.com", 2000.0, 20, "847329100","123");
                Biologo bio1 = new Biologo("Ju", "123.456.789-00", "ju@hotmail.com", 2000.0, 20, "873628817","123");
		Tratador trat1 = new Tratador("John", "123.456.789-11", "jonh@hotmail.com", 2000.0, 20, "123456789","123");
                Tratador trat2 = new Tratador("Paulo", "123.456.789-22", "paulo@hotmail.com", 2000.0, 20, "123456789","123");
                Zootecnico zoot1 = new Zootecnico("Jorge", "333.333.333-33", "jorge@hotmail.com", 2000.0, 20, "123456789","123");
                Zootecnico zoot2 = new Zootecnico("Ana", "111.333.333-33", "ana@hotmail.com", 2000.0, 20, "123456789","123");
		
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

}
