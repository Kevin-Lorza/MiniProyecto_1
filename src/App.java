import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception{
        Scanner sn = new Scanner(System.in);
        int opcion2;
        do{
            System.out.println("\nSistema de votaciones Valle 2023\n");
            System.out.println("1- Ver menu de los candidatos.");
            System.out.println("2- Ver resultados.");
            System.out.println("3- Ver estadistica.");
            System.out.println("4- salir.");

            System.out.print("\nPor favor seleccione una opcion: ");
            opcion2 = sn.nextInt();
        
            switch(opcion2){
                case 1:
                    menuCandidato(args);
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
        }while(opcion2!=4);
    }

    static void menuCandidato(String[] args) throws Exception{
        
        Scanner sn = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("\nMenu candidatos\n");
        System.out.println("1- Crear un candidato.");
        System.out.println("2- Ver los candidatos.");
        System.out.println("3- Buscar candidato.");
        System.out.println("4- Editar un candidato.");
        System.out.println("5- Eliminar un candidato.");
        System.out.println("6- Volver.");

        System.out.print("\nPor favor seleccione una opcion: ");
        opcion = sn.nextInt();
        ArrayList<Candidato> lista2 = CrearCandidato.candidatoC(args);
        switch(opcion){
            case 1:
                CrearCandidato.candidatoC(args);
                break;
            case 2:
                CrearCandidato.mostrarC(lista2);
                break;
            case 3:
                System.out.println("estas");
                break;
            case 4:
                System.out.println("mi");
                break;
            case 5:
                System.out.println("amigo");
                break;
            case 6:
                App.main(args);
                break;
            default:
                System.out.println("ddigitaste algo mal vuelve a intentarlo");

        }

        sn.close();
        }while(opcion!=6);
    }

}
