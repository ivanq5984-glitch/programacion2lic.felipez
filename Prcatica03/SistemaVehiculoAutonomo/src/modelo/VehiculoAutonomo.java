/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class VehiculoAutonomo extends Sensor {

    private Camara camara;
    private SensorLuzLaser laser;

    public VehiculoAutonomo(String id, String resolucion, int alcance) {
        super(id);

        this.tipo = "Vehiculo Autonomo";

        this.camara = new Camara(id + "-CAM", resolucion);
        this.laser = new SensorLuzLaser(id + "-LAS", alcance);
    }

    public void activarVehiculo() {
        System.out.println("\nActivando vehiculo autonomo...");
        activar();
        camara.activar();
        laser.activar();
    }

    public void desactivarVehiculo() {
        System.out.println("\nDesactivando vehiculo autonomo...");
        camara.desactivar();
        laser.desactivar();
        desactivar();
    }

    public void mostrarVehiculo() {
        System.out.println("\n=== VEHICULO AUTONOMO ===");
        mostrarDatos();

        System.out.println("\n--- CAMARA ---");
        camara.mostrarCamara();

        System.out.println("\n--- SENSOR LASER ---");
        laser.mostrarLaser();
    }
}