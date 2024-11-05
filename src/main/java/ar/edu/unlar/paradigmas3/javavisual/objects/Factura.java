/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unlar.paradigmas3.javavisual.objects;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
/**
 *
 * @author sebas
 */
public class Factura {
    private int id;
    private int numero;
    private Date fecha;
    private Persona cliente;
    private float monto;
    private ArrayList<FacturaDetalle> detalle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int size() {
        return detalle.size();
    }

    public boolean addItem(FacturaDetalle e) {
        return detalle.add(e);
    }

    public boolean removeItem(Object o) {
        return detalle.remove(o);
    }

    public Iterator<FacturaDetalle> iteratorItem() {
        return detalle.iterator();
    }
    
    
}
