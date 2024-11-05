/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unlar.paradigmas3.javavisual.controladores;

import ar.edu.unlar.paradigmas3.javavisual.objects.Factura;
import ar.edu.unlar.paradigmas3.javavisual.objects.FacturaDetalle;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class FacturaControlador implements IABMController<Integer, Factura>{
    private FacturaDetalleControlador detalleControlador; 
    
    @Override
    public void setConexion(Connection conexion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Factura> extraerTodo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Factura extrer(Integer id) {
        Factura f=new Factura(); 
        
        ArrayList<FacturaDetalle> detalle = (ArrayList<FacturaDetalle>) detalleControlador.extraerPorFacturaId(f.getId());
        for (FacturaDetalle facturaDetalle : detalle) {
            f.addItem(facturaDetalle);
        }
        return null;
        
    }

    @Override
    public boolean crear(Factura entidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Factura entidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(Factura entidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
