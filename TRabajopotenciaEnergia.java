
package trabajopotenciaenergia;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.lang.Math;

public class TRabajopotenciaEnergia {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static String resp = "";
    public static String preg[] = {"\033[32m\t¿Que angulo forma el trabajo cuando es cero?", "\033[35m\tEl trabajo es cero cuando existe una fuerza:", "\033[35m\tLa Energia es una magnitud fisica : ",
        "\033[35m\tLa potencia es una magnitud fisica :", " \033[35m\t cual no pertenece al trabajo :"," \033[35m\t Que autor menciona:“la  relación del trabajo realizado con el tiempo se conoce como potencia” " , "\033[35m\t ¿En qué se mide la energía? :",
        "\033[35m\t Es aquella forma de energía asociada a un cuerpo debido  a su movimiento y translación y rotación :"," \033[35m\t La energía mecánica es :" , "\033[35m\t Es aquella que posee un cuerpo sujeto a un resorte comprimido y estirado. :"};
    public static String opc1[] = {"\033[34m\t0", "\033[34m\t120", "\033[34m\t90", "\033[34m\t360", "\033[34m\t180"};
    public static String opc2[] = {"\033[34m\tObtusa", "\033[34m\tPerpendicular", "\033[34m\trecta", "\033[34m\tparalela", "\033[34m\tNinguna de las anteriores"};
    public static String opc3[] = {"\033[34m\tfundamental", "\033[34m\tnecesaria", "\033[34m\tEscalar", "\033[34m\ta y b", "\033[34m\t N.A"};
    public static String opc4[] = {"\033[34m\tfundamental", "\033[34m\tnecesaria", "\033[34m\tEscalar", "\033[34m\ta y b", "\033[34m\t N.A"};
    public static String opc5[] = {"Distancia", "Fuerza", "Velocidad", "Aceleración", " A y B "};
    public static String opc6[] = {"Beichner", "Newton", "Charles Darwin ", "Dueñas", "N.A"};
    public static String opc7[] = {"Metros", "Watts", "Joules", "Coulomb", "N.A"};
    public static String opc8[] = {"Energía Potencial", "Energía", "Energía Cinetica", "Energía Elastica", "N.A"};
    public static String opc9[] = {"E.Cinética + E.Potencial", "E.Cinética * E.Potencial", "E.Cinética ", "E.Potencial", "N.A"};
    public static String opc10[] = {"E.Elastica", "E.Potencial", "E.Mecanica", "E.Cinetica", "N.A"};
    public static String resp1[] = {"c", "b", "c", "c", "e","a", "c", "c","a","a"};
    public static int n = preg.length, correcto = 0;
    public static void main(String[] args)throws IOException {
           creditos();

        int op, c = 0;

        do {
            do {
                menu();
                op = Integer.parseInt(br.readLine());
            } while (op < 1 || op > 6);

            switch (op) {
                case 1:
                    Trabajo();
                    break;
                case 2:
                    potencia();
                    break;
                case 3:
                    ENERGIA();
                    break;
                case 4:
                    Conceptos();
                    break;
              case 5:
                    Cuestionario();
                    break;
                default:
            }
        } while (op != 6);
        creditos();
        System.out.println("\t\033[32m☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺ \n");
        System.out.println("\t\033[32m☺\033[30m✔✔✔✔  Gracias, hasta la próxima✔✔✔✔\033[32m☺ \n");
        System.out.println("\t\033[32m☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺ \n");
    }
       
        
       
