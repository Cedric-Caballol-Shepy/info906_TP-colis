public class Colis {
    private  long id;
    private int poids;
    private float valeur;
    private Position origine;
    private Position destination;
    private Etat etat;
}


enum Etat {
    ENREGISTREMENT,
    ATTENTE,
    ACHEMINEMENT,
    BLOQUE,
    LIVRE
}