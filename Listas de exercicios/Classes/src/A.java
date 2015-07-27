/*******************************************************************************/
import java.util.*;
public class A {

	static int a;
	public A() {
		a=0;
	}

	public static void main(String[] args) {
		int aux;
		Scanner sc = new Scanner(System.in);
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
	
	public static boolean m(int valor){
		if(valor>0) return true;
		else return false;
	}

}
/*******************************************************************************/

