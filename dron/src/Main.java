import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la batería inicial del dron: ");
        int bateria = teclado.nextInt();

        int minuto = 1;
        int consumoPorMinuto = 7;
        while (bateria >= consumoPorMinuto) {
            bateria -= consumoPorMinuto;
            System.out.println("Minuto " + minuto + " -> " + bateria + "%");
            minuto++;
        }
    }
}
