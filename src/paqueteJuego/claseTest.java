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
public class claseTest {
    
    public static void main(String [] args){
        
          JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(2,89); 
          juego1.juega();
          
          JuegoAdivinaPar juego2 = new JuegoAdivinaPar(2,2);
          juego2.ValidaNumero(3);
          
          JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3,3);
          juego2.ValidaNumero(2);
        
    }
    
}