    private static void Conceptos() throws IOException {
        System.out.println("\033[32m     ♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");
        System.out.println("\033[32m     ♦\t\033[32m   ✻CONCEPTOS✻                                                                                          ♦");
        System.out.println("\033[32m     ♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");
        System.out.println("\033[32m     ♦                                                                                                                   ♦");
        System.out.println("\033[32m     ♦\t\033[31m  ➥ Trabajo ➥  \033[31m                                                                                 ♦");
        System.out.println("\033[32m     ♦\t\033[30m  1.- ✔Si la fuerza esta en el sentido del movimiento , el trabajo es : W = F*D .                       ♦");
        System.out.println("\033[32m     ♦\t\033[30m   2.- ✔El trabajo se mide en Joules.                                                                   ♦");
        System.out.println("\033[32m     ♦\t\033[30m  2.-  ✔Si la fuerza es perpendicular el trabajo es cero.                                               ♦");
        System.out.println("\033[32m     ♦\t\033[30m  3.-  ✔Si la fuerza esta en sentido contrario , el trabajo es negativo.                                ♦" );
        System.out.println("\033[32m     ♦\t\033[31m  ➥ Potencia ➥ \033[31m                                                                                 ♦");
        System.out.println("\033[32m     ♦\t\033[30m   1.- ✔La potencia nos idica cual es la rapidez de realizar un trabajo.                                 ♦");
        System.out.println("\033[32m     ♦\t\033[30m   2.- ✔La potencia se mide en Watts.                                                                    ♦");
        System.out.println("\033[32m     ♦\t\033[30m   3.- ✔La potencia no ayuda a encontrar la eficiencia de un trabajo , como la de un motor de autos.     ♦");
        System.out.println("\033[32m     ♦\t\033[30m   4.- ✔La eficiencia dentro de la potencia nos indica el maximo rendimiento de un motor.                ♦");
        System.out.println("\033[32m     ♦\t\033[31m   ➥ Energía ➥ \033[31m                                                                                  ♦");
        System.out.println("\033[32m     ♦\t\033[30m  1.- ✔La energia es una magnitud fisica escalar; que expresa la capacidad para realizar trabajo.        ♦");
        System.out.println("\033[32m     ♦\t\033[30m  2.- ✔Existen tipos de energia como ; la cinetica , potencial, potencial gravitatoria y la elastica.    ♦");
        System.out.println("\033[32m     ♦\t\033[30m  3.- ✔La energia es una magnitud fisica escalar; que expresa la capacidad para realizar trabajo.        ♦");
        System.out.println("\033[32m     ♦\t\033[30m  4.- ✔Existen tipos de energia como ; la cinetica , potencial, potencial gravitatoria y la elastica.    ♦");
        System.out.println("\033[32m     ♦\t\033[30m  5.- ✔La energia es una magnitud fisica escalar; que expresa la capacidad para realizar trabajo.        ♦");
        System.out.println("\033[32m     ♦\t\033[30m  6.- ✔Existen tipos de energia como ; la cinetica , potencial, potencial gravitatoria y la elastica.    ♦");
        System.out.println("\033[32m     ♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");
        System.out.println(""); 
        System.out.println("\t\033[30m ☛☛☛☛ Selecciona \033[32m SI \033[30m , si quieres añadir un concepto "); 
    }

    private static void Trabajo() throws IOException {
               
        System.out.println("\tTRABAJO");
          teoria2LN();
        int op2;
        do {
            do {
                menutrabajo();
                op2 = Integer.parseInt(br.readLine());
            } while (op2 < 1 || op2 > 2);
            switch (op2) {
                case 1:
                    trabajo();
                    break;
                default:
            }
        } while (op2 != 2);     
    }

    private static void potencia() throws IOException {
        tutoPotencia();
        int op2;
        do {
            do {
              potencia2();
                op2 = Integer.parseInt(br.readLine());
            } while (op2 < 1 || op2 > 3);
            switch (op2) {
                case 1:
                    potencia4();
                    break;
                case 2:
                   rendimiento();
                    break;
                     
                  
                case 3:
                default:
            }
        } while (op2 != 3);
    }
    
