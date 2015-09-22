/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Micro
 */
public class GUI_welcome extends javax.swing.JFrame {

    private Boolean login;
    static Funcionario usuario = null;
    //variaveis relativas aos horarios
    Timer timer;
    String data, hora;
    int dia;
    Date agora = new Date();  
    public void setLogin(boolean e) {
        login = e;
    }

    /**
     * Creates new form JFrame
     */
    public GUI_welcome() {
        initComponents();
        Background.criar_funcionarios();    //Criando todos os funcionarios
        Setores.init();                     //Criando todos os animais
        //Timer pra ficar atualizando as horas
        timer_cicle();
    }

    public void timer_cicle() {
        ActionListener action = new ActionListener() {
            public void actionPerformed(@SuppressWarnings("unused") java.awt.event.ActionEvent e) {
                String data_ = "dd/MM/yyyy";
                String hora_ = "HH:mm - a";

                //Indetificar o dia da semanas
                Calendar cal = Calendar.getInstance();
                agora = cal.getTime();
                SimpleDateFormat formata = new SimpleDateFormat(data_);
                data = formata.format(agora);
                formata = new SimpleDateFormat(hora_);
                hora = formata.format(agora);

                cal.setTime(agora);
                dia = cal.get(Calendar.DAY_OF_WEEK);
                //System.out.println(data + ", " + hora + ", " + getDiaString());
                _setTitle(data + ", " + hora + ", (" + getDiaString()+")");
            }
        };
        timer = new Timer(1000, action);
        timer.start();
    }

    public void _setTitle(String str) {
        this.setTitle(str);
    }

    public int getDia() {
        return dia;
    }

    public String getDiaString() {
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

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    /**
     * **********************************************************************
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Funcionario");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Novo Visitante");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Visitante");

        jButton4.setText("Agendar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        GUI_Login_Worker win1 = new GUI_Login_Worker(this, true);
        win1.setVisible(true);
        System.out.println(win1.getCpf());
        System.out.println(win1.getPassword());
        System.out.println(win1.getFnc());

        //Faz a busca e loga se usuario existir
        int index = Background.busca_funcionario(win1.getCpf(), win1.getPassword(), win1.getFnc());
        //Segundo form
        GUI_Work winW = new GUI_Work();
        if (index >= 0) {
            Background.loginF(index);
            System.out.println("Index = " + index);
            usuario = Background.quadroF.get(index);//Atribui um usuario
            if (usuario instanceof Biologo) {
                winW.setTitle(usuario.getNome() + "<Biologo>");
            }
            if (usuario instanceof Veterinario) {
                winW.setTitle(usuario.getNome() + "<Veterinario>");
            }
            if (usuario instanceof Tratador) {
                winW.setTitle(usuario.getNome() + "<Tratador>");
            }
            if (usuario instanceof Zootecnico) {
                winW.setTitle(usuario.getNome() + "<Zootecnico>");
            }
            JOptionPane.showMessageDialog(null, "Login efetuado com sucesso");
            winW.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "não foi possivel efetuar seu login");
            //winW.setTitle("Desenvolvedor");//Nunca acontece
        }

        //winW.setTitle("Logado");
        //this.setVisible(false);
        //this.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       GUI_visit_register win = new GUI_visit_register(this, true);
       win.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
       GUI_buy_tickets win = new GUI_buy_tickets();
       win.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}
