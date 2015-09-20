/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Micro
 */
public class GUI_Work extends javax.swing.JFrame {

    Animal selectedAnimal;
    boolean isOpened = false;
    Funcionario usuario = null;
    // Constantes representando os menus de ação para animais
    private int ALIMENTAR = 0;
    private int CURAR = 1;
    private int LIMPAR = 2;
    private int ADICIONAR = 3;
    private int REMOVER = 4;
    private int EDITAR = 5;

    private int Mamiferos = 0;
    private int Aves = 1;
    private int Repteis = 2;
    private int Anfibios = 3;
    private int Invertebrados = 4;

    DefaultListModel<String> model;

    void load_animalList(String str) {
        this.model = new DefaultListModel<String>();
        if (str.equals("Mamiferos")) {
            for (Mamifero s : Setores.setorM) {
                model.addElement(s.getNome());
            }
        }
        if (str.equals("Aves")) {
            for (Ave s : Setores.setorAv) {
                model.addElement(s.getNome());
            }
        }
        if (str.equals("Repteis")) {
            for (Reptil s : Setores.setorR) {
                model.addElement(s.getNome());
            }
        }
        if (str.equals("Anfibios")) {
            for (Anfibio s : Setores.setorAn) {
                model.addElement(s.getNome());
            }
        }
        if (str.equals("Invertebrados")) {
            for (Invertebrado s : Setores.setorI) {
                model.addElement(s.getNome());
            }
        }
        animal_ListBox.setModel(model);
        animal_ListBox.setSelectedIndex(0);
    }
    
    void load_animalList(int index) {
        this.model = new DefaultListModel<String>();
        //model.clear();
        //this.animal_ListBox.clearSelection();
        if (index == this.Mamiferos) {
            for (Mamifero s : Setores.setorM) {
                model.addElement(s.getNome());
            }
        }
        if (index == this.Aves) {
            for (Ave s : Setores.setorAv) {
                model.addElement(s.getNome());
            }
        }
        if (index == this.Repteis) {
            for (Reptil s : Setores.setorR) {
                model.addElement(s.getNome());
            }
        }
        if (index == this.Anfibios) {
            for (Anfibio s : Setores.setorAn) {
                model.addElement(s.getNome());
            }
        }
        if (index == this.Invertebrados) {
            for (Invertebrado s : Setores.setorI) {
                model.addElement(s.getNome());
            }
        }
        animal_ListBox.setModel(model);
        animal_ListBox.setSelectedIndex(0);
    }
    
    void add_animals(String str, String nome, String especie, int sexo, String tipo_alimentacao, int idade) {
        this.model = new DefaultListModel<String>();
        if (str.equals("Mamiferos")) {
            Setores.setorM.add(new Mamifero(nome, especie, sexo, tipo_alimentacao, idade, ""));
        }
        if (str.equals("Aves")) {
            Setores.setorAv.add(new Ave(nome, especie, sexo, tipo_alimentacao, idade, ""));
        }
        if (str.equals("Repteis")) {
            Setores.setorR.add(new Reptil(nome, especie, sexo, tipo_alimentacao, idade, ""));
        }
        if (str.equals("Anfibios")) {
            Setores.setorAn.add(new Anfibio(nome, especie, sexo, tipo_alimentacao, idade, ""));
        }
        if (str.equals("Invertebrados")) {
            Setores.setorI.add(new Invertebrado(nome, especie, sexo, tipo_alimentacao, idade, ""));
        }
        animal_ListBox.setModel(model);
        animal_ListBox.setSelectedIndex(0);
    }

