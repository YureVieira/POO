import java.util.Scanner;

public class myClass {
	public static void main(String args[])
	{
		int a = 0;
		int b = 0;
		
		Scanner sc = new Scanner(System.in);					//Instancia para peguar dados do teclado.
		
		System.out.println("Programa para somar dois inteiros");//Saida de dados.
		System.out.println("Digite o primeiro inteiro");
		a = sc.nextInt();										//Pegue uma entrada do teclado e salve numa variavel inteira.
		System.out.println("Digite o segundo inteiro");
		b = sc.nextInt();
		
		int soma = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		
		//System.out.println("O resultado: "+c);
		System.out.println("A soma: "+a+"+" +b + " = "+soma);
		System.out.println("A subtração: "+a+"-" +b + " = "+sub);
		System.out.println("O produto: "+a+"*" +b + " = "+mul);
		System.out.println("O quociente: "+a+"/" +b + " = "+div);
	}
}
