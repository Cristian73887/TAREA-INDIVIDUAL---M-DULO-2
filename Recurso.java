/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recurso;

/**
 *
 * @author crist
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Recurso {

    /* Prmer metodo: Retorna un mensaje*/
public String obtenerMensaje(){
    return "Programacion Orientada a Objetos 2021";
}

/*Segundo metodo: Determina si el estudiante 
es mayor o menor de edad */
public String VerificarEdad (int edad){
    if (edad >=21){
        return " MAyor de edad";
    }else {
        return "Menor de edad";
    }
}

/*Tercer metodo: Realiza una multiplicacion
  de dos numeros enteros*/
public int multiplicar(int numer1, int numer2)
{
return numer1*numer2;
}

/*Cuarto metodo: Retorna una lista de numeros del 1 al x*/
public List<Integer> generarListaNumeros(int x)
{
  List<Integer> numeros = new ArrayList<>();
  for (int i=1; i<=x; i++)
   {
   numeros.add(i);
   }
  return numeros;
}   
public static void main(String[] args) {
 /* Crear un scanner para leer la entrada del usuario*/      
    Scanner scanner = new Scanner(System.in);
    
     //instancia de la clase recurso
    Recurso recurso = new Recurso();
    
    //Llamar al primer metodo
    System.out.println(recurso.obtenerMensaje());
    
    //Llamar al segundo metodo: pedir la edad del estudiante
    System.out.println("Profavor ingrese la edad del estudiante");
    int edad = scanner.nextInt();
    System.out.println("verificacion de edad:" + recurso.VerificarEdad(edad));
    
    //Llamar al tercer metodo: Pedir dos numeros
    System.out.println("Ingrese el primer numero para la multiplicacion");
    int numer1 = scanner.nextInt();
    System.out.println("Ingrese el segundo numero para la multiplicacion");
    int numer2 = scanner.nextInt();
    System.out.println("Resultados de la multiplicacion:" + recurso.multiplicar(numer1,numer2));
    
    //Llamar al Cuarto metodo: pedir el valor de x 
    System.out.println("ingrese un numero(x) para generar una lista de numeros del 1 al x:");
    int x = scanner.nextInt();
    System.out.println("Lista de numeros del 1 al:" + x + ":" + recurso.generarListaNumeros(x));
    
    //Cerrar el Scanner
    scanner.close();
    }
    
}
