package Funciones;

import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import Clases.Dependiente;
import Clases.Render;

import javax.swing.table.TableColumn;

public class FTable {
    public void InsertarDatos(JTable tabla, ResultSet datos){
        DefaultTableModel modelo = new DefaultTableModel();;
        tabla.setModel(modelo);
        String[] headers = getHeaders(tabla);
        setHeaders(modelo, headers);
        try {
          int cantColumn = datos.getMetaData().getColumnCount();
          while (datos.next()) {
            Object arreglo[] = new Object[cantColumn];
            for(int i = 0; i< cantColumn; i++){
                arreglo[i] = datos.getObject(i + 1).toString().replaceAll("\\s+", " ");
            }
            modelo.addRow(arreglo);
        }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    public void InsertarDatos(JTable tabla, ResultSet datos, JButton[] Botones){
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel modelo = new DefaultTableModel();
        String[] headers = getHeaders(tabla);
        tabla.setModel(modelo);
        setHeaders(modelo, headers);
        try {
            int cantColumn = datos.getMetaData().getColumnCount();
            while (datos.next()) {
              Object arreglo[] = new Object[cantColumn + Botones.length];
              for(int i = 0; i< cantColumn; i++){
                  arreglo[i] = datos.getObject(i + 1).toString().replaceAll("\\s+", " ");
              }
              for(int i = 0; i < Botones.length; i++){
                arreglo[i + cantColumn] = Botones[i];
              }
              modelo.addRow(arreglo);
          }
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null, e.toString());
          }
    }
    public void InsertarArray(JTable tabla, ArrayList<Dependiente> datos){
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        String[] headers = getHeaders(tabla);
        setHeaders(modelo, headers);
        try {
          int cantColumn = datos.size();
            String arreglo[] = new String[cantColumn];
            for(int i = 0; i< cantColumn; i++){
                arreglo[i] = datos.get(i).toString();
            }
            modelo.addRow(arreglo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    public String[] getHeaders(JTable tabla){
        TableColumnModel modelo = tabla.getTableHeader().getColumnModel();
        String[] retorno = new String[modelo.getColumnCount()];
        for (int i = 0; i < modelo.getColumnCount(); i++) {
            TableColumn column = modelo.getColumn(i);
            retorno[i] = (String) column.getHeaderValue();
        }
        return retorno;
    }
    public void setHeaders(DefaultTableModel modelo,String[] headers){
        for (int i = 0; i < headers.length; i++) {
            modelo.addColumn(headers[i]);
        }
    }
}
