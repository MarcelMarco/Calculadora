package edu.upc.eetac.dsa;

import edu.upc.eetac.dsa.models.Objeto;
import edu.upc.eetac.dsa.models.User;
import java.util.List;

public interface Manager {
    public List<Objeto> objetosByPrice();

    public List<User> usersByOrder();

    public void addObject(String nombre, String descripcion, int dsaCoins);

    public void loginUser(String mail,String passw);

    public Object getObject(String Id);

    void registroUser(String name, String surname, String fecha, String correo, String password, String id, int saldo);
}
