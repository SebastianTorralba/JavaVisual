/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unlar.paradigmas3.javavisual.objects;

/**
 *
 * @author sebas
 */
public class FacturaDetalle {
    private int id;
    private int cantidad;
    private Articulo item;
    private float monto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Articulo getItem() {
        return item;
    }

    public void setItem(Articulo item) {
        this.item = item;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public FacturaDetalle() {
    }

    public FacturaDetalle(int cantidad, Articulo item, float monto) {
        this.cantidad = cantidad;
        this.item = item;
        this.monto = monto;
    }

    public FacturaDetalle(int id, int cantidad, Articulo item, float monto) {
        this.id = id;
        this.cantidad = cantidad;
        this.item = item;
        this.monto = monto;
    }
    
    
}
