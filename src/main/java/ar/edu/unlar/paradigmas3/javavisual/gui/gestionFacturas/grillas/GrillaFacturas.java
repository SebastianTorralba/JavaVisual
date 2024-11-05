/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unlar.paradigmas3.javavisual.gui.gestionFacturas.grillas;

import ar.edu.unlar.paradigmas3.javavisual.objects.Factura;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author sebas
 */
public class GrillaFacturas extends AbstractTableModel {
    private ArrayList<Factura> datos=new ArrayList<>(); //establezco los datos
    private String[] columnas = {"ID","Numero","Cliente"}; //nombres de la columnas

    public GrillaFacturas() {
    }

    public GrillaFacturas(ArrayList<Factura> datos) {
        this.datos = datos;
    }

    public void setDatos(ArrayList<Factura> datos) {
        this.datos = datos;
    }
    
    
    
    @Override //devuelvo la cantidad filas
    public int getRowCount() {
        return datos.size();
    }

    @Override //devuelvo la cantidad de columnas
    public int getColumnCount() {
        return 3;
    }

    @Override //devuelvo el valor de la celda (fila,columna)
    public Object getValueAt(int rowIndex, int columnIndex) {
        Factura p = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return p.getId();
            case 1:
                return p.getNumero();
            case 2:
                return p.getCliente();
            default:
                return "";
        }
    }

    @Override //Devuelvo el nombre de la columna
    public String getColumnName(int column) {
        return columnas[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
