
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;


public class altacliente extends javax.swing.JInternalFrame {

    String sesion_idv1;
    String sesion_nivelv1;
    String loc_selected;
    String idl;
    String itempl;
    String loc;
    String codigolocalidad;
   
    public altacliente(sesionainternal sesionainternal) {
        initComponents();
        Date myDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String v_fechaComoCadena = sdf.format(new Date());
        this.input_fecha.setText(v_fechaComoCadena);
        sesion_idv1 = sesionainternal.getCodigoLnI();
        sesion_nivelv1 = sesionainternal.getNivelLnI();
        this.input_operador.setText(sesion_idv1);
        cargaProvincias();
    }

    String combo_pronvinciaS;
    int combo_pronvinciaSI;
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
    
    //variables para grabar datos ingresados
        String va1;// v_id_operador;
        String va2;// v_fecha;
        String va3;// v_cuit;
        String va4;// v_genero;
        String va5;// v_nombre;
        String va6;// v_apellidc;
        String va7;// v_nacimiento;
        String va8;// v_domicilio;
        String va9;// v_localidad;
        String va10;// v_provincias;
        String va11;// v_estadocivil;
        String va12;// v_email;
        String va13;// v_canthijos;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_cerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        input_operador = new javax.swing.JTextField();
        input_fecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        input_cuit = new javax.swing.JTextField();
        combo_genero = new javax.swing.JComboBox<>();
        input_nombre = new javax.swing.JTextField();
        input_apellido = new javax.swing.JTextField();
        input_nac = new javax.swing.JTextField();
        input_domicilio = new javax.swing.JTextField();
        combo_provincias = new javax.swing.JComboBox<>();
        input_correo = new javax.swing.JTextField();
        combo_estcivil = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        input_hijos = new javax.swing.JTextField();
        lb_total = new javax.swing.JLabel();
        combo_localidades = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        b_limpiar = new javax.swing.JButton();
        boton_crear = new javax.swing.JButton();

        setTitle("Alta Cliente");

        b_cerrar.setText("Cancelar");
        b_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cerrarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Operador"));

