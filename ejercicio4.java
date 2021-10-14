import java.rmi.server.LoaderHandler;
import java.util.Scanner;

//Realizar un programa que calcule el factorial de un número:
//n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
//Sin hacer uso de librerías.


public class ejercicio4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numero a factorizar");
        int num = entrada.nextInt();
        long fact = 1;
        for(long i=1; i<=num; i++){
            fact = (fact*i);
            
        }
        System.out.println("El factorial de " + num +(" es: " + fact));
    }
    
}
