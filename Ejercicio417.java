package ejerciciosforanidados;

import java.util.Scanner;

public class Ejercicio417 {
    //dibujaRectangulo
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        int base,altura;
        System.out.println("Introduce el valor de los lados del rectángulo");
        int num1=datos.nextInt();
        int num2=datos.nextInt();
        if(num1>num2){
            base=num1;
            altura=num2;
        }
        else{
            base=num2;
            altura=num1;
        }
        System.out.println("Base:" + base);
        System.out.println("Altura:" + altura);
        
        for(int x=0;x<altura;x++){            
            for(int y=0;y<base;y++){
                System.out.print(" * ");
            }
            System.out.println();
        }  
        
        
    }

}
