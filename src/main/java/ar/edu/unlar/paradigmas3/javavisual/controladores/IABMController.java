/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.edu.unlar.paradigmas3.javavisual.controladores;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface IABMController<ID,Entidad> {
    
    public void setConexion(Connection conexion);
    public List<Entidad> extraerTodo();
    public Entidad extrer(ID id);
    public boolean crear(Entidad entidad);
    public boolean modificar(Entidad entidad);
    public boolean eliminar(Entidad entidad);
    
}
