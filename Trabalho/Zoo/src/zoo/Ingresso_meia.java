package zoo;
import java.util.ArrayList;

public class Ingresso_meia {
	double valor = 50;
	int n_pessoas = 1;
	ArrayList<Visitante> visit;
	public Ingresso_meia(){}

	public void fazerCombo(ArrayList<Visitante> list){
		n_pessoas = list.size();
		if(n_pessoas == 3){
			visit = list;
		}
	}
}
