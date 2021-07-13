import java.io.IOException;
import javax.swing.JOptionPane;

public class Inicio {

    public static void main(String[] args) throws IOException{
        int opcion_menu = -1;
        String[] botones = {" 1. ver gatos", "2. ver favoritos", "3. salir"};

        do{

            //menu principal
            String opcion = (String) JOptionPane.showInputDialog(null, "Gatitos java", "Menu principal", JOptionPane.INFORMATION_MESSAGE,
                    null, botones,botones[0]);

            //validate what the user choose!
            for(int i=0;i<botones.length;i++){
                if(opcion.equals(botones[i])){
                    opcion_menu = i;
                }
            }

            switch(opcion_menu){
                case 0:
                    com.platzi.gatos_app.GatosService.verGatos();
                    break;
                case 1:
                    Gatos gato = new Gatos();
                    com.platzi.gatos_app.GatosService.verFavorito(gato.getApikey());
                default:
                    break;
            }
        }while(opcion_menu != 1);

    }

}
