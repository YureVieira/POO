
public class VIP extends Ingresso {
	float adicional;
	public VIP(float add) {
		// TODO Auto-generated constructor stub
		super(200);
		adicional = add;
	}
	float valotTotal(){
		return valor_reais+adicional;
	}
	void imprimeValor(){
		System.out.println("Valor do ingresso R$"+valotTotal());
		
	}
}
