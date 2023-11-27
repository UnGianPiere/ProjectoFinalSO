
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class VentanaPrincipal extends javax.swing.JFrame {

    int[] listasstf;
    int[] listalook;
    int[] listaclook;
    int[] listascan;
    int[] listacscan;
    int[] valorparafifo;
    int valorMaximo;
    int ActualValor;
    int AnteriorValor;
    int cont = 0;

    DefaultTableModel objTabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            // Solo permite la edición de celdas en la segunda columna (columna 1)
            return column == 1;
        }
    };
    //Creacion de tablas de algoritmos
    DefaultTableModel objtablafifo = new DefaultTableModel();
    DefaultTableModel objtablasstf = new DefaultTableModel();
    DefaultTableModel objtablascan = new DefaultTableModel();
    DefaultTableModel objtablacscan = new DefaultTableModel();
    DefaultTableModel objtablalook = new DefaultTableModel();
    DefaultTableModel objtablaclook = new DefaultTableModel();
    private JPanel panel_grafica;

    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        botonFIFO.setVisible(false);
        botonSSTF.setVisible(false);
        botonSCAN.setVisible(false);
        botonCSCAN.setVisible(false);
        botonLOOK.setVisible(false);
        botonCLOOK.setVisible(false);

        String titulos[] = {"N° Peticion", "N° pista"};
        objTabla.setColumnIdentifiers(titulos);
        tablaPistas.setModel(objTabla);
        String titulosAlgoritmos[] = {"Prox Pista", "Pista Recorr"};
        objtablafifo.setColumnIdentifiers(titulosAlgoritmos);
        tablafifo.setModel(objtablafifo);
        objtablasstf.setColumnIdentifiers(titulosAlgoritmos);
        tablasstf.setModel(objtablasstf);
        objtablascan.setColumnIdentifiers(titulosAlgoritmos);
        tablascan.setModel(objtablascan);
        objtablacscan.setColumnIdentifiers(titulosAlgoritmos);
        tablacscan.setModel(objtablacscan);
        objtablalook.setColumnIdentifiers(titulosAlgoritmos);
        tablalook.setModel(objtablalook);
        objtablaclook.setColumnIdentifiers(titulosAlgoritmos);
        tablaclook.setModel(objtablaclook);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaPistas = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPistas = new javax.swing.JTable();
        botonOK = new javax.swing.JButton();
        VentanaGraficos = new javax.swing.JFrame();
        panelGrafico = new javax.swing.JPanel();
        PanelParaElGrafico = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        entryNumeroPistas = new javax.swing.JTextField();
        entryPistasTotales = new javax.swing.JTextField();
        entryPistaInicial = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        paneAlgoritmos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablasstf = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablascan = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablafifo = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablalook = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaclook = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablacscan = new javax.swing.JTable();
        botonFIFO = new javax.swing.JButton();
        botonSCAN = new javax.swing.JButton();
        botonSSTF = new javax.swing.JButton();
        botonCSCAN = new javax.swing.JButton();
        botonLOOK = new javax.swing.JButton();
        botonCLOOK = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(134, 190, 206));

        tablaPistas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(tablaPistas);

        botonOK.setBackground(new java.awt.Color(0, 102, 102));
        botonOK.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        botonOK.setForeground(new java.awt.Color(255, 255, 255));
        botonOK.setText("Guardar");
        botonOK.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout VentanaPistasLayout = new javax.swing.GroupLayout(VentanaPistas.getContentPane());
        VentanaPistas.getContentPane().setLayout(VentanaPistasLayout);
        VentanaPistasLayout.setHorizontalGroup(
            VentanaPistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VentanaPistasLayout.setVerticalGroup(
            VentanaPistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelGrafico.setBackground(new java.awt.Color(0, 153, 153));
        panelGrafico.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout PanelParaElGraficoLayout = new javax.swing.GroupLayout(PanelParaElGrafico);
        PanelParaElGrafico.setLayout(PanelParaElGraficoLayout);
        PanelParaElGraficoLayout.setHorizontalGroup(
            PanelParaElGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanelParaElGraficoLayout.setVerticalGroup(
            PanelParaElGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelGraficoLayout = new javax.swing.GroupLayout(panelGrafico);
        panelGrafico.setLayout(panelGraficoLayout);
        panelGraficoLayout.setHorizontalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGraficoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(PanelParaElGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        panelGraficoLayout.setVerticalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGraficoLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(PanelParaElGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout VentanaGraficosLayout = new javax.swing.GroupLayout(VentanaGraficos.getContentPane());
        VentanaGraficos.getContentPane().setLayout(VentanaGraficosLayout);
        VentanaGraficosLayout.setHorizontalGroup(
            VentanaGraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaGraficosLayout.createSequentialGroup()
                .addComponent(panelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        VentanaGraficosLayout.setVerticalGroup(
            VentanaGraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistemas Operativos-Final");
        setLocation(new java.awt.Point(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(134, 190, 206));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Asignacion de Disco");

        jLabel2.setText("N° de pistas :");

        jLabel3.setText("Pistas maxima :");

        jLabel4.setText("Pista inicial :");

        entryNumeroPistas.setText("0");
        entryNumeroPistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryNumeroPistasActionPerformed(evt);
            }
        });

        entryPistasTotales.setText("0");

        entryPistaInicial.setText("0");

        btnCalcular.setBackground(new java.awt.Color(0, 102, 102));
        btnCalcular.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.setActionCommand("");
        btnCalcular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Pistas");
        jButton1.setActionCommand("");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        paneAlgoritmos.setBackground(new java.awt.Color(0, 204, 204));

        tablasstf.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablasstf);

        jScrollPane3.setBorder(null);

        tablascan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablascan);

        jScrollPane4.setForeground(new java.awt.Color(0, 255, 255));

        tablafifo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tablafifo);

        jScrollPane5.setBorder(null);

        tablalook.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tablalook);

        jScrollPane6.setBorder(null);

        tablaclook.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tablaclook);

        jScrollPane7.setBorder(null);

        tablacscan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(tablacscan);

        javax.swing.GroupLayout paneAlgoritmosLayout = new javax.swing.GroupLayout(paneAlgoritmos);
        paneAlgoritmos.setLayout(paneAlgoritmosLayout);
        paneAlgoritmosLayout.setHorizontalGroup(
            paneAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAlgoritmosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        paneAlgoritmosLayout.setVerticalGroup(
            paneAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneAlgoritmosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paneAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        botonFIFO.setBackground(new java.awt.Color(0, 102, 102));
        botonFIFO.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        botonFIFO.setForeground(new java.awt.Color(255, 255, 255));
        botonFIFO.setText("Mostrar Grafico");
        botonFIFO.setActionCommand("");
        botonFIFO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonFIFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFIFOActionPerformed(evt);
            }
        });

        botonSCAN.setBackground(new java.awt.Color(0, 102, 102));
        botonSCAN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        botonSCAN.setForeground(new java.awt.Color(255, 255, 255));
        botonSCAN.setText("Mostrar Grafico");
        botonSCAN.setActionCommand("");
        botonSCAN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonSCAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSCANActionPerformed(evt);
            }
        });

        botonSSTF.setBackground(new java.awt.Color(0, 102, 102));
        botonSSTF.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        botonSSTF.setForeground(new java.awt.Color(255, 255, 255));
        botonSSTF.setText("Mostrar Grafico");
        botonSSTF.setActionCommand("");
        botonSSTF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonSSTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSSTFActionPerformed(evt);
            }
        });

        botonCSCAN.setBackground(new java.awt.Color(0, 102, 102));
        botonCSCAN.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        botonCSCAN.setForeground(new java.awt.Color(255, 255, 255));
        botonCSCAN.setText("Mostrar Grafico");
        botonCSCAN.setActionCommand("");
        botonCSCAN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonCSCAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCSCANActionPerformed(evt);
            }
        });

        botonLOOK.setBackground(new java.awt.Color(0, 102, 102));
        botonLOOK.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        botonLOOK.setForeground(new java.awt.Color(255, 255, 255));
        botonLOOK.setText("Mostrar Grafico");
        botonLOOK.setActionCommand("");
        botonLOOK.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonLOOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLOOKActionPerformed(evt);
            }
        });

        botonCLOOK.setBackground(new java.awt.Color(0, 102, 102));
        botonCLOOK.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        botonCLOOK.setForeground(new java.awt.Color(255, 255, 255));
        botonCLOOK.setText("Mostrar Grafico");
        botonCLOOK.setActionCommand("");
        botonCLOOK.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonCLOOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCLOOKActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel21.setText("FIFO");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel19.setText("SSTF");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setText("SCAN");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setText("C-SCAN");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel24.setText("LOOK");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel25.setText("C-LOOK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(paneAlgoritmos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(botonFIFO)
                        .addGap(74, 74, 74)
                        .addComponent(botonSSTF)
                        .addGap(60, 60, 60)
                        .addComponent(botonSCAN)
                        .addGap(77, 77, 77)
                        .addComponent(botonCSCAN)
                        .addGap(74, 74, 74)
                        .addComponent(botonLOOK)
                        .addGap(64, 64, 64)
                        .addComponent(botonCLOOK)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jLabel22))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(entryNumeroPistas, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                            .addComponent(entryPistasTotales)
                                            .addComponent(entryPistaInicial)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel25)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(163, 163, 163))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(252, 252, 252))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(135, 135, 135))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(entryNumeroPistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(entryPistasTotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(entryPistaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneAlgoritmos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonFIFO)
                    .addComponent(botonSSTF)
                    .addComponent(botonSCAN)
                    .addComponent(botonCSCAN)
                    .addComponent(botonLOOK)
                    .addComponent(botonCLOOK))
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed
        VentanaPistas.setVisible(false);
    }//GEN-LAST:event_botonOKActionPerformed

    private void botonCLOOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCLOOKActionPerformed
        VentanaGraficos.setLocationRelativeTo(null);
        VentanaGraficos.setVisible(true);
        VentanaGraficos.setSize(500, 500);
        Grafico graf = new Grafico(PanelParaElGrafico);
        graf.graficar(listaclook, valorMaximo);
    }//GEN-LAST:event_botonCLOOKActionPerformed

    private void botonLOOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLOOKActionPerformed
        VentanaGraficos.setLocationRelativeTo(null);
        VentanaGraficos.setVisible(true);
        VentanaGraficos.setSize(500, 500);
        Grafico graf = new Grafico(PanelParaElGrafico);
        graf.graficar(listaclook, valorMaximo);
    }//GEN-LAST:event_botonLOOKActionPerformed

    private void botonCSCANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCSCANActionPerformed
        VentanaGraficos.setLocationRelativeTo(null);
        VentanaGraficos.setVisible(true);
        VentanaGraficos.setSize(500, 500);
        Grafico graf = new Grafico(PanelParaElGrafico);
        graf.graficar(listacscan, valorMaximo);
    }//GEN-LAST:event_botonCSCANActionPerformed

    private void botonSSTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSSTFActionPerformed
        VentanaGraficos.setLocationRelativeTo(null);
        VentanaGraficos.setVisible(true);
        VentanaGraficos.setSize(500, 500);
        Grafico graf = new Grafico(PanelParaElGrafico);
        graf.graficar(listasstf, valorMaximo);
    }//GEN-LAST:event_botonSSTFActionPerformed

    private void botonSCANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSCANActionPerformed
        VentanaGraficos.setLocationRelativeTo(null);
        VentanaGraficos.setVisible(true);
        VentanaGraficos.setSize(500, 500);
        Grafico graf = new Grafico(PanelParaElGrafico);
        graf.graficar(listascan, valorMaximo);
    }//GEN-LAST:event_botonSCANActionPerformed

    private void botonFIFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFIFOActionPerformed
        VentanaGraficos.setLocationRelativeTo(null);
        VentanaGraficos.setVisible(true);
        VentanaGraficos.setSize(500, 500);
        Grafico graf = new Grafico(PanelParaElGrafico);
        graf.graficar(valorparafifo, valorMaximo);
    }//GEN-LAST:event_botonFIFOActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaPistas.setLocationRelativeTo(null);
        ActualValor = Integer.parseInt(entryNumeroPistas.getText());
        VentanaPistas.setVisible(true);
        if (cont == 0) {
            AnteriorValor = Integer.parseInt(entryNumeroPistas.getText());
            cont++;
            //Generando Tabla
            VentanaPistas.setSize(350, 500);
            try {

                int CantidadPistas = Integer.parseInt(entryNumeroPistas.getText());
                for (int i = 1; i <= CantidadPistas; i++) {
                    Object[] fila = {"Peticion " + i, ""};
                    objTabla.addRow(fila);
                }
            } catch (Exception e) {
                System.out.println("No ingresaste el numero de pistas");
            }
        }

        if (ActualValor != AnteriorValor) {
            //Limpiando tabla
            objTabla.setRowCount(0);
            try {

                int CantidadPistas = Integer.parseInt(entryNumeroPistas.getText());
                for (int i = 1; i <= CantidadPistas; i++) {
                    Object[] fila = {"Peticion " + i, ""};
                    objTabla.addRow(fila);
                }
            } catch (Exception e) {
                System.out.println("No ingresaste el numero de pistas");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        this.setLocationRelativeTo(null);
        if (Integer.parseInt(entryNumeroPistas.getText()) == 0
                || Integer.parseInt(entryPistaInicial.getText()) == 0
                || Integer.parseInt(entryPistasTotales.getText()) == 0) {
            System.out.println("Rellene todos los valores");
        } else {

            botonFIFO.setVisible(true);
            botonSSTF.setVisible(true);
            botonSCAN.setVisible(true);
            botonCSCAN.setVisible(true);
            botonLOOK.setVisible(true);
            botonCLOOK.setVisible(true);

            valorMaximo = Integer.parseInt(entryPistasTotales.getText());
            int valorinicial = Integer.parseInt(entryPistaInicial.getText());
            //creando lista de valores de columna FIFO o orden de llegada
            int cantidad = Integer.parseInt(entryNumeroPistas.getText());
            int[] valores = new int[cantidad];
            valorparafifo = new int[cantidad];

            // Limpiar tablas antes de agregar nuevos datos
            objtablafifo.setRowCount(0);
            objtablasstf.setRowCount(0);
            objtablalook.setRowCount(0);
            objtablaclook.setRowCount(0);
            objtablascan.setRowCount(0);
            objtablacscan.setRowCount(0);

            for (int i = 0; i < cantidad; i++) {
                Object valorCelda = objTabla.getValueAt(i, 1);
                valores[i] = Integer.parseInt(valorCelda.toString());
                valorparafifo[i] = Integer.parseInt(valorCelda.toString());
            }

            Logica ob = new Logica();

            //creando listas columna 1
            listasstf = ob.atenderSolicitudSSTF(valores, valorinicial);
            listalook = ob.atenderSolicitudLOOK(valores, valorinicial);
            listaclook = ob.atenderSolicitudCLOOK(valores, valorinicial);
            listascan = ob.atenderSolicitudSCAN(valores, valorinicial, valorMaximo);
            listacscan = ob.atenderSolicitudCSCAN(valores, valorinicial, valorMaximo);

            //creando lista de valores de columna 2
            int[] listafifo = ob.PistaAtravesada(valorparafifo, valorinicial);
            int[] listaAtravesadaSSTF = ob.PistaAtravesada(listasstf, valorinicial);
            int[] listaAtravesadaLOOK = ob.PistaAtravesada(listalook, valorinicial);
            int[] listaAtravesadaCLOOK = ob.PistaAtravesada(listaclook, valorinicial);
            int[] listaAtravesadaSCAN = ob.PistaAtravesada(listascan, valorinicial);
            int[] listaAtravesadaCSCAN = ob.PistaAtravesada(listacscan, valorinicial);
            //colocar tablas
            for (int i = 0; i < listafifo.length; i++) {
                Object[] fila = {valorparafifo[i], listafifo[i]};
                objtablafifo.addRow(fila);
                Object[] fila2 = {listasstf[i], listaAtravesadaSSTF[i]};
                objtablasstf.addRow(fila2);
                Object[] fila3 = {listalook[i], listaAtravesadaLOOK[i]};
                objtablalook.addRow(fila3);
                Object[] fila4 = {listaclook[i], listaAtravesadaCLOOK[i]};
                objtablaclook.addRow(fila4);
            }
            for (int i = 0; i < listafifo.length + 1; i++) {
                Object[] fila5 = {listascan[i], listaAtravesadaSCAN[i]};
                objtablascan.addRow(fila5);
            }

            for (int i = 0; i < listafifo.length + 2; i++) {
                Object[] fila = {listacscan[i], listaAtravesadaCSCAN[i]};
                objtablacscan.addRow(fila);
            }

            // Agregar fila de promedio con el texto "Promedio"
            Object[] filaPromediofifo = {"Promedio", Math.round(ob.Promedio(listafifo) * 100.0) / 100.0};
            objtablafifo.addRow(filaPromediofifo);
            Object[] filaPromediosstf = {"Promedio", Math.round(ob.Promedio(listaAtravesadaSSTF) * 100.0) / 100.0};
            objtablasstf.addRow(filaPromediosstf);
            Object[] filaPromediolook = {"Promedio", Math.round(ob.Promedio(listaAtravesadaLOOK) * 100.0) / 100.0};
            objtablalook.addRow(filaPromediolook);
            Object[] filaPromedioclook = {"Promedio", Math.round(ob.Promedio(listaAtravesadaCLOOK) * 100.0) / 100.0};
            objtablaclook.addRow(filaPromedioclook);
            Object[] filaPromedioscan = {"Promedio", Math.round(ob.Promedio(listaAtravesadaSCAN) * 100.0) / 100.0};
            objtablascan.addRow(filaPromedioscan);
            Object[] filaPromediocscan = {"Promedio", Math.round(ob.Promedio(listaAtravesadaCSCAN) * 100.0) / 100.0};
            objtablacscan.addRow(filaPromediocscan);
        }


    }//GEN-LAST:event_btnCalcularActionPerformed

    private void entryNumeroPistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryNumeroPistasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entryNumeroPistasActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelParaElGrafico;
    private javax.swing.JFrame VentanaGraficos;
    private javax.swing.JFrame VentanaPistas;
    private javax.swing.JButton botonCLOOK;
    private javax.swing.JButton botonCSCAN;
    private javax.swing.JButton botonFIFO;
    private javax.swing.JButton botonLOOK;
    private javax.swing.JButton botonOK;
    private javax.swing.JButton botonSCAN;
    private javax.swing.JButton botonSSTF;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JTextField entryNumeroPistas;
    private javax.swing.JTextField entryPistaInicial;
    private javax.swing.JTextField entryPistasTotales;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPanel paneAlgoritmos;
    private javax.swing.JPanel panelGrafico;
    private javax.swing.JTable tablaPistas;
    private javax.swing.JTable tablaclook;
    private javax.swing.JTable tablacscan;
    private javax.swing.JTable tablafifo;
    private javax.swing.JTable tablalook;
    private javax.swing.JTable tablascan;
    private javax.swing.JTable tablasstf;
    // End of variables declaration//GEN-END:variables
}
