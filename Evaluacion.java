/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;



/**
 *
 * @author 503
 */
public class Evaluacion {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in); 
       
       System.out.println("ingrese el numero que desea elegir");
        System.out.println("Ingresa la opcion del nombre que deseas elegir");
        
        
         String[] compañero = {"Maria", "Juan","Andres","Luisa"};
        
        compañero[0]= "Maria";
        compañero[1]= "Juan";
        compañero[2]= "Andres";
        compañero[3]= "Luisa";
        compañero[4]= "Andrea";
        compañero[5]= "Carlos";
        compañero[6]= "Monica";
        
        System.out.println("Posicion 1 "+ compañero[6]);
        System.out.println(" El nombre en la posicion 0 es: "+ compañero[0]);
        System.out.println(" El nombre en la posicion 1 es: "+ compañero[1]);
        System.out.println(" El nombre en la posicion 2 es: "+ compañero[2]);
        System.out.println(" El nombre en la posicion 3 es: "+ compañero[3]);
        System.out.println(" El nombre en la posicion 4 es: "+ compañero[4]);
        System.out.println(" El nombre en la posicion 5 es: "+ compañero[5]);
        System.out.println(" El nombre en la posicion 6 es: "+ compañero[6]);
        
            int size = compañero.length;
                System.out.println("El nombre que has seleccionado es:"+ size);
        for(int variable=0; variable<compañero.length; variable++){
            
        System.out.println("Posicion:" + variable + "es:" + compañero[variable]);

        
            
        }
        
    }
    

    //-----------------------------EJERCICIO-2--------------------------------//
    
    // Cree una matriz  3 * 3 en la que almacene las edades de sus familiares mas allegados. Cree un loop que recorra e imprima la matriz.
    
public class TablaFamiliares {

    public static void main(String[] args) {
        // Datos para la tabla
        String[][] datos = {
            {"Familiar", "Edad"},
            {"Familiar 1", "25"},
            {"Familiar 2", "32"},
            {"Familiar 3", "45"}
            // ... añadir más filas si es necesario
        };
        
        // Imprimir la tabla
        for (String[] fila : datos) {
            System.out.printf("Esta es la lista de las edades de mis familiares", fila[0], fila[1]);
        }
    }
}
//----------------------------Ejercicio-3-------------------------------------//
public class JugadoresFutbol {

    public static void main(String[] args) {
        // Datos de los jugadores
        String[][] jugadores = {
            {"Jugador 1", "Juan", "15 años", "delantero"},
            {"Jugador 2", "Pedro", "16 años", "defensa"},
            {"Jugador 3", "Luis", "17 años", "arquero"}
        };
        
        // Imprimir la información de los jugadores
        System.out.println("Información de los jugadores de fútbol:");
        for (String[] jugador : jugadores) {
            System.out.println("Número: " + jugador[0]);
            System.out.println("Nombre: " + jugador[1]);
            System.out.println("Edad: " + jugador[2]);
            System.out.println("Posición: " + jugador[3]);
            System.out.println();  // Agregar una línea en blanco entre jugadores
        }
       
    }
   
}
//--------------------------EJERCICIO-4-----------------------------------------
public class JugadoresFutbol {

    public static void main(String[] args) {
        // Datos de los jugadores
        String[][] jugadores = {
            {"Jugador 1", "Juan", "15 años", "delantero"},
            {"Jugador 2", "Pedro", "16 años", "defensa"},
            {"Jugador 3", "Luis", "17 años", "arquero"}
        };
        
        //  imprimo la posición del arquero
        System.out.println("Posición del arquero:");
        for (String[] jugador : jugadores) {
            if (jugador[3].equals("arquero")) {
                System.out.println("El arquero es " + jugador[1]);
                break;  // Una vez que se encuentra el arquero, salir del bucle
            }
        }
    }
}
//-----------------------EJERCICIO-5-------------------------------------------
// Buscar e imprimir la información del jugador con edad "16 años"
        String edadBuscada = "16 años";
        for (String[] jugador : jugadores) {
            if (jugador[2].equals(edadBuscada)) {
                System.out.println("Información del jugador con edad " + edadBuscada + ":");
                System.out.println("Número: " + jugador[0]);
                System.out.println("Nombre: " + jugador[1]);
                System.out.println("Edad: " + jugador[2]);
                System.out.println("Posición: " + jugador[3]);
                break;  // Una vez que se encuentra la edad, salir del bucle
            }
//-----------------------EJERCICIO-6--------------------------------------------
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgregarNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        
        int contador = 0;
        do {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
            contador++;
        } while (contador < 7);
        
        System.out.println("Números ingresados:");
        for (int num : numeros) {
            System.out.println(num);
        }
        
        scanner.close();
   //----------------------------ejercicio-7------------------------------------
   import java.util.ArrayList;
import java.util.List;

public class RecorrerLista {

    public static void main(String[] args) {
        List<String> datos = new ArrayList<>();
        
        datos.add("Nombre1: 10");
        datos.add("Nombre2: 20");
        datos.add("Nombre3: 30");
        // Agregar más elementos si es necesario
        
        System.out.println("Elementos en la lista:");
        for (String dato : datos) {
            System.out.println(dato);
        }
    }
}
}

    
 
