/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ar.edu.unlar.paradigmas3.javavisual;

import ar.edu.unlar.paradigmas3.javavisual.gui.Principal;
import ar.edu.unlar.paradigmas3.javavisual.objects.Persona;
import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class JavaVisual {
    public static ArrayList<Persona> personas=new ArrayList<Persona>();
    public static void main(String[] args) {
        Principal p= new Principal();
        p.setVisible(true);
        personas.add(new Persona("Sebastian", "Torralba"));
        personas.add(new Persona("Ariel","Rivadulla"));
    }
}
