
package proyectorestaurante;

import javax.swing.JOptionPane;

public class SeleccionMenu extends javax.swing.JFrame{

    private double total=0.0;
    private int x=0;
    private double desc=0.0;
    
    public SeleccionMenu() {
        initComponents();
        iniciar();
    }

    
    public void iniciar(){
        
        
    }
    
    
    public void reset(){
        total=0.0;
        x = 0;
        desc = 0.0;
        Cantidad1.setValue(0);
        Cantidad2.setValue(0);
        Cantidad3.setValue(0);
        Cantidad4.setValue(0);
        Cantidad5.setValue(0);
        Cantidad6.setValue(0);
        Cantidad7.setValue(0);
        Cantidad8.setValue(0);
        Cantidad9.setValue(0);
        Cantidad10.setValue(0);
        Cantidad12.setValue(0);
        jtxtIGV.setText("0.0");
        jtxtSubTotal.setText("0.0");
        jtxtTotal.setText("0.0");
        Seleccion.setSelected(false);
        Seleccion2.setSelected(false);
        Seleccion3.setSelected(false);
        Seleccion4.setSelected(false);
        Seleccion5.setSelected(false);
        Seleccion6.setSelected(false);
        Seleccion7.setSelected(false);
        Seleccion8.setSelected(false);
        Seleccion9.setSelected(false);
        Seleccion10.setSelected(false);
        Seleccion11.setSelected(false);
        Seleccion12.setSelected(false);
        jTextArea.setText("");
        jbtnAceptar.setEnabled(true);
   
    }
    
