public class Main {
    public static void main(String[] args) {
        int[] cal = {55, 68, 72, 90, 61, 98, 45, 77, 83, 59};
        mostrar(cal);
        sumaLimite(cal);
        System.out.println("Arreglo final: ");
        mostrar(cal);
        System.out.println("");
        contador(cal);
    }
    public static void mostrar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(+arreglo[i]+", ");
        }
    }

    public static void sumaLimite(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = arreglo[i] + 5;
            if (arreglo[i] > 100) {
                arreglo[i] = 100;
            }
        }
    }

    public static void contador(int[] arreglo) {
        int aprobados = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] >= 70) {
                aprobados++;
            }
        }

        System.out.println("Aprobados: "+aprobados);
    }
}