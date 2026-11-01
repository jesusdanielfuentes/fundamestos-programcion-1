import java.util.Scanner;
//Jesus Daniel Fuentes Alcantara
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el tamaño del archivo en MB: ");
        double tamaño = teclado.nextDouble();
        System.out.print("Introduce la velocidad de descarga en MB/s: ");
        double vel = teclado.nextDouble();

        if (tamaño < 0) {
            System.out.println("El tamaño del archivo no puede ser negativo.");
        } else if (vel <= 0) {
            System.out.println("La velocidad de descarga debe ser mayor que cero.");
        } else {
            double testimado = calcularTiempo(tamaño, vel);
            System.out.println("El tiempo estimado de descarga es: " + testimado + " segundos.");
        }
    }
    static double calcularTiempo(double tamaño, double vel) {
        return tamaño / vel;
    }
}
