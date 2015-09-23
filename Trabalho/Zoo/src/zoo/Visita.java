package zoo;

import java.text.SimpleDateFormat;
import java.util.*;

public class Visita {

    ArrayList<Visitante> visitantes;
    String data;//data e hora
    int hora, minuto, hora_sair;
    int dia, mes, ano;
    int valor;
    String id;

    public Visita() {
        visitantes = new ArrayList<Visitante>();
    }

    public String compute(boolean combo, boolean full) {
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
        
        //Gerar um ID
        String data_ = "dd/MM/yyyy";
        SimpleDateFormat formata = new SimpleDateFormat(data_);
       
        Date d = new Date();
        data = formata.format(d);
        
        Calendar cal = new GregorianCalendar();
        long agora = d.getTime();
        
        id = "ZOO" + visitantes.size() + "V" + valor + "H" + hora + "HS" + hora_sair+"D"+agora;
        return id;
    }

    public ArrayList<Visitante> getVisitantes() {
        return visitantes;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getHora_sair() {
        return hora_sair;
    }

    public void setHora_sair(int hora_sair) {
        this.hora_sair = hora_sair;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