    private static void ENERGIA() throws IOException {
        tutoEnergia();
        int op2 = 0;
        do {
            do {
              Energia();
                op2 = Integer.parseInt(br.readLine());
            } while (op2 < 1 || op2 > 4);
           
            switch (op2) {
                case 1:
                    Energiacinetica();
                    break;
                case 2:
                    Energiapotencial();
                    break;
                case 3:
                   Energiaelastica();
                    break;
                default:
            }
        } while (op2 != 4);
    }
  
  
    static void creditos() {
        System.out.println("\033[32m  ✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦ ");
        System.out.println("\033[32m  ✦      \033[30m              PROYECTO                         \033[32m                        ✦ ");
        System.out.println("\033[32m  ✦      \033[30m        TAREA DE PRODUCCION                   \033[32m                         ✦ ");
        System.out.println("\033[32m  ✦      \033[30m                                               \033[32m                ✦ ");
        System.out.println("\033[32m  ✦      \033[30m    TRABAJO,POTENCIA Y ENERGIA                 \033[32m                        ✦");
        System.out.println("\033[32m  ✦                                                             \033[32m                        ✦");
        System.out.println("\033[32m  ✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦");
        System.out.println("\033[32m  ✦              \033[34m      ALGORITMOS                   \033[32m                            ✦");
        System.out.println("\033[32m  ✦                                                                                      ✦");
        System.out.println("\033[32m  ✦\033[34m Escuela Profesional de Ingeniería de Sistemas e Informatica \033[32m                ✦");
        System.out.println("\033[32m  ✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦");
        System.out.println("\033[32m  ✦     \033[31m           Elaborado por:              \033[32m                                  ✦");
        System.out.println("\033[32m  ✦     \033[30m        ➣ Mendoza Oviedo Michael Nay   \033[32m                                 ✦ ");
        System.out.println("\033[32m  ✦     \033[30m        ➣ Fajardo Gamez Jeferson       \033[32m                                 ✦");
        System.out.println("\033[32m  ✦     \033[30m        ➣ Valera Garibay Renato        \033[32m                                 ✦");
        System.out.println("\033[32m  ✦     \033[30m        ➣ Leyton Randall               \033[32m                                 ✦");
        System.out.println("\033[32m  ✦ ══════════════════════════════════════════════        ✦");
        System.out.println("\033[32m  ✦     \033[31m DOCENTES:\033[30m Mg. Hugo E. Caselli Gismondi   \033[32m              ✦");
        System.out.println("\033[32m  ✦                       \033[30m Ing. Pedro Manco Pulido        \033[32m                      ✦");
        System.out.println("\033[32m  ✦                       \033[30m Mg. Yim Apestegui Florentino    \033[32m                     ✦");
        System.out.println("\033[32m  ✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦\n");
    }

   
   
     
      static void menu() {
        System.out.println("\n\n");
        System.out.println("\033[32m\t\t✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦");
        System.out.println("\033[32m\t\t║                                 ║");
        System.out.println("\033[32m\t\t║       TRABAJO , POTENCIA        ║");
        System.out.println("\033[32m\t\t║            Y ENERGIA            ║");
        System.out.println("\033[32m\t\t║                                 ║");
        System.out.println("\033[32m\t\t✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦");
        System.out.println("\033[32m\t\t║     ║1⇗ Trabajo     ║          ║");
        System.out.println("\033[32m\t\t║     ║2⇗ Potencia    ║          ║");
        System.out.println("\033[32m\t\t║     ║3⇗ Energia     ║          ║");
        System.out.println("\033[32m\t\t║     ║4⇗ CONCEPTOS   ║          ║");
        System.out.println("\033[32m\t\t║     ║5⇗ CUESTIONARIO║          ║");
        System.out.println("\033[32m\t\t║     ║6⇗ Salir       ║          ║");
        System.out.println("\033[32m\t\t✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦");
        System.out.print("\t\t    Vamos ☺  Elije una opción [1-6] : ");
    }
      
