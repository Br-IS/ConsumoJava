/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Cancion;
import modelo.Lista;
import modelo.api.Apis;
import vista.Principal;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Controlador {

    private Principal vistaPrincipal;
    private Apis api = new Apis();
    private Apis.Canciones apisCanciones = api.new Canciones();
    private Apis.Listas apisListas = api.new Listas();


    private JOptionPane jOptionPane = new JOptionPane();

    public Controlador(Principal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        vistaPrincipal.setLocationRelativeTo(null);
        vistaPrincipal.setVisible(true);
        vistaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vistaPrincipal.getCreateCancionesDialog().setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        vistaPrincipal.getCreateListasDialog().setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        vistaPrincipal.getAsignarCancionesListaDialog().setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        vistaPrincipal.setTitle("Spotify");
        cagarComboBox();
        Carga(vistaPrincipal.getCbxNombres().getSelectedItem().toString());
        CargaDatos(vistaPrincipal.getCbxElegirLista().getSelectedItem().toString());
        controles();
    }

    private void controles() {


        vistaPrincipal.getCbxNombres().addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                Carga(vistaPrincipal.getCbxNombres().getSelectedItem().toString());
            }
        });

        vistaPrincipal.getCbxElegirLista().addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                CargaDatos(vistaPrincipal.getCbxElegirLista().getSelectedItem().toString());
            }
        });

        vistaPrincipal.getTblCanciones().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                darClik(1);
            }
        });

        vistaPrincipal.getTblListas().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                darClik(2);
            }
        });

        vistaPrincipal.getTblCancionListas().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                darClik(3);
            }
        });

        vistaPrincipal.getBtnCrearCanciones().addActionListener(l -> abrirCrearCanciones());
        vistaPrincipal.getBtnRegresarCancion().addActionListener(l -> regresarVistaPrincipal());
        vistaPrincipal.getBtnCrearCancion().addActionListener(l -> crearCanciones());
        vistaPrincipal.getBtnModificarCancion().addActionListener(l -> modificarCanciones());
        vistaPrincipal.getBtnEliminarCancion().addActionListener(l -> eliminarCanciones());

        vistaPrincipal.getBtnCrearLista().addActionListener(l -> abrirCrearListas());
        vistaPrincipal.getBtnRegresarListas().addActionListener(l -> regresarVistaPrincipal());
        vistaPrincipal.getBtnCrearListas().addActionListener(l -> crearListas());
        vistaPrincipal.getBtnModificarLista().addActionListener(l -> modificarListas());
        vistaPrincipal.getBtnEliminarListas().addActionListener(l -> eliminarListas());

        vistaPrincipal.getBtnAsignarCancionesLista().addActionListener(l -> abrirListaCanciones());
        vistaPrincipal.getBtnRegresar().addActionListener(l -> regresarVistaPrincipal());
        vistaPrincipal.getBtnAsignar().addActionListener(l -> asignarCancionLista());

        // vistaPrincipal.getTxtNombre().setEditable(false);
    }

    private void asignarCancionLista() {
        if (!vistaPrincipal.getCbxElegirLista().getSelectedItem().toString().isEmpty() && !vistaPrincipal.getLblTitulo().getText().isEmpty()) {
            if (api.asignarCancionLista(vistaPrincipal.getLblTitulo().getText(), vistaPrincipal.getCbxElegirLista().getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(null, "Cancion asignada a la lista");
                CargaDatos(vistaPrincipal.getCbxElegirLista().getSelectedItem().toString());
            } else {
                JOptionPane.showMessageDialog(null, "Error al asignar la cancion a la lista");
            }

        } else {
            jOptionPane.showMessageDialog(vistaPrincipal, "Seleccione una lista y una cancion");
        }

    }

    private void Carga(String nombre) {
        vistaPrincipal.getLblLista().setText(apisCanciones.getListas(nombre).getNombre());
        vistaPrincipal.getLblDescripcion().setText(apisCanciones.getListas(nombre).getDescripcion());
        DefaultTableModel tblModel = (DefaultTableModel) vistaPrincipal.getTblTablaDatos().getModel();
        tblModel.setNumRows(0);
        apisCanciones.getListas(nombre).getCancion().forEach(cancion -> {
            tblModel.addRow(new Object[]{cancion.getTitulo(), cancion.getArtista(), cancion.getAlbum(), cancion.getAnio()});
        });
    }

    private void CargaDatos(String nombre) {
        vistaPrincipal.getLblDescrpcion().setText(apisCanciones.getListas(nombre).getDescripcion());
    }

    private void cagarComboBox() {
        vistaPrincipal.getCbxNombres().removeAllItems();
        apisListas.getListas().forEach(lista -> {
            vistaPrincipal.getCbxNombres().addItem(lista.getNombre());
        });

        vistaPrincipal.getCbxElegirLista().removeAllItems();
        apisListas.getListas().forEach(lista -> {
            vistaPrincipal.getCbxElegirLista().addItem(lista.getNombre());
        });
    }

    private void darClik(int opcion) {
        switch (opcion) {
            case 1:
                int row = vistaPrincipal.getTblCanciones().getSelectedRow();
                if (row != -1) {
                    vistaPrincipal.getTxtTitulo().setText(vistaPrincipal.getTblCanciones().getValueAt(row, 0).toString());
                    vistaPrincipal.getTxtArtista().setText(vistaPrincipal.getTblCanciones().getValueAt(row, 1).toString());
                    vistaPrincipal.getTxtAlbum().setText(vistaPrincipal.getTblCanciones().getValueAt(row, 2).toString());
                    vistaPrincipal.getTxtAnio().setText(vistaPrincipal.getTblCanciones().getValueAt(row, 3).toString());
                }
                break;
            case 2:
                int row2 = vistaPrincipal.getTblListas().getSelectedRow();
                if (row2 != -1) {
                    vistaPrincipal.getTxtNombre().setText(vistaPrincipal.getTblListas().getValueAt(row2, 0).toString());
                    vistaPrincipal.getTxtDescripcion().setText(vistaPrincipal.getTblListas().getValueAt(row2, 1).toString());
                }
                break;
            case 3:
                int row3 = vistaPrincipal.getTblCancionListas().getSelectedRow();
                if (row3 != 1) {
                    vistaPrincipal.getLblTitulo().setText(vistaPrincipal.getTblCancionListas().getValueAt(row3, 0).toString());
                    vistaPrincipal.getLblArtista().setText(vistaPrincipal.getTblCancionListas().getValueAt(row3, 1).toString());
                    vistaPrincipal.getLblAlbum().setText(vistaPrincipal.getTblCancionListas().getValueAt(row3, 2).toString());
                }
                break;
        }


    }

    private void abrirCrearCanciones() {
        vistaPrincipal.dispose();
        vistaPrincipal.getCreateCancionesDialog().setVisible(true);
        vistaPrincipal.getCreateListasDialog().setTitle("Crear Canciones");
        vistaPrincipal.getCreateCancionesDialog().setSize(700, 700);
        vistaPrincipal.getCreateCancionesDialog().setLocationRelativeTo(null);
        cargarCanciones();
    }

    private void cargarCanciones() {

        DefaultTableModel tblModel = (DefaultTableModel) vistaPrincipal.getTblCanciones().getModel();
        tblModel.setNumRows(0);

        apisCanciones.getCanciones().forEach(cancion -> {

            String fila[] = {cancion.getTitulo(), cancion.getArtista(), cancion.getAlbum(), cancion.getAnio()};

            tblModel.addRow(fila);

        });

        RowSorter<TableModel> sorter = new TableRowSorter<>(tblModel);
        vistaPrincipal.getTblCanciones().setRowSorter(sorter);
    }


    private void crearCanciones() {
        if (!vistaPrincipal.getTxtTitulo().getText().isEmpty() && !vistaPrincipal.getTxtArtista().getText().isEmpty() && !vistaPrincipal.getTxtAlbum().getText().isEmpty() && !vistaPrincipal.getTxtAnio().getText().isEmpty()) {
            Cancion cancion = new Cancion(vistaPrincipal.getTxtTitulo().getText(), vistaPrincipal.getTxtArtista().getText(), vistaPrincipal.getTxtAlbum().getText(), vistaPrincipal.getTxtAnio().getText());
            if (apisCanciones.createCancion(cancion)) {

                jOptionPane.showMessageDialog(null, "Cancion creada correctamente");
                cargarCanciones();
                limpiarCamposCancionesListas();
            } else {
                jOptionPane.showMessageDialog(null, "Error al crear la cancion");
            }
        } else {
            jOptionPane.showMessageDialog(null, "Rellenar todos los campos");
        }
        cargarCanciones();
    }

    private void modificarCanciones() {

        if (!vistaPrincipal.getTxtTitulo().getText().isEmpty() && !vistaPrincipal.getTxtArtista().getText().isEmpty() && !vistaPrincipal.getTxtAlbum().getText().isEmpty() && !vistaPrincipal.getTxtAnio().getText().isEmpty()) {
            Cancion cancion = new Cancion(vistaPrincipal.getTxtTitulo().getText(), vistaPrincipal.getTxtArtista().getText(), vistaPrincipal.getTxtAlbum().getText(), vistaPrincipal.getTxtAnio().getText());
            if (apisCanciones.createCancion(cancion)) {

                jOptionPane.showMessageDialog(null, "Cancion modificada correctamente");
                cargarCanciones();
                limpiarCamposCancionesListas();
            } else {
                jOptionPane.showMessageDialog(null, "Error al modificar la cancion");
            }
        } else {
            jOptionPane.showMessageDialog(null, "Rellenar todos los campos");
        }
        cargarCanciones();
    }

    private void eliminarCanciones() {
        if (!vistaPrincipal.getTxtTitulo().getText().isEmpty()) {
            int reply = jOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar la cancion?", "Eliminar", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                if (apisCanciones.deleteCancion(vistaPrincipal.getTxtTitulo().getText())) {
                    jOptionPane.showMessageDialog(null, "Cancion eliminada correctamente");
                    cargarCanciones();
                    limpiarCamposCancionesListas();
                } else {
                    jOptionPane.showMessageDialog(null, "Error al eliminar la cancion");
                }
            }
        } else {
            jOptionPane.showMessageDialog(null, "Para eliminar la cancion tiene que poner el titulo");
        }
    }

    private void crearListas() {
        if (!vistaPrincipal.getTxtDescripcion().getText().isEmpty()) {
            Lista lista = new Lista(vistaPrincipal.getTxtNombre().getText(), vistaPrincipal.getTxtDescripcion().getText(), null);
            if (apisListas.createLista(lista)) {
                jOptionPane.showMessageDialog(null, "Lista creada correctamente");
                cargarListas();
                limpiarCamposCancionesListas();
            } else {
                jOptionPane.showMessageDialog(null, "Error al crear la lista");
            }
        } else {
            jOptionPane.showMessageDialog(null, "Rellenar todos los campos");
        }
    }

    private void modificarListas() {
        if (!vistaPrincipal.getTxtDescripcion().getText().isEmpty() && !vistaPrincipal.getTxtNombre().getText().isEmpty()) {
            Lista lista = new Lista(vistaPrincipal.getTxtNombre().getText(), vistaPrincipal.getTxtDescripcion().getText(), null);
            if (apisListas.updateLista(vistaPrincipal.getTxtNombre().getText(), lista)) {
                jOptionPane.showMessageDialog(null, "Lista modificada correctamente");
                cargarListas();
                limpiarCamposCancionesListas();
                // jOptionPane.showMessageDialog(null, "Lista creada correctamente");
                cargarListas();
                limpiarCamposCancionesListas();
            } else {
                jOptionPane.showMessageDialog(null, "Error al modificar la lista");
            }
        } else {
            jOptionPane.showMessageDialog(null, "Rellenar todos los campos");
        }
    }

    private void eliminarListas() {
        if (!vistaPrincipal.getTxtNombre().getText().isEmpty()) {
            int reply = jOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar la lista?", "Eliminar", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                if (apisListas.deleteLista(vistaPrincipal.getTxtNombre().getText())) {
                    jOptionPane.showMessageDialog(null, "Lista eliminada correctamente");
                    cargarListas();
                    limpiarCamposCancionesListas();
                } else {
                    jOptionPane.showMessageDialog(null, "Error al eliminar la lista");
                }
            }
        } else {
            jOptionPane.showMessageDialog(null, "Para eliminar la lista tiene que poner el nombre");
        }
    }

    private void limpiarCamposCancionesListas() {
        vistaPrincipal.getTxtTitulo().setText(null);
        vistaPrincipal.getTxtArtista().setText(null);
        vistaPrincipal.getTxtAlbum().setText(null);
        vistaPrincipal.getTxtAnio().setText(null);
        vistaPrincipal.getTxtNombre().setText(null);
        vistaPrincipal.getTxtDescripcion().setText(null);
    }


    private void abrirCrearListas() {
        vistaPrincipal.dispose();
        vistaPrincipal.getCreateListasDialog().setVisible(true);
        vistaPrincipal.getCreateListasDialog().setTitle("Crear Lista");
        vistaPrincipal.getCreateListasDialog().setSize(700, 400);
        vistaPrincipal.getCreateListasDialog().setLocationRelativeTo(null);
        cargarListas();
    }

    private void abrirListaCanciones() {
        vistaPrincipal.dispose();
        vistaPrincipal.getAsignarCancionesListaDialog().setVisible(true);
        vistaPrincipal.getAsignarCancionesListaDialog().setTitle("Lista de Canciones");
        vistaPrincipal.getAsignarCancionesListaDialog().setSize(500, 650);
        vistaPrincipal.getAsignarCancionesListaDialog().setLocationRelativeTo(null);
        cargarListas();
        //465, 580
    }

    public void cargarListas() {
        DefaultTableModel tblModel = (DefaultTableModel) vistaPrincipal.getTblListas().getModel();
        tblModel.setNumRows(0);

        apisListas.getListas().forEach(lista -> {
            String fila[] = {lista.getNombre(), lista.getDescripcion()};
            tblModel.addRow(fila);
        });

        DefaultTableModel tblModel1 = (DefaultTableModel) vistaPrincipal.getTblCancionListas().getModel();
        tblModel1.setNumRows(0);

        apisCanciones.getCanciones().forEach(cancion -> {

            String fila[] = {cancion.getTitulo(), cancion.getArtista(), cancion.getAlbum()};

            tblModel1.addRow(fila);

        });

        RowSorter<TableModel> sorter1 = new TableRowSorter<>(tblModel1);
        vistaPrincipal.getTblCancionListas().setRowSorter(sorter1);

    }

    public void regresarVistaPrincipal() {
        vistaPrincipal.getCreateListasDialog().dispose();
        vistaPrincipal.getCreateCancionesDialog().dispose();
        vistaPrincipal.getAsignarCancionesListaDialog().dispose();
        limpiarCamposCancionesListas();
        vistaPrincipal.setVisible(true);
    }


    public static void main(String[] args) {
        new Controlador(new Principal());
    }
}





/*

        Apis apis = new Apis();
        //System.out.println(apis.getListas());

        apis.getListas().stream().forEach(lista -> {
            // System.out.println(lista.getNombre() + " - " + lista.getDescripcion() + "" +
            // lista.getCancion().stream().map(cancion -> cancion.getTitulo() + " - " +
            // cancion.getArtista() + " - " + cancion.getAlbum() + " - " +
            // cancion.getAnio()).reduce("", (a, b) -> a + " Canciones: " + b));
        });
            private void cargarDatos() {
        api = new Apis();

        DefaultTableModel tblModel = (DefaultTableModel) vistaPrincipal.getTblTablaDatos().getModel();
        tblModel.setNumRows(0);

        api.getListas().stream().forEach(lista -> {
            //String[] fila = {lista.getNombre(), lista.getDescripcion()};

            //vistaPrincipal.getLblLista().setText(lista.getNombre());
            //vistaPrincipal.getLblDescripcion().setText(lista.getDescripcion());

            //tblModel.addRow(new Object[]{lista.getId(), lista.getNombre(), lista.getDescripcion()});
        });
    }

 */