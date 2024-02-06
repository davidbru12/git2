package ejerciciosstring;

public class EjercicioHola {

    public static void main(String[] args) {
        //Comparar Strings es un poco rollo porque no podemos usar
        //el operador ==.       
        String s1 = "Hola";
        String s2 = "Adios";
        String s3 = "HOLA";
        if (s1.equals(s3)) {
            //Funciona pero no es la forma mas usada
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
        if (s1.equalsIgnoreCase(s3)) {
            //Si son iguales devuelve true, sino false
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
        System.out.println("La cadena " + s1 + " tiene un tamaño de " + s1.length());
        //Podemos acceder a los caracteres del String como si fuese un array
        System.out.println(s1.charAt(0));
        System.out.println("El string empieza por H:" + s1.toLowerCase().startsWith("h"));
        System.out.println(s3);
        //Podemos  convertir Strings en arrays 
        //sino la función toCharArray()
        char[] arrayChar = s3.toCharArray();
        for (int x = 0; x < arrayChar.length; x++) {
            System.out.println(arrayChar[x]);
        }

        String s4 = "Otra cadena";
        if (s4.compareTo(s1) > 0) {
            System.out.println("s1>s4");
        } else if (s1.compareTo(s4) < 0) {
            System.out.println("s1<s4");
        } else {
            System.out.println("s1=s4");
        }
    }
    //Este es el ejercicio Hola sobre los metodos para comparar String
}
