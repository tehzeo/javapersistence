import java.util.Scanner;

public class Inicio {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int opcion=0;

        do{
            System.out.println("-----------------");
            System.out.println(" Aplicacion de mensajes");
            System.out.println(" 1. crear mensaje");
            System.out.println(" 2. listar mensajes");
            System.out.println(" 3. eliminar mensaje");
            System.out.println(" 4. editar mensaje");
            System.out.println(" 5. salir");
            //read the user option
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    mensajeService.crearMensaje();
                    break;
                case 2:
                    mensajeService.listarMensajes();
                    break;
                case 3:
                    mensajeService.borrarMensaje();
                    break;
                case 4:
                    mensajeService.editarMensaje();
                    break;
                default:
                    break;
            }

        }while(opcion != 5);


    }

}