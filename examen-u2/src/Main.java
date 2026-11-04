import java.util.Scanner;
//Jesus daniel fuentes alcantara
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String tipo = "";
        int rechazados=0;
        int aceptado=0;
        int fragil=0;
        int peso=0;
        double total=0;
        double mayor=0;
        do{
            System.out.println("Ingresa el peso del paquete en kg enteros: ");
            peso = teclado.nextInt();
            if (peso==0) break;
            System.out.println("Ingresa si es Local(1) Nacional(2) Express(3)");
            int opc = teclado.nextInt();
            if(peso<0){

                System.out.println("No cuenta como paquete");
            }else{
                switch (opc){
                    case 1:
                        tipo = "Local";
                        break;
                    case 2:
                        tipo = "Nacional";
                        break;
                    case 3:
                        tipo = "Express";
                        break;
                }
            }
            if(tipo=="Local" && peso>12 || tipo=="Nacional" && peso>20 || tipo=="Express" && peso>5) {
                System.out.println("Paquete rechazado");
                rechazados+=1;
            }else {
                aceptado+=1;
                double calculo = 0;
                if (tipo == "Local") {
                    calculo = 30 + (8 * peso);
                } else if (tipo == "Nacional") {
                    calculo = 50 + (12 * peso);
                } else {
                    calculo = 80 + (20 * peso);
                }
                System.out.println("El paquete es fragil? si(1) no(2)");
                int opc2 = teclado.nextInt();
                if(calculo>mayor){
                    mayor=calculo;
                }
                do {
                    switch (opc2){
                        case 1:
                            calculo=calculo+25;
                            fragil+=1;
                            break;
                        case 2:
                            break;
                        default:
                            break;
                    }
                } while (opc2 < 1);
                total=total+calculo;

                System.out.println("Tipo de envio: "+tipo);
                System.out.println("Peso: "+peso);
                if(opc2==1){
                    System.out.println("Cargo por fragilidad incluido");
                }
                System.out.println("Total: "+calculo);
            }
        }while (peso!=0);
        System.out.println("El mayor fue: "+mayor);
        System.out.println("Paquetes aceptados: "+aceptado);
        System.out.println("Paquetes rechazados: "+rechazados);
        System.out.println("Total recaudado: "+total);
        System.out.println("Fragiles aceptados: "+fragil);
    }
}
