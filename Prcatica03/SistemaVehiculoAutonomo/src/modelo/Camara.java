/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

public class Camara extends Sensor {

    protected String resolucion;

    public Camara(String id, String resolucion) {
        super(id);
        this.tipo = "Camara";
        this.resolucion = resolucion;
    }

    public void mostrarCamara() {
        mostrarDatos();
        System.out.println("Resolucion: " + resolucion);
    }
}
