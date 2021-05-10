
package paqueteJuego;

import java.util.Scanner;


public class JuegoAdivinaNumero extends Juego{
        
        public int record = 0;
        Scanner in = new Scanner(System.in);
        
        public JuegoAdivinaNumero(int numVidas, int num) {
            super(numVidas,num);
        }
        
        
        @Override 
        public void juega(){
           do{    
                int numero;
                boolean band;
                
                System.out.println("");
                System.out.print("Inserte un numero: ");
                numero = in.nextInt();
                record++;
 
                if ( numero == num ){
                    System.out.println("ACERTASTE!!");
                    System.out.println("Su record es: "+record);
                    ActualizaRecord(record);
                    break;
                }
                else{
                    band = QuitaVida();
                    if (band == true){
                        if (this.num > numero){
                            System.out.println("El numero a adivinar es mayor");
                        }
                        else{
                            System.out.println("El numero a adivinar es menor");
                        }
                        
                        System.out.println("Intentalo de Nuevo, Suerte!");
                    }
                }
                
               if (band == false){
                   System.out.println("-------------------------------");
                   System.out.println("Ya no te quedan vidas mi ciela :( ");
                   System.out.println("-------------------------------");
                   break;
               }
                
            }while(numVidas != 0);
        }
        
        public boolean QuitaVida(){
            this.numVidas -= 1;
            boolean vidas = false;
            
            if (numVidas != 0){
                vidas = true;
                return vidas;
            }
            else{
                return vidas;
            }
   
        }
        
        public void ActualizaRecord(int numVidas){
            record = numVidas;
        }
        
        public boolean ValidaNumero(int num){
            return true;
        }
        
        
        
}
