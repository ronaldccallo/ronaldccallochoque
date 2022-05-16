package productocrud;

import implementacion.ImplProductos;
import java.util.Scanner;


public class MenuDeOpcionesCRUD {
    
     //Reset
         public static final String ANSI_RESET = "\u001B[0m";
         //Colores de letra
         public static final String ANSI_BLACK = "\u001B[30m";
         public static final String ANSI_RED = "\u001B[31m";
         public static final String ANSI_GREEN = "\u001B[32m";
         public static final String ANSI_YELLOW = "\u001B[33m";
         public static final String ANSI_BLUE = "\u001B[34m";
         public static final String ANSI_PURPLE = "\u001B[35m";
         public static final String ANSI_CYAN = "\u001B[36m";
         public static final String ANSI_WHITE = "\u001B[37m";
         //Colores de fondo
         public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
         public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
         public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
         public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
         public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
         public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
         public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
         public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    
    
    
    
    public void menuOpciones() {      
        Scanner lTecla = new Scanner(System.in);
        ImplProductos impl = new ImplProductos();
        
        int opcionesA=0;
             
        System.out.println(ANSI_GREEN+"|----------Bienvenido al menu de opciones del CRUD de la clase Productos----------|"+ANSI_RESET+
        "\n"+ANSI_YELLOW+"Elija la accion a realizar:\n"+ANSI_RESET+ 
        "\n"+ANSI_CYAN+"1=Agregar Productos"+ANSI_CYAN+
        "\n2=Reportar Productos"+ANSI_CYAN+
        "\n3=Modificar Productos"+ANSI_CYAN+
        "\n4=Eliminar Productos"+ANSI_CYAN+
        "\n0=Salir del CRUD de Productos"+ANSI_CYAN+
        "\n"+ANSI_RESET);
        int numA = lTecla.nextInt();
        
        opcionesA = numA;  
        while(opcionesA!=0){
            switch(opcionesA) {

              case 1:{ 
                  impl.agragarProductosPorTeclado();
                    } break;

            
              case 2: {
                  impl.reporteProductos();
              } break;  
              
              
              case 3: {
                  impl.modificarproductos();
            } break; 
            

              case 4: {
                  impl.eliminarproductos();
            } break;

              default: System.out.println(ANSI_RED+"Elija una opcion existente!!"+ANSI_RESET);
            }
        
        System.out.println(ANSI_GREEN+"----------------------------------------------------------------"+ANSI_RESET);
            
        System.out.println(ANSI_GREEN+"|----------Bienvenido al menu de opciones del CRUD de la clase Productos----------|"+ANSI_RESET+
        "\n"+ANSI_YELLOW+"Elija la accion a realizar:\n"+ANSI_RESET+ 
        "\n"+ANSI_CYAN+"1=Agregar Productos"+ANSI_CYAN+
        "\n2=Reportar Productos"+ANSI_CYAN+
        "\n3=Modificar Productos"+ANSI_CYAN+
        "\n4=Eliminar Productos"+ANSI_CYAN+
        "\n0=Salir del CRUD de Productos"+ANSI_CYAN+
        "\n"+ANSI_RESET);
        int numB = lTecla.nextInt();
        opcionesA = numB;
         
                
        }        
    }
    
}
