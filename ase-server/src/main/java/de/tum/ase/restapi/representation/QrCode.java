package de.tum.ase.restapi.representation;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class QrCode {
    /** Default serial version ID. */
    private static final long serialVersionUID = 1L;

    @Id String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
