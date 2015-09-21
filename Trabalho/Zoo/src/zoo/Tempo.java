/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author Micro
 */
public class Tempo {

    //Timer

    static Timer timer;
    static Date agora = new Date();
    static String data, hora;
    static int dia = 1;

    static void start() {
        timer_cicle();
    }

    //Responsavel pelas informações de tempo

    public static void timer_cicle() {
        ActionListener action = new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String data_ = "dd/MM/yyyy";
                String hora_ = "h:mm - a";
                String data,hora;

                //Indetificar o dia da semanas
                Calendar cal = Calendar.getInstance();
                agora = cal.getTime();
                SimpleDateFormat formata = new SimpleDateFormat(data_);
                data = formata.format(agora);
                formata = new SimpleDateFormat(hora_);
                hora = formata.format(agora);

                cal.setTime(agora);
                dia = cal.get(Calendar.DAY_OF_WEEK);
            }
        };
        timer = new Timer(1000, action);
        timer.start();
    }

    public static int getDia() {
        return dia;
    }

    public static String getDiaString() {
        switch (dia) {
            case 1:
                return "domingo";
            case 2:
                return "segunda-feira";
            case 3:
                return "terça-feira";
            case 4:
                return "quarta-feira";
            case 5:
                return "quinta-feira";
            case 6:
                return "sexta-feira";
            case 7:
                return "sabado";
            default:
                return null;
        }

    }

    public static String getData() {
        return data;
    }

    public static String getHora() {
        return hora;
    }
    
}
