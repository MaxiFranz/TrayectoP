
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class veroperaciones extends javax.swing.JInternalFrame {

   DefaultTableModel operaciones = new DefaultTableModel();
   
    public veroperaciones() {
        initComponents();
        cargarTabla(); 
        cuentaoperaciones();
        
    }
    
    int row;
    long lNumeroLineas;
    String rowS;
   
    
    private void cargarTabla(){
        
        try {
            operaciones.addColumn("Id");
            operaciones.addColumn("Operador");
            operaciones.addColumn("Fecha operacion");
            operaciones.addColumn("Cuil Cliente");
            operaciones.addColumn("Tipo de Operacion");
            operaciones.addColumn("Detalles");
            tabla.setModel(operaciones);

            cargarArchivo();
        } catch(IOException e){
        System.out.println(e);
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
    
    private void cuentaoperaciones (){
        String sCadena = "";
        
        try{
           FileReader archivo = new FileReader(".\\src\\dbs\\operaciones.txt");
           BufferedReader leer = new BufferedReader(archivo);
       
           lNumeroLineas = 0;
            while ((sCadena = leer.readLine())!=null) {
        lNumeroLineas++;
        lb_cantOp.setText(""+lNumeroLineas);
  
        }
           
 
        
       } catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
            } catch (IOException ioe){
                  ioe.printStackTrace();
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lb_cantOp = new javax.swing.JLabel();

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

        jLabel1.setText("Operaciones totales:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_cantOp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_cantOp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jLabel1)))
                .addContainerGap())
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_cantOp;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
