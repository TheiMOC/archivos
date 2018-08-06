

package porfavor;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author ROSA
 */
public class Porfavor {
    public static void main(String[] args) {
        int n = 11 ; //numero de items 
        String banco_preguntas []= new String[n] ;
        banco_preguntas[0]= " \033[35m\t [1] ¿Que angulo forma el trabajo cuando es cero?";
        banco_preguntas[1]= "\033[35m\t [2] El trabajo es cero cuando existe una fuerza:";
        banco_preguntas[2]= "\033[35m\t[3] La Energia es una magnitud fisica : ";
        banco_preguntas[3]= "\033[35m\t[4] La potencia es una magnitud fisica :";
        banco_preguntas[4]= " \033[35m\t [5] ¿cual no pertenece al trabajo ?";
        banco_preguntas[5]=   " \033[35m\t [6] ¿cual no pertenece al trabajo ?";
        banco_preguntas[6]=   " \03s3[35m\t [7] Que autor menciona:“la  relación del trabajo realizado con el tiempo se conoce como potencia” " ;
        banco_preguntas[7]=  "\033[35m\t [8] ¿En qué se mide la energía? :";
        banco_preguntas[8]=    "\033[35m\t [9] Es aquella forma de energía asociada a un cuerpo debido  a su movimiento y translación y rotación :";
        banco_preguntas[9]=   " \033[35m\t [10] La energía mecánica es :";
        banco_preguntas[10]=   "\033[35m\t [11] Es aquella que posee un cuerpo sujeto a un resorte comprimido y estirado. :";
        String alternativas[][] = { {"90","120","180","360"},
                {"perpendicular" ,"obtusa" ,"fuerza", "N.A"},
                {"Escalar" , "Fundamental" , "Implicita" , "Gravitatoria"},
                {"Escalar" , "Fundamental" , "Implicita" , "Gravitatoria" },
                {"tiempo" ,"fuerza" ,"distancia","gfgfg"},
                {"Metros", "Watts", "Joules", "N.A"},
                {"Beichner", "Newton", "Charles Darwin ", "N.A"},
                {"Energía Potencial", "Energía", "Energía Cinetica",  "N.A"},
                {"Energía Potencial", "Energía", "Energía Cinetica",  "N.A"},
                {"E.Cinética + E.Potencial", "E.Cinética * E.Potencial", "E.Cinética ", "N.A"},
                 
                {"E.Elastica", "E.Potencial", "E.Mecaniaca", "N.A"},
        };
        String respuestas []={"a" ,"a" ,"a","a" , "a","a","c","a", "a" , "a", "a", };
        
        n =banco_preguntas.length;
        String []A= banco_preguntas ;
        int dado;
        int B [] = new int [n];
        for ( int i=0;i<B.length;i++)
        {
        int estado  =0;
            if (i==0){
            dado= (int)(Math.random()*(B.length));
            B[i]= dado;
                    } 
            else {
            int k = 0;
                do{
               dado = (int) (Math.random()*(B.length));
               while  (k<i) {
               if (dado != B[k])
               {estado++;}
               k++;}
               if (estado==i){
               B[i]=dado;
               }else {
               estado=0;
               k=0;              
               }             
                }                         
                while(estado !=i);
            }      
        int aleatorio = B[i];
        System.out.println (" ");
        System.out.println (banco_preguntas[aleatorio]);
        int j = aleatorio;
        System.out.println ("\tⒶ"  + alternativas[j][0] + "\tⒷ "+ alternativas[j][1] +    "\t Ⓒ "+ alternativas[j][2]+   " \tⒹ "+ alternativas[j][3] );
        System.out.println("\033[35m\t Ingrese su respuesta [A-D] :");    
        String respuesta="";
         int correcta = 0 ;
        int mala = 0;
        
        
          Scanner leerrespuesta= new Scanner (System.in);
          do {respuesta = leerrespuesta.nextLine();}
          while (respuesta == "a" || respuesta == "b" ||respuesta == "c" ||respuesta == "d" );
          if (respuesta.equals(respuestas[aleatorio])){
               System.out.println("\033[32m\t es correcta");
             
                
               
          }else{System.out.println("\033[32m\t es incorrecta");
             
          System.out.println("\033[32m\t la respuesta es "+respuestas[j] );
            
          
               
          
          }
          
          
         
              correcta = correcta + 1;
            System.out.println("el numero de buenas es" + correcta);  
          
              mala = mala + 1;
                System.out.println("el numero de malas" + mala);
            
        
       
          
        /*  
         double des = 1.5;
         double total = 10-mala*des ;
         System.out.println("el total es "+ total);*/
         /*
          if (correcta>=1 && correcta<= 3){
                 System.out.println("\033[32m\t numeros de buenas "+correcta );
                System.out.println("\033[32m\t numeros de malas "+mala );
            System.out.println("\033[32m\t repasar mas " );
   
          }
             if (correcta>=4 && correcta<= 7){
                 System.out.println("\033[32m\t numeros de buenas "+correcta );
                System.out.println("\033[32m\t numeros de malas "+mala );
            System.out.println("\033[32m\t repasar mas " );
   
          }
          if (correcta>=7 && correcta<= 10){
                 System.out.println("\033[32m\t numeros de buenas "+correcta );
                System.out.println("\033[32m\t numeros de malas "+mala );
            System.out.println("\033[32m\t repasar mas " );
   
          }
         */
          
         
        
        /*
        Scanner leerteclado= new Scanner (System.in);
       
       turespuesta = leerteclado.nextLine();
   
        correcta = correcta++;
       if (turespuesta.equals(respuestas[j])){
          
        System.out.println(turespuesta+"\033[32m\t es correcta");
     
        }
    
        else {System.out.println(turespuesta+"\033[31m\t incorrecta");
        mala = mala++;
        System.out.println("\t la respuesta correcta es \t " + respuestas[j]);   
           }
        
  
*/
        
        
        
        
        
        
        
        
        
        
        
        
        
    
        
        
        
        
        
        
        
        
        
        
        
        }  
    }
}
