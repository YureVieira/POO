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
    static int dia; 
    
    static void start(){
        timer_cicle();
    }
    //Responsavel pelas informações de tempo
    public static void timer_cicle() {
        ActionListener action = new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String data_ = "dd/MM/yyyy";
                String hora_ = "h:mm - a";
                
                //Indetificar o dia da semanas
                Calendar cal = Calendar.getInstance();
                agora = cal.getTime();
                SimpleDateFormat formata = new SimpleDateFormat(data);
                data1 = formata.format(agora);
                formata = new SimpleDateFormat(hora);
                hora1 = formata.format(agora);
                
                cal.setTime(agora);
                int dia = cal.get(Calendar.DAY_OF_WEEK);                
            }
        };
        timer = new Timer(1000, action);
        timer.start();
    }
    
}
