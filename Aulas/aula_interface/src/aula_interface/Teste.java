package aula_interface;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Isosceles t1 = new Isosceles(12,8);
		Escaleno t2 = new Escaleno();
		Retangulo rect = new Retangulo(12,20);
		
		t1.calculaArea();
		t2.calculaArea();

	}

}
