package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Position {
    @Id @GeneratedValue
    private long id;

    float latitude;
    float longitude;
    String emplacement;
}