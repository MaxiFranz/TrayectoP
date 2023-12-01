
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author Max
 */
public class veroperxcliente extends javax.swing.JInternalFrame {

     DefaultTableModel operaciones = new DefaultTableModel();
     
    public veroperxcliente() {
        initComponents();
        cargarTabla(); 
    }

    int row;
    long lNumeroLineas;
    String rowS;
    
    private void cargarTabla(){
        
            operaciones.addColumn("Cuil de cliente");
            operaciones.addColumn("Fecha");
            operaciones.addColumn("Id Operacion");
            operaciones.addColumn("Operacion");
            operaciones.addColumn("Detalles");
            tabla.setModel(operaciones);
       
       }
    
    private void cargarsql(){
        //devinimos un array. la longitud la da la cantidad de columnas
        String [] datos = new String[5];
       
        try{
         // conectar a la base de datos
           Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "");
            
            // Enviando la sentencia sql
           PreparedStatement sq = conexion.prepareStatement("SELECT "
                   + "clientes.cuil, operaciones.fecha, operaciones.id, tipo_operaciones.nombre_operacion,    "
                   + "operaciones.detalles "
                   + "FROM operaciones INNER JOIN clientes ON clientes.cuil = "
                   + "operaciones.cuil_cliente INNER JOIN tipo_operaciones "
                   + "ON tipo_operaciones.id = operaciones.tipo_op where "
                   + "cuil_cliente = ? order by operaciones.fecha DESC");
           sq.setString(1, buscar_cuil.getText());
           // Ejecutar la consulta y obtener el conjunto de resultados
           ResultSet rs = sq.executeQuery();

            // Procesar los resultados
            while (rs.next()) {
                datos[0]=rs.getString(1);//id
                datos[1]=rs.getString(2);//operador
                datos[2]=rs.getString(3);//Fecha operacion
                datos[3]=rs.getString(4);//Cuil Cliente
                datos[4]=rs.getString(5);//Cuil Cliente
                //agrega cada fila
                operaciones.addRow(datos);
            }  
         }catch(SQLException e){
       
       }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buscar_cuil = new javax.swing.JTextField();
        bt_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        jLabel1.setText("Ingrese CUIT");

        bt_buscar.setText("Buscar");
        bt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscar_cuil, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buscar_cuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_buscar))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarActionPerformed
     String [] datos = new String[14];
       
        try{
         // conectar a la base de datos
           Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "");
            
            // Enviando la sentencia sql
           PreparedStatement sq = conexion.prepareStatement("select * from operaciones WHERE cuil_cliente = ?");
           //Especifico los campos 
           sq.setString(1, buscar_cuil.getText());
           // Ejecutar la consulta y obtener el conjunto de resultados
           ResultSet rs = sq.executeQuery();
           
           
           if (rs.next()){
               JOptionPane.showMessageDialog(null, "El cliente  esta en la base");
               cargarsql();
                  
              }else {
                JOptionPane.showMessageDialog(null, "El cliente no esta en la base");
            }  
         }catch(SQLException e){
       
       }
    }//GEN-LAST:event_bt_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_buscar;
    private javax.swing.JTextField buscar_cuil;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
