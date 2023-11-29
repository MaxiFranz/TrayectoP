
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class veroperaciones extends javax.swing.JInternalFrame {

   DefaultTableModel operaciones = new DefaultTableModel();
   
    public veroperaciones() {
        initComponents();
        cargarTabla(); 
        
        
    }
    
    int row;
    long lNumeroLineas;
    String rowS;
   
    
    private void cargarTabla(){
       
            operaciones.addColumn("Empleado");
            operaciones.addColumn("Tipo de Operacion");
            operaciones.addColumn("Nombre Cliente");
            operaciones.addColumn("Apellido");
            operaciones.addColumn("Fecha");
            operaciones.addColumn("Detalle");
            tabla.setModel(operaciones);
            cargarsql();
            
            //cargarArchivo();
       
       }
    
    private void cargarsql(){
        //devinimos un array. la longitud la da la cantidad de columnas
        String [] datos = new String[6];
       
        try{
         // conectar a la base de datos
           Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "");
            
            // Enviando la sentencia sql
           PreparedStatement sq = conexion.prepareStatement("SELECT "
                   + "usuarios.usuario_nombre, tipo_operaciones.nombre_operacion, "
                   + "clientes.nombre, clientes.apellido, operaciones.fecha, "
                   + "operaciones.detalles FROM operaciones INNER JOIN usuarios "
                   + "ON operaciones.id_operador = usuarios.id INNER JOIN "
                   + "clientes ON clientes.cuil = operaciones.cuil_cliente "
                   + "INNER JOIN tipo_operaciones ON tipo_operaciones.id = "
                   + "operaciones.tipo_op order by operaciones.fecha DESC;");
            // Ejecutar la consulta y obtener el conjunto de resultados
           ResultSet rs = sq.executeQuery();
           //ResultSet rs2 = sq2.executeQuery();
           
          
           
            // Procesar los resultados
            while (rs.next()) {
                datos[0]=rs.getString(1);//id
                datos[1]=rs.getString(2);//operador
                datos[2]=rs.getString(3);//Fecha operacion
                datos[3]=rs.getString(4);//Cuil Cliente
                datos[4]=rs.getString(5);//Tipo de Operacion
                datos[5]=rs.getString(6);//Detalles
                //agrega cada fila
                operaciones.addRow(datos);
            }  
         }catch(SQLException e){
       
       }
    }
    
    private void cargarArchivo() throws IOException {
       
       
      String fila [];
       
       try {
           FileReader archivo = new FileReader(".\\src\\dbs\\operaciones.txt");
           BufferedReader leer = new BufferedReader(archivo);
       
           String linea = leer.readLine();
           
           while(linea != null){
               fila = linea.split(",");
               operaciones.addRow(fila);
               linea = leer.readLine();
           }
        
       }catch(FileNotFoundException e){
           System.out.println(e);
       
       }
         
         
     
     }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setTitle("Ver Operaciones");

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
        tabla.setColumnSelectionAllowed(true);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
    row =  this.tabla.getSelectedRow();
    rowS = String.valueOf(row);
    System.out.println(row);
  
    //*************************************
    
    }//GEN-LAST:event_tablaMouseClicked
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
