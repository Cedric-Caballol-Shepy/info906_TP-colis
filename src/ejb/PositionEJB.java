package ejb;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class PositionEJB {

    public PositionEJB() { /* Nothing to do here */ }

    @PersistenceContext
    private EntityManager em;

}
