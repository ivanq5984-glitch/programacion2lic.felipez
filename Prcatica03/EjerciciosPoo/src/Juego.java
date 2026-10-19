/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Juego {
    protected int numeroDeVidas;
    protected int record;
    public Juego(int numeroDeVidas){
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }
    public void reiniciaPartida(){
        numeroDeVidas = 3;
    }
    public void actualizaRecord(){
        if (numeroDeVidas > record){
            record = numeroDeVidas;
        }
    }
    public boolean quitaVida(){
        numeroDeVidas--;
        return numeroDeVidas > 0;
    }
}
