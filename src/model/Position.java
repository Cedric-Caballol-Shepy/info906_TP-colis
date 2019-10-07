package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Position {
    @Id
    float latitude;
    @Id
    float longitude;
    @Id
    String emplacement;
}