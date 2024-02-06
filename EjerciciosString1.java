package ejerciciosstring;

public class EjerciciosString1 {

    public static void main(String[] args) {
        char[] saludo = new char[4];
        saludo[0] = 'H';
        saludo[1] = 'O';
        saludo[2] = 'L';
        saludo[3] = 'A';
        System.out.println(saludo);
        String saludo2 = "Hola, como estás?, yo estoy genial";
        System.out.println(saludo2);
        String otroString = saludo2;
        System.out.println(otroString);
        String prueba = "esto" + "es" + "una" + "prueba";
        System.out.println(prueba);
        prueba = prueba + ". Podemos añadir mas texto" + saludo2;
        System.out.println(prueba);
        //Hola es un ejercicio para entender los String
    }

}
