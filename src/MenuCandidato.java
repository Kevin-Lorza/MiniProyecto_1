import java.util.Scanner;
    
public class MenuCandidato{

    static void menuCandidato(String[] args) throws Exception{
        Scanner sn = new Scanner(System.in);
        Boolean salir = false;
        int opcion;
        while(!false){
        System.out.println("\nMenu candidatos\n");
        System.out.println("1- Crear un candidato.");
        System.out.println("2- Ver los candidatos.");
        System.out.println("3- Editar un candidato.");
        System.out.println("4- Eliminar un candidato.");
        System.out.println("5- Volver.");

        System.out.print("\nPor favor seleccione una opcion: ");
        opcion = sn.nextInt();
        
        switch(opcion){
            case 1:
                CrearCandidato.candidatoC(args);
                break;
            case 2:
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

        sn.close();
        }  
    }


}
