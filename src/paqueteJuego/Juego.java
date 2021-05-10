
package paqueteJuego;


public abstract class Juego {
        
        //Atributos
        protected int numVidas;
        protected int num;
        
        //Metodo Abstracto
        public abstract void juega();

        //Constructor Clase Padre
        public Juego(int numVidas, int num) {
            this.numVidas = numVidas;
            this.num = num;
        }
        
}
