package trabajoclase_2_catalinayushan;

import java.util.Scanner;

public class TRABAJOCLASE_2_CATALINAYUSHAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int opcion = 0;
        
      
        boolean banderita=true;
        System.out.println("Hola, bienvenido al menu!");
        System.out.println("Las opciones son: 1. Metodo Void \n 2. Metodo Int \n 3. Metodo Boolean");
        
        switch(opcion){
            case 1:
                System.out.println("");
                break ;
            case 2:
                System.out.println("");
                break;
            case 3:
                System.out.println("");
                break ;
            default:
                banderita = false;
                break;
        }
        
    }
    
    public static boolean esPalindroma(String cadena){
        String cadenaNueva=cadena.replace(" ","");
        String minuscula=cadenaNueva.toLowerCase();
        for (int x = minuscula.length()-1; x >=0; x-- ){
            String letra_reversa=minuscula.charAt(x)+"";
            String letra_normal=minuscula.charAt(x2)+"";
            if(!letra_reversa.equals(letra_normal)){
                return false;
            }
        }   
        x2++;
    }
        return true;
    }

    