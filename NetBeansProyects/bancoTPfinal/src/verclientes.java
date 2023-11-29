
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


public class verclientes extends javax.swing.JInternalFrame {

    DefaultTableModel clientes = new DefaultTableModel();
    
    public verclientes() {
        initComponents();
        cargarTabla(); 
    }

    private void cargarTabla(){
        clientes.addColumn("Provincia");
        clientes.addColumn("Localidad");
        clientes.addColumn("Cuil/Cuit");
        clientes.addColumn("Nombre");
        clientes.addColumn("Apellido");
        clientes.addColumn("Domicilio");
        clientes.addColumn("Email");
        tabla.setModel(clientes);
        cargarsql();
        
        //cargarArchivo();
       }
    
    private void cargarArchivo() throws IOException {
       
       
       String fila [];
       
       try {
           FileReader archivo = new FileReader(".\\src\\dbs\\clientes.txt");
           BufferedReader leer = new BufferedReader(archivo);
       
           String linea = leer.readLine();
           
           while(linea != null){
               fila = linea.split(",");
               clientes.addRow(fila);
               linea = leer.readLine();
           }
        
       }catch(FileNotFoundException e){
           System.out.println(e);
       
       }
         
         
     
     }
    
    private void cargarsql(){
        //devinimos un array. la longitud la da la cantidad de columnas
        String [] datos = new String[7];
       
        try{
         // conectar a la base de datos
           Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "");
            
            // Enviando la sentencia sql
           PreparedStatement sq = conexion.prepareStatement(""
                   + "Select provincias.provincia, localidades.localidad, "
                   + "clientes.cuil, clientes.nombre, clientes.apellido, "
                   + "clientes.domicilio, clientes.email from clientes inner "
                   + "join provincias on provincias.id = clientes.provincia "
                   + "inner join localidades on localidades.id = clientes.localidad");
           
           // Ejecutar la consulta y obtener el conjunto de resultados
           ResultSet rs = sq.executeQuery();

            // Procesar los resultados
            while (rs.next()) {
                datos[0]=rs.getString(1);//id
                datos[1]=rs.getString(2);//operador
                datos[2]=rs.getString(3);//fecha de alta
                datos[3]=rs.getString(4);//cuil/cuit
                datos[4]=rs.getString(5);//genero
                datos[5]=rs.getString(6);//nombre
                datos[6]=rs.getString(7);//apellido
               
                
                //agrega cada fila
                clientes.addRow(datos);
            }  
         }catch(SQLException e){
       
       }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setResizable(true);
        setTitle("Ver Clientes");

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

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