        input_operador.setEnabled(false);
        input_operador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_operadorActionPerformed(evt);
            }
        });

        input_fecha.setEnabled(false);

        jLabel1.setText("Id operador");

        jLabel2.setText("Fecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_operador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(input_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_operador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(input_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de cliente"));

        input_cuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_cuitActionPerformed(evt);
            }
        });
        input_cuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_cuitKeyTyped(evt);
            }
        });

        combo_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Hombre", "Mujer", "No binario" }));
        combo_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_generoActionPerformed(evt);
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

        input_nac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input_nacKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_nacKeyTyped(evt);
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

        combo_provincias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_provinciasActionPerformed(evt);
            }
        });

        input_correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input_correoKeyReleased(evt);
            }
        });

        combo_estcivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Soltero", "Casado", "Viudo", "Divorciado" }));
        combo_estcivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_estcivilActionPerformed(evt);
            }
        });

        jLabel3.setText("Cuit / Cuil");

        jLabel4.setText("Genero");

        jLabel5.setText("Nombre");

        jLabel6.setText("Apellido");

        jLabel7.setText("Fecha nacimiento");

        jLabel8.setText("Domicilio");

        jLabel9.setText("Localidad");

        jLabel11.setText("Provincias");

        jLabel12.setText("Estado Civil");

        jLabel13.setText("Hijos");

        input_hijos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input_hijosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_hijosKeyTyped(evt);
            }
        });

        combo_localidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_localidadesActionPerformed(evt);
            }
        });

        jLabel10.setText("Correo electrónico");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(49, 49, 49)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(input_nombre)
                                    .addComponent(input_nac)
                                    .addComponent(input_cuit)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(input_domicilio))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                        .addComponent(combo_provincias, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(27, 27, 27)
                                .addComponent(combo_localidades, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_total, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(52, 52, 52)
                                        .addComponent(input_hijos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(input_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combo_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(combo_estcivil, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(10, 10, 10))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(input_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(input_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(input_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(input_nac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_estcivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_hijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(input_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(input_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_provincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(combo_localidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );

        b_limpiar.setText("Reset");
        b_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_limpiarActionPerformed(evt);
            }
        });

        boton_crear.setText("Grabar cliente");
        boton_crear.setEnabled(false);
        boton_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_crearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b_limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_crear)
                    .addComponent(b_limpiar)
                    .addComponent(b_cerrar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_operadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_operadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_operadorActionPerformed

    private void b_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cerrarActionPerformed
    this.setVisible(false);
    }//GEN-LAST:event_b_cerrarActionPerformed

    private void input_cuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_cuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_cuitActionPerformed

    private void b_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_limpiarActionPerformed
        resetform();
    }//GEN-LAST:event_b_limpiarActionPerformed

    private void boton_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_crearActionPerformed
       this.validamail();
        if (paso == 1){
        //JOptionPane.showMessageDialog(null, "Todo en orden");
        this.grabalinea();
        
        } else {
         JOptionPane.showMessageDialog(null, "El correo no esta correctamente escrito");   
        }
    }//GEN-LAST:event_boton_crearActionPerformed

    private void input_cuitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_cuitKeyTyped
       int key = evt.getKeyChar();
        boolean numeros = key>=48 && key <=57;
       
        if (!numeros){
         evt.consume();
         
        }            
        if (input_cuit.getText().length()>=11){
        evt.consume();
        v5 = 1;
        input_cuit.setEnabled(false);
        suma();
        } else {
        v5 = 0;
        }
    }//GEN-LAST:event_input_cuitKeyTyped

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

        if (input_apellido.getText().length()>=50){
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

        if (input_domicilio.getText().length()>=50){
        evt.consume();
        }
    }//GEN-LAST:event_input_domicilioKeyTyped

    private void combo_provinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_provinciasActionPerformed
      //combo_pronvinciaS = (String) this.combo_provincias.getSelectedItem();
      //tommamos dos valores para hacer la validacion
      combo_pronvinciaSI = this.combo_provincias.getSelectedIndex();
     
      System.out.println(combo_pronvinciaSI);
      System.out.println(combo_pronvinciaS);
        if (combo_pronvinciaSI == 0){
       
        v8 = 0;
    }else {
       cargalocalidades();
      v8 = 1;
      combo_provincias.setEnabled(false);
      suma();
    }
             
    }//GEN-LAST:event_combo_provinciasActionPerformed

    private void combo_estcivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_estcivilActionPerformed
        combo_estadoS = this.combo_estcivil.getSelectedIndex();  
     if (combo_estadoS == 0){
      
        v9 = 0;
    }else {
     
      v9 = 1;
      combo_estcivil.setEnabled(false);
      suma();
    }
    }//GEN-LAST:event_combo_estcivilActionPerformed

    private void input_hijosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_hijosKeyTyped
    int key = evt.getKeyChar();
        boolean numeros = key>=48 && key <=57;
       
        if (!numeros){
         evt.consume();
        
        }            
        if (input_hijos.getText().length()>=2){
       evt.consume();
      
       }   
    }//GEN-LAST:event_input_hijosKeyTyped

    private void input_nacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_nacKeyTyped
       int key = evt.getKeyChar();
        boolean numeros = key>=48 && key <=57;
       
        if (!numeros){
         evt.consume();
       
        }            
        if (input_nac.getText().length()>=6){
       evt.consume();
        input_nac.setEnabled(false);
       }  
    }//GEN-LAST:event_input_nacKeyTyped

    private void input_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_nombreKeyReleased
     v1 = 1;
     suma();
    }//GEN-LAST:event_input_nombreKeyReleased

    private void input_apellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_apellidoKeyReleased
     v2 = 1;
     suma();
    }//GEN-LAST:event_input_apellidoKeyReleased

    private void input_nacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_nacKeyReleased
      v3 = 1;
     suma();  
    }//GEN-LAST:event_input_nacKeyReleased

    private void input_domicilioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_domicilioKeyReleased
    v6 = 1;
     suma();  
    }//GEN-LAST:event_input_domicilioKeyReleased

    private void input_hijosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_hijosKeyReleased
     v10 = 1;
    suma();
    }//GEN-LAST:event_input_hijosKeyReleased

    private void input_correoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_correoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_input_correoKeyReleased

    private void combo_localidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_localidadesActionPerformed
       loc_selected = (String) this.combo_localidades.getSelectedItem();
        // Caracter definido previamente
        char caracterDefinido = '-';

        // Encontrar la posición del caracter definido en la cadena
        int posicionCaracter = loc_selected.indexOf(caracterDefinido);

        // Verificar si el caracter definido está presente en la cadena
        if (posicionCaracter != -1) {
            // Seleccionar la parte de la cadena hasta el caracter definido
            codigolocalidad = loc_selected.substring(0, posicionCaracter);
            
            //JOptionPane.showMessageDialog(null, "Codigo localidad: "+codigolocalidad);
        } else {
            // Imprimir un mensaje si el caracter no está presente en la cadena
            JOptionPane.showMessageDialog(null, "Hubo un error para seleccionar la locadlidad ");
        }
        
        
    }//GEN-LAST:event_combo_localidadesActionPerformed

    private void validamail(){
        mail = this.input_correo.getText();
        
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
    
     public void suma(){
        
        
        total = v1+v2+v3+v4+v5+v6+v7+v8+v9+v10;
        this.lb_total.setText(""+total);
        if (total == 9){
            this.boton_crear.setEnabled(true);
        }
       
    }
    private void resetform() {                                              
    //limpia todo
    this.input_nombre.setText("");
    this.input_apellido.setText("");
    this.input_nac.setText("");
    this.input_cuit.setText("");
    this.input_domicilio.setText("");
    this.input_hijos.setText("");
    this.input_correo.setText("");
    this.combo_localidades.setSelectedIndex(0);
    this.lb_total.setText("0");
    this.total = 0;
    this.combo_genero.setSelectedIndex(0);
    this.combo_provincias.setSelectedIndex(0);
    this.combo_estcivil.setSelectedIndex(0);
   this.combo_genero.setEnabled(true);
    this.combo_provincias.setEnabled(true);
    this.combo_estcivil.setEnabled(true);
    this.input_nac.setEnabled(true);
    this.input_cuit.setEnabled(true);
    }                                           
    
    public void grabalinea(){
        //creamos las variables que retomaremos despues
        va1 = this.input_operador.getText();// v_id_operador;
        va2 = this.input_fecha.getText();// v_fecha;
        va3 = this.input_cuit.getText();// v_cuit;
        va4 = (String) this.combo_genero.getSelectedItem();
        va5 = this.input_nombre.getText();// v_nombre;
        va6 = this.input_apellido.getText();// v_apellidc;
        va7 = this.input_nac.getText();// v_nacimiento;
        va8 = this.input_domicilio.getText();// v_domicilio;
        va9 = codigolocalidad;
        va10 = String.valueOf(combo_pronvinciaSI);
        va11 = (String) this.combo_estcivil.getSelectedItem();// v_estadocivil;
        va12 = this.input_correo.getText();// v_email;
        va13 = this.input_hijos.getText();// v_canthijos;
        
        //comprobamos si esta el archivo, sino, lo crea
        //archivo_altacliente.archivo_crear(this);

        //aca generamos una variable con todos los valores
        String linea = (""+va1+","+va2+","+va3+","+va4+","+va5+","+va6+","+va7+","+va8+
                ","+va9+","+va10+","+va11+","+va12+","+va13);
        
        //grabamos la linea
        //archivo_altacliente.archivo_escribir(""+linea); 
        
        //grabamos la linea en la base
        try{
           // conectar a la base de datos
           Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "");
           if (conexion!=null){
              JOptionPane.showMessageDialog(null, "Conectado a DB. Los datos se grabaran a continuacion.");   
            }
          
    // Enviando la sentencia sql
           PreparedStatement sq = (PreparedStatement) conexion.prepareStatement("insert into clientes values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
           //Especifico los campos
           sq.setString(1, "0");
           sq.setString(2, va1);
           sq.setString(3, va2);
           sq.setString(4, va3);
           sq.setString(5, va4);
           sq.setString(6, va5);
           sq.setString(7, va6);
           sq.setString(8, va7);
           sq.setString(9, va8);
           sq.setString(10, va9);
           sq.setString(11, va10);
           sq.setString(12, va11);
           sq.setString(13, va12);
           sq.setString(14, va13);
           //Todo lo pedido que lo ejecute y cierre la base
           sq.executeUpdate();
           
       }catch(SQLException e){
       
       }
        
        //***************************************************************
        this.setVisible(false);
    }
    
    private void cargaProvincias(){
        //devinimos un array. la longitud la da la cantidad de columnas
        String [] datos = new String[2];
       
        try{
         // conectar a la base de datos
           java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "");
            
            // Enviando la sentencia sql
           java.sql.PreparedStatement sq = conexion.prepareStatement("select * from provincias order by id ASC");
           
           // Ejecutar la consulta y obtener el conjunto de resultados
           ResultSet rs = sq.executeQuery();

            // Procesar los resultados
            while (rs.next()) {
                
                String id = rs.getString("id");
                String prov = rs.getString("provincia");
                String itemp = id  + "" + prov;
                combo_provincias.addItem(prov);    
            }  
         }catch(SQLException e){
       
       }
    }
    
    private void cargalocalidades(){
        //devinimos un array. la longitud la da la cantidad de columnas
        String [] datos = new String[2];
       
        try{
         // conectar a la base de datos
           java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "");
            
// Enviando la sentencia sql
           java.sql.PreparedStatement sq = conexion.prepareStatement("select * from localidades where id_privincia = "+combo_pronvinciaSI);
           
           // Ejecutar la consulta y obtener el conjunto de resultados
           ResultSet rs = sq.executeQuery();

            // Procesar los resultados
            while (rs.next()) {
                idl = String.valueOf(rs.getString("id"));
                loc = rs.getString("localidad");
                itempl = ""+idl+ "-" +loc;
                combo_localidades.addItem(itempl);    
            }  
         }catch(SQLException e){
       
       }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cerrar;
    private javax.swing.JButton b_limpiar;
    private javax.swing.JButton boton_crear;
    private javax.swing.JComboBox<String> combo_estcivil;
    private javax.swing.JComboBox<String> combo_genero;
    private javax.swing.JComboBox<String> combo_localidades;
    private javax.swing.JComboBox<String> combo_provincias;
    private javax.swing.JTextField input_apellido;
    private javax.swing.JTextField input_correo;
    private javax.swing.JTextField input_cuit;
    private javax.swing.JTextField input_domicilio;
    private javax.swing.JTextField input_fecha;
    private javax.swing.JTextField input_hijos;
    private javax.swing.JTextField input_nac;
    private javax.swing.JTextField input_nombre;
    private javax.swing.JTextField input_operador;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_total;
    // End of variables declaration//GEN-END:variables
}
