import javax.swing.*;

public class punto10 {

    boolean contra = true;
    String psw = "contraseña";
    String psw1;

    public punto10() {
        while (contra) {
            psw1 = JOptionPane.showInputDialog("Por favor ingrese su contraseña");

            if (psw.equals(psw1)) {
                JOptionPane.showMessageDialog(null, "Ingreso de contraseña exitoso");
                contra = false;
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseña no coinciden");
                contra = true;
            }

        }
    }

        public static void main (String[]args){

            new punto10();
            // Escribir un programa que almacene la cadena de
            // caracteres contraseña en una variable, pregunte al
            // usuario por la contraseña hasta que introduzca
            // la contraseña correcta.
        }
    }

