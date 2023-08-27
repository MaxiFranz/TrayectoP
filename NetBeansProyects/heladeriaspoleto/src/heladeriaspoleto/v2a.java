
package heladeriaspoleto;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Max
 */
public class v2a extends javax.swing.JInternalFrame {

    /**
     * Creates new form v2a
     */
    public v2a() {
        initComponents();
        this.setTitle("Venta");
        
    }
    //cargamos la imagen para el JOptionpane de pedido
    Icon icono = new ImageIcon(getClass().getResource("/imagenes/pedido.jpg"));
    
    //creamos una variable por cada gusto instanciadas en 1 es decir..
    //luego las sumamos y tenemos disponibles 9 gustos. Al elegirlo, el valor
    //de la variable pasa a ser 0 y en la suma 0 no suma!!
    //Si lo vuelve a elegir, valor cambia a 1 y suma
    //la suma de los gustos (de las gs) va en cant
    int g1 = 1;
    int g2 = 1;
    int g3 = 1;
    int g4 = 1;
    int g5 = 1;
    int g6 = 1;
    int g7 = 1;
    int g8 = 1;
    int g9 = 1;
    int g10 = 1;
    int g11 = 1;
    int g12 = 1;
    
    int limitegustos;
    int noseleccionados;
    int diferencia;
    
    String email;
    String fecha;
    String nombre;
    String producto;
    String gustoselegidos;
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lb_fechacompra = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_limitegustos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_gustosdisponibles = new javax.swing.JLabel();
        b_generapedido = new javax.swing.JButton();
        b_delivery = new javax.swing.JButton();
        b_cerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        input_nombrecliente = new javax.swing.JTextField();
        input_emailcliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ch_gusto1 = new javax.swing.JCheckBox();
        ch_gusto2 = new javax.swing.JCheckBox();
        ch_gusto3 = new javax.swing.JCheckBox();
        ch_gusto4 = new javax.swing.JCheckBox();
        ch_gusto5 = new javax.swing.JCheckBox();
        ch_gusto6 = new javax.swing.JCheckBox();
        ch_gusto7 = new javax.swing.JCheckBox();
        ch_gusto8 = new javax.swing.JCheckBox();
        ch_gusto9 = new javax.swing.JCheckBox();
        ch_gusto10 = new javax.swing.JCheckBox();
        ch_gusto11 = new javax.swing.JCheckBox();
        ch_gusto12 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        rb_producto1 = new javax.swing.JRadioButton();
        rb_producto2 = new javax.swing.JRadioButton();
        rb_producto3 = new javax.swing.JRadioButton();
        rb_producto4 = new javax.swing.JRadioButton();
        rb_producto5 = new javax.swing.JRadioButton();
        rb_producto6 = new javax.swing.JRadioButton();
        bt_limpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Su pedido"));

        jLabel1.setText("Fecha y Hora");

