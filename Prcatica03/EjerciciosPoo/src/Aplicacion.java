/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Aplicacion {
    public static void main(String[] args){
        JuegoAdivinaNumero juegoNumero = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3);
        System.out.println("===== JUEGO NORMAL =====");
        juegoNumero.juega();
        System.out.println("===== JUEGO PAR =====");
        juegoPar.juega();
        System.out.println("===== JUEGO IMPAR =====");
        juegoImpar.juega();
    }
}
