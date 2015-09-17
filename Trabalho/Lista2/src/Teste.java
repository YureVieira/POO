/*
 * Autor: Yure vieira Sampaio Albuquerque
 * 
 * Objetivo: Resolu��o da lista2 de exercicios
 * 
 * 
 * 
 * */
import java.util.*;

public class Teste {

	public static void main(String[] args) {
		//questao_4();
		questao_7();
	}
	static void questao_4(){
		Quadrado q1 = new Quadrado(2);
		System.out.println("Quadrado de lados "+q1.altura+" e "+q1.base);
	}
	static void questao_7(){
		Scanner sc = new Scanner(System.in);

		ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();
		ArrayList<Assistente> assistentes = new ArrayList<Assistente>();

		// /Instancias
		Normal normal_1 = new Normal(200);
		Normal normal_2 = new Normal(200);
		VIP vip_1 = new VIP(50);
		VIP vip_2 = new VIP(50);

		Tecnico tecnico_1 = new Tecnico("Jo�o", 1200934,950, 100);
		Tecnico tecnico_2 = new Tecnico("Paulo", 1200956,950 ,115);
		Administrativo admin_1 = new Administrativo("Suzy", 1200503,2000, "noite");
		Administrativo admin_2 = new Administrativo("Pedro", 120223,2000, "dia");

		// /Adicionados as listas
		ingressos.add(normal_1);
		ingressos.add(normal_2);
		ingressos.add(vip_1);
		ingressos.add(vip_2);
		assistentes.add(tecnico_1);
		assistentes.add(tecnico_2);
		assistentes.add(admin_1);
		assistentes.add(admin_2);

		// /Menu
		System.out
				.println("Digite �1� para Visualizar Ingressos do Tipo Normal Armazenados");
		System.out.println("Digite �2� para Visualizar Ingressos do Tipo VIP");
		System.out
				.println("Digite �3�  para Visualizar Nossa lista de Assistentes Tecnicos");
		System.out
				.println("Digite  �4�  para  Visualizar  Nossa  lista  de  Assistentes  Administrativos");

		int resp = sc.nextInt();
		switch (resp) {
		case 1:// Ingressos normais
			for (Ingresso aux : ingressos) {
				if (aux instanceof Normal) {
					aux.imprimeValor();
				}
			}
			break;
		case 2:// Ingressos VIP
			for (Ingresso aux : ingressos) {
				if (aux instanceof VIP) {
					aux.imprimeValor();
				}
			}
			break;
		case 3:// Assistentes tecnicos
			for (Assistente aux : assistentes) {
				if (aux instanceof Tecnico) {
					aux.exibeDados();
				}
			}
			break;
		case 4:// Assistentes administrativos
			for (Assistente aux : assistentes) {
				if (aux instanceof Administrativo) {
					aux.exibeDados();
				}
			}
			break;
			default: 
				System.out.println("Valor invalido!");
				break;
		}
		
	}
}