        private static void  tutoPotencia() throws IOException {
        System.out.println("\t♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦  ");
        System.out.println("\t♦✎ ✎ ✎ Potencia✐✐✐✐✐✐                                            ♦");
        System.out.println("\t♦ Para Calcular la Potencia ; debemos tener en cuenta lo siguiente: ♦");
        System.out.println("\t♦                                                                     ♦");
        System.out.println("\t♦                                                                     ♦");
        System.out.println("\t♦     ♣  1 watt = 1 joule / segundos                                  ♦");
        System.out.println("\t♦     ♣   P= w/t             Donde:                                   ♦ ");
        System.out.println("\t♦                                 P = Potencia                         ♦");
        System.out.println("\t♦                                 W = Trabajo                          ♦");
        System.out.println("\n♦                                 T = Tiempo                           ♦");
        System.out.println("\n♦\t      ♣ EJEMPLO: Calcular la Potencia si el                         ♦");
        System.out.println("\n♦                trabajo es igual a 50 J  y  el tiempo                 ♦");
        System.out.println("\n♦                2 segundos                                            ♦");
        System.out.println("\n♦\t      ♣ SOLUCION:     W     50 J                                    ♦");
        System.out.println("\n♦                 P= --- = ------------ = 25  watts                    ♦");
        System.out.println("\n♦                     T       2 S                                      ♦");
        System.out.println("\n♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦                                                          ");
        System.out.println("");
        }
        private static void   tutoEnergia() throws IOException {
        System.out.println("");
        System.out.println("\n♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");
        System.out.println("\n♦Energia                                                          ♦");
        System.out.println("\n♦Elije del menu para poder calcular los distintos tipos de energia♦");
        System.out.println("\n♦                                                                  ♦");
        System.out.println("\n♦ RECORDAR                                                         ♦");
        System.out.println("\n♦     UNIDADES : Joule                                             ♦");
        System.out.println("\n♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦               ");
        System.out.println("");
        }
    
       
    static void potencia2() {
      System.out.println("\n\n");
        System.out.println("\033[32m\t\t┌───────────────┐");
        System.out.println("\033[32m\t\t│  Potencia              │");
        System.out.println("\033[32m\t\t├───────────────┤");
        System.out.println("\033[32m\t\t│  Calcular                │");
        System.out.println("\033[32m\t\t│    [1] potencia          │");
        System.out.println("\033[32m\t\t│    [2] rendimiento       │");
        System.out.println("\033[32m\t\t│    [3] Salir             │");
        System.out.println("\033[32m\t\t└───────────────┘");
        System.out.print("\t\t     Elije una opción [1-4]: ");
    }
    static void Energia() {
        System.out.println("\n\n");
        System.out.println("\033[32m\t\t┌───────────────┐");
        System.out.println("\033[32m\t\t│    ENERGIA              │");
        System.out.println("\033[32m\t\t├───────────────┤");
        System.out.println("\033[32m\t\t│  Calcular               │");
        System.out.println("\033[32m\t\t│    [1] ENERGIA CINETICA │");
        System.out.println("\033[32m\t\t│    [2] ENERGIA POTENCIAL│");
        System.out.println("\033[32m\t\t│    [3] ENERGIA ELASTICA │");
        System.out.println("\033[32m\t\t│    [4] Salir            │");
        System.out.println("\033[32m\t\t└───────────────┘");
        System.out.print("\t\t     Elije una opción [1-4]: ");
    }
    
    
    static void menutrabajo() {
        System.out.println ("");
        System.out.println("\033[32m\t\t┌───────────────┐");
        System.out.println("\033[32m\t\t│    TRabajo               │");
        System.out.println("\033[32m\t\t├───────────────┤");
        System.out.println("\033[32m\t\t│  Calcular               │");
        System.out.println("\033[32m\t\t│    [1] Calcular el Trabajo│");
        System.out.println("\033[32m\t\t│    [2] Salir              │");
        System.out.println("\033[32m\t\t└───────────────┘");
        System.out.println("\t\t     Elije una opción [1-2]: ");}
    private static void teoria2LN() throws IOException {
        System.out.println("");
        System.out.println("\n♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦  ");
        System.out.println("\n♦\t ♦Calcula el Trabajo                                        ♦");
        System.out.println("\n♦\033[32m\t( 1 Joule = 1 Newton * 1 Metro)                     ♦");
        System.out.println("\n♦\tLa aceleración que toma un -- completar                     ♦");
        System.out.println("\n♦\t-- completar --.                                            ♦");
        System.out.println("\n♦ _     _                                                      ♦");
        System.out.println("\n♦  \t  F = m a Donde:                                          ♦");
        System.out.println("\n♦  \t F = fuerza (N)                                           ♦");
        System.out.println("\n♦  \t D = distancia (m)                                        ♦");
        System.out.println("\n♦  \t Cos  = Angulo                                            ♦");
        System.out.println("\n♦  \t Por ejemplo ; calcular el trabajo  si :                  ♦");
        System.out.println("\n♦  \t F = 10 , D = 10 , Cos = 37º                              ♦");
        System.out.println("\n♦  \t SOLUCION:  m/s²                                          ♦");
        System.out.println("\n♦  \tW = F * D* Cos =10 N * 10 m * Cos 37º  = 79 joule         ♦");
        System.out.println("\n♦                                                              ♦");
        System.out.println("\n♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦ ");
    }

    private static void trabajo() throws IOException {
        double w = 0.0, f = 0.0, d = 0.0 , grados=0.0;
   
        System.out.print("Ingrese el valor de la Fuerza (en N): ");
        f = Double.parseDouble(br.readLine());
        System.out.print("Ingrese el valor de la distancia (en m): ");
        d = Double.parseDouble(br.readLine());
        System.out.print("Ingrese el valor del angulo (en grados): ");
           grados = Double.parseDouble(br.readLine());
         double gradRadi = Math.toRadians(grados);
        w = f * d * Math.cos(gradRadi) ;
        System.out.print("\033[32m\tTrabajo = " + w + " J (Joules)");
    }

    
 
