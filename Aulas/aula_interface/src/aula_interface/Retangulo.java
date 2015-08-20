package aula_interface;

public class Retangulo implements Calculavel {
	double lado_M;
	double lado_m;
	public Retangulo(double a,double b) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		double area = lado_m*lado_M;
		System.out.println("A area do retangulo"+area);
		return area;
	}
}
