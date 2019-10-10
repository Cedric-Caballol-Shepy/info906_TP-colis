package ejb;

import model.Colis;
import model.Position;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class ColisEJB {
    @PersistenceContext
    private EntityManager em;

    public ColisEJB() { /* Nothing to do here */ }

    public Colis addColis(int poids, float valeur, Position origine, Position destination) {
        Colis c = new Colis(poids, valeur, origine, destination);
        em.persist(c);
        return c;
    }

}
