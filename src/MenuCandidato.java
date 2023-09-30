import java.util.Scanner;

public class MenuCandidato {

    static void menuCandidato(){
        Scanner sn = new Scanner(System.in);
        Boolean salir = false;
        int opcion;
        while(!false){
        System.out.println("Menu candidatos\n");
        System.out.println("1- Crear un candidato.");
        System.out.println("2- Ver los candidatos.");
        System.out.println("3- Editar un candidato.");
        System.out.println("4- Eliminar un candidato.");
        System.out.println("5- Volver.");

        System.out.print("\nPor favor seleccione una opcion: ");
        opcion = sn.nextInt();
        switch(opcion){
            case 1:
                System.out.println("hola");
                break;
            case 2:
                System.out.println("como");
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
            default:
                System.out.println("adios");

        }


        }
    }
}
