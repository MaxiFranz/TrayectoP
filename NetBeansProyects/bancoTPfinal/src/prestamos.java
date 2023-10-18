
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

public class prestamos extends javax.swing.JInternalFrame {

    String sesion_id;
    String cuit_ingresado;
    boolean contieneU = false;
    int capital;
    int meses;
    int interes_tasa;
    int interes_pesos;
    int adevolver;
    
    String operacion = "Solicitud de prestamo";
    
    public prestamos(sesionainternal sesionainternal) {
        initComponents();
        sesion_id = sesionainternal.getCodigoLnI();
        this.input_operador.setText(sesion_id);
        Date myDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String v_fechaComoCadena = sdf.format(new Date());
        this.input_fecha.setText(v_fechaComoCadena);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        input_operador = new javax.swing.JTextField();
        input_fecha = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        input_cuit = new javax.swing.JTextField();
        b_reiniciainput = new javax.swing.JButton();
        b_cerrar = new javax.swing.JButton();
        b_buscarcliente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        input_capital = new javax.swing.JTextField();
        input_tiempo = new javax.swing.JTextField();
        input_interes = new javax.swing.JTextField();
        b_valida = new javax.swing.JButton();
        b_calcular = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        input_interesapagar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        input_totadevolver = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        input_valorcuota = new javax.swing.JTextField();
        b_confirmaygraba = new javax.swing.JButton();
        b_recalcula = new javax.swing.JButton();

        setTitle("Prestamos");

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Operador"));

        jLabel1.setText("Id Operador");

        input_operador.setEnabled(false);
        input_operador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_operadorActionPerformed(evt);
            }
        });

        input_fecha.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(input_fecha)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(input_operador, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(input_operador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(input_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Cliente"));

        jLabel2.setText("Ingrese Cuit");

        input_cuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_cuitKeyTyped(evt);
            }
        });

        b_reiniciainput.setText("Reset");
        b_reiniciainput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_reiniciainputActionPerformed(evt);
            }
        });

        b_cerrar.setText("Cancelar");
        b_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cerrarActionPerformed(evt);
            }
        });

        b_buscarcliente.setText("Buscar Cliente");
        b_buscarcliente.setEnabled(false);
        b_buscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarclienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b_buscarcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(b_reiniciainput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(input_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_reiniciainput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_buscarcliente)
                    .addComponent(b_cerrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos para Transaccion"));

        jLabel3.setText("Capital");

        jLabel4.setText("Tiempo");

        jLabel5.setText("Interes");

        input_capital.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input_capitalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_capitalKeyTyped(evt);
            }
        });

        input_tiempo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input_tiempoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_tiempoKeyTyped(evt);
            }
        });

        input_interes.setEnabled(false);

        b_valida.setText("Validar");
        b_valida.setEnabled(false);
        b_valida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_validaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_valida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input_capital, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(input_tiempo)
                    .addComponent(input_interes))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(input_capital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(input_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(b_valida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        b_calcular.setText("Calcular");
        b_calcular.setEnabled(false);
        b_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_calcularActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Verificar Valores"));

        jLabel6.setText("Interes");

        input_interesapagar.setEnabled(false);
        input_interesapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_interesapagarActionPerformed(evt);
            }
        });

        jLabel7.setText("Monto");

        input_totadevolver.setEnabled(false);

        jLabel8.setText("Cuota");

        input_valorcuota.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(input_interesapagar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_totadevolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_valorcuota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(input_interesapagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(input_totadevolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(input_valorcuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        b_confirmaygraba.setText("Confirma");
        b_confirmaygraba.setEnabled(false);
        b_confirmaygraba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_confirmaygrabaActionPerformed(evt);
            }
        });

        b_recalcula.setText("Recalcula");
        b_recalcula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_recalculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b_confirmaygraba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b_recalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b_calcular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(b_calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_confirmaygraba)
                            .addComponent(b_recalcula)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_operadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_operadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_operadorActionPerformed

    private void b_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cerrarActionPerformed
    this.setVisible(false);
    }//GEN-LAST:event_b_cerrarActionPerformed

    private void input_cuitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_cuitKeyTyped
      int key = evt.getKeyChar();
        boolean numeros = key>=48 && key <=57;
       
        if (!numeros){
         evt.consume();
         
        }            
        if (input_cuit.getText().length()>=11){
        evt.consume();
        this.b_buscarcliente.setEnabled(true);
        input_cuit.setEnabled(false);
        
        } else {
       this.b_buscarcliente.setEnabled(false);
        }
    }//GEN-LAST:event_input_cuitKeyTyped

    private void b_reiniciainputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_reiniciainputActionPerformed
        this.input_cuit.setText("");
        this.input_cuit.setEnabled(true);
        this.b_buscarcliente.setEnabled(false);
    }//GEN-LAST:event_b_reiniciainputActionPerformed

    private void b_buscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarclienteActionPerformed
        cuit_ingresado = this.input_cuit.getText();
        this.validacuit();
    }//GEN-LAST:event_b_buscarclienteActionPerformed

    private void b_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_calcularActionPerformed
    //calculamos el interes en pesos
    interes_pesos = interes_tasa * capital / 100;
    String int_pesos = String.valueOf( interes_pesos);
    input_interesapagar.setText(int_pesos);
    
    //calculamos el total a devolver
    adevolver = capital + interes_pesos;
    String imp_adevolver = String.valueOf( adevolver);
    input_totadevolver.setText(imp_adevolver);
            
    //calculamos el valor cuota
    int calc_valor_cuota = adevolver / meses;
    String valor_cuota = String.valueOf( calc_valor_cuota); 
    input_valorcuota.setText(valor_cuota);
    b_confirmaygraba.setEnabled(true);
    }//GEN-LAST:event_b_calcularActionPerformed

    private void b_recalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_recalculaActionPerformed
    input_tiempo.setEnabled(true);
    b_valida.setEnabled(true);
    input_capital.setEnabled(true); 
    input_tiempo.setText("");
    input_capital.setText("");
    input_interes.setText("");
    b_valida.setEnabled(false);
    input_interesapagar.setText("");
    input_totadevolver.setText("");
    input_valorcuota.setText("");
    b_calcular.setEnabled(false);
    b_confirmaygraba.setEnabled(false);
    }//GEN-LAST:event_b_recalculaActionPerformed

    private void input_capitalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_capitalKeyTyped
    int key = evt.getKeyChar();
        boolean numeros = key>=48 && key <=57;
       
        if (!numeros){
         evt.consume();
         
        }            
        if (input_capital.getText().length()>=11){
        evt.consume();
        
        input_capital.setEnabled(false);
        
        } else {
            
        }
    }//GEN-LAST:event_input_capitalKeyTyped

    private void input_tiempoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_tiempoKeyTyped
    int key = evt.getKeyChar();
        boolean numeros = key>=48 && key <=57;
       
        if (!numeros){
         evt.consume();
         
        }            
        if (input_tiempo.getText().length()>=3){
        evt.consume();
        
        input_tiempo.setEnabled(false);
        
        } else {
       
        }
        
       
    }//GEN-LAST:event_input_tiempoKeyTyped

    private void input_interesapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_interesapagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_interesapagarActionPerformed

    private void input_capitalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_capitalKeyReleased
     
    }//GEN-LAST:event_input_capitalKeyReleased

    private void input_tiempoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_tiempoKeyReleased
    this.b_valida.setEnabled(true);   
    }//GEN-LAST:event_input_tiempoKeyReleased

    private void b_validaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_validaActionPerformed
        //validamos el capital ingresado
        int capitalP = Integer.parseInt(this.input_capital.getText());
        if (capitalP >= 100000001 ){
        JOptionPane.showMessageDialog(null, 
                                 "El importe solicitado supera lo autorizado", "Atencion!", 
                                 HEIGHT);
        input_capital.setText("");
        }else {
capital = Integer.parseInt(this.input_capital.getText());
        input_capital.setEnabled(false);//traba input capital y chequea periodo
        int tiempoP = Integer.parseInt(this.input_tiempo.getText());
        if (tiempoP > 120 ){
        JOptionPane.showMessageDialog(null, 
                                 "El periodo no puede superar los 120 meses", "Atencion!", 
                                 HEIGHT);  
        input_tiempo.setText("");
        } else if  (tiempoP == 0) {
            
        } else {     
        input_tiempo.setEnabled(false);
        b_valida.setEnabled(false);
meses = Integer.parseInt(this.input_tiempo.getText());
        System.out.println(meses);
        b_calcular.setEnabled(true);
        calculatasainteres();
       }
    }
    }//GEN-LAST:event_b_validaActionPerformed

    private void b_confirmaygrabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_confirmaygrabaActionPerformed
        String va1 = this.input_operador.getText();// v_id_operador;
        String va2 = this.input_fecha.getText();// v_fecha;
        String va3 = this.input_cuit.getText();//cuit
        String va4 = operacion;
        String detalle = "Monto a entregar: " + this.input_capital.getText()+ 
                         " - Cantidad de cuotas: " + this.input_tiempo.getText()+
                         " - Tasa de Interes: "  + this.input_interes.getText()+
                         " - Intereses a pagar $: "+ this.input_interesapagar.getText()+
                         " - Valor cuota $: " + this.input_totadevolver.getText()+
                         " - Total a devolver $: "+ this.input_valorcuota.getText();
        //hasta aca las lineas para grabar en general todas las operaciones
        
        //comprobamos si esta el archivo, sino, lo crea
        archivo_prestamos.archivo_crear(this);

        //aca generamos una variable con todos los valores
        String linea = (""+va1+","+va2+","+va3+","+va4+","+detalle);
        
        //grabamos la linea
        archivo_prestamos.archivo_escribir(""+linea);
        this.setVisible(false);
    }//GEN-LAST:event_b_confirmaygrabaActionPerformed
 
