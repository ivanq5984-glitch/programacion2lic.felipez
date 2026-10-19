/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

public class Sensor {

    protected String tipo = "Generico";
    protected String id;
    protected boolean encendido;

    public Sensor(String id) {
        this.id = id;
        this.encendido = false;
    }

    public void activar() {
        encendido = true;
        System.out.println(tipo + " " + id + " activado.");
    }

    public void desactivar() {
        encendido = false;
        System.out.println(tipo + " " + id + " desactivado.");
    }

    public void mostrarDatos() {
        System.out.println("Tipo: " + tipo);
        System.out.println("ID: " + id);
        System.out.println("Encendido: " + encendido);
    }
}

