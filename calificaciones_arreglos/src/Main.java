import java.util.Scanner;
public class Main {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int[] calificaciones = capturarCalificaciones();
        mostrarCalificaciones(calificaciones);
        int totalAprobados = contarAprobados(calificaciones);
        int totalReprobados = contarReprobados(calificaciones);
        System.out.println("Alumnos aprobados: "+totalAprobados);
        System.out.println("Alumnos reprobados: "+totalReprobados);
    }

    static int[] capturarCalificaciones() {
        int[] arreglo = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Captura la calificación del alumno "+(i + 1)+": ");
            int calificacion = teclado.nextInt();
            if (calificacion >= 0 && calificacion <= 100) {
                arreglo[i] = calificacion;
            } else {
                System.out.println("Calificación inválida, debe ser entre 0 y 100.");
                i = i - 1;
            }
        }
        return arreglo;
    }

    static void mostrarCalificaciones(int[] arreglo) {
        System.out.println("Calificaciones capturadas:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno "+(i + 1)+": "+arreglo[i]);
        }
        System.out.println();
    }

    static int contarAprobados(int[] arreglo) {
        int aprobados = 0;
        for (int i = 0; i < 10; i++) {
            if (arreglo[i] >= 70) {
                aprobados = aprobados + 1;
            }
        }
        return aprobados;
    }

    static int contarReprobados(int[] arreglo) {
        int reprobados = 0;
        for (int i = 0; i < 10; i++) {
            if (arreglo[i] < 70) {
                reprobados = reprobados + 1;
            }
        }
        return reprobados;
    }
}
