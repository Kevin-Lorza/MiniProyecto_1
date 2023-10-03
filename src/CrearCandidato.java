import java.util.ArrayList;
import java.util.Scanner;

public class CrearCandidato{
    public static void candidatoC(String[] args) throws Exception{
        ArrayList <Candidato> lista= new ArrayList<Candidato>(); 
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa el nombbre: ");
            String nombreWhile = scanner.next();
            
            System.out.println("ingrese la Identificación: ");
            String identificacion = scanner.next();
            
            System.out.println("Estas son las ciudades: ");
            System.out.println("1.Cali       2.Buenaventura    3.Palmira    4.Tulua");
            System.out.println("5.Jamundi    6.Cartago         7.Zarzal     8.Candelaria");
            System.out.println("9.Pradera    10.Ginebra        11.Cerrito   12.Roldanillo");
            System.out.println("13.La union  14.Sevilla        15.Buga      16.Guacari");
            System.out.println("17.Rozo      18.Caicedonia     19.Yumbo     20.Florida");
            System.out.println("21.Dagua");
            int variableswitch3;
            String ciudad = ""; 
            do{
                System.out.println("ingrese el número de su ciudad de origen: ");
                variableswitch3 = scanner.nextInt();
                
                switch(variableswitch3){
                    case 1: ciudad = "Cali";break;
                    case 2: ciudad = "Buenaventura";break;
                    case 3: ciudad = "Palmira";break;
                    case 4: ciudad = "Tulua";break;
                    case 5: ciudad = "Jamundi";break;
                    case 6: ciudad = "Cartago";break;
                    case 7: ciudad = "Zarzal";break;
                    case 8: ciudad = "Candelaria";break;
                    case 9: ciudad = "Pradera";break;
                    case 10: ciudad = "Ginebra";break;
                    case 11: ciudad = "Cerrito";break;
                    case 12: ciudad = "Roldanillo";break;
                    case 13: ciudad = "Launion";break;
                    case 14: ciudad = "Sevilla";break;
                    case 15: ciudad = "Buga";break;
                    case 16: ciudad = "Guacari";break;
                    case 17: ciudad = "Rozo";break;
                    case 18: ciudad = "Caicedonia";break;
                    case 19: ciudad = "Yumbo";break;
                    case 20: ciudad = "Florida";break;
                    case 21: ciudad = "Dagua";break;
                    default: System.out.println("Digite algo válido");
                }
            }while(variableswitch3 < 1 || variableswitch3 >21 );       
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
            

            if(continuar==0){
                MenuCandidato.menuCandidato(args);  
                break;  

            }else if(continuar!=0) 
                CrearCandidato.candidatoC(args);
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
    
    public static void mostrarC(ArrayList lista){
        
    }
}
