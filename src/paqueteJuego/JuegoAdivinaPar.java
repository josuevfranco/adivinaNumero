/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteJuego;

/**
 *
 * @author Josue
 */

public class JuegoAdivinaPar extends JuegoAdivinaNumero{

    public JuegoAdivinaPar(int numVidas, int num) {
        super(numVidas, num);
    }
    
    
    @Override
    public boolean ValidaNumero(int num){
        
        if (num % 2 == 0){
            return true;
        }
        else{
            System.out.println("El numero no es par");
            return false;
        }
    }
    
}
