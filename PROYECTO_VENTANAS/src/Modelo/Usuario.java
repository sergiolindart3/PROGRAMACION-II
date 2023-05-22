package Modelo;

import java.util.Vector;

/**
 *
 * @author CHECHO
 */
public class Usuario {
    
    private String userName;
    private String password;
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public static int VerificarUsuario(String userName) {
        Vector Lista = Mostrar();
        Usuario obj;
        for (int i = 0; i < Lista.size(); i++) {
            obj = (Usuario) Lista.elementAt(i);
            if (obj.getUserName().equalsIgnoreCase(userName)) {
                return i;
            }
        }
        return -1;
    }
    
    public static int VerificarLogin(String userName, String password) {
        Vector Lista = Mostrar();
        Usuario obj;
        for (int i = 0; i < Lista.size(); i++) {
            obj = (Usuario) Lista.elementAt(i);
            if (obj.getUserName().equalsIgnoreCase(userName) && obj.getPassword().equalsIgnoreCase(password)) {
                return i;
            }
        }
        return -1;
    }
    
    public static Vector Mostrar() {
        return ListaUsuario.Mostrar();
    }
}
