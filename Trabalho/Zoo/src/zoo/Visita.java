package zoo;

import java.util.*;

public class Visita {

    ArrayList<Visitante> visitantes;
    String data;//data e hora
    int hora, minuto, horaSair, minutoSair;
    int dia, mes, ano;
    int valor;

    public Visita() {
        visitantes = new ArrayList<Visitante>();
    }

    public void compute(boolean combo, boolean full) {
        if (combo) {
            int nCombos = visitantes.size() / 3;
            int nAvulsos = visitantes.size() % 3;
            if (full) {
                valor = nCombos * 200 + nAvulsos * 100;
            } else {
                valor = nCombos * 100 + nAvulsos * 50;
            }
        } else {
            if (full) {
                valor = visitantes.size() * 100;
            } else {
                valor = visitantes.size() * 50;
            }
        }
    }
}
