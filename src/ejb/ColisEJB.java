package ejb;

import model.Colis;
import model.Position;

import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@DataSourceDefinition(
        name = "java:app/env/jdbc/MyDataSource",
        className = "com.mysql.jdbc.jdbc2.optional.MysqlDataSource",
        user = "root",
        password = "root",
        serverName = "127.0.0.1",
        portNumber = 3306,
        databaseName = "colis_gestion")

@Stateless
@LocalBean
public class ColisEJB {
    @PersistenceContext
    private EntityManager em;

    public ColisEJB() { /* Nothing to do here */ }

    public Colis addColis(int poids, float valeur, Position origine, Position destination) {
        em.persist(origine);
        em.persist(destination);
        Colis c = new Colis(poids, valeur, origine, destination);
        em.persist(c);
        return c;
    }

    public Colis findColis(long id){
        return em.find(Colis.class, id);
    }

}
