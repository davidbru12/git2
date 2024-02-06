package ejercicios.de.metodos;

import java.util.Scanner;

public class EjerciciosDeMétodos {
    public static Scanner datos=new Scanner(System.in);
    //Hoja de ejercicios sobre los métodos
    public static int[] crearArray(){
        System.out.println("Introduce el tamaño del array");
        int tam=datos.nextInt();
        int miArray []=new int [tam];
        //Rellenamos elArray con un for
        for(int x=0; x<miArray.length;x++){
        System.out.println("Introduce el valor " + (x+1) + " del array");
        miArray[x]=datos.nextInt();        
        }
        return miArray ; 
    }
    //DEFINICIÓN DE LA FUNCIÓN
    public static int sumaArray(int [] arrayASumar){
        int suma=0;
        for(int x=0;x<arrayASumar.length; x++)
            suma=suma+arrayASumar[x];
        return suma; 
    }
    
    public static int mayorEnArray(int [] arraicito){
        int mayor=arraicito[0];
        for(int x=1; x<arraicito.length;x++){
            if( arraicito[x]>mayor)
                mayor=arraicito[x];            
        }
        return mayor;
    }
    
    public static int sumaPares(int [] arraizote){
        int laSumaPar=0;
        for(int x=0; x<arraizote.length;x++){
            if(arraizote[x]%2==0)
                laSumaPar=laSumaPar+arraizote[x];
        }
        return laSumaPar;
    }
    public static int factorial(int numero){
        return factorial(8);
    }
    

    public static void main(String[] args) {
        /*int [] x=crearArray();    
        int laSuma=sumaArray(x);
        int mayor=mayorEnArray(x);
        int sumitaPar=sumaPares(x);
        System.out.println(laSuma);
        System.out.println(mayor);
        System.out.println(sumitaPar);*/
        
        
    }

}
