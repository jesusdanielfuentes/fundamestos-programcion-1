import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntos = 100;
        int opcion = 0;
        do {
            System.out.println("MENÚ DE JUEGO");
            System.out.println("1. Ganar 20 puntos");
            System.out.println("2. Gastar 15 puntos");
            System.out.println("3. Consultar puntos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    puntos += 20;
                    System.out.println("Has ganado 20 puntos, puntos actuales: " + puntos);
                    break;
                case 2:
                    if (puntos >= 15) {
                        puntos -= 15;
                        System.out.println("Has gastado 15 puntos, puntos actuales: " + puntos);
                    } else {
                        System.out.println("Error: No tienes suficientes puntos para gastar (Mínimo 15).");
                    }
                    break;
                case 3:
                    System.out.println("Tienes un total de: " + puntos + " puntos");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
        System.out.println("Juego terminado, puntos restantes finales: " + puntos);
        scanner.close();
    }
}