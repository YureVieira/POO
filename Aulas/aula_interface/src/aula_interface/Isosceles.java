package aula_interface;
import java.util.*;
import java.lang.*;

public class Isosceles extends Triangulo {
	
	public Isosceles(){}
	public Isosceles(double a,double b) {
		// TODO Auto-generated constructor stub
		lado_1 = a;
		lado_2 = b;
		lado_3 = b;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		double h = Math.sqrt(Math.pow(lado_2,2)-(Math.pow(lado_1,2)/4));
		double area = lado_1*h/2;	
		System.out.println("A area do triangulo isoceles: "+area);
		return area;
	}

}
