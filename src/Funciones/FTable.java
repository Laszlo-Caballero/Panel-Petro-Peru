package Funciones;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableColumn;

public class FTable {
    public void InsertarDatos(JTable tabla, ResultSet datos){
        DefaultTableModel modelo = new DefaultTableModel();
        String[] headers = getHeaders(tabla);
        tabla.setModel(modelo);
        for (int i = 0; i < headers.length; i++) {
            modelo.addColumn(headers[i]);
        }

        try {
          int cantColumn = datos.getMetaData().getColumnCount();
          while (datos.next()) {
            Object arreglo[] = new Object[cantColumn];
            for(int i = 0; i< cantColumn; i++){
                arreglo[i] = datos.getObject(i + 1);

            }
            modelo.addRow(arreglo);
        }
            
        } catch (SQLException e) {
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
}