    void add_animals(int sector, String nome, String especie, int sexo, String tipo_alimentacao, int idade) {
        this.model = new DefaultListModel<String>();
        if (sector == this.Mamiferos) {
            Setores.setorM.add(new Mamifero(nome, especie, sexo, tipo_alimentacao, idade, ""));
        }
        if (sector == this.Aves) {
            Setores.setorAv.add(new Ave(nome, especie, sexo, tipo_alimentacao, idade, ""));
        }
        if (sector == this.Repteis) {
            Setores.setorR.add(new Reptil(nome, especie, sexo, tipo_alimentacao, idade, ""));
        }
        if (sector == this.Anfibios) {
            Setores.setorAn.add(new Anfibio(nome, especie, sexo, tipo_alimentacao, idade, ""));
        }
        if (sector == this.Invertebrados) {
            Setores.setorI.add(new Invertebrado(nome, especie, sexo, tipo_alimentacao, idade, ""));
        }
        animal_ListBox.setModel(model);
        animal_ListBox.setSelectedIndex(0);
    }
    
    boolean create_animal(){
        try{
            int sexo = 0;
            if(this.sexo_textBox.getText().equals("Femea")||
                    this.sexo_textBox.getText().equals("femea")||
                    this.sexo_textBox.getText().equals("F")||
                    this.sexo_textBox.getText().equals("f"))sexo = 0;
            
            else if(this.sexo_textBox.getText().equals("Macho")||
               this.sexo_textBox.getText().equals("macho")||
               this.sexo_textBox.getText().equals("M")||
               this.sexo_textBox.getText().equals("m"))sexo = 1;
            else{
                JOptionPane.showMessageDialog(null,"Valor para sexo incorreto");
                return false;
            }
            
            this.add_animals(                               //Adicionado animais ao arrayList
                    this.animal_comboBox.getSelectedIndex(),//Diferencia se é mamifero, ave e etc
                    this.nameAnimal_textBox.getText(),      //Nome
                    this.especie_textBox.getText(),         //Especie
                    sexo,                                   //Sexo (int)
                    this.alimentAnimal_textBox.getText(),   //Alimentação
                    Integer.parseInt(this.idadeAnimal_textBox.getText()));//Idade
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Idade invalida");
                return false;
            }
        return true;
    }
    
    void remove_animals(int sector,int index){
        this.model = new DefaultListModel<String>();
        if (sector == this.Mamiferos) {
            Setores.setorM.remove(index);
        }
        if (sector == this.Aves) {
            Setores.setorAv.remove(index);
        }
        if (sector == this.Repteis) {
            Setores.setorR.remove(index);
        }
        if (sector == this.Anfibios) {
            Setores.setorAn.remove(index);
        }
        if (sector == this.Invertebrados) {
            Setores.setorI.remove(index);
        }
        animal_ListBox.setModel(model);
        animal_ListBox.setSelectedIndex(0);
    }
    
    void feed_animals(int sector,int index){
        if (sector == this.Mamiferos) {
            Setores.setorM.get(index).comer();
            this.fome_progress.setValue(Setores.setorM.get(index).getFome());
        }
        if (sector == this.Aves) {
            Setores.setorAv.get(index).comer();
            this.fome_progress.setValue(Setores.setorAv.get(index).getFome());
        }
        if (sector == this.Repteis) {
            Setores.setorR.get(index).comer();
            this.fome_progress.setValue(Setores.setorR.get(index).getFome());
        }
        if (sector == this.Anfibios) {
            Setores.setorAn.get(index).comer();
            this.fome_progress.setValue(Setores.setorAn.get(index).getFome());
        }
        if (sector == this.Invertebrados) {
            Setores.setorI.get(index).comer();
            this.fome_progress.setValue(Setores.setorI.get(index).getFome());
        }
    }
    
    void cure_animals(int sector,int index){
        if (sector == this.Mamiferos) {
            Setores.setorM.get(index).cura();
            this.saude_progress.setValue(Setores.setorM.get(index).getSaude());
        }
        if (sector == this.Aves) {
            Setores.setorAv.get(index).cura();
            this.saude_progress.setValue(Setores.setorAv.get(index).getSaude());
        }
        if (sector == this.Repteis) {
            Setores.setorR.get(index).cura();
            this.saude_progress.setValue(Setores.setorR.get(index).getSaude());
        }
        if (sector == this.Anfibios) {
            Setores.setorAn.get(index).cura();
            this.saude_progress.setValue(Setores.setorAn.get(index).getSaude());
        }
        if (sector == this.Invertebrados) {
            Setores.setorI.get(index).cura();
            this.saude_progress.setValue(Setores.setorI.get(index).getSaude());
        }
    }
    
