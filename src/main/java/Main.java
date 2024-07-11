
import jakarta.persistence.EntityManager;
import java.util.List;
import org.luispichiya.webapp.model.Producto;
import org.luispichiya.webapp.util.JPAUtil;

public class Main {
    
    private static EntityManager em = JPAUtil.getEntityManager();
    
    public static void main(String [] args){
    
        List<Producto> productos = em.createQuery("SELECT p FROM Producto p", Producto.class).getResultList();       
        productos.forEach(producto -> System.out.println(producto));            
    }   
}
