
package programa05;
import java.util.Scanner;

public class Programa05 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero del uno al doce:  ");
        int mes;
        mes = entrada.nextInt();
        if (mes == 1){
            System.out.println("Enero 31 dias");
        }
        if (mes == 3){
            System.out.println("Marzo 31 dias");
        }
        if (mes == 4){
            System.out.println("Abril 30 dias");
        }
        if (mes == 5){
            System.out.println("Mayo 31 dias");
        }
        if (mes == 6){
            System.out.println("Junio 30 dias");
        }
        if (mes == 7){
            System.out.println("Julio 31 dias");
        }
        if (mes == 8){
            System.out.println("Agosto 31 dias");
        }
        if (mes == 9){
            System.out.println("Septiembre 30 dias");
        }
        if (mes == 10){
            System.out.println("Octubre 31 dias");
        }
        if (mes == 11){
            System.out.println("Noviembre 30 dias");
        }
        if (mes == 12){
            System.out.println("Diciembre 31 dias");
        }
        if (mes == 2){
            System.out.println("Año:  ");
            Scanner a = new Scanner(System.in);
            int anio;
            anio = a.nextInt();
                  
            System.out.println("bisiesto");
                //else {
                  //      System.out.println("No es bisiesto ");
                    //    }           
                         
            
      
    }
    
}
}
