
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;


public class main extends javax.swing.JFrame {

    ImageIcon logo = new ImageIcon("/imagenes/logospoleto.jpg");
    
 fondodesktop escritorio;
 
    String sesion_id;
    String sesion_nivel;
 
    public main(sesion sesion) {
      
        initComponents();
        this.setExtendedState(6);
         this.setLocationRelativeTo(null);
         sesion_id = sesion.getCodigoLn();
         sesion_nivel = sesion.getNivelLn();
         int nivel = Integer.parseInt(sesion_nivel);
         escritorio = new fondodesktop();
        this.setContentPane(escritorio);
        this.setTitle("Bienvenidos!!!");
        if (nivel == 1){
            b_abrelistadousuarios.setEnabled(true);
        }else {
            b_abrelistadousuarios.setEnabled(false); 
        }
    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondodesktop = new javax.swing.JDesktopPane();
        in_verusuarios = new javax.swing.JInternalFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        b_abrelistadousuarios = new javax.swing.JMenuItem();
        b_cerrar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        b_altacliente = new javax.swing.JMenuItem();
        b_cambiomoneda = new javax.swing.JMenuItem();
        b_prestamos = new javax.swing.JMenuItem();
        b_seguros = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        b_verclientes = new javax.swing.JMenuItem();
        b_veroperaciones = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        in_verusuarios.setVisible(false);

        javax.swing.GroupLayout in_verusuariosLayout = new javax.swing.GroupLayout(in_verusuarios.getContentPane());
        in_verusuarios.getContentPane().setLayout(in_verusuariosLayout);
        in_verusuariosLayout.setHorizontalGroup(
            in_verusuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        in_verusuariosLayout.setVerticalGroup(
            in_verusuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        fondodesktop.setLayer(in_verusuarios, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout fondodesktopLayout = new javax.swing.GroupLayout(fondodesktop);
        fondodesktop.setLayout(fondodesktopLayout);
        fondodesktopLayout.setHorizontalGroup(
            fondodesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondodesktopLayout.createSequentialGroup()
                .addContainerGap(444, Short.MAX_VALUE)
                .addComponent(in_verusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
        );
        fondodesktopLayout.setVerticalGroup(
            fondodesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondodesktopLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(in_verusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        jMenu1.setText("Menu");

        jMenuItem1.setText("Ver sesion en curso");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        b_abrelistadousuarios.setText("Ver Usuarios");
        b_abrelistadousuarios.setEnabled(false);
        b_abrelistadousuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_abrelistadousuariosActionPerformed(evt);
            }
        });
        jMenu1.add(b_abrelistadousuarios);

        b_cerrar.setText("Cerrar");
        b_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cerrarActionPerformed(evt);
            }
        });
        jMenu1.add(b_cerrar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Clientes");

        b_altacliente.setText("Alta Cliente");
        b_altacliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_altaclienteActionPerformed(evt);
            }
        });
        jMenu2.add(b_altacliente);

        b_cambiomoneda.setText("Cambio Moneda");
        b_cambiomoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cambiomonedaActionPerformed(evt);
            }
        });
        jMenu2.add(b_cambiomoneda);

        b_prestamos.setText("Prestamos");
        b_prestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_prestamosActionPerformed(evt);
            }
        });
        jMenu2.add(b_prestamos);

        b_seguros.setText("Seguros");
        b_seguros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_segurosActionPerformed(evt);
            }
        });
        jMenu2.add(b_seguros);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Informes");

        b_verclientes.setText("Clientes");
        b_verclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_verclientesActionPerformed(evt);
            }
        });
        jMenu3.add(b_verclientes);

        b_veroperaciones.setText("Operaciones");
        b_veroperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_veroperacionesActionPerformed(evt);
            }
        });
        jMenu3.add(b_veroperaciones);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondodesktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondodesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_abrelistadousuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_abrelistadousuariosActionPerformed
      verusuarios verusuarios = new verusuarios();
     escritorio.add(verusuarios);
     //queremos que se abra en el centro...
        //toma las dimensiones del escritorio
        Dimension dimensionEsc = escritorio.getSize();
        //toma las dimensiones de la ventana que va a abrir
        Dimension dimensionverusuarios = verusuarios.getSize();
        verusuarios.setLocation((dimensionEsc.width-dimensionverusuarios.width)/2,(dimensionEsc.height-dimensionverusuarios.height)/2);
        verusuarios.show();
    }//GEN-LAST:event_b_abrelistadousuariosActionPerformed

    private void b_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cerrarActionPerformed
   System.exit(0);   
    }//GEN-LAST:event_b_cerrarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //pasamos dos variables al main
        sesionainternal pdi1 = new sesionainternal(sesion_id, sesion_nivel);
        versesion  v1 = new versesion(pdi1);
        escritorio.add(v1);
        v1.setVisible(true);       
            
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void b_veroperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_veroperacionesActionPerformed
        veroperaciones  v7 = new veroperaciones();
        escritorio.add(v7);
        
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = v7.getSize();
        v7.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        v7.setVisible(true);  
    }//GEN-LAST:event_b_veroperacionesActionPerformed

    private void b_verclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_verclientesActionPerformed
        verclientes  v3 = new verclientes();
        escritorio.add(v3);
        
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = v3.getSize();
        v3.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        v3.setVisible(true);  
    }//GEN-LAST:event_b_verclientesActionPerformed

    private void b_cambiomonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cambiomonedaActionPerformed
        sesionainternal pdi3 = new sesionainternal(sesion_id, sesion_nivel);
        cambiomoneda v4 = new cambiomoneda(pdi3);
        escritorio.add( v4);

        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = v4.getSize();
        v4.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        v4.setVisible(true);
    }//GEN-LAST:event_b_cambiomonedaActionPerformed

    private void b_altaclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_altaclienteActionPerformed
        sesionainternal pdi2 = new sesionainternal(sesion_id, sesion_nivel);
        altacliente  v2 = new altacliente(pdi2);
        escritorio.add(v2);
        
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = v2.getSize();
        v2.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        v2.setVisible(true);
    }//GEN-LAST:event_b_altaclienteActionPerformed

    private void b_prestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_prestamosActionPerformed
    sesionainternal pdi4 = new sesionainternal(sesion_id, sesion_nivel);
        prestamos v5 = new prestamos(pdi4);
        escritorio.add( v5);

        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = v5.getSize();
        v5.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        v5.setVisible(true);
    }//GEN-LAST:event_b_prestamosActionPerformed

    private void b_segurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_segurosActionPerformed
      sesionainternal pdi5 = new sesionainternal(sesion_id, sesion_nivel);
        seguros v6 = new seguros(pdi5);
        escritorio.add( v6);

        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = v6.getSize();
        v6.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        v6.setVisible(true);  
    }//GEN-LAST:event_b_segurosActionPerformed

    
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                //new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem b_abrelistadousuarios;
    private javax.swing.JMenuItem b_altacliente;
    private javax.swing.JMenuItem b_cambiomoneda;
    private javax.swing.JMenuItem b_cerrar;
    private javax.swing.JMenuItem b_prestamos;
    private javax.swing.JMenuItem b_seguros;
    private javax.swing.JMenuItem b_verclientes;
    private javax.swing.JMenuItem b_veroperaciones;
    public static javax.swing.JDesktopPane fondodesktop;
    private javax.swing.JInternalFrame in_verusuarios;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables

   
}