    private static void potencia4() throws IOException {
         double w = 0.0, t = 0.0, P = 0.0  ;
        System.out.print("Ingrese el tiempo (en segundos): ");
        t = Double.parseDouble(br.readLine());
        System.out.print("Ingrese el valor del trabajo (en joules): ");
        w = Double.parseDouble(br.readLine());
        
        P =  w/t;
        System.out.print("potencia = " + P + " Watts(w)"); 
        
        
    }
    
    
    private static void rendimiento() throws IOException {
          double n = 0.0, PU = 0.0, PE = 0.0  ;
        System.out.print("Ingrese la Potencia Entregada P.E (en watts): ");
        PE = Double.parseDouble(br.readLine());
        System.out.print("Ingrese la Potencia Util P.U (en watts): : ");
        PU= Double.parseDouble(br.readLine());
        n=  (PU/PE)*100;
        System.out.print(" El rendimiento de su motor es = " + n +  " % Watts ");
         }
    
    private static void PP() throws IOException {
        double   PP=0.0 ,PU = 0.0, PE = 0.0  ;
        System.out.print("Ingrese la Potencia perdida PP (en watts): ");
        PP = Double.parseDouble(br.readLine());
        System.out.print("Ingrese la Potencia Util PU (en watts): : ");
        PU= Double.parseDouble(br.readLine());
        PE= PU + PE ;
        System.out.print("ya tenemos la potencia inicial es : "  + PE);
        
    }
    /////inicio a calcular la energia
    
    private static void  Energiacinetica() throws IOException {
         double E = 0.0, M = 0.0, V = 0.0 , constante= 0.5 ;   
        System.out.print("Ingrese la velocidad (en m/s): ");
        V = Double.parseDouble(br.readLine());
        System.out.print("Ingrese la masa (en kilogramos): ");
        M = Double.parseDouble(br.readLine());
        E = constante* M*Math.pow(constante, 2);
        System.out.print(" La energia cinetica es :  = " + E + " joules ");      
    } 
    private static void  Energiapotencial() throws IOException {
         double EP = 0.0, M = 0.0, G = 9.8 , H =0.0  ;
         
        System.out.print("Ingrese la masa (en kg): ");
        M = Double.parseDouble(br.readLine());
        System.out.print("Ingrese la altura (en metros): ");
        H = Double.parseDouble(br.readLine());
        EP =  M * H * G;
        System.out.print(" La energia potencial es: = " + EP + "joules ");    
    }
    private static void  Energiaelastica() throws IOException {
         double EE = 0.0, X = 0.0, K = 0.0,consEE = 0.5  ;
         
        System.out.print("Ingrese la calidad del resorte  K (la constante elasticidad) : ");
        K = Double.parseDouble(br.readLine());
        System.out.print("Ingrese la deformacion del resorte X ");
        X= Double.parseDouble(br.readLine());
        EE = consEE*K*Math.pow(X, 2);
        System.out.print("La energia elastica es;  = " + EE + "joules ");   
    }
    ///fin de la energia
    private static void Cuestionario() throws IOException {
        System.out.println("CUESTIONARIO\n");
        correcto = 0;
        for (int i = 0; i < n; i++) {
            do {
                System.out.println("\n" + (i + 1) + ".- " + preg[i]);
                if (i == 0 || i == 2 || i == 4) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("\t[" + (char) (j + 97) + "]" + opc1[j] + "\t");
                    }
                    System.out.println();
                } else {
                    if (i == 1) {
                        for (int j = 0; j < n; j++) {
                            System.out.print("\t[" + (char) (j + 97) + "]" + opc2[j] + "\t");
                        }
                        System.out.println();
                    } else {
                        for (int j = 0; j < n; j++) {
                            System.out.print("\t[" + (char) (j + 97) + "]" + opc3[j] + "\t");
                        }
                        System.out.println();
                    }
                }
                System.out.print("Escriba su respuesta [a-e]? ");
                resp = br.readLine();
            } while (resp.compareTo("a") < 0 || resp.compareTo("e") > 0);
            if (resp.equals(resp1[i])) {
                correcto++;
            }
        }
        System.out.println();
        System.out.println("RESULTADOS");
        System.out.println("Tiene: " + correcto + " respuestas correctas");
        System.out.println("     y " + (5 - correcto) + " incorrectas");
        if (correcto == 5) {
            System.out.println("EXCELENTE, FELICIDADES!!!");
        } else {
            if (correcto == 4 || correcto == 3) {
                System.out.println("\033[34m\t ESTAS BIEN    ☺!!!");
            } else {
                System.out.println("\033[31m\t TIENES QUE REPASAR   ☹ !!!");
            }
        }
    }
}

        
    
    
    
    

