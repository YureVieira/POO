import java.util.*;

public class Ingresso_dia {
	double valor = 100;
	int n_pessoas = 1;
	ArrayList<Visitante> visit;
	public Ingresso_dia(){}

	public void fazerCombo(ArrayList<Visitante> list){
		n_pessoas = list.size();
		if(n_pessoas == 3){
			visit = list;
		}
	}
}
