/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio33;

import javax.swing.JOptionPane;

/**
 *
 * @author Max
 */
public class validador extends javax.swing.JFrame {

    /**
     * Creates new form validador
     */
    public validador() {
        initComponents();
         this.setLocationRelativeTo(null);
    }
    
    int combo_pronvinciaS;
    int combo_generoS;
    int combo_estadoS;
    
    //validacion de email**********************************************
    boolean arroba = false;
    boolean punto = false;
    
    String mail;
    //variables para validacion final
    int paso = 0;
    int v1;
    int v2;
    int v3;
    int v4;
    int v5;
    int v6;
    int v7;
    int v8;
    int v9;
    int v10;
    int v11;
    int total;
    
    
    public void validamail(){
        mail = this.input_email.getText();
        
         for (int i = 0; i<mail.length(); i++) {

        for (int j = 0; j<mail.length(); j++) {

            if(mail.charAt(i)=='@' && mail.charAt(j)=='.') {

                arroba = true;
                punto = true;
                
            } else{
               
            }
                

        }

    }

    if (arroba == true && punto == true) {
        paso = 1;
        
    } else {
        
    paso = 0;
    
    }

    }
    //fin validacion de email*************************
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        input_nombre = new javax.swing.JTextField();
        input_apellido = new javax.swing.JTextField();
        input_fechanac = new javax.swing.JTextField();
        input_cuil = new javax.swing.JTextField();
        input_domicilio = new javax.swing.JTextField();
        input_localidad = new javax.swing.JTextField();
        input_hijos = new javax.swing.JTextField();
        input_email = new javax.swing.JTextField();
        combo_genero = new javax.swing.JComboBox<>();
        combo_pronvincia = new javax.swing.JComboBox<>();
        combo_estadocivil = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        boton_crear = new javax.swing.JButton();
        boton_limpiar = new javax.swing.JButton();
        boton_salir = new javax.swing.JButton();
        no = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lb_total = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Validador"));