    void wash_animals(int sector,int index){
        if (sector == this.Mamiferos) {
            Setores.setorM.get(index).lavar();
            this.higiene_progress.setValue(Setores.setorM.get(index).getHigiene());
        }
        if (sector == this.Aves) {
            Setores.setorAv.get(index).lavar();
            this.higiene_progress.setValue(Setores.setorAv.get(index).getHigiene());
        }
        if (sector == this.Repteis) {
            Setores.setorR.get(index).lavar();
            this.higiene_progress.setValue(Setores.setorR.get(index).getHigiene());
        }
        if (sector == this.Anfibios) {
            Setores.setorAn.get(index).lavar();
            this.higiene_progress.setValue(Setores.setorAn.get(index).getHigiene());
        }
        if (sector == this.Invertebrados) {
            Setores.setorI.get(index).lavar();
            this.higiene_progress.setValue(Setores.setorI.get(index).getHigiene());
        }
    }
            
    int size_sector(int sector){
        this.model = new DefaultListModel<String>();
        if (sector == this.Mamiferos) {
            return Setores.setorM.size();
        }
        if (sector == this.Aves) {
            return Setores.setorAv.size();
        }
        if (sector == this.Repteis) {
            return Setores.setorR.size();
        }
        if (sector == this.Anfibios) {
            return Setores.setorAn.size();
        }
        if (sector == this.Invertebrados) {
            return Setores.setorI.size();
        }
        return 0;
    }
    /*Ativa ou desativa a edição nos textBoxs que 
     * exibem as informações dos animais */

    private void animals_textBoxs_setEditable(boolean flag) {
        this.nameAnimal_textBox.setEditable(flag);
        this.alimentAnimal_textBox.setEditable(flag);
        this.especie_textBox.setEditable(flag);
        this.idadeAnimal_textBox.setEditable(flag);
        this.sexo_textBox.setEditable(flag);
    }
    /*Limpa os textBoxs relativos aos animais*/

    void animals_textBoxs_clearText() {
        this.nameAnimal_textBox.setText(null);
        this.alimentAnimal_textBox.setText(null);
        this.especie_textBox.setText(null);
        this.idadeAnimal_textBox.setText(null);
        this.sexo_textBox.setText(null);
    }

    void animal_texBoxs_loadValues(String s1, String s2, String s3, String s4, String s5) {
        System.out.println(s1 + ", " + s2 + ", " + s3 + ", " + s4 + ", " + s5);
        this.nameAnimal_textBox.setText(s1);
        this.especie_textBox.setText(s2);
        this.sexo_textBox.setText(s3);
        this.idadeAnimal_textBox.setText(s4);
        this.alimentAnimal_textBox.setText(s5);
    }
    
    void animal_progressBar_loadValues(int fome,int saude, int hig){
        this.fome_progress.setValue(fome);
        this.saude_progress.setValue(saude);
        this.higiene_progress.setValue(hig);
    }
    
