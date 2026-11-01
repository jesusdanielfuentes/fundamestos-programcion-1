import java.util.Scanner;
//Jesus Daniel Fuentes Alcantara
public class Main {
    static void main() {
        System.out.println("Bienvenido a este sistema de mensajeria");
        System.out.println("Aqui se mostraran todas las etiquetas");
        mostrarEtiqueta("101", "Cuernavaca", 6.5);
        mostrarEtiqueta("102", "Alpuyeca", 15);
    }
    static void mostrarEtiqueta(String numg, String destino, double peso) {
        System.out.println("");
        System.out.println("Número de Guía: " + numg);
        System.out.println("Ciudad Destino: " + destino);
        System.out.println("Peso del Paquete: " + peso + " kg");
    }
}