        input_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nombreActionPerformed(evt);
            }
        });
        input_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input_nombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_nombreKeyTyped(evt);
            }
        });

        input_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input_apellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_apellidoKeyTyped(evt);
            }
        });

        input_fechanac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input_fechanacKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_fechanacKeyTyped(evt);
            }
        });

        input_cuil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_cuilKeyTyped(evt);
            }
        });

        input_domicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input_domicilioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_domicilioKeyTyped(evt);
            }
        });

        input_localidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input_localidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_localidadKeyTyped(evt);
            }
        });

        input_hijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_hijosActionPerformed(evt);
            }
        });
        input_hijos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input_hijosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_hijosKeyTyped(evt);
            }
        });

        input_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input_emailKeyReleased(evt);
            }
        });

        combo_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Masculino", "Femenino", "No Binario" }));
        combo_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_generoActionPerformed(evt);
            }
        });

        combo_pronvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Ciudad Autonoma de BA", "Buenos Aires", "Jujuy", "Salta", "Formosa", "Santiago del Estero", "Misiones", "Corrientes", "Santa Fe", "Entre Rios", "Cordoba", "Catamarca", "La Rioja", "San Juan", "San Luis", "Mendoza", "La Pampa", "Rio Negro", "Chubut", "Santa Cruz", "Tierra del Fuego" }));
        combo_pronvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_pronvinciaActionPerformed(evt);
            }
        });

        combo_estadocivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Soltero/a", "Casado/a", "Separado/a", "Viudo/a" }));
        combo_estadocivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_estadocivilActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Fecha de nacimiento");

        jLabel4.setText("Genero **");

        jLabel5.setText("Cuil/Cuit ***");

        jLabel6.setText("Domicilio");

        jLabel7.setText("Localidad");

        jLabel8.setText("Provincias **");

        jLabel9.setText("Estado Civil **");

        jLabel10.setText("Hijos");

        jLabel11.setText("E-mail");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(jLabel3))
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo_pronvincia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input_nombre)
                    .addComponent(input_apellido)
                    .addComponent(input_fechanac)
                    .addComponent(combo_genero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input_cuil)
                    .addComponent(input_domicilio)
                    .addComponent(input_localidad)
                    .addComponent(combo_estadocivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input_hijos)
                    .addComponent(input_email))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_fechanac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combo_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_cuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(input_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_pronvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_estadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_hijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        boton_crear.setText("CREAR");
        boton_crear.setEnabled(false);
        boton_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_crearActionPerformed(evt);
            }
        });

        boton_limpiar.setText("LIMPIAR");
        boton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_limpiarActionPerformed(evt);
            }
        });

        boton_salir.setText("SALIR");
        boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_salirActionPerformed(evt);
            }
        });

        no.setText("** Debe seleccionar una opcion");

        jLabel13.setText("*** El dato ingresado debe estar completo");

        lb_total.setText("0");

        jLabel12.setText("/ 10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lb_total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(boton_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton_crear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_salir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_total)
                            .addComponent(no)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_crearActionPerformed
        this.validamail();
        if (paso == 1){
         JOptionPane.showMessageDialog(null, "Todo en orden");
        } else {
         JOptionPane.showMessageDialog(null, "El correo no esta correctamente escrito");   
        }
    }//GEN-LAST:event_boton_crearActionPerformed

    private void boton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_limpiarActionPerformed
    //limpia todo
    this.input_nombre.setText("");
    this.input_apellido.setText("");
    this.input_fechanac.setText("");
    this.input_cuil.setText("");
    this.input_domicilio.setText("");
    this.input_hijos.setText("");
    this.input_email.setText("");
    this.input_localidad.setText("");
    this.lb_total.setText("0");
    this.total = 0;
    this.combo_genero.setSelectedIndex(0);
    this.combo_pronvincia.setSelectedIndex(0);
    this.combo_estadocivil.setSelectedIndex(0);
   this.combo_genero.setEnabled(true);
    this.combo_pronvincia.setEnabled(true);
    this.combo_estadocivil.setEnabled(true);
    this.input_fechanac.setEnabled(true);
    this.input_cuil.setEnabled(true);
    }//GEN-LAST:event_boton_limpiarActionPerformed

    private void input_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nombreActionPerformed
    
    }//GEN-LAST:event_input_nombreActionPerformed

    private void boton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_salirActionPerformed
    System.exit(0);    // TODO add your handling code here:
    }//GEN-LAST:event_boton_salirActionPerformed

    private void input_cuilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_cuilKeyTyped
     
    int key = evt.getKeyChar();
        boolean numeros = key>=48 && key <=57;
       
        if (!numeros){
         evt.consume();
         
        }            
        if (input_cuil.getText().length()>=11){
       evt.consume();
       jLabel5.setText("Cuil/Cuit");
       v5 = 1;
       input_cuil.setEnabled(false);
       suma();
       } else {
        jLabel5.setText("Cuil/Cuit ***");
        v5 = 0;
        }
    }//GEN-LAST:event_input_cuilKeyTyped

    private void input_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_nombreKeyTyped
    int key = evt.getKeyChar();
        boolean min = key >=97 && key <=122;
        boolean espacio = key ==32;
        boolean may = key >=65 && key <=90;
     
        if (!(min || espacio|| may)){
        evt.consume();
        }

        if (input_nombre.getText().length()>=50){
        evt.consume();
        
        }
        
        
    }//GEN-LAST:event_input_nombreKeyTyped

    private void input_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_apellidoKeyTyped
    int key = evt.getKeyChar();
        boolean min = key >=97 && key <=122;
        boolean espacio = key ==32;
        boolean may = key >=65 && key <=90;
     
        if (!(min || espacio|| may)){
        evt.consume(); 
        }

        if (input_nombre.getText().length()>=50){
        evt.consume();
      
        }
    }//GEN-LAST:event_input_apellidoKeyTyped

    private void input_domicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_domicilioKeyTyped
    int key = evt.getKeyChar();
        boolean numeros = key>=48 && key <=57;
        boolean min = key >=97 && key <=122;
        boolean espacio = key ==32;
        boolean may = key >=65 && key <=90;
     
        if (!(min || espacio|| may|| numeros)){
        evt.consume(); 
        
        }

        if (input_nombre.getText().length()>=50){
        evt.consume();
        }
    }//GEN-LAST:event_input_domicilioKeyTyped

    private void input_localidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_localidadKeyTyped
   int key = evt.getKeyChar();
        boolean min = key >=97 && key <=122;
        boolean espacio = key ==32;
        boolean may = key >=65 && key <=90;
     
        if (!(min || espacio|| may)){
        evt.consume();    
       
        }

        if (input_nombre.getText().length()>=50){
        evt.consume();
        
        }
    }//GEN-LAST:event_input_localidadKeyTyped

    private void combo_pronvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_pronvinciaActionPerformed
    combo_pronvinciaS = this.combo_pronvincia.getSelectedIndex();
    if (combo_pronvinciaS == 0){
        jLabel8.setText("Provincias **");
        v8 = 0;
    }else {
      jLabel8.setText("Provincias"); 
      v8 = 1;
      combo_pronvincia.setEnabled(false);
      suma();
    }
    }//GEN-LAST:event_combo_pronvinciaActionPerformed

    private void combo_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_generoActionPerformed
   combo_generoS = this.combo_genero.getSelectedIndex();
    if (combo_generoS == 0){
        jLabel4.setText("Genero **");
        v4 = 0;
    }else {
      jLabel4.setText("Genero");  
      v4 = 1;
      combo_genero.setEnabled(false);
      suma();
    }
    }//GEN-LAST:event_combo_generoActionPerformed

    private void combo_estadocivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_estadocivilActionPerformed
    combo_estadoS = this.combo_estadocivil.getSelectedIndex();  
     if (combo_estadoS == 0){
        jLabel9.setText("Estado Civil **");
        v9 = 0;
    }else {
      jLabel9.setText("Estado Civil");  
      v9 = 1;
      combo_estadocivil.setEnabled(false);
      suma();
    }
    }//GEN-LAST:event_combo_estadocivilActionPerformed

    private void input_hijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_hijosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_hijosActionPerformed

    private void input_hijosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_hijosKeyTyped
    int key = evt.getKeyChar();
        boolean numeros = key>=48 && key <=57;
       
        if (!numeros){
         evt.consume();
        
        }            
        if (input_hijos.getText().length()>=2){
       evt.consume();
      
       }   // TODO add your handling code here:
                             
    }//GEN-LAST:event_input_hijosKeyTyped

    private void input_fechanacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_fechanacKeyTyped
    int key = evt.getKeyChar();
        boolean numeros = key>=48 && key <=57;
       
        if (!numeros){
         evt.consume();
       
        }            
        if (input_fechanac.getText().length()>=6){
       evt.consume();
        input_fechanac.setEnabled(false);
       }  
        
        
    }//GEN-LAST:event_input_fechanacKeyTyped

    private void input_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_nombreKeyReleased
     v1 = 1;
     suma();
    }//GEN-LAST:event_input_nombreKeyReleased

    private void input_apellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_apellidoKeyReleased
     v2 = 1;
     suma();
    }//GEN-LAST:event_input_apellidoKeyReleased

    private void input_fechanacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_fechanacKeyReleased
     v3 = 1;
     suma();   // TODO add your handling code here:
    }//GEN-LAST:event_input_fechanacKeyReleased

    private void input_domicilioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_domicilioKeyReleased
     v6 = 1;
     suma();   // TODO add your handling code here:
    }//GEN-LAST:event_input_domicilioKeyReleased

    private void input_localidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_localidadKeyReleased
    v7 = 1;
    suma();        // TODO add your handling code here:
    }//GEN-LAST:event_input_localidadKeyReleased

    private void input_hijosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_hijosKeyReleased
    v10 = 1;
    suma();    // TODO add your handling code here:
    }//GEN-LAST:event_input_hijosKeyReleased

    private void input_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_emailKeyReleased
       // TODO add your handling code here:
    }//GEN-LAST:event_input_emailKeyReleased
    
    public void suma(){
        
        
        total = v1+v2+v3+v4+v5+v6+v7+v8+v9+v10;
        this.lb_total.setText(""+total);
        if (total == 10){
            this.boton_crear.setEnabled(true);
        }
       
    }
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
            java.util.logging.Logger.getLogger(validador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(validador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(validador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(validador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new validador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_crear;
    private javax.swing.JButton boton_limpiar;
    private javax.swing.JButton boton_salir;
    private javax.swing.JComboBox<String> combo_estadocivil;
    private javax.swing.JComboBox<String> combo_genero;
    private javax.swing.JComboBox<String> combo_pronvincia;
    private javax.swing.JTextField input_apellido;
    private javax.swing.JTextField input_cuil;
    private javax.swing.JTextField input_domicilio;
    private javax.swing.JTextField input_email;
    private javax.swing.JTextField input_fechanac;
    private javax.swing.JTextField input_hijos;
    private javax.swing.JTextField input_localidad;
    private javax.swing.JTextField input_nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_total;
    private javax.swing.JLabel no;
    // End of variables declaration//GEN-END:variables
}
