import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int puntos=0;
        int mas = 0;
        int men = 0;
        for(int i = 1; i <= 7; i++){
            System.out.println("ingresa los puntos obtenidos de la partida "+i+" :");
            int puntosporpartida = teclado.nextInt();
            puntos = puntos+puntosporpartida;
            if(puntosporpartida>1000){
                mas++;
            }else {
                men++;
            }
        }
        double probporp = puntos/7;
        System.out.println("Puntos totales: "+puntos);
        System.out.println("Promedio de puntuacion: "+probporp);
        System.out.println("Partidas con mas de 1000 puntos: "+mas);
        System.out.println("Partidas con 1000 puntos o menos: "+men);
    }
}
