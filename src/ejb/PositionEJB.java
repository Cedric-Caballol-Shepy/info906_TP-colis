package ejb;
import model.Position;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class PositionEJB {
    @PersistenceContext
    private EntityManager em;

    public PositionEJB() { /* Nothing to do here */ }

    public Position addPosition(float latitude, float longitude, String emplacement) {
        Position p = new Position(latitude, longitude, emplacement);
        em.persist(p);
        return p;
    }

}
