import edu.upc.eetac.dsa.ManagerImpl;
import edu.upc.eetac.dsa.Manager;
import edu.upc.eetac.dsa.models.Objeto;
import edu.upc.eetac.dsa.models.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class ManagerImplTest {

    Manager pm;

    @Before
    public void registo(){
        pm = new ManagerImpl();
        pm.registroUser("Marcel","Marco","04/05/2002","marcel@gmail.com","1234","a001",50);
        pm.registroUser("Richard","Feynman","11/05/1918","Richard@gmail.com","1234","a002",50);
        pm.registroUser("Nikola","Tesla","10/07/1956","marcel@gmail.com","1234","a003",50);

        pm.addObject("Libreta","Objeto para escribir",5);
        pm.addObject("Boli","Objeto donde escribir",10);
        pm.addObject("Chaqueta","Objeto para abrigarse",40);

    }
    @After
    public void tearDown() {
        this.pm = null;
    }



}
