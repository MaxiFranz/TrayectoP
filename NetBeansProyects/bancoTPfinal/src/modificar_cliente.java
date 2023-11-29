
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class modificar_cliente extends javax.swing.JInternalFrame {

    int id_cliente;
    //validacion de email**********************************************
    boolean arroba = false;
    boolean punto = false;
    
    String mail;
    //variables para validacion final
    int paso = 0;
    public modificar_cliente() {
        initComponents();
    }
    
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
        String va10;// v_localidad;
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_cerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        buscar_cuil = new javax.swing.JTextField();
        bt_buscar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        input_cuil = new javax.swing.JTextField();
        input_genero = new javax.swing.JTextField();
        input_apellido = new javax.swing.JTextField();
        input_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        input_fechanac = new javax.swing.JTextField();
        input_estadocivil = new javax.swing.JTextField();
        input_cant_hijos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        input_domicilio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        input_provincia = new javax.swing.JTextField();
        input_correo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        input_localidad = new javax.swing.JTextField();
        bt_update = new javax.swing.JButton();
        bt_borrarregistro = new javax.swing.JButton();
        input_id = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        bt_cerrar.setText("Cancelar");
        bt_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cerrarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        buscar_cuil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscar_cuilKeyTyped(evt);
            }
        });

        bt_buscar.setText("Buscar");
        bt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese nro de Cuit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscar_cuil, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar_cuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_buscar)
                    .addComponent(jLabel1))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        input_cuil.setEnabled(false);

        jLabel2.setText("Apellido");

        jLabel3.setText("Nombre");

        jLabel4.setText("Cuil");

        jLabel5.setText("Genero");

        jLabel6.setText("Fecha Nacimiento");

        jLabel10.setText("Estado Civil");

        jLabel12.setText("Hijos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(input_fechanac, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(input_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(input_cuil, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(input_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addComponent(input_genero))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(input_estadocivil, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(input_cant_hijos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)))))
                .addGap(13, 13, 13))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(input_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(input_fechanac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_estadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(input_cuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(input_cant_hijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Otros datos"));

        jLabel7.setText("Domicilio");

        jLabel9.setText("Provincia");

        jLabel11.setText("Email");

        jLabel8.setText("Localidad");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(input_domicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(input_provincia))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(input_localidad, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(input_correo))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(input_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(input_localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(input_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_update.setText("Guardar Cambios");
        bt_update.setEnabled(false);
        bt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_updateActionPerformed(evt);
            }
        });

        bt_borrarregistro.setText("Borrar Registro");
        bt_borrarregistro.setEnabled(false);
        bt_borrarregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_borrarregistroActionPerformed(evt);
            }
        });

        input_id.setEnabled(false);

        jLabel13.setText("Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_borrarregistro))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_cerrar))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_borrarregistro, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addComponent(bt_update, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cerrarActionPerformed
    this.setVisible(false);
    }//GEN-LAST:event_bt_cerrarActionPerformed

    private void buscar_cuilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_cuilKeyTyped
    int key = evt.getKeyChar();
        boolean numeros = key>=48 && key <=57;
       
        if (!numeros){
         evt.consume();
         
        }            
        if (buscar_cuil.getText().length()>=11){
        evt.consume();
        buscar_cuil.setEnabled(false);
        
        } else {
       
        }
    }//GEN-LAST:event_buscar_cuilKeyTyped

    private void bt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarActionPerformed
   //devinimos un array. la longitud la da la cantidad de columnas
        String [] datos = new String[14];
       
        try{
         // conectar a la base de datos
           Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "");
            
            // Enviando la sentencia sql
           PreparedStatement sq = conexion.prepareStatement("select * from clientes WHERE cuil = ?");
           //Especifico los campos 
           sq.setString(1, buscar_cuil.getText());
           // Ejecutar la consulta y obtener el conjunto de resultados
           ResultSet rs = sq.executeQuery();
           
           
           if (rs.next()){
               JOptionPane.showMessageDialog(null, "El cliente  esta en la base");
                bt_borrarregistro.setEnabled(true);
                bt_update.setEnabled(true);
                input_id.setText(rs.getString("id"));
                id_cliente = Integer.parseInt(rs.getString(("id").trim()));
                input_cuil.setText(rs.getString("cuil"));
                input_genero.setText(rs.getString("genero"));
                input_nombre.setText(rs.getString("nombre"));
                input_apellido.setText(rs.getString("apellido"));
                input_fechanac.setText(rs.getString("fecha_nacimiento"));
                input_estadocivil.setText(rs.getString("estado_civil"));
                input_cant_hijos.setText(rs.getString("cant_hijos"));
                input_domicilio.setText(rs.getString("domicilio"));
                input_localidad.setText(rs.getString("localidad"));
                input_provincia.setText(rs.getString("Provincia"));
                input_correo.setText(rs.getString("email"));   
              }else {
                JOptionPane.showMessageDialog(null, "El cliente no esta en la base");
            }  
         }catch(SQLException e){
       
       }
       
    }//GEN-LAST:event_bt_buscarActionPerformed

    private void bt_borrarregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_borrarregistroActionPerformed
     try{
           // conectar a la base de datos
           Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "");
           Statement consulta = (Statement) conexion.createStatement();
           consulta.executeUpdate("delete from clientes WHERE id ='" +id_cliente +"'" );
           
            JOptionPane.showMessageDialog(null, "El registro se borro con exito");
            this.setVisible(false);
       }catch(SQLException e){
       
       }
    }//GEN-LAST:event_bt_borrarregistroActionPerformed

    private void bt_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_updateActionPerformed
    this.validamail();
        if (paso == 1){
        JOptionPane.showMessageDialog(null, "Todo en orden");
        this.grabalinea();
        
        } else {
         JOptionPane.showMessageDialog(null, "El correo no esta correctamente escrito");   
        }
    }//GEN-LAST:event_bt_updateActionPerformed

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

    public void grabalinea(){
        
        //creamos las variables que retomaremos despues
        va1 = this.input_nombre.getText();// v_id_operador;
        va2 = this.input_apellido.getText();// v_fecha;
        va3 = this.input_genero.getText();// v_cuit;
        va4 = this.input_estadocivil.getText();
        va5 = this.input_cant_hijos.getText();// v_nombre;
        va6 = this.input_domicilio.getText();// v_apellidc;
        va7 = this.input_localidad.getText();// v_nacimiento;
        va8 = this.input_provincia.getText();// v_domicilio;
        va9 = this.input_correo.getText();// v_localidad;
        va10 = this.input_fechanac.getText();// v_localidad;
        
        //grabamos la linea en la base
        try{
           // conectar a la base de datos
           com.mysql.jdbc.Connection conexion = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "");
           if (conexion!=null){
              JOptionPane.showMessageDialog(null, "Conectado a DB ID cliente:" +id_cliente);   
            }
           
           com.mysql.jdbc.PreparedStatement sq = (com.mysql.jdbc.PreparedStatement) 
           //conexion.prepareStatement("update clientes set nombre = '" +va1+ "', apellido = '" +va2+ "' WHERE id ='" +id_cliente+"'");  
           conexion.prepareStatement("update clientes set genero = '"+va3+"', nombre = '"+va1+"', apellido = '"+va2+"', domicilio = '"+va6+"', localidad = '"+va7+"', provincia = '"+va8+"', estado_civil = '"+va4+"', email = '"+va9+"', cant_hijos = '"+va5+"', fecha_nacimiento =  '"+va10+"' WHERE id ='" +id_cliente+"' ");
           //Todo lo pedido que lo ejecute y cierre la base
           sq.executeUpdate();
           JOptionPane.showMessageDialog(null, "Registro modificado con exito!");   
       }catch(SQLException e){
       
       }
        
        //***************************************************************
        this.setVisible(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_borrarregistro;
    private javax.swing.JToggleButton bt_buscar;
    private javax.swing.JButton bt_cerrar;
    private javax.swing.JButton bt_update;
    private javax.swing.JTextField buscar_cuil;
    private javax.swing.JTextField input_apellido;
    private javax.swing.JTextField input_cant_hijos;
    private javax.swing.JTextField input_correo;
    private javax.swing.JTextField input_cuil;
    private javax.swing.JTextField input_domicilio;
    private javax.swing.JTextField input_estadocivil;
    private javax.swing.JTextField input_fechanac;
    private javax.swing.JTextField input_genero;
    private javax.swing.JTextField input_id;
    private javax.swing.JTextField input_localidad;
    private javax.swing.JTextField input_nombre;
    private javax.swing.JTextField input_provincia;
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
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
