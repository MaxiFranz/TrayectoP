
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class cambiomoneda extends javax.swing.JInternalFrame {
    
    String operacion = "1";
    String sesion_id;
    String cuit_ingresado;
    
    String va1;
    String va2;
    String va3;
    String va4;
    String detalle;
        
    int combo_monedaS = 0;
    String monedaCambio = "";
    
    boolean contieneU = false;
    
    public cambiomoneda(sesionainternal sesionainternal) {
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

        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        b_cerrar = new javax.swing.JButton();
        b_reiniciainput = new javax.swing.JButton();
        b_buscarcliente = new javax.swing.JButton();
        input_cuit = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        input_operador = new javax.swing.JTextField();
        input_fecha = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        input_pesos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        combo_monedas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        input_cotizacion = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        input_loquedamos = new javax.swing.JTextField();
        b_calcularrr = new javax.swing.JButton();
        b_confirma = new javax.swing.JButton();
        b_recalcula = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setTitle("Cambio Moneda");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Cliente"));

        b_cerrar.setText("Cancelar");
        b_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cerrarActionPerformed(evt);
            }
        });

        b_reiniciainput.setText("Reset");
        b_reiniciainput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_reiniciainputActionPerformed(evt);
            }
        });

        b_buscarcliente.setText("Buscar Cliente");
        b_buscarcliente.setEnabled(false);
        b_buscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarclienteActionPerformed(evt);
            }
        });

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

        jLabel1.setText("Ingrese Cuit");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b_buscarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(b_reiniciainput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(input_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_reiniciainput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_buscarcliente)
                    .addComponent(b_cerrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Operador"));

        jLabel2.setText("Id Operador");

        input_operador.setEnabled(false);
        input_operador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_operadorActionPerformed(evt);
            }
        });

        input_fecha.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_operador, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(input_fecha, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(input_operador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(input_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos para transaccion"));
        jPanel1.setToolTipText("");

        input_pesos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_pesosKeyTyped(evt);
            }
        });

        jLabel3.setText("Ingrese monto $");

        jLabel4.setText("Seleccione Moneda");

        combo_monedas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Dolares", "Euros" }));
        combo_monedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_monedasActionPerformed(evt);
            }
        });

        jLabel5.setText("Cotizacion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_cotizacion)
                    .addComponent(input_pesos)
                    .addComponent(combo_monedas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_pesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_monedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_cotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Verificar valores"));

        jLabel6.setText("El banco entrega");

        input_loquedamos.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(input_loquedamos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_loquedamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        b_calcularrr.setText("Calcular");
        b_calcularrr.setEnabled(false);
        b_calcularrr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_calcularrrActionPerformed(evt);
            }
        });

        b_confirma.setText("Confirma");
        b_confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_confirmaActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_calcularrr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b_confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_recalcula)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(b_calcularrr, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_confirma)
                            .addComponent(b_recalcula)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_buscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarclienteActionPerformed
        cuit_ingresado = this.input_cuit.getText();
        this.validacuit();
    }//GEN-LAST:event_b_buscarclienteActionPerformed

    private void b_reiniciainputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_reiniciainputActionPerformed
        this.input_cuit.setText("");
        this.input_cuit.setEnabled(true);
        this.b_buscarcliente.setEnabled(false);
    }//GEN-LAST:event_b_reiniciainputActionPerformed

    private void input_cuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_cuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_cuitActionPerformed

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

    private void input_operadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_operadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_operadorActionPerformed

    private void b_confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_confirmaActionPerformed
        va1 = this.input_operador.getText();// v_id_operador;
        va2 = this.input_fecha.getText();// v_fecha;
        va3 = this.input_cuit.getText();//cuit
        va4 = operacion;
        //hasta aca las lineas para grabar en general todas las operaciones
        detalle = "El cliente entrega: " + this.input_pesos.getText()+ 
                         " - Moneda a entregar: " + this.combo_monedas.getSelectedItem()+
                         " - Cotizacion: "  + this.input_cotizacion.getText()+
                         " - Total a entregar: "+ this.input_loquedamos.getText();
        
        //comprobamos si esta el archivo, sino, lo crea
        archivo_cambiomoneda.archivo_crear(this);

        //aca generamos una variable con todos los valores
        String linea = (""+va1+","+va2+","+va3+","+va4+","+detalle);
        
        //grabamos la linea
        archivo_cambiomoneda.archivo_escribir(""+linea);
        
        //********************************************************************
        //grabamos la linea en la base
        try{
           // conectar a la base de datos
           Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "");
           if (conexion!=null){
              JOptionPane.showMessageDialog(null, "Conectado a DB");   
            }
          
        // Enviando la sentencia sql
           PreparedStatement sq = (PreparedStatement) conexion.prepareStatement("insert into operaciones values(?,?,?,?,?,?)");
           //Especifico los campos
           sq.setString(1, "0");
           sq.setString(2, va1);
           sq.setString(3, va2);
           sq.setString(4, va3);
           sq.setString(5, va4);
           sq.setString(6, detalle);
           //Todo lo pedido que lo ejecute y cierre la base
           sq.executeUpdate();
           
       }catch(SQLException e){
       
       }
        
        //********************************************************************
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_b_confirmaActionPerformed

    private void input_pesosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_pesosKeyTyped
    int key = evt.getKeyChar();
        boolean numeros = key>=48 && key <=57;
       
        if (!numeros){
         evt.consume();
         
        }            
        if (input_pesos.getText().length()>=7){
        evt.consume();
        
        input_pesos.setEnabled(false);
       
        } else {
        
        }
    }//GEN-LAST:event_input_pesosKeyTyped

    private void combo_monedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_monedasActionPerformed
     combo_monedaS = this.combo_monedas.getSelectedIndex();
     monedaCambio = (String) this.combo_monedas.getSelectedItem();
     
    if (combo_monedaS == 0){
     this.input_cotizacion.setText("");   
    this.b_calcularrr.setEnabled(false);   
    }else if (combo_monedaS == 1) { 
     //buscamos el valor   
        try {
           FileReader archivo = new FileReader(".\\src\\dbs\\cotizaciones.txt");
           BufferedReader leer = new BufferedReader(archivo);
       
           String linea = leer.readLine();
           String lineaS =linea.substring(0,3);
           this.input_cotizacion.setText(lineaS);
       } catch (IOException ex) {
             Logger.getLogger(cambiomoneda.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    this.b_calcularrr.setEnabled(true);    
    } else {
     //buscamos el valor   
        try {
           FileReader archivo = new FileReader(".\\src\\dbs\\cotizaciones.txt");
           BufferedReader leer = new BufferedReader(archivo);
       
           String linea = leer.readLine();
           String lineaS =linea.substring(3,6);
           this.input_cotizacion.setText(lineaS);
       } catch (IOException ex) {
             Logger.getLogger(cambiomoneda.class.getName()).log(Level.SEVERE, null, ex);
        }
     this.b_calcularrr.setEnabled(true);     
    }//GEN-LAST:event_combo_monedasActionPerformed
} 
    private void b_calcularrrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_calcularrrActionPerformed
    
        int entregapesos = Integer.parseInt(this.input_pesos.getText());
        int cotizacion = Integer.parseInt(this.input_cotizacion.getText());
        double apagar = entregapesos / cotizacion; 
        String apagarS = Double.toString(apagar); 
        this.input_loquedamos.setText(apagarS);
            
    }//GEN-LAST:event_b_calcularrrActionPerformed

    private void b_recalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_recalculaActionPerformed
    input_pesos.setText("");
    input_pesos.setEnabled(true);
    input_cotizacion.setText("");
    input_loquedamos.setText("");
    combo_monedas.setSelectedIndex(0);
    }//GEN-LAST:event_b_recalculaActionPerformed


    private void validacuit(){
    
        Scanner entrada = null;
        String linea;
        
        Scanner sc = new Scanner(System.in);
        //inicializamos el numero de linea
        int numeroDeLinea = 1;
        buscaensql();
        
    } 

    private void buscaensql(){
   
        try{
         // conectar a la base de datos
           java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "");
            
            // Enviando la sentencia sql
           java.sql.PreparedStatement sq = conexion.prepareStatement("SELECT cuil FROM clientes WHERE cuil = ?");
           //Especifico los campos 
           sq.setString(1, input_cuit.getText().trim());
           ResultSet rs = sq.executeQuery();
           
           if (rs.next()){
                JOptionPane.showMessageDialog(null, "El cuit ingresado es cliente");
           }else {
               JOptionPane.showMessageDialog(null, "El cuit ingresado no es cliente");
           }
         }catch(SQLException e){
       
       }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_buscarcliente;
    private javax.swing.JButton b_calcularrr;
    private javax.swing.JButton b_cerrar;
    private javax.swing.JButton b_confirma;
    private javax.swing.JButton b_recalcula;
    private javax.swing.JButton b_reiniciainput;
    private javax.swing.JComboBox<String> combo_monedas;
    private javax.swing.JTextField input_cotizacion;
    private javax.swing.JTextField input_cuit;
    private javax.swing.JTextField input_fecha;
    private javax.swing.JTextField input_loquedamos;
    private javax.swing.JTextField input_operador;
    private javax.swing.JTextField input_pesos;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    private Object readLines(FileReader archivo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
