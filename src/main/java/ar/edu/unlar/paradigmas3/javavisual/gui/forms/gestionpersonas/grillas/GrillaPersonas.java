/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unlar.paradigmas3.javavisual.gui.forms.gestionpersonas.grillas;

import ar.edu.unlar.paradigmas3.javavisual.objects.Persona;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author sebas
 */
public class GrillaPersonas extends AbstractTableModel {
    private ArrayList<Persona> datos=new ArrayList<>(); //establezco los datos
    private String[] columnas = {"ID","Nombre","Apellido"}; //nombres de la columnas

    public GrillaPersonas() {
    }

    public GrillaPersonas(ArrayList<Persona> datos) {
        this.datos = datos;
    }

    public void setDatos(ArrayList<Persona> datos) {
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
        Persona p = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return p.getId();
            case 1:
                return p.getNombre();
            case 2:
                return p.getApellido();
            default:
                return "";
        }
    }

    @Override //Devuelvo el nombre de la columna
    public String getColumnName(int column) {
        return columnas[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
