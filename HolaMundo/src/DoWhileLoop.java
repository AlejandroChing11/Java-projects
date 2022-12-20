import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;
        do {
            System.out.println("Selecciona el numero de la opción deseada: ");
            System.out.println("1. Movies");
            System.out.println("2. Serie");
            System.out.println("3. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 3:
                    System.out.println("Gracias por visitar");
                    break;
                case 1:
                    System.out.println("Movies: ");
                    break;
                case 2:
                    System.out.println("Series: ");
                    break;
                default:
                    System.out.println("Selecciona una opcion correcta por favor");
            }
        } while (response != 3);
        System.out.println("La ejecucion termino terminó");
    }
}
