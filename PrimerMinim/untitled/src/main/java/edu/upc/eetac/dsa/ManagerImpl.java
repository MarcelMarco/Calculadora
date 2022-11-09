package edu.upc.eetac.dsa;

import edu.upc.eetac.dsa.models.Objeto;
import edu.upc.eetac.dsa.models.User;
import org.apache.log4j.Logger;
import java.util.*;

public class ManagerImpl implements Manager{
    private static Manager instance;
    List<Objeto> objetos;
    List<User> usuarios;

    final static Logger logger = Logger.getLogger(ManagerImpl.class);

    public static Manager getInstance() {
        if (instance==null) instance = new ManagerImpl();
        return instance;
    }

    @Override
    public List<Objeto> objetosByPrice() {
        return null;
    }

    @Override
    public List<User> usersByOrder() {
        return null;
    }

    @Override
    public void addObject(String nombre, String descripcion, int dsaCoins) {

    }

    @Override
    public void loginUser(String mail, String passw) {

    }

    @Override
    public Object getObject(String Id) {
        return null;
    }

    @Override
    public void registroUser(String name, String surname, String fecha, String correo, String password, String id, int saldo) {

    }
}
