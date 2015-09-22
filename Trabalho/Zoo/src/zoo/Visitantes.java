/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.ArrayList;

/**
 *
 * @author Yure
 */
public class Visitantes {
    static ArrayList<Visitante> cadastro_visitantes = new ArrayList<Visitante>();
    
    static void addVisitante(Visitante v){
        cadastro_visitantes.add(v);
    }
    static void removeVisitante(Visitante v){
        cadastro_visitantes.remove(v);
    }
    static void removeVisitante(int index){
        cadastro_visitantes.remove(index);
    }
    static int getSize(){
        return cadastro_visitantes.size();
    }

    public static ArrayList<Visitante> getCadastro_visitantes() {
        return cadastro_visitantes;
    }

    public static void setCadastro_visitantes(ArrayList<Visitante> cadastro_visitantes) {
        Visitantes.cadastro_visitantes = cadastro_visitantes;
    }
    
}
