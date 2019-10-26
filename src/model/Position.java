package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Position {
    @Id @GeneratedValue
    private long id;

    private float latitude;
    private float longitude;
    private String emplacement;

    public Position(){ /* Nothing to do here */ }
    public Position(float latitude, float longitude, String emplacement) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.emplacement = emplacement;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }
}