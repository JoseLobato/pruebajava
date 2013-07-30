package entrada;
import java.util.Scanner; 

public class Entrada {

    public static void main(String[] args) {
        int resultado = 0;
        
        // En este segmento introducimos los datos.
        System.out.print("Introduzca el primer numero: ");
        Scanner pnumero = new Scanner(System.in); 
        int i = pnumero.nextInt();
        
        System.out.print("Introduzca el segundo numero: ");
        Scanner snumero = new Scanner(System.in);
        int x = snumero.nextInt();
        
        // Acá producimos la operación.
        resultado = i * x; 
        
        // Aca los devolvemos en pantalla. 
        System.out.println("La multiplicación es: " + resultado); 
     
    }
}
