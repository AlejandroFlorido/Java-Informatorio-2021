import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Ingrese un numero para mostrar la secuencia");
        int num = scan.nextInt();
        scan.close();
        // primer for crea un bucle para crear n numero de listas
        for (int i=1; i<=num; i++){
            List<Integer> lista = new ArrayList<Integer>();
            //segundo for crea la lista
            for (int g=1; g<=i; g++){
                lista.add(g);
            }
            System.out.println(lista);
        }
    }
}
