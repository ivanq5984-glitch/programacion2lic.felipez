/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class SensorLuzLaser extends Sensor {

    protected int alcance;

    public SensorLuzLaser(String id, int alcance) {
        super(id);
        this.tipo = "Luz Laser";
        this.alcance = alcance;
    }

    public void mostrarLaser() {
        mostrarDatos();
        System.out.println("Alcance: " + alcance + " metros");
    }
}
