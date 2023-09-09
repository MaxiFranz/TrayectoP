/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguroscfp010923;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.String;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class gestor extends javax.swing.JFrame {

    /**
     * Creates new form gestor
     */
    public gestor() {
        initComponents();
        this.setLocationRelativeTo(null);
        Date myDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy H:m");
        String v_fechaComoCadena = sdf.format(new Date());
        this.label_fecha.setText(v_fechaComoCadena);
        
    }
    
    boolean arroba = false;
    boolean punto = false;
    int paso = 0;
    String mail;
    
    public void validamail(){
        mail = this.input_email.getText();
        
         for (int i = 0; i<mail.length(); i++) {

        for (int j = 0; j<mail.length(); j++) {

            if(mail.charAt(i)=='@' && mail.charAt(j)=='.') {

                arroba = true;
                punto = true;
            }

        }

    }

    if (arroba == true && punto == true) {
        paso = 1;
        System.out.println("El mail ingresado es correcto");
    }
    else {
        System.out.println("El mail ingresado es incorrecto");
        }

    }
            
    //variables para calculo seguro vida porcentaje
    String comboSvidaprimeraopcion;  
    String comboSvidasegundaopcion;
    String comboSvidaterceraopcion;
    int valor1;
    int valor2;
    int valor3;
    //***********************************************************
    
    //variables para datos en comun
    String f1fecha;
    String f1cuil;
    String f1nombre;
    String f1telefono;
    String f1email;
    String f1tipodeseguro;
    
    //resto de las variables
    String v1;  
    String v2; 
    String v3; 
    String v4;  
    String v5;  
    String v6;  
    String v7; 
    String v8;  
    String v9; 
    String v10;
    String v11;  
    String v12; 
    String v13; 
    String v14;  
    String v15;  
    String v16;  
    String v17; 
    String v18;  
    String v19; 
    String v20; 
    String v21;
    String v22;  
    String v23; 
    String v24; 
    String v25;  
    String v26;  
    String v27;  
    String v28; 
    String v29;  
    String v30; 
    String v31; 
    String v32; 
    String v33; 
    String v34;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        input_cuil = new javax.swing.JTextField();
        input_nombre = new javax.swing.JTextField();
        input_telefono = new javax.swing.JTextField();
        input_email = new javax.swing.JTextField();
        b_salir = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        b_grabarhogar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        S1_chekIncendio = new javax.swing.JCheckBox();
        s1_chekRobo = new javax.swing.JCheckBox();
        s1_chekInundacion = new javax.swing.JCheckBox();
        s1_comboincendio = new javax.swing.JComboBox<>();
        s1_comborobo = new javax.swing.JComboBox<>();
        s1_comboinundacion = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        S1_chekIheladera = new javax.swing.JCheckBox();
        S1_cheklavarropas = new javax.swing.JCheckBox();
        S1_chekcocina = new javax.swing.JCheckBox();
        S1_cheknotebook = new javax.swing.JCheckBox();
        S1_chekconsola = new javax.swing.JCheckBox();
        S1_chektelevisor = new javax.swing.JCheckBox();
        s1_inputnotebook = new javax.swing.JTextField();
        s1_inputtelevisor = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        b_grabarvehiculo = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        s2_inputDominio = new javax.swing.JTextField();
        s2_combomarcas = new javax.swing.JComboBox<>();
        s2_combomodelos = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        s2_comboAño = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        s2_combofranquicias = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        s2_chekTercerocompleto = new javax.swing.JCheckBox();
        s2_chekresponsabilidadcivil = new javax.swing.JCheckBox();
        s2_triesgosinfranquicia = new javax.swing.JCheckBox();
        s2_triesgoconfranq = new javax.swing.JCheckBox();
        s2_checkgranizo = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        b_grabarpvida = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        s3_checkMuerte = new javax.swing.JCheckBox();
        s3_chekMuerteaccidental = new javax.swing.JCheckBox();
        s3_paralisis = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        s3_diasinternacion = new javax.swing.JCheckBox();
        s3_comboDiasinternacion = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        s3_inputbeneficiario1 = new javax.swing.JTextField();
        s3_inputbeneficiario2 = new javax.swing.JTextField();
        s3_inputbeneficiario3 = new javax.swing.JTextField();
        s3_inputbeneficiario4 = new javax.swing.JTextField();
        s3_combobeneficiarios1 = new javax.swing.JComboBox<>();
        s3_combobeneficiarios2 = new javax.swing.JComboBox<>();
        s3_combobeneficiarios3 = new javax.swing.JComboBox<>();
        s3_restobeneficiario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        label_fecha = new javax.swing.JLabel();
        b_vercontrataciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del cliente"));

        jLabel1.setText("CUIL/CUIT");

        jLabel2.setText("NOMBRE Y  APELLIDO");

        jLabel3.setText("TELEFONO");

        jLabel4.setText("EMAIL");

        input_cuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_cuilActionPerformed(evt);
            }
        });
        input_cuil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_cuilKeyTyped(evt);
            }
        });

        input_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_nombreKeyTyped(evt);
            }
        });

        input_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_telefonoKeyTyped(evt);
            }
        });

        input_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_emailKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(input_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(input_cuil)
                    .addComponent(input_telefono)
                    .addComponent(input_email))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(input_cuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(input_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        b_salir.setText("CERRAR");
        b_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salirActionPerformed(evt);
            }
        });

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        b_grabarhogar.setText("CONTRATAR");
        b_grabarhogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_grabarhogarActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Coberturas"));

        S1_chekIncendio.setText("Incendio");
        S1_chekIncendio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                S1_chekIncendioStateChanged(evt);
            }
        });

        s1_chekRobo.setText("Robo");
        s1_chekRobo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1_chekRoboActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(s1_chekRobo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(s1_comborobo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(S1_chekIncendio, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(s1_comboincendio, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(s1_chekInundacion, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(s1_comboinundacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(S1_chekIncendio)
                    .addComponent(s1_comboincendio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s1_chekRobo)
                    .addComponent(s1_comborobo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s1_chekInundacion)
                    .addComponent(s1_comboinundacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Elementos dañados/robados"));

        S1_chekIheladera.setText("Heladera");

        S1_cheklavarropas.setText("Lavarropas");

        S1_chekcocina.setText("Cocina");

        S1_cheknotebook.setText("Notebook");
        S1_cheknotebook.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                S1_cheknotebookStateChanged(evt);
            }
        });

        S1_chekconsola.setText("Consola Games");

        S1_chektelevisor.setText("Televisor");
        S1_chektelevisor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                S1_chektelevisorStateChanged(evt);
            }
        });

        s1_inputnotebook.setEnabled(false);

        s1_inputtelevisor.setEnabled(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(S1_chekIheladera, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S1_chekcocina, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(S1_cheknotebook, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(s1_inputnotebook, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(S1_chekconsola)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(S1_chektelevisor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(s1_inputtelevisor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(S1_cheklavarropas, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(S1_chekIheladera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(S1_cheklavarropas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(S1_chekcocina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s1_inputnotebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S1_cheknotebook))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(S1_chekconsola)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(S1_chektelevisor)
                    .addComponent(s1_inputtelevisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_grabarhogar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(180, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(b_grabarhogar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47))))
        );

        jTabbedPane2.addTab("HOGAR", jPanel2);

        b_grabarvehiculo.setText("CONTRATAR");
        b_grabarvehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_grabarvehiculoActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del vehiculo"));

        jLabel6.setText("Dominio");

        jLabel7.setText("Marca");

        jLabel8.setText("Modelo");

        s2_combomarcas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Ford", "Renault", "Wolkswagen" }));
        s2_combomarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2_combomarcasActionPerformed(evt);
            }
        });

        s2_combomodelos.setEnabled(false);

        jLabel9.setText("Año");

        s2_comboAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2001", "2000" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(s2_combomarcas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(s2_inputDominio)
                    .addComponent(s2_combomodelos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(s2_comboAño, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(s2_inputDominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(s2_combomarcas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s2_combomodelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(s2_comboAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Franquicia"));

        s2_combofranquicias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "20000", "40000", "60000", "80000", "100000" }));
        s2_combofranquicias.setEnabled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(s2_combofranquicias, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(s2_combofranquicias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Coberturas"));

        s2_chekTercerocompleto.setText("Tercero Completo");
        s2_chekTercerocompleto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                s2_chekTercerocompletoStateChanged(evt);
            }
        });
        s2_chekTercerocompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2_chekTercerocompletoActionPerformed(evt);
            }
        });

        s2_chekresponsabilidadcivil.setText("Responsabilidad Civil");

        s2_triesgosinfranquicia.setText("Todo Riesgo Sin franquicia");
        s2_triesgosinfranquicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2_triesgosinfranquiciaActionPerformed(evt);
            }
        });

        s2_triesgoconfranq.setText("Todo Riesgo Con Franquicia");
        s2_triesgoconfranq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2_triesgoconfranqActionPerformed(evt);
            }
        });

        s2_checkgranizo.setText("Granizo");
        s2_checkgranizo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2_checkgranizoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s2_triesgoconfranq)
                    .addComponent(s2_checkgranizo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s2_chekresponsabilidadcivil)
                    .addComponent(s2_chekTercerocompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s2_triesgosinfranquicia, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(s2_chekTercerocompleto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s2_chekresponsabilidadcivil)
                .addGap(18, 18, 18)
                .addComponent(s2_triesgosinfranquicia)
                .addGap(18, 18, 18)
                .addComponent(s2_triesgoconfranq)
                .addGap(18, 18, 18)
                .addComponent(s2_checkgranizo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_grabarvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b_grabarvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(45, 45, 45))
        );

        jTabbedPane2.addTab("VEHICULO", jPanel3);

        b_grabarpvida.setText("CONTRATAR");
        b_grabarpvida.setPreferredSize(new java.awt.Dimension(199, 66));
        b_grabarpvida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_grabarpvidaActionPerformed(evt);
            }
        });

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Coberturas"));

        s3_checkMuerte.setText("Muerte");
        s3_checkMuerte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3_checkMuerteActionPerformed(evt);
            }
        });

        s3_chekMuerteaccidental.setText("Muerte accidental");

        s3_paralisis.setText("Paralisis Parcial o Total");

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        s3_diasinternacion.setText("Dias de internación");
        s3_diasinternacion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                s3_diasinternacionStateChanged(evt);
            }
        });

        s3_comboDiasinternacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "30", "60", "90" }));
        s3_comboDiasinternacion.setEnabled(false);

        jLabel10.setText("Dias");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s3_diasinternacion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(s3_comboDiasinternacion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(s3_diasinternacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(s3_comboDiasinternacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s3_checkMuerte, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s3_chekMuerteaccidental, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(s3_paralisis, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(s3_checkMuerte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s3_chekMuerteaccidental)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(s3_paralisis)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Beneficiarios"));

        s3_inputbeneficiario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3_inputbeneficiario1ActionPerformed(evt);
            }
        });

        s3_inputbeneficiario2.setEnabled(false);

        s3_inputbeneficiario3.setEnabled(false);

        s3_inputbeneficiario4.setEnabled(false);

        s3_combobeneficiarios1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "90", "80", "70", "60", "50", "40", "30", "20", "10" }));
        s3_combobeneficiarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3_combobeneficiarios1ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s3_inputbeneficiario4, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(s3_inputbeneficiario3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(s3_inputbeneficiario2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(s3_inputbeneficiario1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(s3_combobeneficiarios2, javax.swing.GroupLayout.Alignment.TRAILING, 0, 1, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(s3_restobeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s3_combobeneficiarios3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(s3_combobeneficiarios1, 0, 1, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s3_inputbeneficiario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s3_combobeneficiarios1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s3_inputbeneficiario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s3_combobeneficiarios2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s3_inputbeneficiario3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s3_combobeneficiarios3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s3_inputbeneficiario4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s3_restobeneficiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(b_grabarpvida, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_grabarpvida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jTabbedPane2.addTab("VIDA", jPanel4);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seguroscfp010923/imagenes/logo.png"))); // NOI18N

        b_vercontrataciones.setText("CONTRATACIONES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_vercontrataciones, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_salir, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(b_vercontrataciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_grabarpvidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_grabarpvidaActionPerformed
    //lineas que se repiten en cada boton contratar
    archivo archi = new archivo();
    archi.crearArchivo();
    
    //valores que tienen en comun. Solo cambiar tipo de seguro
    f1fecha = this.label_fecha.getText();
    f1cuil = this.input_cuil.getText();
    f1nombre = this.input_nombre.getText();
    f1telefono = this.input_telefono.getText();
    f1email = this.input_email.getText();
    f1tipodeseguro = "Vida";//
    
    //instanciamos variables para mensajero
    if (this.s3_checkMuerte.isSelected()){
        v22 = this.s3_checkMuerte.getText();
    } else {
        v22 = " ";
    }
    
    if (this.s3_chekMuerteaccidental.isSelected()){
       v23 = this.s3_chekMuerteaccidental.getText();
    } else {
        v23 = " ";
    }
     
    if (this.s3_diasinternacion.isSelected()){
       v24 = this.s3_diasinternacion.getText();
       v25 =  (String) this.s3_comboDiasinternacion.getSelectedItem();
    } else {
        v24 = " ";
        v25 = " ";
    }
    
    if (this.s3_paralisis.isSelected()){
       v26 = this.s3_diasinternacion.getText();
    } else {
        v26 = " ";
    }
      
    v27 = this.s3_inputbeneficiario1.getText();
    v28 = (String) this.s3_combobeneficiarios1.getSelectedItem();
    
    if (this.s3_inputbeneficiario2.isEnabled()){
        v29 =  this.s3_inputbeneficiario2.getText();
        v30 = (String) this.s3_combobeneficiarios2.getSelectedItem();
    } else {
       v29 = " ";
       v30 = " ";
    }
    
    if (this.s3_inputbeneficiario3.isEnabled()){
        v31 = this.s3_inputbeneficiario3.getText();
        v32 = (String) this.s3_combobeneficiarios3.getSelectedItem();
    } else {
       v31 = " ";
       v32 = " ";
    }
    
    if (this.s3_inputbeneficiario4.isEnabled()){
         v33 = this.s3_inputbeneficiario4.getText();
        v34 = (String) this.s3_restobeneficiario.getText();
    } else {
       v33 = " ";
       v34 = " ";
    }
    
     //creamos mensajero
    Persona Persona = new Persona(f1tipodeseguro, f1fecha, f1cuil, f1nombre, f1telefono, f1email,v22,v23, v24,v25,v26,v27,v28,v29,v30,v31,v32,v33,v34);
    archi.escribirArchivo(Persona);
    
    
    }//GEN-LAST:event_b_grabarpvidaActionPerformed

    private void input_cuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_cuilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_cuilActionPerformed

    private void b_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salirActionPerformed
    System.exit(0);    // TODO add your handling code here:
    }//GEN-LAST:event_b_salirActionPerformed

    private void s1_chekRoboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1_chekRoboActionPerformed
    if (this.s1_chekRobo.isSelected()){
        this.s1_comborobo.setEnabled(true);
    }else {
      this.s1_comborobo.setEnabled(false);  
    }
        
    }//GEN-LAST:event_s1_chekRoboActionPerformed

    private void S1_chekIncendioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_S1_chekIncendioStateChanged
     if (this.S1_chekIncendio.isSelected()) {
     this.s1_comboincendio.setEnabled(true);
     } else {
      this.s1_comboincendio.setEnabled(false);   
     }   // TODO add your handling code here:
    }//GEN-LAST:event_S1_chekIncendioStateChanged

    private void s1_chekInundacionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_s1_chekInundacionStateChanged
     if (this.s1_chekInundacion.isSelected()){
     this.s1_comboinundacion.setEnabled(true);
     } else {
     this.s1_comboinundacion.setEnabled(false);
     }    // TODO add your handling code here:
    }//GEN-LAST:event_s1_chekInundacionStateChanged

    private void S1_cheknotebookStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_S1_cheknotebookStateChanged
     if (this.S1_cheknotebook.isSelected())  {
     this.s1_inputnotebook.setEnabled(true);
     } else {
       this.s1_inputnotebook.setEnabled(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_S1_cheknotebookStateChanged

    private void S1_chektelevisorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_S1_chektelevisorStateChanged
     if (this.S1_chektelevisor.isSelected()) {
     this.s1_inputtelevisor.setEnabled(true);
     } else  {
      this.s1_inputtelevisor.setEnabled(false);  
      }  // TODO add your handling code here:
    }//GEN-LAST:event_S1_chektelevisorStateChanged

    private void s2_combomarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2_combomarcasActionPerformed
    //marcas segun modelos
    
   
        int marca_seleccion = this.s2_combomarcas.getSelectedIndex();
        if (marca_seleccion != 0){
            s2_combomodelos.setEnabled(true);
            //opciones de modelos segun la marca seleccionada
            switch (marca_seleccion){
                case 0:
                   
                break;
                case 1://ford
                    this.s2_combomodelos.addItem("Bronco Sport");
                    this.s2_combomodelos.addItem("Maverick");
                    this.s2_combomodelos.addItem("Mustang");
                    this.s2_combomodelos.addItem("Raptor");
                    this.s2_combomodelos.addItem("Otro");
                    //removemos el resto
                    this.s2_combomodelos.removeItem("Alaskan");
                    this.s2_combomodelos.removeItem("Duster");
                    this.s2_combomodelos.removeItem("Kangoo");
                    this.s2_combomodelos.removeItem("Logan");
                    this.s2_combomodelos.removeItem("T-Cross");
                    this.s2_combomodelos.removeItem("PoloTrack");
                    this.s2_combomodelos.removeItem("Taos");
                break;
                case 2://renault
                    this.s2_combomodelos.addItem("Alaskan");
                    this.s2_combomodelos.addItem("Duster");
                    this.s2_combomodelos.addItem("Kangoo");
                    this.s2_combomodelos.addItem("Logan");
                    //removemos el resto
                    this.s2_combomodelos.removeItem("Bronco Sport");
                    this.s2_combomodelos.removeItem("Maverick");
                    this.s2_combomodelos.removeItem("Mustang");
                    this.s2_combomodelos.removeItem("Raptor");
                    this.s2_combomodelos.removeItem("T-Cross");
                    this.s2_combomodelos.removeItem("PoloTrack");
                    this.s2_combomodelos.removeItem("Taos"); 
                break;
                case 3://wolksvagen
                    this.s2_combomodelos.addItem("T-Cross");
                    this.s2_combomodelos.addItem("PoloTrack");
                    this.s2_combomodelos.addItem("Taos");
                    //removemos el resto
                    this.s2_combomodelos.removeItem("Alaskan");
                    this.s2_combomodelos.removeItem("Duster");
                    this.s2_combomodelos.removeItem("Kangoo");
                    this.s2_combomodelos.removeItem("Logan");
                    this.s2_combomodelos.removeItem("BroncoSport");
                    this.s2_combomodelos.removeItem("Maverick");
                    this.s2_combomodelos.removeItem("Mustang");
                    this.s2_combomodelos.removeItem("Raptor");
                break;
            }
            
        }else {
        s2_combomodelos.setEnabled(false);
        }
    }//GEN-LAST:event_s2_combomarcasActionPerformed

    private void s2_chekTercerocompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2_chekTercerocompletoActionPerformed
    if (s2_chekTercerocompleto.isSelected()){
        s2_chekresponsabilidadcivil.setSelected(true);
        s2_chekresponsabilidadcivil.setEnabled(false);
       } else {
         s2_chekresponsabilidadcivil.setSelected(false);
        s2_chekresponsabilidadcivil.setEnabled(true);
    }
    }//GEN-LAST:event_s2_chekTercerocompletoActionPerformed

    private void s3_checkMuerteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3_checkMuerteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s3_checkMuerteActionPerformed

    private void s3_inputbeneficiario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3_inputbeneficiario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s3_inputbeneficiario1ActionPerformed

    private void s3_diasinternacionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_s3_diasinternacionStateChanged
    if (this.s3_diasinternacion.isSelected())   {
    this.s3_comboDiasinternacion.setEnabled(true);
    } else{
     this.s3_comboDiasinternacion.setEnabled(false);
    }   // TODO add your handling code here:
    }//GEN-LAST:event_s3_diasinternacionStateChanged

    private void s3_combobeneficiarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3_combobeneficiarios1ActionPerformed
     comboSvidaprimeraopcion = (String) this.s3_combobeneficiarios1.getSelectedItem();
     this.calculaporcentaje1(comboSvidaprimeraopcion);
    }//GEN-LAST:event_s3_combobeneficiarios1ActionPerformed

    private void s3_combobeneficiarios2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3_combobeneficiarios2ActionPerformed
    comboSvidasegundaopcion = (String) this.s3_combobeneficiarios2.getSelectedItem();
    this.calculaporcentaje2(comboSvidasegundaopcion);
    }//GEN-LAST:event_s3_combobeneficiarios2ActionPerformed

    private void s3_combobeneficiarios3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3_combobeneficiarios3ActionPerformed
    comboSvidaterceraopcion = (String) this.s3_combobeneficiarios3.getSelectedItem();
    this.calculaporcentaje3(comboSvidaterceraopcion);    // TODO add your handling code here:
    }//GEN-LAST:event_s3_combobeneficiarios3ActionPerformed

    private void b_grabarhogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_grabarhogarActionPerformed
    
    this.validamail();
    if (paso == 1){
        
    
    //vamos a validar el correo aca
    


    archivo archi = new archivo();
    archi.crearArchivo();
    
    //valores que tienen en comun. Solo cambiar tipo de seguro
    f1fecha = this.label_fecha.getText();
    f1cuil = this.input_cuil.getText();
    f1nombre = this.input_nombre.getText();
    f1telefono = this.input_telefono.getText();
    f1email = this.input_email.getText();
    f1tipodeseguro = "Hogar";//
    
    //instanciamos variables para mensajero
    if (S1_chekIncendio.isSelected()){
        v1 = S1_chekIncendio.getText();
        v4 = (String) this.s1_comboincendio.getSelectedItem();
    } else {
         v1 = " ";
         v4 = " ";       
    }
    if (s1_chekRobo.isSelected()){
        v2 = s1_chekRobo.getText();
         v5 = (String) this.s1_comborobo.getSelectedItem();
    } else {
         v2 = " ";
         v5 = " ";       
    } 
    if (s1_chekInundacion.isSelected()){
        v3 = s1_chekInundacion.getText();
        v6 = (String) this.s1_comboinundacion.getSelectedItem();
    } else {
         v3 = " ";
         v6 = " ";       
    }  
 
     if (S1_chekIheladera.isSelected()){
        v7 = S1_chekIheladera.getText();
    } else {
         v7 = " ";
     }
     
      if (S1_cheklavarropas.isSelected()){
            v8 = S1_cheklavarropas.getText();
    } else {
         v8 = " ";
     }
      
       if (S1_chekcocina.isSelected()){
        v9 = S1_chekcocina.getText();
    } else {
        v9 = " ";
     }
        if (S1_cheknotebook.isSelected()){
        v10 = S1_cheknotebook.getText();
        v11 = this.s1_inputnotebook.getText();
    }else {
         v10 = " ";
         v11 = " ";
     }
    
    //creamos mensajero
    Persona Persona = new Persona(f1tipodeseguro, f1fecha, f1cuil, f1nombre, f1telefono, f1email,v1,v4, v2,v5,v3,v6,v7,v8,v9,v10,v11);
    archi.escribirArchivo(Persona);
    
    this.limpiatutto1();
    } else {
        this.input_email.setText(" ");
    }
    }//GEN-LAST:event_b_grabarhogarActionPerformed

    private void b_grabarvehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_grabarvehiculoActionPerformed
     //lineas que se repiten en cada boton contratar
    archivo archi = new archivo();
    archi.crearArchivo();
    
    //valores que tienen en comun. Solo cambiar tipo de seguro
    f1fecha = this.label_fecha.getText();
    f1cuil = this.input_cuil.getText();
    f1nombre = this.input_nombre.getText();
    f1telefono = this.input_telefono.getText();
    f1email = this.input_email.getText();
    f1tipodeseguro = "Vehiculos";//
    
    //instanciamos variables para mensajero
    v12 = this.s2_inputDominio.getText();
    v13 = (String) this.s2_combomarcas.getSelectedItem();
    v14 = (String) this.s2_combomodelos.getSelectedItem();
    v15 = (String) this.s2_comboAño.getSelectedItem();
    v16 = (String) this.s2_combofranquicias.getSelectedItem();
    
    if (s2_chekTercerocompleto.isSelected()){
        v17 =  this.s2_chekTercerocompleto.getText();
    } else {
        v17 = " ";
    }
    
    if (s2_chekresponsabilidadcivil.isSelected()){
        v18 = this.s2_chekresponsabilidadcivil.getText();
    } else {
        v18 = " ";
    }
    
    if (s2_triesgosinfranquicia.isSelected()){
      v19 = this.s2_triesgosinfranquicia.getText();
    } else {
        v19 = " ";
    }
    
    if (s2_triesgoconfranq.isSelected()){
       v20 = this.s2_triesgoconfranq.getText();
    } else {
        v20 = " ";
    }
   
    if (s2_checkgranizo.isSelected()){
      v21 = this.s2_checkgranizo.getText();
    } else {
        v21 = " ";
    }
    
    //creamos mensajero 
    Persona persona = new Persona(f1tipodeseguro, f1fecha, f1cuil, f1nombre, f1telefono, f1email,v12,v13,v14,v15,v16,v17,v18,v19,v20,v21);
    archi.escribirArchivo(persona);
    
    }//GEN-LAST:event_b_grabarvehiculoActionPerformed

    private void s2_chekTercerocompletoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_s2_chekTercerocompletoStateChanged
          // TODO add your handling code here:
    }//GEN-LAST:event_s2_chekTercerocompletoStateChanged

    private void s2_triesgosinfranquiciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2_triesgosinfranquiciaActionPerformed
    if (s2_triesgosinfranquicia.isSelected()) {
     s2_chekresponsabilidadcivil.setSelected(true);
        s2_chekresponsabilidadcivil.setEnabled(false);
       } else {
         s2_chekresponsabilidadcivil.setSelected(false);
        s2_chekresponsabilidadcivil.setEnabled(true);
    }// TODO add your handling code here:
    }//GEN-LAST:event_s2_triesgosinfranquiciaActionPerformed

    private void s2_triesgoconfranqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2_triesgoconfranqActionPerformed
    if (s2_triesgoconfranq.isSelected()){
        s2_chekresponsabilidadcivil.setSelected(true);
        s2_chekresponsabilidadcivil.setEnabled(false);
        s2_combofranquicias.setEnabled(true);
        
       } else {
         s2_chekresponsabilidadcivil.setSelected(false);
         s2_chekresponsabilidadcivil.setEnabled(true);
         s2_combofranquicias.setEnabled(false);
        
    }    
    
    }//GEN-LAST:event_s2_triesgoconfranqActionPerformed

    private void s2_checkgranizoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2_checkgranizoActionPerformed
   if (s2_checkgranizo.isSelected()){
        s2_chekresponsabilidadcivil.setSelected(true);
        s2_chekresponsabilidadcivil.setEnabled(false); 
        s2_triesgosinfranquicia.setSelected(true);
        s2_triesgosinfranquicia.setEnabled(false);
   }else {
       s2_chekresponsabilidadcivil.setSelected(false);
        s2_chekresponsabilidadcivil.setEnabled(true); 
        s2_triesgosinfranquicia.setSelected(false);
            s2_triesgosinfranquicia.setEnabled(true);   
   }
    
    }//GEN-LAST:event_s2_checkgranizoActionPerformed

    private void input_cuilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_cuilKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key>=48 && key <=57;
       
        if (!numeros){
         evt.consume();
         
        }            
        if (input_cuil.getText().length()>=11){
       evt.consume();
       }
    }//GEN-LAST:event_input_cuilKeyTyped

    private void input_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_telefonoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key>=48 && key <=57;
       
        if (!numeros){
         evt.consume();
         
        }            
        if (input_telefono.getText().length()>=11){
        evt.consume();
        } 
    }//GEN-LAST:event_input_telefonoKeyTyped

    private void input_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_nombreKeyTyped
        int key = evt.getKeyChar();
        boolean min = key >=97 && key <=122;
        boolean espacio = key ==32;
        boolean may = key >=65 && key <=90;
     
        if (!(min || espacio|| may)){
        evt.consume();    
        }

        if (input_nombre.getText().length()>=50){
        evt.consume();
        } // TODO add your handling code here:
    }//GEN-LAST:event_input_nombreKeyTyped

    private void input_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_emailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_input_emailKeyTyped
    
    
    
    
    //seccion de metodos de los formularios!!!!!!!!!!!!!!***************************************
    
    
    public void limpiatutto1(){
    this.S1_chekIncendio.setSelected(false);
    this.s1_chekRobo.setSelected(false);
    this.s1_chekInundacion.setSelected(false);
    this.s1_comboincendio.setSelectedIndex(0);
    this.s1_comboincendio.setEnabled(false);
    this.s1_comborobo.setSelectedIndex(0);
    this.s1_comborobo.setEnabled(false);
    this.s1_comboinundacion.setSelectedIndex(0);
    this.s1_comboinundacion.setEnabled(false);
    this.S1_chekIheladera.setSelected(false);
    this.S1_cheklavarropas.setSelected(false);
    this.S1_chekcocina.setSelected(false);
    this.S1_cheknotebook.setSelected(false);       
    this.s1_inputnotebook.setText("");
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
            java.util.logging.Logger.getLogger(gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox S1_chekIheladera;
    private javax.swing.JCheckBox S1_chekIncendio;
    private javax.swing.JCheckBox S1_chekcocina;
    private javax.swing.JCheckBox S1_chekconsola;
    private javax.swing.JCheckBox S1_cheklavarropas;
    private javax.swing.JCheckBox S1_cheknotebook;
    private javax.swing.JCheckBox S1_chektelevisor;
    private javax.swing.JButton b_grabarhogar;
    private javax.swing.JButton b_grabarpvida;
    private javax.swing.JButton b_grabarvehiculo;
    private javax.swing.JButton b_salir;
    private javax.swing.JButton b_vercontrataciones;
    private javax.swing.JTextField input_cuil;
    private javax.swing.JTextField input_email;
    private javax.swing.JTextField input_nombre;
    private javax.swing.JTextField input_telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JCheckBox s1_chekInundacion;
    private javax.swing.JCheckBox s1_chekRobo;
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
    private javax.swing.JComboBox<String> s2_combomarcas;
    private javax.swing.JComboBox<String> s2_combomodelos;
    private javax.swing.JTextField s2_inputDominio;
    private javax.swing.JCheckBox s2_triesgoconfranq;
    private javax.swing.JCheckBox s2_triesgosinfranquicia;
    private javax.swing.JCheckBox s3_checkMuerte;
    private javax.swing.JCheckBox s3_chekMuerteaccidental;
    private javax.swing.JComboBox<String> s3_comboDiasinternacion;
    private javax.swing.JComboBox<String> s3_combobeneficiarios1;
    private javax.swing.JComboBox<String> s3_combobeneficiarios2;
    private javax.swing.JComboBox<String> s3_combobeneficiarios3;
    private javax.swing.JCheckBox s3_diasinternacion;
    private javax.swing.JTextField s3_inputbeneficiario1;
    private javax.swing.JTextField s3_inputbeneficiario2;
    private javax.swing.JTextField s3_inputbeneficiario3;
    private javax.swing.JTextField s3_inputbeneficiario4;
    private javax.swing.JCheckBox s3_paralisis;
    private javax.swing.JTextField s3_restobeneficiario;
    // End of variables declaration//GEN-END:variables
}