private void calculatasainteres(){
if (meses <= 24){
                this.input_interes.setText("80");
interes_tasa = Integer.parseInt(this.input_interes.getText());               
                } else if (meses > 24 && meses <= 48){
                this.input_interes.setText("100");
interes_tasa = Integer.parseInt(this.input_interes.getText());     
                } else if (meses >= 49) {
                this.input_interes.setText("150");   
interes_tasa = Integer.parseInt(this.input_interes.getText());     
                } else {
                this.input_interes.setText("");     
                }
}    


private void validacuit(){
    
        Scanner entrada = null;
        String linea;
        
        Scanner sc = new Scanner(System.in);
        //inicializamos el numero de linea
        int numeroDeLinea = 1;
       
        
       try {
           FileReader archivo = new FileReader(".\\src\\dbs\\clientes.txt");
           BufferedReader leer = new BufferedReader(archivo);
           entrada = new Scanner(archivo);
           
           while (entrada.hasNext()) { //mientras no se llegue al final del fichero
                linea = entrada.nextLine();  //se lee una línea
                //si esta el usuario en la linea que lee...
                if (linea.contains(cuit_ingresado)) {   
                        
                        
                        JOptionPane.showMessageDialog(null, 
                                 "Cliente encontrado", "Atencion!", 
                                 HEIGHT); 
                         
                        contieneU = true; 
                        } 
                        
                       
                    
                    
                }
           
                numeroDeLinea++; //se incrementa el contador de líneas   

               
                if(!contieneU){
                JOptionPane.showMessageDialog(null, 
                                 "El cuit ingresado no pertenece\n "
                                         + "a un cliente del banco", "Atencion!", 
                                 HEIGHT);
                this.input_cuit.setText("");
                contieneU = false; 
                 }
       }catch(FileNotFoundException e){
           System.out.println(e);
       
       }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_buscarcliente;
    private javax.swing.JButton b_calcular;
    private javax.swing.JButton b_cerrar;
    private javax.swing.JButton b_confirmaygraba;
    private javax.swing.JButton b_recalcula;
    private javax.swing.JButton b_reiniciainput;
    private javax.swing.JButton b_valida;
    private javax.swing.JTextField input_capital;
    private javax.swing.JTextField input_cuit;
    private javax.swing.JTextField input_fecha;
    private javax.swing.JTextField input_interes;
    private javax.swing.JTextField input_interesapagar;
    private javax.swing.JTextField input_operador;
    private javax.swing.JTextField input_tiempo;
    private javax.swing.JTextField input_totadevolver;
    private javax.swing.JTextField input_valorcuota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