        lb_fechacompra.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lb_fechacompraAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lb_fechacompra.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                lb_fechacompraComponentShown(evt);
            }
        });

        jLabel5.setText("Gustos que puede elegir!");

        jLabel4.setText("Gustos disponibles!");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lb_fechacompra, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel5)))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_limitegustos, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(lb_gustosdisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_limitegustos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lb_fechacompra, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_gustosdisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        b_generapedido.setText("Generar Pedido");
        b_generapedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_generapedidoActionPerformed(evt);
            }
        });

        b_delivery.setText("Delivery");
        b_delivery.setEnabled(false);
        b_delivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_deliveryActionPerformed(evt);
            }
        });

        b_cerrar.setText("Anular Pedido");
        b_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cerrarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del cliente"));

        input_nombrecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nombreclienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(input_emailcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(input_nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_emailcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Sabores"));

        ch_gusto1.setText("Mascarpone");
        ch_gusto1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ch_gusto1StateChanged(evt);
            }
        });

        ch_gusto2.setText("Dulce de Leche");
        ch_gusto2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ch_gusto2StateChanged(evt);
            }
        });

        ch_gusto3.setText("Frutilla");
        ch_gusto3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ch_gusto3StateChanged(evt);
            }
        });

        ch_gusto4.setText("Crema del cielo");
        ch_gusto4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ch_gusto4StateChanged(evt);
            }
        });

        ch_gusto5.setText("Chocolate");
        ch_gusto5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ch_gusto5StateChanged(evt);
            }
        });

        ch_gusto6.setText("Limon");
        ch_gusto6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ch_gusto6StateChanged(evt);
            }
        });

        ch_gusto7.setText("Granizado");
        ch_gusto7.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ch_gusto7StateChanged(evt);
            }
        });

        ch_gusto8.setText("Sambayon");
        ch_gusto8.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ch_gusto8StateChanged(evt);
            }
        });

        ch_gusto9.setText("Cereza");
        ch_gusto9.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ch_gusto9StateChanged(evt);
            }
        });

        ch_gusto10.setText("Pistachio");
        ch_gusto10.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ch_gusto10StateChanged(evt);
            }
        });

        ch_gusto11.setText("Lemon Pie");
        ch_gusto11.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ch_gusto11StateChanged(evt);
            }
        });

        ch_gusto12.setText("Tiramisu");
        ch_gusto12.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ch_gusto12StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ch_gusto9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ch_gusto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ch_gusto3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ch_gusto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ch_gusto5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ch_gusto6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ch_gusto12)
                    .addComponent(ch_gusto11)
                    .addComponent(ch_gusto10)
                    .addComponent(ch_gusto8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ch_gusto4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ch_gusto7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ch_gusto6)
                    .addComponent(ch_gusto12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ch_gusto9)
                    .addComponent(ch_gusto11))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ch_gusto1)
                    .addComponent(ch_gusto10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ch_gusto3)
                    .addComponent(ch_gusto8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ch_gusto2)
                    .addComponent(ch_gusto4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ch_gusto5)
                    .addComponent(ch_gusto7))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos"));

        rb_producto1.setText("1/4 Kilo");
        rb_producto1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rb_producto1StateChanged(evt);
            }
        });
        rb_producto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_producto1ActionPerformed(evt);
            }
        });

        rb_producto2.setText("1/2 Kilo");
        rb_producto2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rb_producto2StateChanged(evt);
            }
        });

        rb_producto3.setText("1 kilo");
        rb_producto3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rb_producto3StateChanged(evt);
            }
        });

        rb_producto4.setText("Cono");
        rb_producto4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rb_producto4StateChanged(evt);
            }
        });

        rb_producto5.setText("Capellina");
        rb_producto5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rb_producto5StateChanged(evt);
            }
        });

        rb_producto6.setText("Torta Milka");
        rb_producto6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rb_producto6StateChanged(evt);
            }
        });
        rb_producto6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_producto6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_producto4)
                    .addComponent(rb_producto3)
                    .addComponent(rb_producto1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_producto5)
                    .addComponent(rb_producto2)
                    .addComponent(rb_producto6))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_producto4)
                    .addComponent(rb_producto5))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_producto1)
                    .addComponent(rb_producto2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_producto3)
                    .addComponent(rb_producto6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_limpiar.setText("Limpiar");
        bt_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_generapedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b_delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(b_cerrar)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_generapedido, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(b_delivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_limpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_fechacompraAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lb_fechacompraAncestorAdded
        Date myDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy H:m");
        String v_fechaComoCadena = sdf.format(new Date());
        lb_fechacompra.setText(""+v_fechaComoCadena);        // TODO add your handling code here:
    }//GEN-LAST:event_lb_fechacompraAncestorAdded

    private void lb_fechacompraComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_lb_fechacompraComponentShown

        // TODO add your handling code here:
    }//GEN-LAST:event_lb_fechacompraComponentShown

    private void ch_gusto1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ch_gusto1StateChanged
        if (!ch_gusto1.isSelected()){
            g1 = 1;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        } else if (ch_gusto1.isSelected()){
            g1 = 0;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        }// TODO add your handling code here:
    }//GEN-LAST:event_ch_gusto1StateChanged

    private void ch_gusto2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ch_gusto2StateChanged
        if (!ch_gusto2.isSelected()){
            g2 = 1;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        }else if (ch_gusto2.isSelected()){
            g2 = 0;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_ch_gusto2StateChanged

    private void ch_gusto3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ch_gusto3StateChanged
        if (!ch_gusto3.isSelected()){
            g3 = 1;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        } else if (ch_gusto3.isSelected()){
            g3 = 0;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        } // TODO add your handling code here:
    }//GEN-LAST:event_ch_gusto3StateChanged

    private void ch_gusto4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ch_gusto4StateChanged
        if (!ch_gusto4.isSelected()){
            g4 = 1;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        } else if (ch_gusto4.isSelected()){
            g4 = 0;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        }
    }//GEN-LAST:event_ch_gusto4StateChanged

    private void ch_gusto5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ch_gusto5StateChanged
        if (!ch_gusto5.isSelected()){
            g5 = 1;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        }  else if (ch_gusto5.isSelected()){
            g5 = 0;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        }

    }//GEN-LAST:event_ch_gusto5StateChanged

    private void ch_gusto6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ch_gusto6StateChanged
        if (!ch_gusto6.isSelected()){
            g6 = 1;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        }else if (ch_gusto6.isSelected()){
            g6 = 0;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        }

    }//GEN-LAST:event_ch_gusto6StateChanged

    private void ch_gusto7StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ch_gusto7StateChanged
        if (!ch_gusto7.isSelected()){
            g7 = 1;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        }  else if (ch_gusto7.isSelected()){
            g7 = 0;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        } // TODO add your handling code here:
    }//GEN-LAST:event_ch_gusto7StateChanged

    private void ch_gusto8StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ch_gusto8StateChanged
        if (!ch_gusto8.isSelected()){
            g8 = 1;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        } else if (ch_gusto8.isSelected()){
            g8 = 0;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        }  // TODO add your handling code here:
    }//GEN-LAST:event_ch_gusto8StateChanged

    private void ch_gusto9StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ch_gusto9StateChanged
        if (!ch_gusto9.isSelected()){
            g9 = 1;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        }else if (ch_gusto9.isSelected()){
            g9 = 0;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        }
    }//GEN-LAST:event_ch_gusto9StateChanged

    
    //productos!!************************************************************
    private void rb_producto1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rb_producto1StateChanged
        if (rb_producto1.isSelected()) {
            this.resetGustos();
            b_delivery.setEnabled(true);
            producto = this.rb_producto1.getText();
            limitegustos = 2;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
            //deschequear el resto
            rb_producto2.setSelected(false);
            rb_producto3.setSelected(false);
            rb_producto4.setSelected(false);
            rb_producto5.setSelected(false);
            rb_producto6.setSelected(false);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_rb_producto1StateChanged

    private void rb_producto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_producto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_producto1ActionPerformed

    private void rb_producto2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rb_producto2StateChanged
        if (rb_producto2.isSelected()) {
            this.resetGustos();
            b_delivery.setEnabled(true);
             producto = this.rb_producto2.getText();
            limitegustos = 3;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
            //deschequear el resto
            rb_producto1.setSelected(false);
            rb_producto3.setSelected(false);
            rb_producto4.setSelected(false);
            rb_producto5.setSelected(false);
            rb_producto6.setSelected(false);
        }
    }//GEN-LAST:event_rb_producto2StateChanged

    private void rb_producto3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rb_producto3StateChanged
        if (rb_producto3.isSelected()) {
            this.resetGustos();
            b_delivery.setEnabled(true);
             producto = this.rb_producto3.getText();
            limitegustos = 4;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
            //deschequear el resto
            rb_producto1.setSelected(false);
            rb_producto2.setSelected(false);
            rb_producto4.setSelected(false);
            rb_producto5.setSelected(false);
            rb_producto6.setSelected(false);
        }  
    }//GEN-LAST:event_rb_producto3StateChanged

    private void b_generapedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_generapedidoActionPerformed
        this.saboreselegidos();
        nombre = this.input_nombrecliente.getText();
        email = this.input_emailcliente.getText();
        fecha = this.lb_fechacompra.getText();
        JOptionPane.showMessageDialog(null,"Detalle de pedido: "
                + "\nFecha: " +fecha+
                 "\nNombre: " +nombre+
                "\nEmail: "+email+
                "\nProducto: " +producto+
                "\nSabores: " +gustoselegidos, "Su pedido!", JOptionPane.PLAIN_MESSAGE, icono);
    }//GEN-LAST:event_b_generapedidoActionPerformed

    private void b_deliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deliveryActionPerformed
    v3 v3 = new v3();
    
    v3.show();// TODO add your handling code here:
    }//GEN-LAST:event_b_deliveryActionPerformed

    private void b_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cerrarActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_b_cerrarActionPerformed

    private void input_nombreclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nombreclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_nombreclienteActionPerformed

    private void rb_producto4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rb_producto4StateChanged
         if (rb_producto4.isSelected()) {
             this.resetGustos();
             b_delivery.setEnabled(true);
              producto = this.rb_producto4.getText();
            limitegustos = 1;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
            //deschequear el resto
            rb_producto1.setSelected(false);
            rb_producto2.setSelected(false);
            rb_producto3.setSelected(false);
            rb_producto5.setSelected(false);
            rb_producto6.setSelected(false);
        }       // TODO add your handling code here:
    }//GEN-LAST:event_rb_producto4StateChanged

    private void rb_producto5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rb_producto5StateChanged
       if (rb_producto5.isSelected()) {
           this.resetGustos();
           b_delivery.setEnabled(true);
            producto = this.rb_producto5.getText();
            limitegustos = 2;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
            //deschequear el resto
            rb_producto1.setSelected(false);
            rb_producto2.setSelected(false);
            rb_producto3.setSelected(false);
            rb_producto4.setSelected(false);
            rb_producto6.setSelected(false);
        }
    }//GEN-LAST:event_rb_producto5StateChanged

    private void ch_gusto12StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ch_gusto12StateChanged
    if (!ch_gusto12.isSelected()){
            g12 = 1;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        }else if (ch_gusto12.isSelected()){
            g12 = 0;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        }    // TODO add your handling code here:
    }//GEN-LAST:event_ch_gusto12StateChanged

    private void ch_gusto11StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ch_gusto11StateChanged
     if (!ch_gusto11.isSelected()){
            g11 = 1;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        }else if (ch_gusto11.isSelected()){
            g11 = 0;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_ch_gusto11StateChanged

    private void ch_gusto10StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ch_gusto10StateChanged
    if (!ch_gusto10.isSelected()){
            g10 = 1;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        }else if (ch_gusto10.isSelected()){
            g10 = 0;
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
        }    // TODO add your handling code here:
    }//GEN-LAST:event_ch_gusto10StateChanged

    private void bt_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limpiarActionPerformed
    this.resetGustos();  
    this.limpiaForm();
    }//GEN-LAST:event_bt_limpiarActionPerformed

    private void rb_producto6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_producto6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_producto6ActionPerformed

    private void rb_producto6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rb_producto6StateChanged
        
        if (rb_producto6.isSelected()) {
            b_delivery.setEnabled(true);
           this.resetGustos();
            producto = this.rb_producto6.getText();
            limitegustos = 3;
            this.ch_gusto2.setSelected(true);
            this.ch_gusto5.setSelected(true);
            this.ch_gusto7.setSelected(true);
            this.cuentagustos(limitegustos, g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12);
            //deschequear el resto
            rb_producto1.setSelected(false);
            rb_producto2.setSelected(false);
            rb_producto3.setSelected(false);
            rb_producto4.setSelected(false);
            rb_producto5.setSelected(false);
           
        }    // TODO add your handling code here:
    }//GEN-LAST:event_rb_producto6StateChanged

    //*************************************************************************    
    //METODOS!!!!!!!!!!!!!!!!!!!!!!!!!!!! 
    public void cuentagustos(int limitegustos, int g1, int g2, int g3, int g4, int g5, int g6, int g7, int g8, int g9, int g10, int g11, int g12){
        //cuando selecciona el producto, limita la cantidad de gustos
        //una vez que llega a que sean iguales los valores de ambas variables
        //deshabilita los check no elegidos
        
        //generamos la suma que es dinamica
        noseleccionados = g1+g2+g3+g4+g5+g6+g7+g8+g9+g10+g11+g12;
        String cant = Integer.toString(noseleccionados);
        //lo mostramos
        lb_gustosdisponibles.setText(cant);
        
        //tomamos el valor de gustos limite
        String cant2 = Integer.toString(limitegustos);
        //lo mostramos
        lb_limitegustos.setText(cant2);
        
        
        //sacamos la cantidad de los sabores que no va apoder elegir
        switch (limitegustos) {
            case 2:
                diferencia = 9;
                break;
            case 3:
                diferencia = 8;
                break;
            case 4:
                diferencia = 7;
                break;
            case 1:
                diferencia = 10;
                break;
            default:
                break;
        }
                
        if (diferencia == noseleccionados){
            JOptionPane.showMessageDialog(null, "No puede elegir mas gustos para este producto");
        }
      
    }
    
    
    public void resetGustos() {
    g1 = 1;
    this.ch_gusto1.setSelected(false);
    g2 = 1;
    this.ch_gusto2.setSelected(false);
    g3 = 1;
    this.ch_gusto3.setSelected(false);
    g4 = 1;
    this.ch_gusto4.setSelected(false);
    g5 = 1;
    this.ch_gusto5.setSelected(false);
    g6 = 1;
    this.ch_gusto6.setSelected(false);
    g7 = 1;
    this.ch_gusto7.setSelected(false);
    g8 = 1;
    this.ch_gusto8.setSelected(false);
    g9 = 1;
    this.ch_gusto9.setSelected(false);
    g10 = 1;
    this.ch_gusto10.setSelected(false);
    g11 = 1;
    this.ch_gusto11.setSelected(false);
    g12 = 1;
    this.ch_gusto12.setSelected(false);
    }
    
    public void limpiaForm() {
    this.rb_producto1.setSelected(false);
    this.rb_producto2.setSelected(false);
    this.rb_producto3.setSelected(false);
    this.rb_producto4.setSelected(false);
    this.rb_producto5.setSelected(false);
    this.rb_producto6.setSelected(false);
    this.input_nombrecliente.setText("");
    this.input_emailcliente.setText("");
    }
    
     public void saboreselegidos() {
        gustoselegidos = "\n ";
        
         if (ch_gusto1.isSelected()){
             gustoselegidos = ""+gustoselegidos+ "-" + ch_gusto1.getText()+ "\n ";
         }
        if (ch_gusto2.isSelected()){
             gustoselegidos = ""+gustoselegidos+ "-" + ch_gusto2.getText()+ "\n ";
         }
        if (ch_gusto3.isSelected()){
             gustoselegidos = ""+gustoselegidos+ "-" + ch_gusto3.getText()+ "\n ";
         }
        if (ch_gusto4.isSelected()){
             gustoselegidos = ""+gustoselegidos+ "-" + ch_gusto4.getText()+ "\n ";
         }
        if (ch_gusto5.isSelected()){
             gustoselegidos = ""+gustoselegidos+ "-" + ch_gusto5.getText()+ "\n ";
         }
        if (ch_gusto6.isSelected()){
             gustoselegidos = ""+gustoselegidos+ "-" + ch_gusto6.getText()+ "\n ";
         }
        if (ch_gusto7.isSelected()){
             gustoselegidos = ""+gustoselegidos+ "-" + ch_gusto7.getText()+ "\n ";
         }
        if (ch_gusto8.isSelected()){
             gustoselegidos = ""+gustoselegidos+ "-" + ch_gusto8.getText()+ "\n ";
         }
        if (ch_gusto9.isSelected()){
             gustoselegidos = ""+gustoselegidos+ "-" + ch_gusto9.getText()+ "\n ";
         }
        if (ch_gusto10.isSelected()){
             gustoselegidos = ""+gustoselegidos+ "-" + ch_gusto10.getText()+ "\n ";
         }
        if (ch_gusto11.isSelected()){
             gustoselegidos = ""+gustoselegidos+ "-" + ch_gusto11.getText()+ "\n ";
         }
        if (ch_gusto12.isSelected()){
             gustoselegidos = ""+gustoselegidos+ "-" + ch_gusto12.getText()+ "\n ";
         }
        
     }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cerrar;
    private javax.swing.JButton b_delivery;
    private javax.swing.JButton b_generapedido;
    private javax.swing.JButton bt_limpiar;
    private javax.swing.JCheckBox ch_gusto1;
    private javax.swing.JCheckBox ch_gusto10;
    private javax.swing.JCheckBox ch_gusto11;
    private javax.swing.JCheckBox ch_gusto12;
    private javax.swing.JCheckBox ch_gusto2;
    private javax.swing.JCheckBox ch_gusto3;
    private javax.swing.JCheckBox ch_gusto4;
    private javax.swing.JCheckBox ch_gusto5;
    private javax.swing.JCheckBox ch_gusto6;
    private javax.swing.JCheckBox ch_gusto7;
    private javax.swing.JCheckBox ch_gusto8;
    private javax.swing.JCheckBox ch_gusto9;
    private javax.swing.JTextField input_emailcliente;
    private javax.swing.JTextField input_nombrecliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lb_fechacompra;
    private javax.swing.JLabel lb_gustosdisponibles;
    private javax.swing.JLabel lb_limitegustos;
    private javax.swing.JRadioButton rb_producto1;
    private javax.swing.JRadioButton rb_producto2;
    private javax.swing.JRadioButton rb_producto3;
    private javax.swing.JRadioButton rb_producto4;
    private javax.swing.JRadioButton rb_producto5;
    private javax.swing.JRadioButton rb_producto6;
    // End of variables declaration//GEN-END:variables
}
