import java.util.Scanner;
//JEsus Daniel Fuentes Alcantara
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tarifa = 0;
        double horas = 0;
        System.out.print("Introduce la tarifa de alquiler por hora ($): ");
        tarifa = scanner.nextDouble();

        if (tarifa <= 0) {
            System.out.println("La tarifa debe ser mayor que cero.");
        }

        System.out.print("Introduce la cantidad de horas de uso: ");
        horas = scanner.nextDouble();

        if (horas <= 0) {
            System.out.println("Las horas deben ser mayores que cero.");
        }

        if (tarifa > 0 && horas > 0) {
            double ttlpago = calcularRenta(tarifa, horas);
            mostrarComprobante(ttlpago);
        }
    }
    public static double calcularRenta(double tarifa, double horas) {
        return tarifa * horas;
    }

    public static void mostrarComprobante(double total) {
        System.out.println("Total a pagar por el cliente: $"+total);
    }
}