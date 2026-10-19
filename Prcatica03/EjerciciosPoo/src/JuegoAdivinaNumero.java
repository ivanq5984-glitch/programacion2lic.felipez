/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;
public class JuegoAdivinaNumero extends Juego{
    private int numeroAdivinar;
    public JuegoAdivinaNumero(int numeroDeVidas){
        super(numeroDeVidas);
    }
    public boolean validaNumero(int numero){
        if (numero >= 0 && numero <=10){
            return true;
        }
        System.out.println("Error: el numero debe estar entre 0 y 10.");
        return false;
    }
    public void juega(){
        Scanner teclado = new
            Scanner(System.in);
        reiniciaPartida();
        numeroAdivinar = (int)(Math.random()* 11);
        System.out.println("Adivina un numero entre 0 y 10.");
        while (numeroDeVidas > 0){
            System.out.print("Introduce un numero: ");
            int numero = teclado.nextInt();
            if (!validaNumero(numero)){
                continue;
            }
            if (numero == numeroAdivinar){
                System.out.println("Record: " + record);
                return;
            } else {
                boolean quedanVidas = quitaVida();
                if (quedanVidas){
                    if (numero < numeroAdivinar){
                        System.out.println("El numero es Mayor.");
                    } else {
                        System.out.println("El numero es Menor.");
                    }
                    System.out.println("Te quedan " + numeroDeVidas + " vidas.");
                } else {
                    System.out.println("Ya no te quedan vidas.");
                    System.out.println("El numero era: " + numeroAdivinar);
                }
            }
        }
    }
}
