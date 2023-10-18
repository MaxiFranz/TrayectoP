
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class seguros extends javax.swing.JInternalFrame {

    String sesion_id;
    String cuit_ingresado;
     boolean contieneU = false;
    String operacion = "";
     String comboSvidaprimeraopcion;  
    String comboSvidasegundaopcion;
    String comboSvidaterceraopcion;
     int valor1;
    int valor2;
    int valor3;

    String co1, co1b, co2, co2b, co3, co3b, co4, co4b, co5, co5b, co6, co6b, co7, co7b, co8, co8b, co9,co9b,co10, co10b;
    
    public seguros(sesionainternal sesionainternal) {
        initComponents();
        sesion_id = sesionainternal.getCodigoLnI();
        this.input_operador.setText(sesion_id);
        Date myDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String v_fechaComoCadena = sdf.format(new Date());
        this.input_fecha.setText(v_fechaComoCadena);
        cuentaoperaciones(); 
    }
        //variables para cuenta operaciones
        String sCadena = "";
        String ultimoid = "";
       long lNumeroLineas;
         
   private void cuentaoperaciones (){
        
        try{
           FileReader archivo = new FileReader(".\\src\\dbs\\operaciones.txt");
           BufferedReader leer = new BufferedReader(archivo);
       
           lNumeroLineas = 0;
            while ((sCadena = leer.readLine())!=null) {
        lNumeroLineas++;
        int nuevaOp = (int) (+lNumeroLineas+1);
        n_op.setText(""+nuevaOp);
  
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        input_operador = new javax.swing.JTextField();
        input_fecha = new javax.swing.JTextField();
        n_op = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        input_cuit = new javax.swing.JTextField();
        b_reiniciainput = new javax.swing.JButton();
        b_cerrar = new javax.swing.JButton();
        b_buscarcliente = new javax.swing.JButton();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        s3_inputbeneficario1 = new javax.swing.JTextField();
        s3_inputbeneficiario2 = new javax.swing.JTextField();
        s3_inputbeneficiario3 = new javax.swing.JTextField();
        s3_inputbeneficiario4 = new javax.swing.JTextField();
        s1_combobenef1 = new javax.swing.JComboBox<>();
        s3_combobeneficiarios2 = new javax.swing.JComboBox<>();
        s3_combobeneficiarios3 = new javax.swing.JComboBox<>();
        s3_restobeneficiario = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        s1_chek_muerte = new javax.swing.JCheckBox();
        s1_chek_muerteacc = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        s1_chek_diasinternacion = new javax.swing.JCheckBox();
        s3_diasinternacion = new javax.swing.JComboBox<>();
        s1_chek_paralisis = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        b_svida = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        S1_chekIncendio = new javax.swing.JCheckBox();
        s1_chekRobo = new javax.swing.JCheckBox();
        s1_chekInundacion = new javax.swing.JCheckBox();
        s1_comboincendio = new javax.swing.JComboBox<>();
        s1_comborobo = new javax.swing.JComboBox<>();
        s1_comboinundacion = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        S1_chekIheladera = new javax.swing.JCheckBox();
        S1_cheklavarropas = new javax.swing.JCheckBox();
        S1_chekcocina = new javax.swing.JCheckBox();
        S1_cheknotebook = new javax.swing.JCheckBox();
        S1_chekconsola = new javax.swing.JCheckBox();
        S1_chektelevisor = new javax.swing.JCheckBox();
        s1_inputnotebook = new javax.swing.JTextField();
        s1_inputtelevisor = new javax.swing.JTextField();
        b_resetHogar = new javax.swing.JButton();
        b_shogar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        s2_inputDominio = new javax.swing.JTextField();
        s2_comboAño = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        s2_inputmarcas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        s2_inputmodelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        s2_chekTercerocompleto = new javax.swing.JCheckBox();
        s2_chekresponsabilidadcivil = new javax.swing.JCheckBox();
        s2_triesgosinfranquicia = new javax.swing.JCheckBox();
        s2_triesgoconfranq = new javax.swing.JCheckBox();
        s2_checkgranizo = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        s2_combofranquicias = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        b_svehiculos = new javax.swing.JButton();

        setTitle("Seguros");

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Operador"));
        jPanel1.setPreferredSize(new java.awt.Dimension(163, 51));

        jLabel1.setText("Id Operador");

        input_operador.setEnabled(false);

        n_op.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(n_op, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(input_fecha))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(input_operador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(input_operador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n_op, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar cliente"));

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(b_buscarcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(input_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_reiniciainput, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(input_cuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_reiniciainput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_buscarcliente)
                    .addComponent(b_cerrar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane5.setBorder(javax.swing.BorderFactory.createTitledBorder("Seguros"));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Beneficiarios"));

        s3_inputbeneficiario2.setEnabled(false);

        s3_inputbeneficiario3.setEnabled(false);

        s3_inputbeneficiario4.setEnabled(false);

        s1_combobenef1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "90", "80", "70", "60", "50", "40", "30", "20", "10" }));
        s1_combobenef1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1_combobenef1ActionPerformed(evt);
            }
        });

        s3_combobeneficiarios2.setEnabled(false);
        s3_combobeneficiarios2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3_combobeneficiarios2ActionPerformed(evt);
            }
        });

        s3_combobeneficiarios3.setEnabled(false);
        s3_combobeneficiarios3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3_combobeneficiarios3ActionPerformed(evt);
            }
        });

        s3_restobeneficiario.setEnabled(false);
        s3_restobeneficiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3_restobeneficiarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s3_inputbeneficiario4, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(s3_inputbeneficiario3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(s3_inputbeneficiario2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(s3_inputbeneficario1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s3_combobeneficiarios3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(s1_combobenef1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 66, Short.MAX_VALUE)
                        .addComponent(s3_combobeneficiarios2, 0, 1, Short.MAX_VALUE))
                    .addComponent(s3_restobeneficiario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s3_inputbeneficario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s1_combobenef1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s3_inputbeneficiario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s3_combobeneficiarios2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s3_inputbeneficiario3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s3_combobeneficiarios3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s3_inputbeneficiario4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s3_restobeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Coberturas"));

        s1_chek_muerte.setText("Muerte");
        s1_chek_muerte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1_chek_muerteActionPerformed(evt);
            }
        });

        s1_chek_muerteacc.setText("Muerte accidental");
        s1_chek_muerteacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1_chek_muerteaccActionPerformed(evt);
            }
        });

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        s1_chek_diasinternacion.setText("Dias de internacion");
        s1_chek_diasinternacion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                s1_chek_diasinternacionStateChanged(evt);
            }
        });
        s1_chek_diasinternacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1_chek_diasinternacionActionPerformed(evt);
            }
        });

        s3_diasinternacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30", "60", "90" }));
        s3_diasinternacion.setEnabled(false);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(s1_chek_diasinternacion))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(s3_diasinternacion, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(s1_chek_diasinternacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s3_diasinternacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        s1_chek_paralisis.setText("Paralisis parcial o total");
        s1_chek_paralisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1_chek_paralisisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s1_chek_muerte)
                            .addComponent(s1_chek_muerteacc)
                            .addComponent(s1_chek_paralisis))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(s1_chek_muerte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s1_chek_muerteacc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(s1_chek_paralisis)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jButton5.setText("Reset Formulario");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        b_svida.setText("Contratar");
        b_svida.setEnabled(false);
        b_svida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_svidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b_svida, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(b_svida))
                .addContainerGap())
        );

        jTabbedPane5.addTab("Vida", jPanel3);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Cobertura"), "Coberturas"));

        S1_chekIncendio.setText("Incendio");
        S1_chekIncendio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                S1_chekIncendioStateChanged(evt);
            }
        });
        S1_chekIncendio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S1_chekIncendioActionPerformed(evt);
            }
        });

        s1_chekRobo.setText("Robo");
        s1_chekRobo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                s1_chekRoboStateChanged(evt);
            }
        });

        s1_chekInundacion.setText("Inundacion");
        s1_chekInundacion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                s1_chekInundacionStateChanged(evt);
            }
        });

        s1_comboincendio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Parcial", "Total" }));
        s1_comboincendio.setEnabled(false);

        s1_comborobo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Parcial", "Total" }));
        s1_comborobo.setEnabled(false);

        s1_comboinundacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Parcial", "Total" }));
        s1_comboinundacion.setEnabled(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(S1_chekIncendio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(s1_comboincendio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(s1_chekInundacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(s1_comboinundacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(s1_chekRobo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(s1_comborobo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(S1_chekIncendio)
                    .addComponent(s1_comboincendio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s1_chekRobo)
                    .addComponent(s1_comborobo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s1_chekInundacion)
                    .addComponent(s1_comboinundacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Elementos Dañados / Robados"));

        S1_chekIheladera.setText("Heladera");

        S1_cheklavarropas.setText("Lavarropa");

        S1_chekcocina.setText("Cocina");

        S1_cheknotebook.setText("Notebook");
        S1_cheknotebook.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                S1_cheknotebookStateChanged(evt);
            }
        });

        S1_chekconsola.setText("Consola");

        S1_chektelevisor.setText("Televisor");
        S1_chektelevisor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                S1_chektelevisorStateChanged(evt);
            }
        });

        s1_inputnotebook.setEnabled(false);

        s1_inputtelevisor.setEnabled(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(S1_chekIheladera)
                    .addComponent(S1_cheklavarropas)
                    .addComponent(S1_chekcocina)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(S1_cheknotebook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(s1_inputnotebook, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(S1_chekconsola)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(S1_chektelevisor)
                        .addGap(18, 18, 18)
                        .addComponent(s1_inputtelevisor, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(S1_chekIheladera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(S1_cheklavarropas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(S1_chekcocina)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(S1_cheknotebook)
                    .addComponent(s1_inputnotebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(S1_chekconsola)
                .addGap(11, 11, 11)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(S1_chektelevisor)
                    .addComponent(s1_inputtelevisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        b_resetHogar.setText("Reset Formulario");
        b_resetHogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_resetHogarActionPerformed(evt);
            }
        });

        b_shogar.setText("Contratar");
        b_shogar.setEnabled(false);
        b_shogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_shogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b_shogar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_resetHogar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_resetHogar)
                    .addComponent(b_shogar))
                .addContainerGap())
        );

        jTabbedPane5.addTab("Hogar", jPanel5);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Vehiculo"));

        s2_comboAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2001", "2000" }));

        jLabel3.setText("Dominio");

        jLabel4.setText("Marca");

        jLabel5.setText("Modelo");

        jLabel6.setText("Año");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(s2_comboAño, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(s2_inputmarcas, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s2_inputmodelo)
                    .addComponent(s2_inputDominio, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(20, 20, 20))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s2_inputDominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s2_inputmarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s2_inputmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s2_comboAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Coberturas"));

        s2_chekTercerocompleto.setText("Tercero Completo");

        s2_chekresponsabilidadcivil.setText("Responsabilidad Civil");

        s2_triesgosinfranquicia.setText("Todo Riesgo sin franquicia");

        s2_triesgoconfranq.setText("Todo Riesgo con franquicia");

        s2_checkgranizo.setText("Granizo");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s2_chekTercerocompleto)
                    .addComponent(s2_chekresponsabilidadcivil)
                    .addComponent(s2_triesgosinfranquicia)
                    .addComponent(s2_triesgoconfranq)
                    .addComponent(s2_checkgranizo))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(s2_chekTercerocompleto)
                .addGap(18, 18, 18)
                .addComponent(s2_chekresponsabilidadcivil)
                .addGap(18, 18, 18)
                .addComponent(s2_triesgosinfranquicia)
                .addGap(18, 18, 18)
                .addComponent(s2_triesgoconfranq)
                .addGap(18, 18, 18)
                .addComponent(s2_checkgranizo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Franquicia"));

        s2_combofranquicias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(s2_combofranquicias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(s2_combofranquicias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jButton1.setText("Reset Formulario");

        b_svehiculos.setText("Contratar");
        b_svehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_svehiculosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b_svehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_svehiculos)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jTabbedPane5.addTab("Vehiculo", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTabbedPane5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void b_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cerrarActionPerformed
    this.setVisible(false);
    }//GEN-LAST:event_b_cerrarActionPerformed

    private void b_reiniciainputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_reiniciainputActionPerformed
        this.input_cuit.setText("");
        this.input_cuit.setEnabled(true);
        this.b_buscarcliente.setEnabled(false);
        this.b_shogar.setEnabled(false);
        
    }//GEN-LAST:event_b_reiniciainputActionPerformed

    private void b_buscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarclienteActionPerformed
    cuit_ingresado = this.input_cuit.getText();
        this.validacuit();
    }//GEN-LAST:event_b_buscarclienteActionPerformed

    
    //boton para grabar seguro de vida
    private void b_svidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_svidaActionPerformed
        operacion = "Seguro de vida";
        
        String nid = n_op.getText();
        String va1 = this.input_operador.getText();// v_id_operador;
        String va2 = this.input_fecha.getText();// v_fecha;
        String va3 = this.input_cuit.getText();//cuit
        String va4 = operacion;
        
        //cargamos variables con lo seleccionado
        if (s1_chek_muerte.isSelected()){
        co1 = "Muerte";  
        }
         if (s1_chek_muerteacc.isSelected()){
        co2 ="Muerte Accidental";   
        } 
        
        if (s1_chek_paralisis.isSelected()){
        co3 ="Paralisis Parcial o total";  
        }
        
        if (s1_chek_diasinternacion.isSelected()){
        co4 ="Dias de internacion";   
        }   
        
        co4b = "Dias: " +(String) s3_diasinternacion.getSelectedItem();
        
        co6 = s3_inputbeneficario1.getText();
        if (s1_combobenef1.getSelectedIndex() != 0){
        co6b = (String) s1_combobenef1.getSelectedItem();
        }
        co7 = s3_inputbeneficiario2.getText();
        if (s3_combobeneficiarios2.getSelectedIndex() != 0){
        co7b = (String) s3_combobeneficiarios2.getSelectedItem();
        }
        co8 = s3_inputbeneficiario3.getText();
        if (s3_combobeneficiarios3.getSelectedIndex() != 0){
        co8b = (String) s3_combobeneficiarios3.getSelectedItem();
        }
        co9 = s3_inputbeneficiario4.getText();
        co9b = s3_restobeneficiario.getText();
        
        String detalle = "Cobertura: " +co1+ " " +co2+ " " +co3+ " " +co4+ 
                        "-"+co4b+ " " +co6+ "-" +co6b+ " " +co7+ "-" +co7b+ 
                        " "+co8+ "-" +co8b+ " " +co9+ "-" +co9b;
        
        
        //comprobamos si esta el archivo, sino, lo crea
        archivo_seguros.archivo_crear(this);

        //aca generamos una variable con todos los valores
        String linea = (""+nid+","+va1+","+va2+","+va3+","+va4+","+detalle);
        
        //grabamos la linea
        archivo_prestamos.archivo_escribir(""+linea);
        this.setVisible(false);
    }//GEN-LAST:event_b_svidaActionPerformed

    //boton para grabar seguro de hogar
    private void b_shogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_shogarActionPerformed
        operacion = "Seguro de Hogar";
        
        String nid = n_op.getText();
        String va1 = this.input_operador.getText();// v_id_operador;
        String va2 = this.input_fecha.getText();// v_fecha;
        String va3 = this.input_cuit.getText();//cuit
        String va4 = operacion;
        
        if (S1_chekIncendio.isSelected()){
        co1 = "Incendio"; 
        co1b = (String) s1_comboincendio.getSelectedItem();
        }

        if (s1_chekRobo.isSelected()){
        co2 = "Robo"; 
        co2b = (String) s1_comborobo.getSelectedItem();
        }
        
        if (s1_chekInundacion.isSelected()){
        co3 = "Inundacion"; 
        co3b = (String) s1_comboinundacion.getSelectedItem();
        }
        
        if (s1_chekInundacion.isSelected()){
        co3 = "Inundacion"; 
        co3b = (String) s1_comboinundacion.getSelectedItem();
        }
        
        if (S1_chekIheladera.isSelected()){
        co5 = "Heladera"; 
        }
        
         if (S1_cheklavarropas.isSelected()){
        co6 = "Lavarropas"; 
        }
         
          if (S1_chekcocina.isSelected()){
        co7 = "Cocina";
          }

            if (S1_cheknotebook.isSelected()){
        co8 = "Notebook"; 
        co8b = s1_inputnotebook.getText();
        }
            
              if (S1_chekconsola.isSelected()){
        co9 = "Consola"; 
        }
          
              
               if (S1_chektelevisor.isSelected()){
        co10 = "Televisor"; 
        co10b = s1_inputtelevisor.getText();
        }
       
               
                String detalle = "Cobertura: " +co1+ " " +co1b+ " " +co2+ " " +co2b+ 
                        "-"+co3+ " " +co3b+ "" +co4+ " " +co5+ "-" +co6+ 
                        " "+co7+ " " +co8+ " " +co8b+ "" +co9+
                        " "+co10+ " " +co10b;
                
        //comprobamos si esta el archivo, sino, lo crea
        archivo_seguros.archivo_crear(this);

        //aca generamos una variable con todos los valores
        String linea = (""+nid+","+va1+","+va2+","+va3+","+va4+","+detalle);
        
        //grabamos la linea
        archivo_prestamos.archivo_escribir(""+linea);
        this.setVisible(false);
    }//GEN-LAST:event_b_shogarActionPerformed

    //boton para grabar seguro de autos
    private void b_svehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_svehiculosActionPerformed
        operacion = "Seguro de vehiculos";
        
        String nid = n_op.getText();
        String va1 = this.input_operador.getText();// v_id_operador;
        String va2 = this.input_fecha.getText();// v_fecha;
        String va3 = this.input_cuit.getText();//cuit
        String va4 = operacion;
        //hasta aca las lineas para grabar en general todas las operaciones
        
        //comprobamos si esta el archivo, sino, lo crea
        archivo_seguros.archivo_crear(this);

        //aca generamos una variable con todos los valores
        String linea = (""+nid+","+va1+","+va2+","+va3+","+va4);
        
        //grabamos la linea
        archivo_prestamos.archivo_escribir(""+linea);
        this.setVisible(false);
    }//GEN-LAST:event_b_svehiculosActionPerformed

    private void S1_chekIncendioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S1_chekIncendioActionPerformed
        
    }//GEN-LAST:event_S1_chekIncendioActionPerformed

    private void S1_chekIncendioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_S1_chekIncendioStateChanged
       if (this.S1_chekIncendio.isSelected()) {
           habilitaboton();
     this.s1_comboincendio.setEnabled(true);
     } else {
      this.s1_comboincendio.setEnabled(false);   
     }   // TODO add your handling code here:
    }//GEN-LAST:event_S1_chekIncendioStateChanged

    private void s1_chekRoboStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_s1_chekRoboStateChanged
     if (this.s1_chekRobo.isSelected()){
         habilitaboton();
       this.s1_comborobo.setEnabled(true);
     } else {
       this.s1_comborobo.setEnabled(false);  
     }
    }//GEN-LAST:event_s1_chekRoboStateChanged

    private void s1_chekInundacionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_s1_chekInundacionStateChanged
    if (this.s1_chekInundacion.isSelected()){
        habilitaboton();
       this.s1_comboinundacion.setEnabled(true);
     } else {
       this.s1_comboinundacion.setEnabled(false);  
     }
    }//GEN-LAST:event_s1_chekInundacionStateChanged

    private void S1_cheknotebookStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_S1_cheknotebookStateChanged
     if (this.S1_cheknotebook.isSelected()){
       this.s1_inputnotebook.setEnabled(true);
     } else {
       this.s1_inputnotebook.setEnabled(false);  
     }
    }//GEN-LAST:event_S1_cheknotebookStateChanged

    private void S1_chektelevisorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_S1_chektelevisorStateChanged
     if (this.S1_chektelevisor.isSelected()){
       this.s1_inputtelevisor.setEnabled(true);
     } else {
       this.s1_inputtelevisor.setEnabled(false);  
     }    // TODO add your handling code here:
    }//GEN-LAST:event_S1_chektelevisorStateChanged

    private void b_resetHogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_resetHogarActionPerformed
      this.b_shogar.setEnabled(false);
      this.S1_chekIncendio.setSelected(false);
      this.s1_chekRobo.setSelected(false);
      this.s1_chekInundacion.setSelected(false);
      this.S1_chekIheladera.setSelected(false);
     this.S1_cheklavarropas.setSelected(false);
        this.S1_chekcocina.setSelected(false);
     this.S1_cheknotebook.setSelected(false);
     this.S1_chekconsola.setSelected(false);
        this.S1_chektelevisor.setSelected(false);
    this.s1_comboincendio.setEnabled(false);
    this.s1_comborobo.setEnabled(false);
    this.s1_comboinundacion.setEnabled(false);
    this.s1_inputnotebook.setText("");
    this.s1_inputtelevisor.setText("");
    this.s1_inputnotebook.setEnabled(false);
    this.s1_inputtelevisor.setEnabled(false);
    }//GEN-LAST:event_b_resetHogarActionPerformed

    private void s1_chek_diasinternacionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_s1_chek_diasinternacionStateChanged
    if (this.s1_chek_diasinternacion.isSelected())   {
    this.s3_diasinternacion.setEnabled(true);
    } else{
     this.s3_diasinternacion.setEnabled(false);
    }   // TODO add your handling code here:
    }//GEN-LAST:event_s1_chek_diasinternacionStateChanged

    private void s1_combobenef1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1_combobenef1ActionPerformed
    comboSvidaprimeraopcion = (String) this.s1_combobenef1.getSelectedItem();
    this.calculaporcentaje1(comboSvidaprimeraopcion);
    }//GEN-LAST:event_s1_combobenef1ActionPerformed

    private void s3_restobeneficiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3_restobeneficiarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s3_restobeneficiarioActionPerformed

    private void s3_combobeneficiarios3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3_combobeneficiarios3ActionPerformed
   comboSvidaterceraopcion = (String) this.s3_combobeneficiarios3.getSelectedItem();
    this.calculaporcentaje3(comboSvidaterceraopcion);   
    }//GEN-LAST:event_s3_combobeneficiarios3ActionPerformed

    private void s3_combobeneficiarios2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3_combobeneficiarios2ActionPerformed
    comboSvidasegundaopcion = (String) this.s3_combobeneficiarios2.getSelectedItem();
    this.calculaporcentaje2(comboSvidasegundaopcion);
    }//GEN-LAST:event_s3_combobeneficiarios2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    s1_chek_muerte.setSelected(false);