    public GUI_Work() {
        initComponents();
        //Problema aqui, não quer alterar o titulo
        if (usuario != null) {
            this.setTitle(usuario.nome);
        }
        animals_textBoxs_setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jLabel7 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameAnimal_textBox = new javax.swing.JTextField();
        especie_textBox = new javax.swing.JTextField();
        idadeAnimal_textBox = new javax.swing.JTextField();
        alimentAnimal_textBox = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        sexo_textBox = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        higiene_progress = new javax.swing.JProgressBar();
        saude_progress = new javax.swing.JProgressBar();
        fome_progress = new javax.swing.JProgressBar();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        animal_ListBox = new javax.swing.JList();
        animal_comboBox = new javax.swing.JComboBox();
        n_animais_label = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        actions_comboBox = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Caracteristicas"));

        jLabel2.setText("Nome");

        jLabel9.setText("Especie");

        jLabel3.setText("Idade(anos)");

        jLabel4.setText("Alimentação");

        nameAnimal_textBox.setEditable(false);

        especie_textBox.setEditable(false);

        idadeAnimal_textBox.setEditable(false);

        alimentAnimal_textBox.setEditable(false);

        jLabel17.setText("Sexo");

        sexo_textBox.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(jLabel17)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idadeAnimal_textBox)
                    .addComponent(alimentAnimal_textBox)
                    .addComponent(sexo_textBox, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(especie_textBox)
                    .addComponent(nameAnimal_textBox, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameAnimal_textBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(especie_textBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(sexo_textBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idadeAnimal_textBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(alimentAnimal_textBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado"));

        jLabel18.setText("Fome");

        jLabel19.setText("Saúde");

        jLabel20.setText("Higiene");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fome_progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saude_progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(higiene_progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fome_progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saude_progress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(higiene_progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Setores"));

        animal_ListBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                animal_ListBoxMouseClicked(evt);
            }
        });
        animal_ListBox.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                animal_ListBoxValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(animal_ListBox);

        animal_comboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mamiferos", "Aves", "Repteis", "Anfibios", "Invertebrados" }));
        animal_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animal_comboBoxActionPerformed(evt);
            }
        });

        n_animais_label.setText("...");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(animal_comboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(n_animais_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(animal_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(n_animais_label))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        actions_comboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alimentar", "Curar", "Limpar", "Adicionar", "Remover", "Editar" }));
        actions_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actions_comboBoxActionPerformed(evt);
            }
        });

        jButton1.setText("Ok");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Carne", "Vegetais", "Frutas" }));
        jComboBox4.setEnabled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actions_comboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox4, 0, 158, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(actions_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Lista de animais", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Funcionarios"));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Veterinarios", "Tratadores", "Zootecnicos", "Biologo" }));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBox3, 0, 143, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Caracteristicas"));

        jLabel12.setText("Nome");

        jLabel13.setText("Cargo");

        jLabel14.setText("Email");

        jLabel15.setText("CPF");

        jLabel16.setText("Horario");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(3, 3, 3)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(213, 213, 213))))
        );

        jTabbedPane3.addTab("Funcionarios", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        // Array com os nomes das colunas.
        load_animalList("Mamiferos");
        isOpened = true;
        System.out.println("Aberto");
    }//GEN-LAST:event_formWindowOpened

    private void animal_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animal_comboBoxActionPerformed
        // TODO add your handling code here:
        int index = this.animal_comboBox.getSelectedIndex();
        load_animalList(animal_comboBox.getItemAt(index).toString());
        System.out.println("Ok");
    }//GEN-LAST:event_animal_comboBoxActionPerformed

    private void actions_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actions_comboBoxActionPerformed
        // TODO add your handling code here:
