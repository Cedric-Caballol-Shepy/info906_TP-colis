package model;

import javax.persistence.*;

@Entity
public class Colis {
    @Id @GeneratedValue
    private long id;

    public Colis() { /* Nothing to do here */ }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public float getValeur() {
        return valeur;
    }

    public void setValeur(float valeur) {
        this.valeur = valeur;
    }

    public Position getOrigine() {
        return origine;
    }

    public void setOrigine(Position origine) {
        this.origine = origine;
    }

    public Position getDestination() {
        return destination;
    }

    public void setDestination(Position destination) {
        this.destination = destination;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    private int poids;
    private float valeur;
    @ManyToOne
    private Position origine;
    @ManyToOne
    private Position destination;

    public Colis(int poids, float valeur, Position origine, Position destination) {
        this.poids = poids;
        this.valeur = valeur;
        this.origine = origine;
        this.destination = destination;
        this.etat = Etat.ENREGISTREMENT;
    }

    @Enumerated(EnumType.STRING)
    private Etat etat;
}


enum Etat {
    ENREGISTREMENT,
    ATTENTE,
    ACHEMINEMENT,
    BLOQUE,
    LIVRE
}