s1_chek_muerteacc.setSelected(false);
s1_chek_diasinternacion.setSelected(false);
s1_chek_paralisis.setSelected(false);
s3_inputbeneficario1.setText("");
s3_inputbeneficiario2.setText("");
s3_inputbeneficiario3.setText("");
s3_inputbeneficiario4.setText("");
s3_restobeneficiario.setText("");

//s3_combobeneficiarios3.setSelectedIndex(0);
//s3_combobeneficiarios2.setSelectedIndex(0);
//s1_combobenef1.setSelectedIndex(0);
//s3_diasinternacion.setSelectedIndex(0);
b_svida.setEnabled(false);
  
    }//GEN-LAST:event_jButton5ActionPerformed

    private void s1_chek_muerteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1_chek_muerteActionPerformed
    if (s1_chek_muerte.isSelected()){
       habilitaboton2();  
    }
       
    }//GEN-LAST:event_s1_chek_muerteActionPerformed

    private void s1_chek_muerteaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1_chek_muerteaccActionPerformed
    if (s1_chek_muerteacc.isSelected()){
       habilitaboton2();  
    }
    
    
    }//GEN-LAST:event_s1_chek_muerteaccActionPerformed

    private void s1_chek_diasinternacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1_chek_diasinternacionActionPerformed
     if (s1_chek_diasinternacion.isSelected()){
       habilitaboton2();  
    }
    }//GEN-LAST:event_s1_chek_diasinternacionActionPerformed

    private void s1_chek_paralisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1_chek_paralisisActionPerformed
     if (s1_chek_paralisis.isSelected()){
       habilitaboton2();  
    }   // TODO add your handling code here:
    }//GEN-LAST:event_s1_chek_paralisisActionPerformed
    
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
    
     private void habilitaboton(){
         
         boolean cobertura = false;
         
         if (S1_chekIncendio.isSelected()){
             cobertura = true;
         } else if ( s1_chekRobo.isSelected()){
             cobertura = true;
         } else if ( s1_chekInundacion.isSelected()){
             cobertura = true;
         }
         
         if (cobertura == true && contieneU == true){
             b_shogar.setEnabled(true);
     }
}
     
      private void habilitaboton2(){
         
         boolean cobertura = false;
         
         if (s1_chek_muerte.isSelected()){
             cobertura = true;
         } else if ( s1_chek_muerteacc.isSelected()){
             cobertura = true;
         } else if ( s1_chek_diasinternacion.isSelected()){
             cobertura = true;
         } else if ( s1_chek_paralisis.isSelected()){
             cobertura = true;
         }
         
         if (cobertura == true && contieneU == true){
             b_svida.setEnabled(true);
     }
     }
     //aca creamos las opciones que usaremos de acuerdo a la diferencia
    private String [] porcentajesr0 = {"10","20","30","40","50","60","70","80","90"};
    private String [] porcentajesr1 = {"10","20","30","40","50","60","70","80"};
    private String [] porcentajesr2 = {"10","20","30","40","50","60","70"};
    private String [] porcentajesr3 = {"10","20","30","40","50","60"};
    private String [] porcentajesr4 = {"10","20","30","40","50"};
    private String [] porcentajesr5 = {"10","20","30","40"};
    private String [] porcentajesr6 = {"10","20","30"};
    private String [] porcentajesr7 = {"10","20"};
    private String [] porcentajesr8 = {"10"};
    
    //hacemos un metodo para calcular porcentaje beneficiarios e ir habilitando input y porcentajes diferencia
     public void calculaporcentaje1(String comboSvidaprimeraopcion){ 
         //calculos para la primera opcion
         valor1 = Integer.parseInt(comboSvidaprimeraopcion);
         int diferencia1 = 100-valor1;
         System.out.println("Opcion 1: " +valor1);
         System.out.println("Diferencia 1: " +diferencia1);
         
         //si el tipo selecciona otro valor que no sea 100, entra aca
         if (diferencia1 <= 90 & diferencia1 >= 9){
             //habilita el segundo combo y le pone las opciones
             s3_combobeneficiarios2.setEnabled(true);
             s3_inputbeneficiario2.setEnabled(true);
             switch (diferencia1){
                 case 10:
                    s3_combobeneficiarios2.setModel(new DefaultComboBoxModel <>(porcentajesr8));
                 break;
                 case 20:
                     s3_combobeneficiarios2.setModel(new DefaultComboBoxModel <>(porcentajesr7));
                 break;
                 case 30:
                     s3_combobeneficiarios2.setModel(new DefaultComboBoxModel <>(porcentajesr6));
                 break;
                 case 40:
                     s3_combobeneficiarios2.setModel(new DefaultComboBoxModel <>(porcentajesr5));
                 break;
                 case 50:
                     s3_combobeneficiarios2.setModel(new DefaultComboBoxModel <>(porcentajesr4));
                 break;
                 case 60:
                     s3_combobeneficiarios2.setModel(new DefaultComboBoxModel <>(porcentajesr3));
                 break;
                 case 70:
                     s3_combobeneficiarios2.setModel(new DefaultComboBoxModel <>(porcentajesr2));
                 break;
                 case 80:
                     s3_combobeneficiarios2.setModel(new DefaultComboBoxModel <>(porcentajesr1));
                 break;
                 case 90:
                    s3_combobeneficiarios2.setModel(new DefaultComboBoxModel <>(porcentajesr0));
                 break;      
             }
                 
         } else if (diferencia1 == 0){
             s3_combobeneficiarios2.setEnabled(false);
             s3_inputbeneficiario2.setEnabled(false);
         }
                   
     }
     
     //armamos el combobox que sigue
     public void calculaporcentaje2(String comboSvidasegundaopcion){
         valor2 = Integer.parseInt(comboSvidasegundaopcion);
         int diferencia2 = 100-(valor1+valor2);
         System.out.println("Opcion 2: " +valor2);
         System.out.println("Diferencia 2: " +diferencia2);
       
         if (diferencia2 <= 80 & diferencia2 >= 9){
             s3_combobeneficiarios3.setEnabled(true);
             s3_inputbeneficiario3.setEnabled(true);
             switch (diferencia2){
                 case 10:
                    s3_combobeneficiarios3.setModel(new DefaultComboBoxModel <>(porcentajesr8));
                 break;
                 case 20:
                     s3_combobeneficiarios3.setModel(new DefaultComboBoxModel <>(porcentajesr7));
                 break;
                 case 30:
                     s3_combobeneficiarios3.setModel(new DefaultComboBoxModel <>(porcentajesr6));
                 break;
                 case 40:
                     s3_combobeneficiarios3.setModel(new DefaultComboBoxModel <>(porcentajesr5));
                 break;
                 case 50:
                     s3_combobeneficiarios3.setModel(new DefaultComboBoxModel <>(porcentajesr4));
                 break;
                 case 60:
                     s3_combobeneficiarios3.setModel(new DefaultComboBoxModel <>(porcentajesr3));
                 break;
                 case 70:
                     s3_combobeneficiarios3.setModel(new DefaultComboBoxModel <>(porcentajesr2));
                 break;
                 case 80:
                     s3_combobeneficiarios3.setModel(new DefaultComboBoxModel <>(porcentajesr1));
                 break;  
             }
             
         } else if (diferencia2 == 0){
             s3_combobeneficiarios3.setEnabled(false);
             s3_inputbeneficiario3.setEnabled(false);
         }
    } 
     
     public void calculaporcentaje3(String comboSvidaterceraopcion){
         valor3 = Integer.parseInt(comboSvidaterceraopcion);
         int diferencia3 = 100-(valor1+valor2+valor3);
         String ultimo = (String)""+diferencia3;
         System.out.println("Opcion 3: " +valor3);
         System.out.println("Diferencia 3: " +diferencia3);
         
         if (diferencia3 <= 70 & diferencia3 >= 9){
             s3_inputbeneficiario4.setEnabled(true);
             s3_restobeneficiario.setText(ultimo);
             
             } else if (diferencia3 == 0){
             s3_inputbeneficiario4.setEnabled(false);
         }
     }
     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox S1_chekIheladera;
    private javax.swing.JCheckBox S1_chekIncendio;
    private javax.swing.JCheckBox S1_chekcocina;
    private javax.swing.JCheckBox S1_chekconsola;
    private javax.swing.JCheckBox S1_cheklavarropas;
    private javax.swing.JCheckBox S1_cheknotebook;
    private javax.swing.JCheckBox S1_chektelevisor;
    private javax.swing.JButton b_buscarcliente;
    private javax.swing.JButton b_cerrar;
    private javax.swing.JButton b_reiniciainput;
    private javax.swing.JButton b_resetHogar;
    private javax.swing.JButton b_shogar;
    private javax.swing.JButton b_svehiculos;
    private javax.swing.JButton b_svida;
    private javax.swing.JTextField input_cuit;
    private javax.swing.JTextField input_fecha;
    private javax.swing.JTextField input_operador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextField n_op;
    private javax.swing.JCheckBox s1_chekInundacion;
    private javax.swing.JCheckBox s1_chekRobo;
    private javax.swing.JCheckBox s1_chek_diasinternacion;
    private javax.swing.JCheckBox s1_chek_muerte;
    private javax.swing.JCheckBox s1_chek_muerteacc;
    private javax.swing.JCheckBox s1_chek_paralisis;
    private javax.swing.JComboBox<String> s1_combobenef1;
    private javax.swing.JComboBox<String> s1_comboincendio;
    private javax.swing.JComboBox<String> s1_comboinundacion;
    private javax.swing.JComboBox<String> s1_comborobo;
    private javax.swing.JTextField s1_inputnotebook;
    private javax.swing.JTextField s1_inputtelevisor;
    private javax.swing.JCheckBox s2_checkgranizo;
    private javax.swing.JCheckBox s2_chekTercerocompleto;
    private javax.swing.JCheckBox s2_chekresponsabilidadcivil;
    private javax.swing.JComboBox<String> s2_comboAño;
    private javax.swing.JComboBox<String> s2_combofranquicias;
    private javax.swing.JTextField s2_inputDominio;
    private javax.swing.JTextField s2_inputmarcas;
    private javax.swing.JTextField s2_inputmodelo;
    private javax.swing.JCheckBox s2_triesgoconfranq;
    private javax.swing.JCheckBox s2_triesgosinfranquicia;
    private javax.swing.JComboBox<String> s3_combobeneficiarios2;
    private javax.swing.JComboBox<String> s3_combobeneficiarios3;
    private javax.swing.JComboBox<String> s3_diasinternacion;
    private javax.swing.JTextField s3_inputbeneficario1;
    private javax.swing.JTextField s3_inputbeneficiario2;
    private javax.swing.JTextField s3_inputbeneficiario3;
    private javax.swing.JTextField s3_inputbeneficiario4;
    private javax.swing.JTextField s3_restobeneficiario;
    // End of variables declaration//GEN-END:variables
}
