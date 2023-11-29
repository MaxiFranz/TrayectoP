
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;




public class crea_usuarios extends javax.swing.JInternalFrame {

 
    public crea_usuarios() {
        initComponents();
        cargacategoriaempleados();
    }

    String dni_ingresado;
    String accesoS;
    int acceso;
    String id;
    String prov;
    String itemp;
    String categoria;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_cerrar = new javax.swing.JButton();
        bt_grabar = new javax.swing.JButton();
        bt_evitarduplicado = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        in_nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        in_dni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        in_clave = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        select_nivel = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setTitle("Crear Usuarios");

        bt_cerrar.setText("Cancelar");
        bt_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cerrarActionPerformed(evt);
            }
        });

        bt_grabar.setText("Grabar");
        bt_grabar.setEnabled(false);
        bt_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_grabarActionPerformed(evt);
            }
        });

        bt_evitarduplicado.setText("Comprobar usuario");
        bt_evitarduplicado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_evitarduplicadoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese datos"));

        in_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_nombreActionPerformed(evt);
            }
        });
        in_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                in_nombreKeyTyped(evt);
            }
        });

        jLabel1.setText("Nombre:");

        in_dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                in_dniKeyTyped(evt);
            }
        });

        jLabel2.setText("CUIL:");

        jLabel3.setText("Clave:");

        select_nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_nivelActionPerformed(evt);
            }
        });

        jLabel4.setText("Acceso:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(in_dni, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(in_nombre)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addGap(9, 9, 9)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(select_nivel, 0, 123, Short.MAX_VALUE)
                            .addComponent(in_clave))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(in_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(in_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(in_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_evitarduplicado, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(bt_grabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(bt_evitarduplicado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_grabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_cerrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void in_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_nombreActionPerformed

    private void bt_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cerrarActionPerformed
    this.setVisible(false);
    }//GEN-LAST:event_bt_cerrarActionPerformed

    private void bt_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_grabarActionPerformed
   this.grabalinea();
             
        
    
    }//GEN-LAST:event_bt_grabarActionPerformed

    private void in_dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_in_dniKeyTyped
     int key = evt.getKeyChar();
        boolean numeros = key>=48 && key <=57;
       
        if (!numeros){
         evt.consume();
         
        }            
        if (in_dni.getText().length()>=11){
        evt.consume();
        in_dni.setEnabled(false);
        
        } else {
       
        }
    }//GEN-LAST:event_in_dniKeyTyped

    private void bt_evitarduplicadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_evitarduplicadoActionPerformed
    dni_ingresado = in_dni.getText().trim();
   System.out.print(dni_ingresado);
        try{
         // conectar a la base de datos
           java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "");
           // Enviando la sentencia sql
           java.sql.PreparedStatement sq = conexion.prepareStatement("select * from usuarios WHERE dni ='" +dni_ingresado +"'");
           // Ejecutar la consulta y obtener el conjunto de resultados
           ResultSet rs = sq.executeQuery();
           
           if (rs.next()){
            JOptionPane.showMessageDialog(null, "El usuario esta en la base. Evite duplicados");
            in_nombre.setText("");
            in_dni.setText("");
            in_clave.setText("");
           } else {
           JOptionPane.showMessageDialog(null, "El usuario no esta en la base");
           validacategoria();
           }
           
         } catch(SQLException e){
       
    }
    }//GEN-LAST:event_bt_evitarduplicadoActionPerformed

    private void select_nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_nivelActionPerformed
    categoria = (String) select_nivel.getSelectedItem();
        // Caracter definido previamente
        char caracterDefinido = '-';

        // Encontrar la posición del caracter definido en la cadena
        int posicionCaracter = categoria.indexOf(caracterDefinido);

        // Verificar si el caracter definido está presente en la cadena
        if (posicionCaracter != -1) {
            // Seleccionar la parte de la cadena hasta el caracter definido
            accesoS = categoria.substring(0, posicionCaracter);
            acceso = Integer.parseInt (accesoS);
            //JOptionPane.showMessageDialog(null, "Codigo Acceso: "+acceso);
        } else {
            // Imprimir un mensaje si el caracter no está presente en la cadena
            JOptionPane.showMessageDialog(null, "Hubo un error para seleccionar la categoria");
        }
        
    
    }//GEN-LAST:event_select_nivelActionPerformed

    private void in_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_in_nombreKeyTyped
     int key = evt.getKeyChar();
        boolean min = key >=97 && key <=122;
        boolean espacio = key ==32;
        boolean may = key >=65 && key <=90;
     
        if (!(min || espacio|| may)){
        evt.consume();
        }

        if (in_nombre.getText().length()>=10){
        evt.consume();
        
        }
    }//GEN-LAST:event_in_nombreKeyTyped

    public void validacategoria(){
        System.out.println(acceso);
        if (acceso == 0){
         JOptionPane.showMessageDialog(null, "Debe seleccionar una categoria");   
        } else {
        bt_grabar.setEnabled(true); 
        }
      
    }
    public void grabalinea(){
      //grabamos la linea en la base
        try{
           // conectar a la base de datos
           Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "");
           if (conexion!=null){
              JOptionPane.showMessageDialog(null, "Conectado a DB");   
            }
          
    // Enviando la sentencia sql
           PreparedStatement sq = (PreparedStatement) conexion.prepareStatement("insert into usuarios values(?,?,?,?,?)");
           //Especifico los campos
           
           sq.setString(1, "0");
           sq.setString(2, in_nombre.getText().trim());
           sq.setString(3, in_clave.getText().trim());
           sq.setString(4, in_dni.getText().trim());
           sq.setString(5, accesoS.trim());

           //Todo lo pedido que lo ejecute y cierre la base
           sq.executeUpdate();
           JOptionPane.showMessageDialog(null, "Nuevo usuario creado!"); 
       }catch(SQLException e){
       
       }
        
        //***************************************************************
        this.setVisible(false);  
        
    }
    
    private void cargacategoriaempleados(){
        //devinimos un array. la longitud la da la cantidad de columnas
        String [] datos = new String[2];
       
        try{
         // conectar a la base de datos
           java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "");
            
            // Enviando la sentencia sql
           java.sql.PreparedStatement sq = conexion.prepareStatement("select * from empleados_categorias");
           
           // Ejecutar la consulta y obtener el conjunto de resultados
           ResultSet rs = sq.executeQuery();

            // Procesar los resultados
            while (rs.next()) {
                
                id = rs.getString("id");
                prov = rs.getString("nombre_categoria");
                itemp = id  + "-" + prov;
                select_nivel.addItem(itemp);    
            }  
         }catch(SQLException e){
       
       }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cerrar;
    private javax.swing.JButton bt_evitarduplicado;
    private javax.swing.JButton bt_grabar;
    private javax.swing.JTextField in_clave;
    private javax.swing.JTextField in_dni;
    private javax.swing.JTextField in_nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> select_nivel;
    // End of variables declaration//GEN-END:variables
}
