import java.util.ArrayList;
import java.util.Scanner;

public class CrearCandidato{
    public static void candidatoC(String[] args) throws Exception {
        ArrayList <Candidato> lista= new ArrayList<Candidato>(); 
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa el nombbre: ");
            String nombreWhile = scanner.next();
            System.out.println("ingrese la Identificación: ");
            String identificacion = scanner.next();
            System.out.println("ingrese la ciudad de origen: ");
            String ciudad = scanner.next();
            System.out.println("ingrese 0 si es de derecha o 1 si es de Izquierda: ");
            Integer posi = scanner.nextInt();
            Boolean posicion = false;
            String PartidoCan = null;
            if(posi == 0){
                posicion = true; /* se le asigna true cuando el candidato es de derecha */
                System.out.println("Estos son los partidos de derecha: ");
                System.out.println("1. "+Partido.Conservador);
                System.out.println("2. "+Partido.Centro_democratico);
                System.out.println("3. "+Partido.Partido_cambio_radical);
                int variableswitch = scanner.nextInt(); 
                switch(variableswitch){
                    case 1: PartidoCan = "Conservador";break;
                    case 2: PartidoCan = "Centro_democratico";break;
                    case 3: PartidoCan = "Partido_cambio_radical";break;
                    default: break;
                }

            }
            else if(posi == 1){
                posicion = false; /* se le asigna false cuando el candidato es de izquierda */
                System.out.println("Estos son los partidos de izquierda: ");
                System.out.println("1. "+Partido.Liberal);
                System.out.println("2. "+Partido.Alianza_verde);
                int variableswitch2 = scanner.nextInt();
                switch(variableswitch2){
                    case 1: PartidoCan = "Liberal";break;
                    case 2: PartidoCan = "Alianza_verde";break;
                    default: break;
                }
            }
            System.out.println("ingrese sus propuestas de campaña: ");
            String propuestas = scanner.next();
            Ciudades ciu = Ciudades.valueOf(ciudad);
            Partido part = Partido.valueOf(PartidoCan);
        
            Candidato candidato = new Candidato(nombreWhile, identificacion, ciu , posicion, part, propuestas);
            lista.add(candidato);
            System.out.println(candidato.getNombre());
            System.out.println("si desea salir, ingrese 0: ");
            int continuar = scanner.nextInt();
            if(continuar==0)
                break;
        }
        lista.forEach((i) ->{
            System.out.println(i.getNombre());            
            System.out.println(i.getIdentificacion());            
            System.out.println(i.getCiudad_origen());            
            System.out.println(i.isDerecha());            
            System.out.println(i.getPartido_politico());            
            System.out.println(i.getPropuestas());            
        });
    }
}
