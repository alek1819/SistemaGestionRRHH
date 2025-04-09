/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestionrrhh;

import javax.swing.JFrame;
import sistemaGestionRRHHHPresentacion.DialogIniciarSesion;
import sistemaGestionRRHHHPresentacion.VentanaPrincipal;

public class SistemaGestionRRHH {
    public static void main(String[] args) {
        SistemaGestion sistema = new SistemaGestion();

        DialogIniciarSesion login = new DialogIniciarSesion(null, true, sistema);
        login.setVisible(true);

        if (login.isLoginExitoso()) {
            VentanaPrincipal ventana = new VentanaPrincipal(sistema);
            ventana.setVisible(true);
            ventana.setExtendedState(JFrame.NORMAL);
            ventana.toFront();
            ventana.requestFocus();
        } else {
            System.exit(0);
        }
    }
}


