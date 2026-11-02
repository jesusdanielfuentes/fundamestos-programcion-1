import java.util.Scanner;
//Jesus Daniel Fuentes Alcantara
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int continuar = 1;
        while (continuar == 1) {
            System.out.print("Introduce el porcentaje inicial de la batería 0-100: ");
            int porcentajeInicial = scanner.nextInt();

            if (porcentajeInicial >= 0 && porcentajeInicial <= 100) {
                int minutosNecesarios = calcularMinutos(porcentajeInicial);
                System.out.println("Minutos necesarios para completar la carga: " + minutosNecesarios);
            } else {
                System.out.println("El porcentaje inicial debe estar entre 0 y 100");
            }
            System.out.println("¿Deseas realizar otra simulación? Presiona 1 para Sí, otro número para Salir: ");
            continuar = scanner.nextInt();
            System.out.println();
        }
    }
    public static int calcularMinutos(int bateria) {
        int minutos = 0;
        while (bateria < 100) {
            bateria = bateria + 8;
            minutos = minutos + 1;
        }
        return minutos;
    }
}
