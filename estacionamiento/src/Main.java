import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double dinero = 0;
        int ttalAutos = 0;
        int descuento = 0;
        int horas;
        do {
            System.out.print("Ingrese el numero de de horas estacionado o (0) para terminar: ");
            horas = teclado.nextInt();
            if (horas < 0) {
                System.out.println("No ingresar horas negativas");
            } else if (horas > 0) {
                double pago = horas * 15;
                if (horas > 5) {
                    pago -= 10;
                    descuento++;
                }
                System.out.println("Pago por auto: $"+pago);
                ttalAutos++;
                dinero += pago;
            }
        } while (horas != 0);
        double promedio = dinero/ttalAutos;
        System.out.println("Total de autos: "+ttalAutos);
        System.out.println("Total de dinero recaudado: $"+dinero);
        System.out.println("Cantidad de autos con descuento: "+descuento);
        System.out.println("Promedio pagado por auto: $"+promedio);
    }
}