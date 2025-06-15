/*
 * : Basándote en el ejercicio “Generación de números 
 * aleatorios” de este paso, crea un programa que te permita 
 * generar un array de tipo "int" de manera aleatoria. 
 * El programa debe solicitar al usuario el tamaño del array y el rango de números posibles para rellenarlo.

 */

// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrayAleatorio {
    public static int[] numerosAleatorios;
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ingrese los numeros para el rango: ");
        int min=sc.nextInt();
        sc.nextLine();
        int max=sc.nextInt();
        sc.nextLine();
        int tamaño=solicitar();
        sc.close();
        numerosAleatorios=new int[tamaño]; 
        Rellenar(numerosAleatorios,min,max);
        System.out.println(" el array es: " + Arrays.toString(numerosAleatorios));
    }
    public static int solicitar() {
        System.out.println("ingrese el tamaño del array ");
        int tamaño=sc.nextInt();
        return tamaño;
    }

    public static int[] Rellenar(int[] numerosAleatorios, int min, int max ) {
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (int) (Math.random() * (max - 1 + 1) + min);            
            }
        return numerosAleatorios;
    }

}
