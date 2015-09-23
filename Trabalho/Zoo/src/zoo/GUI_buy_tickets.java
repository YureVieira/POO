/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Yure
 */
public class GUI_buy_tickets extends javax.swing.JFrame {

    Visita visita = new Visita();
    DefaultListModel modelo = new DefaultListModel();
    ArrayList visitsIds = new ArrayList();

    public GUI_buy_tickets() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        remove_bt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        data_tf = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        add_bt = new javax.swing.JButton();
        combo_cb = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        horario_cb = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Visita"));

        jLabel1.setText("Visitante(s)");

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        remove_bt.setText("-");
        remove_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remove_btMouseClicked(evt);
            }
        });

        jLabel2.setText("Data da visita");
        jLabel2.setToolTipText("");

        try {
            data_tf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Horario da visita");
        jLabel3.setToolTipText("");

        jLabel4.setText("Tipo de ingresso");

        add_bt.setText("+");
        add_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_btMouseClicked(evt);
            }
        });

        combo_cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Combo Familia" }));

        jButton2.setText("Ok");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        horario_cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8:00 as 12:00", "12:00 as 16:00", "8:00 as 16:00" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combo_cb, 0, 233, Short.MAX_VALUE)
                            .addComponent(data_tf)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(add_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(remove_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(horario_cb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 12, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(add_bt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remove_bt)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(data_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horario_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void remove_btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remove_btMouseClicked
        int index = this.jList1.getSelectedIndex();
        try {
            modelo.remove(index);
            this.visita.getVisitantes().remove(index);
            this.jList1.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não ha mais nada a remover");
        }
    }//GEN-LAST:event_remove_btMouseClicked

    private void add_btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_btMouseClicked
        //Alterei o construtor para receber uma instancia desta classe como pai tambem
        GUI_search_visits win = new GUI_search_visits(this, true);
        win.setVisible(true);
        //Lista de indices
        try {
            //            ArrayList indexList = new ArrayList();
            //            for(int i=0;i<win.visitsIds.size();i++){
            //                indexList.add(win.visitsIds.get(i));
            //            }
            //visitsIds
            for (int i = 0; i < visitsIds.size(); i++) {
                int index = (int) visitsIds.get(i);
                Visitante aux = Visitantes.getCadastro_visitantes().get(index);
                System.out.println(aux.getNome());
                modelo.addElement(aux.getNome());
//                this.visita.getVisitantes().add(aux);
                System.out.println("2");
                this.visita.visitantes.add(aux);

                this.jList1.setModel(modelo);
            }

        } catch (Exception e) {
            System.out.println("erro: " + e);
        }
    }//GEN-LAST:event_add_btMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        String data;
        int ano, mes, dia, hora, minuto, hora_sair = 12;;
        int diaDaSemana;
        boolean combo = false, full_time = false;
        
        if (this.jList1.getModel().getSize() > 0) {
            data = this.data_tf.getText();
            
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date diaUtil = sdf.parse(data);
                GregorianCalendar gc = new GregorianCalendar();
                gc.setTime(diaUtil);
                diaDaSemana = gc.get(GregorianCalendar.DAY_OF_WEEK);
            } catch (ParseException ex) {
                Logger.getLogger(GUI_buy_tickets.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }

            String _data = data.replace("/", "");
            dia = Integer.parseInt(_data.substring(0, 2));
            mes = Integer.parseInt(_data.substring(2, 4));
            ano = Integer.parseInt(_data.substring(4, 8));

            if (dia > 31 || mes > 12 || dia == 0 || mes == 0) {
                JOptionPane.showMessageDialog(null, "Data invalida");
                return;
            } else if ((mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 31) {
                JOptionPane.showMessageDialog(null, "Data invalida");
                return;
            } else if ((ano % 4 == 0) && mes == 2 && dia > 29) {
                JOptionPane.showMessageDialog(null, "Data invalida(Ano bissexto)");
                return;
            } else if ((ano % 4 != 0) && mes == 2 && dia > 28) {
                JOptionPane.showMessageDialog(null, "Data invalida(Ano não bissexto)");
                return;
            } else if (diaDaSemana == 1) {
                JOptionPane.showMessageDialog(null, "O zoologico é fechado aos domingos");
                return;
            }

            int index = this.horario_cb.getSelectedIndex();

            if (index == 0) {
                hora = 8;
                hora_sair = 12;
            } else if (index == 1) {
                hora = 12;
                hora_sair = 16;
            } else {
                hora = 8;
                hora_sair = 16;
            }
            if (this.combo_cb.getModel().getSelectedItem().equals("Normal")) {
                if (hora_sair - hora == 4) {
                    combo = false;
                    full_time = false;
                } else {
                    combo = false;
                    full_time = true;
                }
            }
            if (this.combo_cb.getModel().getSelectedItem().equals("Combo Familia")) {
                if (this.jList1.getModel().getSize() < 3) {
                    JOptionPane.showMessageDialog(null, "Combo familia somente para grupos de 3 pessoas");
                    return;
                }
                if (hora_sair - hora == 4) {
                    combo = true;
                    full_time = false;
                } else {
                    combo = true;
                    full_time = true;
                }
            }

            visita.setAno(ano);
            visita.setMes(mes);
            visita.setDia(dia);
            visita.setHora(hora);
            visita.setHora_sair(hora_sair);
            visita.setData(data);
            String ID = visita.compute(combo, full_time);
//            JOptionPane.showConfirmDialog(this, data);
            if (JOptionPane.showConfirmDialog(this, "Ingresso para " + this.jList1.getModel().getSize()
                    + " pessoas lhe custara R$" + visita.getValor(), "Deseja pagar por isso?", 2) == 0) {
                Background.visitas.add(visita);
                JOptionPane.showInputDialog(this, "Guarde seu id para fazer a visita futuramente", ID);
            }
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        if (this.jList1.getModel().getSize() == 3) {
            //JOptionPane.showMessageDialog(null, "Voce pode optar pelos combos");
        }
    }//GEN-LAST:event_jList1ValueChanged

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
            java.util.logging.Logger.getLogger(GUI_buy_tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_buy_tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_buy_tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_buy_tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_buy_tickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_bt;
    private javax.swing.JComboBox combo_cb;
    private javax.swing.JFormattedTextField data_tf;
    private javax.swing.JComboBox horario_cb;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton remove_bt;
    // End of variables declaration//GEN-END:variables
}
