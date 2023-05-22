package Modelo;

import java.util.Vector;

/**
 *
 * @author CHECHO
 */
public class ListaUsuario {

    private static Vector<Usuario> datos = new Vector<Usuario>();

    public static void Agregar(Usuario obj) {
        datos.addElement(obj);
    }

    public static void Eliminar(Usuario obj) {
        datos.removeElementAt(0);
    }

    public static Vector Mostrar() {
        return datos;
    }
}
