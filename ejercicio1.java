import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.println("Como te llamas?");
        nombre = entrada.nextLine();
        System.out.println("Hola " + nombre);
        
        entrada.close();
    }
}
