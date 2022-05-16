
package mesesdelaño;

public class Mesesdelaño {
static String[] meses =new String[12];
    public static void mesesDelAñoArreglo () {
    meses[0]= "Enero";
    meses[1]= "Febrero";    
    meses[2]= "Marzo";
    meses[3]= "Abril";
    meses[4]= "Mayo";
    meses[5]= "Junio";
    meses[6]= "Julio";
    meses[7]= "Agosto";
    meses[8]= "Septiembre";
    meses[9]= "Octubre";
    meses[10]= "Noviembre";
    meses[11]= "Diciembre";
    System.out.println("|-------Meses del año-------|");
    for(int a=0, h=1; a<meses.length; a++,h++){
      System.out.println("Mes numero "+h+": "+meses[a]+"\n");     
    }
    }
    public static void main(String[] args){
       mesesDelAñoArreglo(); 
    }
}
