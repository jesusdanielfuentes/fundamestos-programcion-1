import java.util.Scanner;
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el piso en el que estas: ");
        int piso = teclado.nextInt();
        System.out.println("ingresa el piso al que quieres llegar: ");
        int i = teclado.nextInt();
        if(piso==0 || i==0 || piso<0 || i<0){
            System.out.println("No ingresar 0 ni numeros negativos");
        }else if(piso>10 || i>10){
            System.out.println("Solo son 10 pisos");
        }else{
            if(piso<i){
//subir
                while(piso<i){
                    piso++;
                    System.out.println("Estas en el piso: "+piso);
                    System.out.println("LLegaste");
                }
            }else if(piso>i) {
//bajar
                while (piso > i) {
                    piso--;
                    System.out.println("Estas en el piso: "+piso);
                    System.out.println("LLegaste");
                }
            }else{
                System.out.println("los pisos son iguales");
            }
        }
    }
}