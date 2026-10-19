/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import modelo.Camara;
import modelo.SensorLuzLaser;
import modelo.VehiculoAutonomo;

public class Main {

    public static void main(String[] args) {

        // Crear una cámara
        Camara camara1 =
                new Camara("C001", "1920x1080");

        // Crear un sensor láser
        SensorLuzLaser laser1 =
                new SensorLuzLaser("L001", 100);

        // Crear un vehículo autónomo
        VehiculoAutonomo vehiculo1 =
                new VehiculoAutonomo("V001", "4K", 200);

        // Probar la cámara
        System.out.println("=== CAMARA ===");
        camara1.mostrarCamara();
        camara1.activar();

        // Probar el sensor láser
        System.out.println("\n=== SENSOR LASER ===");
        laser1.mostrarLaser();
        laser1.activar();

        // Probar el vehículo autónomo
        vehiculo1.mostrarVehiculo();
        vehiculo1.activarVehiculo();
        vehiculo1.desactivarVehiculo();
    }
}
