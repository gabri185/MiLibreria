package LibreriaCOD;

import javax.swing.*;

public class PedirDatos {
    public static String pedirString(String mensaje){
        return (JOptionPane.showInputDialog( mensaje));
    }
    public static int pedirInt(String mensaje){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
}
