package calificacionesalumnos;

public class CalificacionesAlumnos {
static int[] cali=new int[15];
    public static void  calificacionesAlumns() {
     cali[0]= 12;
    cali[1]= 10;    
    cali[2]= 13;
    cali[3]= 2;
    cali[4]= 19;
    cali[5]= 12;
    cali[6]= 18;
    cali[7]= 16;
    cali[8]= 14;
    cali[9]= 11;
        
        int r=0;
        for(int a=0; a<cali.length; a++){
            r= r+cali[a];
        }
                System.out.println("|-----Calificaciones-----|");
        System.out.println("El promedio de calificaciones es: "+r/cali.length);
        System.out.println("La MAYOR calificacion es: "+cali[5]);
        System.out.println("La MENOR calificacion es: "+cali[7]);
    }
    public static void main(String[] args){
      calificacionesAlumns();  
    }
}
