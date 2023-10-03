import java.util.Scanner;
import java.util.ArrayList;

public class App {
    /*public static void main(String[] args) throws Exception {
        MenuCandidato.menuCandidato(args);
    }*/
    static void menu(String[] args) throws Exception{
        Scanner sn = new Scanner(System.in);
        Boolean salir = false;
        int opcion;
        while(!false){
            System.out.println("\nSistema de votaciones Valle 2023\n");
            System.out.println("1- Ver menu de los candidatos.");
            System.out.println("2- Ver resultados.");
            System.out.println("3- Ver estadistica.");
            System.out.println("4- salir.");

            System.out.print("\nPor favor seleccione una opcion: ");
            opcion = sn.nextInt();
        
            switch(opcion){
                case 1:
                    MenuCandidato.menuCandidato(args);
                    break;
                case 2:
                    System.out.println("aqui van los resultados");
                    break;
                case 3:
                    System.out.println("aqui van las estadisticas");
                    break;
                default:
                    System.out.println("adios");
        }
        }
    }
}
