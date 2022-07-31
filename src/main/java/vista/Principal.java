/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createListasDialog = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabeI7 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnCrearListas = new javax.swing.JButton();
        btnRegresarListas = new javax.swing.JButton();
        btnEliminarListas = new javax.swing.JButton();
        btnModificarLista = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblListas = new javax.swing.JTable();
        createCancionesDialog = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtArtista = new javax.swing.JTextField();
        txtAlbum = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        btnCrearCancion = new javax.swing.JButton();
        btnModificarCancion = new javax.swing.JButton();
        btnEliminarCancion = new javax.swing.JButton();
        btnRegresarCancion = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCanciones = new javax.swing.JTable();
        asignarCancionesListaDialog = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCancionListas = new javax.swing.JTable();
        btnAsignar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblArtista = new javax.swing.JLabel();
        lblAlbum = new javax.swing.JLabel();
        cbxElegirLista = new javax.swing.JComboBox<>();
        lblDescrpcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaDatos = new javax.swing.JTable();
        lblDescripcion = new javax.swing.JLabel();
        lblLista = new javax.swing.JLabel();
        btnCrearCanciones = new javax.swing.JButton();
        btnCrearLista = new javax.swing.JButton();
        cbxNombres = new javax.swing.JComboBox<>();
        btnAsignarCancionesLista = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setText("NOMBRE");

        jLabeI7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabeI7.setText("DESCRIPCION");

        txtDescripcion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        btnCrearListas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCrearListas.setText("CREAR");

        btnRegresarListas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegresarListas.setText("REGRESAR");

        btnEliminarListas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEliminarListas.setText("ELIMINAR");

        btnModificarLista.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnModificarLista.setText("MODIFICAR");

        tblListas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tblListas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "DESCRIPCION"
            }
        ));
        jScrollPane3.setViewportView(tblListas);

        javax.swing.GroupLayout createListasDialogLayout = new javax.swing.GroupLayout(createListasDialog.getContentPane());
        createListasDialog.getContentPane().setLayout(createListasDialogLayout);
        createListasDialogLayout.setHorizontalGroup(
            createListasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createListasDialogLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(createListasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createListasDialogLayout.createSequentialGroup()
                        .addGroup(createListasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabeI7)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(createListasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(createListasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createListasDialogLayout.createSequentialGroup()
                        .addComponent(btnCrearListas, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(createListasDialogLayout.createSequentialGroup()
                        .addGroup(createListasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarListas, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegresarListas, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        createListasDialogLayout.setVerticalGroup(
            createListasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createListasDialogLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(createListasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearListas))
                .addGap(18, 18, 18)
                .addGroup(createListasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeI7)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarLista))
                .addGap(18, 18, 18)
                .addGroup(createListasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createListasDialogLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(createListasDialogLayout.createSequentialGroup()
                        .addComponent(btnEliminarListas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresarListas)
                        .addGap(17, 17, 17))))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("CANCIONES");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("TITULO");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("ARTISTA");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("ALBUM");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("ANIO");

        txtTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        txtArtista.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        txtAlbum.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        txtAnio.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        btnCrearCancion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCrearCancion.setText("CREAR");

        btnModificarCancion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnModificarCancion.setText("MODIFICAR");

        btnEliminarCancion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEliminarCancion.setText("ELIMINAR");

        btnRegresarCancion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegresarCancion.setText("REGRESAR");

        tblCanciones.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TITULO", "ARTISTA", "ALBUM", "ANIO"
            }
        ));
        jScrollPane2.setViewportView(tblCanciones);

        javax.swing.GroupLayout createCancionesDialogLayout = new javax.swing.GroupLayout(createCancionesDialog.getContentPane());
        createCancionesDialog.getContentPane().setLayout(createCancionesDialogLayout);
        createCancionesDialogLayout.setHorizontalGroup(
            createCancionesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createCancionesDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createCancionesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createCancionesDialogLayout.createSequentialGroup()
                        .addGroup(createCancionesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(createCancionesDialogLayout.createSequentialGroup()
                                .addGroup(createCancionesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(createCancionesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(txtArtista)
                                    .addComponent(txtAlbum)
                                    .addComponent(txtAnio))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(createCancionesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegresarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE))
                .addContainerGap())
        );
        createCancionesDialogLayout.setVerticalGroup(
            createCancionesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createCancionesDialogLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(createCancionesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearCancion))
                .addGap(18, 18, 18)
                .addGroup(createCancionesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarCancion))
                .addGap(21, 21, 21)
                .addGroup(createCancionesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCancion))
                .addGap(18, 18, 18)
                .addGroup(createCancionesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresarCancion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Elegir Lista");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Escoger Cancion");

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblCancionListas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TITULO", "ALBUM", "ARTISTA"
            }
        ));
        jScrollPane4.setViewportView(tblCancionListas);

        btnAsignar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAsignar.setText("ASIGNAR");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegresar.setText("REGRESAR");

        lblArtista.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblArtista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblAlbum.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAlbum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbxElegirLista.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        lblDescrpcion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDescrpcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout asignarCancionesListaDialogLayout = new javax.swing.GroupLayout(asignarCancionesListaDialog.getContentPane());
        asignarCancionesListaDialog.getContentPane().setLayout(asignarCancionesListaDialogLayout);
        asignarCancionesListaDialogLayout.setHorizontalGroup(
            asignarCancionesListaDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asignarCancionesListaDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(asignarCancionesListaDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(asignarCancionesListaDialogLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, asignarCancionesListaDialogLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(asignarCancionesListaDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(asignarCancionesListaDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(asignarCancionesListaDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxElegirLista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDescrpcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78))))
            .addGroup(asignarCancionesListaDialogLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(asignarCancionesListaDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        asignarCancionesListaDialogLayout.setVerticalGroup(
            asignarCancionesListaDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asignarCancionesListaDialogLayout.createSequentialGroup()
                .addGroup(asignarCancionesListaDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(asignarCancionesListaDialogLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(cbxElegirLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDescrpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(asignarCancionesListaDialogLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(asignarCancionesListaDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(asignarCancionesListaDialogLayout.createSequentialGroup()
                        .addComponent(lblAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnAsignar)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addGap(26, 26, 26))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblTablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TITULO", "ARTISITA", "ALBUM", "ANIO"
            }
        ));
        jScrollPane1.setViewportView(tblTablaDatos);

        lblDescripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lblLista.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btnCrearCanciones.setText("CREAR CANCIONES");

        btnCrearLista.setText("CREAR LISTAS");

        cbxNombres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btnAsignarCancionesLista.setText("ASIGNAR CANCIONES A LISTAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnCrearLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrearCanciones)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblLista, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cbxNombres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btnAsignarCancionesLista)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(cbxNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLista, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearCanciones)
                    .addComponent(btnCrearLista))
                .addGap(18, 18, 18)
                .addComponent(btnAsignarCancionesLista)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAsignarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog asignarCancionesListaDialog;
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnAsignarCancionesLista;
    private javax.swing.JButton btnCrearCancion;
    private javax.swing.JButton btnCrearCanciones;
    private javax.swing.JButton btnCrearLista;
    private javax.swing.JButton btnCrearListas;
    private javax.swing.JButton btnEliminarCancion;
    private javax.swing.JButton btnEliminarListas;
    private javax.swing.JButton btnModificarCancion;
    private javax.swing.JButton btnModificarLista;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRegresarCancion;
    private javax.swing.JButton btnRegresarListas;
    private javax.swing.JComboBox<String> cbxElegirLista;
    private javax.swing.JComboBox<String> cbxNombres;
    private javax.swing.JDialog createCancionesDialog;
    private javax.swing.JDialog createListasDialog;
    private javax.swing.JLabel jLabeI7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblAlbum;
    private javax.swing.JLabel lblArtista;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescrpcion;
    private javax.swing.JLabel lblLista;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblCancionListas;
    private javax.swing.JTable tblCanciones;
    private javax.swing.JTable tblListas;
    private javax.swing.JTable tblTablaDatos;
    private javax.swing.JTextField txtAlbum;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtArtista;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