//      private int ALIMENTAR   = 0;
//      private int CURAR       = 1;
//      private int LIMPAR      = 2;
//      private int ADICIONAR   = 3;
//      private int REMOVER     = 4;
//      private int EDITAR      = 5;
        int index = actions_comboBox.getSelectedIndex();
        if (index == ALIMENTAR) {
            this.animals_textBoxs_setEditable(false);
        } else if (index == CURAR) {
            this.animals_textBoxs_setEditable(false);
        } else if (index == LIMPAR) {
            this.animals_textBoxs_setEditable(false);
        } else if (index == ADICIONAR) {
            this.animals_textBoxs_setEditable(true);
            //this.animals_textBoxs_clearText();
        } else if (index == REMOVER) {
            this.animals_textBoxs_setEditable(false);
        } else if (index == EDITAR) {
            this.animals_textBoxs_setEditable(true);
        } else {
            System.out.println("???");
        }

    }//GEN-LAST:event_actions_comboBoxActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int index = actions_comboBox.getSelectedIndex();
        int sector = this.animal_comboBox.getSelectedIndex();
        int animal = this.animal_ListBox.getSelectedIndex();
        
        if (index == ALIMENTAR) {
            animals_textBoxs_setEditable(false);
            //Alimenta um animal
            this.feed_animals(sector, animal);
        } else if (index == CURAR) {
            animals_textBoxs_setEditable(false);
            //Cura um animal
            cure_animals(sector, animal);
        } else if (index == LIMPAR) {
            animals_textBoxs_setEditable(false);
            //Limpa um animal
            wash_animals(sector, animal);
        } else if (index == ADICIONAR) {
            animals_textBoxs_setEditable(true);
            this.create_animal();
            load_animalList(this.animal_comboBox.getSelectedIndex());//Atualiza o listBox
        } else if (index == REMOVER) {
            try{
            animals_textBoxs_setEditable(false);
            remove_animals(sector, animal);
            load_animalList(this.animal_comboBox.getSelectedIndex());//Atualiza o listBox
            }catch(ArrayIndexOutOfBoundsException e){
                    JOptionPane.showMessageDialog(null,"Não ha mais nada a excluir");
                    }
        } else if (index == EDITAR) {
            animals_textBoxs_setEditable(true);
            if(create_animal())
                remove_animals(sector, animal);
            load_animalList(this.animal_comboBox.getSelectedIndex());//Atualiza o listBox
           
            this.animals_textBoxs_setEditable(false);
        } else {
            System.out.println("???");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void animal_ListBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animal_ListBoxMouseClicked
        if (isOpened == true) {
            try {
                this.animals_textBoxs_clearText();
                int indexCombo = this.animal_comboBox.getSelectedIndex();
                int indexList = this.animal_ListBox.getSelectedIndex();
                System.out.println(indexCombo + ", " + indexList);
//                Mamiferos, Aves, Repteis, Anfibios, Invertebrados
                switch (indexCombo) {
                    case 0:
                        this.selectedAnimal = Setores.setorM.get(indexList);
                        break;
                    case 1:
                        this.selectedAnimal = Setores.setorAv.get(indexList);
                        break;
                    case 2:
                        this.selectedAnimal = Setores.setorR.get(indexList);
                        break;
                    case 3:
                        this.selectedAnimal = Setores.setorAn.get(indexList);
                        break;
                    case 4:
                        this.selectedAnimal = Setores.setorI.get(indexList);
                        break;
                }
                String sexo;
                if (this.selectedAnimal.getSexo() == Animal.FEMEA) {
                    sexo = "Femea";
                } else {
                    sexo = "Macho";
                }
                System.out.println("OK");
                //Carrega as caixas de textos com atributos do animal
                this.animal_texBoxs_loadValues(this.selectedAnimal.getNome(),
                        this.selectedAnimal.getEspecie(),
                        sexo,
                        this.selectedAnimal.idadeToString(),
                        this.selectedAnimal.getTipo_alimentacao());
                //Carrega as barras de progresso com as necessidades
                this.animal_progressBar_loadValues(selectedAnimal.getFome(),
                        selectedAnimal.getSaude(),
                        selectedAnimal.getHigiene());

            } catch (Exception e) {                     //Erros gerais
                System.err.println("Erro " + e);
            }
        }
    }//GEN-LAST:event_animal_ListBoxMouseClicked

    private void animal_ListBoxValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_animal_ListBoxValueChanged
        //Exibe em uma label quantos animais existem no setor atual
        this.n_animais_label.setText("Animais: "+size_sector(this.animal_comboBox.getSelectedIndex()));
    }//GEN-LAST:event_animal_ListBoxValueChanged

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Work.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Work.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Work.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Work.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Work().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox actions_comboBox;
    private javax.swing.JTextField alimentAnimal_textBox;
    private javax.swing.JList animal_ListBox;
    private javax.swing.JComboBox animal_comboBox;
    private javax.swing.JTextField especie_textBox;
    private javax.swing.JProgressBar fome_progress;
    private javax.swing.JProgressBar higiene_progress;
    private javax.swing.JTextField idadeAnimal_textBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel n_animais_label;
    private javax.swing.JTextField nameAnimal_textBox;
    private javax.swing.JProgressBar saude_progress;
    private javax.swing.JTextField sexo_textBox;
    // End of variables declaration//GEN-END:variables
}
