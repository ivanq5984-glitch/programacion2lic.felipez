/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class JuegoAdivinaImpar extends JuegoAdivinaNumero{
    public JuegoAdivinaImpar(int numeroDeVidas){
        super (numeroDeVidas);
    }
    @Override
    public boolean validaNumero(int numero){
        if (numero >= 0 && numero <= 10 && numero % 2 != 0){
            return true;
        }
        System.out.println("Error: debes introducir un numero Impar entre 0 y 10");
        return false;
    }
}