    public boolean CantidadCero(int cntd){
         if(cntd==0){
             JOptionPane.showMessageDialog(null, "Por favor ingrese una cantidad :)");
              return false;
         }
         return true;
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTiempo = new javax.swing.JLabel();
        jDia = new javax.swing.JLabel();
        Menu1 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jMenu5 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cantidad5 = new javax.swing.JSpinner();
        Seleccion5 = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        Menu2 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jMenu2 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        Seleccion2 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        Cantidad2 = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        Menu3 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jMenu3 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        Seleccion3 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        Cantidad3 = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        Menu4 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jMenu9 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Cantidad9 = new javax.swing.JSpinner();
        Seleccion9 = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        Menu5 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jMenu4 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Cantidad4 = new javax.swing.JSpinner();
        Seleccion4 = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        Menu6 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jMenu6 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Cantidad6 = new javax.swing.JSpinner();
        Seleccion6 = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        Menu7 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jMenu7 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Cantidad7 = new javax.swing.JSpinner();
        Seleccion7 = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        Menu8 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jMenu8 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Cantidad8 = new javax.swing.JSpinner();
        Seleccion8 = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbtnConfirmar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jbtnAceptar = new javax.swing.JButton();
        Menu9 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jMenu1 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        Seleccion = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        Cantidad1 = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        Menu10 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jMenu10 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Cantidad10 = new javax.swing.JSpinner();
        Seleccion10 = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        Menu11 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jMenu11 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Cantidad11 = new javax.swing.JSpinner();
        Seleccion11 = new javax.swing.JCheckBox();
        jLabel27 = new javax.swing.JLabel();
        Menu12 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jMenu12 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Cantidad12 = new javax.swing.JSpinner();
        Seleccion12 = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtTotal = new javax.swing.JTextField();
        jtxtIGV = new javax.swing.JTextField();
        jtxtSubTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusableWindowState(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 19, 166, -1));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTiempo.setBackground(new java.awt.Color(51, 255, 204));
        jPanel7.add(jTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 40));
        jPanel7.add(jDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 110, 40));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 240, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        Menu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        Menu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setText("Precio");
        Menu1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 129, -1, -1));

        jLabel45.setText("Seleccionar");
        Menu1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 163, -1, -1));

        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu5.setText("Hamburguesa de carne");
        Menu1.add(jMenu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 20));

        jLabel47.setText("S/. 8.00");
        Menu1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 129, -1, -1));

        jLabel5.setText("Cantidad");
        Menu1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 200, -1, -1));

        Cantidad5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cantidad5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        Menu1.add(Cantidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 193, -1, -1));

        Seleccion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seleccion5ActionPerformed(evt);
            }
        });
        Menu1.add(Seleccion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 163, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pollo5.jpg"))); // NOI18N
        Menu1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 90));

        jPanel1.add(Menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 210, 230));

        Menu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        Menu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setText("Precio");
        Menu2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 127, -1, -1));

        jLabel50.setText("Seleccionar");
        Menu2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 161, -1, -1));

        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu2.setText("1/2 pollo + ensalada");
        Menu2.add(jMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel52.setText("S/. 25.00");
        Menu2.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 127, -1, -1));

        Seleccion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seleccion2ActionPerformed(evt);
            }
        });
        Menu2.add(Seleccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 161, -1, -1));

        jLabel6.setText("Cantidad");
        Menu2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 198, -1, -1));

        Cantidad2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cantidad2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        Menu2.add(Cantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 191, -1, -1));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pollo1.jpg"))); // NOI18N
        Menu2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 90));

        jPanel1.add(Menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 220, 230));

        Menu3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        Menu3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setText("Precio");
        Menu3.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 125, -1, -1));

        jLabel55.setText("Seleccionar");
        Menu3.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 159, -1, -1));

        jMenu3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jMenu3.setText("Pollo entero + ensalada + gaseosa 3L");
        Menu3.add(jMenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 190, 20));

        jLabel57.setText("S/. 43.00");
        Menu3.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 125, -1, -1));

        Seleccion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seleccion3ActionPerformed(evt);
            }
        });
        Menu3.add(Seleccion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 159, -1, -1));

        jLabel7.setText("Cantidad");
        Menu3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 196, -1, -1));

        Cantidad3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cantidad3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        Menu3.add(Cantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 189, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pollo4.jpg"))); // NOI18N
        Menu3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 90));

        jPanel1.add(Menu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 210, 230));

        Menu4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        Menu4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setText("Precio");
        Menu4.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 129, -1, -1));

        jLabel60.setText("Seleccionar");
        Menu4.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 163, -1, -1));

        jMenu9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu9.setText("Salchipapa clásica");
        Menu4.add(jMenu9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel62.setText("S/. 11.00");
        Menu4.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 129, -1, -1));

        jLabel8.setText("Cantidad");
        Menu4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 200, -1, -1));

        Cantidad9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cantidad9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        Menu4.add(Cantidad9, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 193, -1, -1));

        Seleccion9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seleccion9ActionPerformed(evt);
            }
        });
        Menu4.add(Seleccion9, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 163, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Background.jpg"))); // NOI18N
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Menu4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 90));

        jPanel1.add(Menu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 210, 230));

        Menu5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        Menu5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel64.setText("Precio");
        Menu5.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel65.setText("Seleccionar");
        Menu5.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 153, -1, -1));

        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu4.setText("Hamburguesa de pollo");
        Menu5.add(jMenu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel67.setText("S/. 9.50");
        Menu5.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabel9.setText("Cantidad");
        Menu5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 190, -1, -1));

        Cantidad4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cantidad4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        Menu5.add(Cantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 183, -1, -1));

        Seleccion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seleccion4ActionPerformed(evt);
            }
        });
        Menu5.add(Seleccion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 153, -1, -1));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pollo6.jpeg"))); // NOI18N
        Menu5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 90));

        jPanel1.add(Menu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 210, 230));

        Menu6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        Menu6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel69.setText("Precio");
        Menu6.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 127, -1, -1));

        jLabel70.setText("Seleccionar");
        Menu6.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 161, -1, -1));

        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu6.setText("Hamburguesa de chorizo");
        Menu6.add(jMenu6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel72.setText("S/. 6.50");
        Menu6.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 127, -1, -1));

        jLabel10.setText("Cantidad");
        Menu6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 198, -1, -1));

        Cantidad6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cantidad6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        Menu6.add(Cantidad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 191, -1, -1));

        Seleccion6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seleccion6ActionPerformed(evt);
            }
        });
        Menu6.add(Seleccion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 161, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Background.jpg"))); // NOI18N
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Menu6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 90));

        jPanel1.add(Menu6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 220, 230));

        Menu7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        Menu7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel74.setText("Precio");
        Menu7.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 127, -1, -1));

        jLabel75.setText("Seleccionar");
        Menu7.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 161, -1, -1));

        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu7.setText("Lomo saltado");
        Menu7.add(jMenu7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel77.setText("S/. 13.00");
        Menu7.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 127, -1, -1));

        jLabel11.setText("Cantidad");
        Menu7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 198, -1, -1));

        Cantidad7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cantidad7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        Menu7.add(Cantidad7, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 191, -1, -1));

        Seleccion7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seleccion7ActionPerformed(evt);
            }
        });
        Menu7.add(Seleccion7, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 161, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pollo5.jpg"))); // NOI18N
        Menu7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 90));

        jPanel1.add(Menu7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 210, 230));

        Menu8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        Menu8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel79.setText("Precio");
        Menu8.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 125, -1, -1));

        jLabel80.setText("Seleccionar");
        Menu8.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 159, -1, -1));

        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu8.setText("Pollo a la plancha");
        Menu8.add(jMenu8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel82.setText("S/. 14.00");
        Menu8.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 125, -1, -1));

        jLabel12.setText("Cantidad");
        Menu8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 196, -1, -1));

        Cantidad8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cantidad8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        Menu8.add(Cantidad8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 189, -1, -1));

        Seleccion8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seleccion8ActionPerformed(evt);
            }
        });
        Menu8.add(Seleccion8, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 159, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Background.jpg"))); // NOI18N
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Menu8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 90));

        jPanel1.add(Menu8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 210, 230));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnConfirmar.setBackground(new java.awt.Color(0, 153, 153));
        jbtnConfirmar.setText("Confirmar");
        jbtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConfirmarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 140, 50));

        jbtnLimpiar.setBackground(new java.awt.Color(102, 255, 102));
        jbtnLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 140, 50));

        jbtnSalir.setBackground(new java.awt.Color(255, 102, 102));
        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 140, 50));

        jbtnAceptar.setBackground(new java.awt.Color(102, 255, 204));
        jbtnAceptar.setText("Aceptar");
        jbtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptarActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 140, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 840, 940, 110));

        Menu9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        Menu9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel84.setText("Precio");
        Menu9.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 130, -1, -1));

        jLabel85.setText("Seleccionar");
        Menu9.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 164, -1, -1));

        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu1.setText("1/4 de pollo + ensalada");
        Menu9.add(jMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 130, 20));

        jLabel87.setText("S/. 17.00");
        Menu9.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 130, -1, -1));

        Seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionActionPerformed(evt);
            }
        });
        Menu9.add(Seleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 164, -1, -1));

        jLabel13.setText("Cantidad");
        Menu9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 201, -1, -1));

        Cantidad1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cantidad1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        Menu9.add(Cantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 194, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Background.jpg"))); // NOI18N
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Menu9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 90));

        jPanel1.add(Menu9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 210, 230));

        Menu10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        Menu10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel89.setText("Precio");
        Menu10.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 127, -1, -1));

        jLabel90.setText("Seleccionar");
        Menu10.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 161, -1, -1));

        jMenu10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu10.setText("Pollo broaster");
        Menu10.add(jMenu10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel92.setText("S/. 17.00");
        Menu10.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 127, -1, -1));

        jLabel14.setText("Cantidad");
        Menu10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 198, -1, -1));

        Cantidad10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cantidad10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        Menu10.add(Cantidad10, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 191, -1, -1));

        Seleccion10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seleccion10ActionPerformed(evt);
            }
        });
        Menu10.add(Seleccion10, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 161, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pollo4.jpg"))); // NOI18N
        Menu10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 90));

        jPanel1.add(Menu10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, 220, 230));

        Menu11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        Menu11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel94.setText("Precio");
        Menu11.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel95.setText("Seleccionar");
        Menu11.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 163, -1, -1));

        jMenu11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu11.setText("Mostro brutal");
        Menu11.add(jMenu11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel97.setText("S/. 23.00");
        Menu11.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabel15.setText("Cantidad");
        Menu11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 200, -1, -1));

        Cantidad11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cantidad11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        Menu11.add(Cantidad11, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 193, -1, -1));

        Seleccion11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seleccion11ActionPerformed(evt);
            }
        });
        Menu11.add(Seleccion11, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 163, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Background.jpg"))); // NOI18N
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Menu11.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 90));

        jPanel1.add(Menu11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 600, 210, 230));

        Menu12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        Menu12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel99.setText("Precio");
        Menu12.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 125, -1, -1));

        jLabel100.setText("Seleccionar");
        Menu12.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 159, -1, -1));

        jMenu12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu12.setText("Mostrito semi brutal");
        Menu12.add(jMenu12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel102.setText("S/. 8.00");
        Menu12.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 125, -1, -1));

        jLabel16.setText("Cantidad");
        Menu12.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 196, -1, -1));

        Cantidad12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cantidad12.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        Menu12.add(Cantidad12, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 189, -1, -1));

        Seleccion12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seleccion12ActionPerformed(evt);
            }
        });
        Menu12.add(Seleccion12, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 159, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pollo5.jpg"))); // NOI18N
        Menu12.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 90));

        jPanel1.add(Menu12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 600, 210, 230));

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumen de pedidos"));
        jScrollPane1.setViewportView(jTextArea);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("IGV");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 670, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("SubTotal");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 720, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Total");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 770, -1, -1));

        jtxtTotal.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jtxtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(jtxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 770, 132, 32));

        jtxtIGV.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jtxtIGV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtIGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIGVActionPerformed(evt);
            }
        });
        jPanel4.add(jtxtIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 670, 132, 32));

        jtxtSubTotal.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jtxtSubTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSubTotalActionPerformed(evt);
            }
        });
        jPanel4.add(jtxtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 720, 132, 32));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 110, 380, 830));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        reset();
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jtxtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSubTotalActionPerformed

    private void jtxtIGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIGVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtIGVActionPerformed

    private void SeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionActionPerformed
        int cntd = Integer.parseInt(Cantidad1.getValue().toString());
        if(CantidadCero(cntd) && Seleccion.isSelected()){
            x++;
            if(x==1){
                Resumen();
            }
            double precio = cntd*17;
            total +=precio;
            propina((int) total);
            jTextArea.setText(jTextArea.getText()+x+". "+jMenu1.getText()+"\t\t"+precio+"\n");
            detalles();
        }else{
            Seleccion.setSelected(false);
        }
    }//GEN-LAST:event_SeleccionActionPerformed

    private void Seleccion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seleccion2ActionPerformed
        int cntd = Integer.parseInt(Cantidad2.getValue().toString());
        if(CantidadCero(cntd) && Seleccion2.isSelected()){
            x++;
            if(x==1){
                Resumen();
            }
            double precio = cntd*25;
            total +=precio;
            propina((int) total);
            jTextArea.setText(jTextArea.getText()+x+". "+jMenu2.getText()+"\t\t"+precio+"\n");
            detalles();
        }else{
            Seleccion.setSelected(false);
        }
    }//GEN-LAST:event_Seleccion2ActionPerformed

    private void Seleccion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seleccion3ActionPerformed
        int cntd = Integer.parseInt(Cantidad3.getValue().toString());
        if(CantidadCero(cntd) && Seleccion3.isSelected()){
            x++;
            if(x==1){
                Resumen();
            }
            double precio = cntd*43;
            total +=precio;
            propina((int) total);
            jTextArea.setText(jTextArea.getText()+x+". "+jMenu3.getText()+"\t"+precio+"\n");
            detalles();
        }else{
            Seleccion.setSelected(false);
        }
    }//GEN-LAST:event_Seleccion3ActionPerformed

    private void Seleccion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seleccion4ActionPerformed
        int cntd = Integer.parseInt(Cantidad4.getValue().toString());
        if(CantidadCero(cntd) && Seleccion4.isSelected()){
            x++;
            if(x==1){
                Resumen();
            }
            double precio = cntd*9.5;
            total +=precio;
            propina((int) total);
            jTextArea.setText(jTextArea.getText()+x+". "+jMenu4.getText()+"\t\t"+precio+"\n");
            detalles();
        }else{
            Seleccion.setSelected(false);
        }
    }//GEN-LAST:event_Seleccion4ActionPerformed

    private void Seleccion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seleccion5ActionPerformed
        int cntd = Integer.parseInt(Cantidad5.getValue().toString());
        if(CantidadCero(cntd) && Seleccion5.isSelected()){
            x++;
            if(x==1){
                Resumen();
            }
            double precio = cntd*8;
            total +=precio;
            propina((int) total);
            jTextArea.setText(jTextArea.getText()+x+". "+jMenu5.getText()+"\t\t"+precio+"\n");
            detalles();
        }else{
            Seleccion.setSelected(false);
        }
    }//GEN-LAST:event_Seleccion5ActionPerformed

    private void Seleccion6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seleccion6ActionPerformed
        int cntd = Integer.parseInt(Cantidad6.getValue().toString());
        if(CantidadCero(cntd) && Seleccion6.isSelected()){
            x++;
            if(x==1){
                Resumen();
            }
            double precio = cntd*6.5;
            total +=precio;
            propina((int) total);
            jTextArea.setText(jTextArea.getText()+x+". "+jMenu6.getText()+"\t\t"+precio+"\n");
            detalles();
        }else{
            Seleccion.setSelected(false);
        }
    }//GEN-LAST:event_Seleccion6ActionPerformed
  
    private void Seleccion8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seleccion8ActionPerformed
        int cntd = Integer.parseInt(Cantidad8.getValue().toString());
        if(CantidadCero(cntd) && Seleccion8.isSelected()){
            x++;
            if(x==1){
                Resumen();
            }
            double precio = cntd*14;
            total +=precio;
            propina((int) total);
            jTextArea.setText(jTextArea.getText()+x+". "+jMenu8.getText()+"\t\t"+precio+"\n");
            detalles();
        }else{
            Seleccion.setSelected(false);
        }
    }//GEN-LAST:event_Seleccion8ActionPerformed

    private void Seleccion9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seleccion9ActionPerformed
        int cntd = Integer.parseInt(Cantidad9.getValue().toString());
        if(CantidadCero(cntd) && Seleccion9.isSelected()){
            x++;
            if(x==1){
                Resumen();
            }
            double precio = cntd*11;
            total +=precio;
            propina((int) total);
            jTextArea.setText(jTextArea.getText()+x+". "+jMenu9.getText()+"\t\t"+precio+"\n");
            detalles();
        }else{
            Seleccion.setSelected(false);
        }
    }//GEN-LAST:event_Seleccion9ActionPerformed

    private void Seleccion10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seleccion10ActionPerformed
        int cntd = Integer.parseInt(Cantidad10.getValue().toString());
        if(CantidadCero(cntd) && Seleccion10.isSelected()){
            x++;
            if(x==1){
                Resumen();
            }
            double precio = cntd*17;
            total +=precio;
            propina((int) total);
            jTextArea.setText(jTextArea.getText()+x+". "+jMenu10.getText()+"\t\t"+precio+"\n");
            detalles();
        }else{
            Seleccion.setSelected(false);
        }
    }//GEN-LAST:event_Seleccion10ActionPerformed

    private void Seleccion11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seleccion11ActionPerformed
        int cntd = Integer.parseInt(Cantidad11.getValue().toString());
        if(CantidadCero(cntd) && Seleccion11.isSelected()){
            x++;
            if(x==1){
                Resumen();
            }
            double precio = cntd*23;
            total +=precio;
            propina((int) total);
            jTextArea.setText(jTextArea.getText()+x+". "+jMenu11.getText()+"\t\t\t"+precio+"\n");
            detalles();
        }else{
            Seleccion.setSelected(false);
        }
    }//GEN-LAST:event_Seleccion11ActionPerformed

    private void Seleccion12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seleccion12ActionPerformed
        int cntd = Integer.parseInt(Cantidad12.getValue().toString());
        if(CantidadCero(cntd) && Seleccion12.isSelected()){
            x++;
            if(x==1){
                Resumen();
            }
            double precio = cntd*8;
            total +=precio;
            propina((int) total);
            jTextArea.setText(jTextArea.getText()+x+". "+jMenu12.getText()+"\t\t"+precio+"\n");
            detalles();
        }else{
            Seleccion.setSelected(false);
        }
    }//GEN-LAST:event_Seleccion12ActionPerformed

    private void Seleccion7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seleccion7ActionPerformed
        int cntd = Integer.parseInt(Cantidad7.getValue().toString());
        if(CantidadCero(cntd) && Seleccion7.isSelected()){
            x++;
            if(x==1){
                Resumen();
            }
            double precio = cntd*13;
            total +=precio;
            propina((int) total);
            jTextArea.setText(jTextArea.getText()+x+". "+jMenu7.getText()+"\t\t"+precio+"\n");
            detalles();
        }else{
            Seleccion.setSelected(false);
        }
    }//GEN-LAST:event_Seleccion7ActionPerformed

    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptarActionPerformed
             
      if(total ==0.0){
          JOptionPane.showMessageDialog(null, "No tiene ningun articulo seleccionado");
      }else{
          jTextArea.setText(jTextArea.getText()
                  +"\n***************************************************************\n"
                  +"Propina: \t\t"+desc+"\n"
                  +"IGV:   \t\t"+(String.format("%.2f",(total*0.18)))+"\n"        
                  +"SubTotal: \t\t"+total+"\n"
                  +"Total:  \t\t"+(String.format("%.2f",(total+desc+(total*0.18))))+"\n\n"
                  +"***********************Muchas Gracias***********************\n"
          );
          jbtnAceptar.setEnabled(false);
      }
      
      
      
      
   
    }//GEN-LAST:event_jbtnAceptarActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        Principal verventana = new Principal();
        verventana.setVisible(true);
        this.setVisible(false);
        reset();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConfirmarActionPerformed
        
    }//GEN-LAST:event_jbtnConfirmarActionPerformed

    public void propina(int dc){
        
        if(dc>=10.0 && dc<=20.0){
            desc =1.0;
        }else if(dc>20.0 && dc<=40.0){
            desc = 2.0;
        }else if(dc>40.0 && dc<=60.0){
            desc = 6.0;
        }else if(dc>60.0){
            desc = 10.0;
    }
    
    }
 
    public void detalles(){
        
        jtxtIGV.setText(String.valueOf(String.format("%.2f",total*0.18)));
        jtxtSubTotal.setText(String.valueOf(String.format("%.2f",total)));
        jtxtTotal.setText(String.valueOf(String.format("%.2f",(total+desc+(total*0.18)))));
        
        
    }
    
    
    public void Resumen(){
        
        jTextArea.setText("***********************Vicius Chicken***********************\n"
                +"Hora:                              " + "Día: "+ "\n"
                +"***************************************************************\n"
                +"Nombre de Producto:\t\t"+"Precio(S/.)\n");
        
       
    }
    
  
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SeleccionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SeleccionMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Cantidad1;
    private javax.swing.JSpinner Cantidad10;
    private javax.swing.JSpinner Cantidad11;
    private javax.swing.JSpinner Cantidad12;
    private javax.swing.JSpinner Cantidad2;
    private javax.swing.JSpinner Cantidad3;
    private javax.swing.JSpinner Cantidad4;
    private javax.swing.JSpinner Cantidad5;
    private javax.swing.JSpinner Cantidad6;
    private javax.swing.JSpinner Cantidad7;
    private javax.swing.JSpinner Cantidad8;
    private javax.swing.JSpinner Cantidad9;
    private javax.swing.JPanel Menu1;
    private javax.swing.JPanel Menu10;
    private javax.swing.JPanel Menu11;
    private javax.swing.JPanel Menu12;
    private javax.swing.JPanel Menu2;
    private javax.swing.JPanel Menu3;
    private javax.swing.JPanel Menu4;
    private javax.swing.JPanel Menu5;
    private javax.swing.JPanel Menu6;
    private javax.swing.JPanel Menu7;
    private javax.swing.JPanel Menu8;
    private javax.swing.JPanel Menu9;
    private javax.swing.JCheckBox Seleccion;
    private javax.swing.JCheckBox Seleccion10;
    private javax.swing.JCheckBox Seleccion11;
    private javax.swing.JCheckBox Seleccion12;
    private javax.swing.JCheckBox Seleccion2;
    private javax.swing.JCheckBox Seleccion3;
    private javax.swing.JCheckBox Seleccion4;
    private javax.swing.JCheckBox Seleccion5;
    private javax.swing.JCheckBox Seleccion6;
    private javax.swing.JCheckBox Seleccion7;
    private javax.swing.JCheckBox Seleccion8;
    private javax.swing.JCheckBox Seleccion9;
    private javax.swing.JLabel jDia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel jMenu1;
    private javax.swing.JLabel jMenu10;
    private javax.swing.JLabel jMenu11;
    private javax.swing.JLabel jMenu12;
    private javax.swing.JLabel jMenu2;
    private javax.swing.JLabel jMenu3;
    private javax.swing.JLabel jMenu4;
    private javax.swing.JLabel jMenu5;
    private javax.swing.JLabel jMenu6;
    private javax.swing.JLabel jMenu7;
    private javax.swing.JLabel jMenu8;
    private javax.swing.JLabel jMenu9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JLabel jTiempo;
    private javax.swing.JButton jbtnAceptar;
    private javax.swing.JButton jbtnConfirmar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JTextField jtxtIGV;
    private javax.swing.JTextField jtxtSubTotal;
    private javax.swing.JTextField jtxtTotal;
    // End of variables declaration//GEN-END:variables
}
