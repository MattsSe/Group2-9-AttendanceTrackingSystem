package de.tum.ase.restapi.representation;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Error {
    /** Default serial version ID. */
    private static final long serialVersionUID = 1L;

   @Id private String code;

    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    private String description;

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    private String reasonPhrase;

    
    public String getReasonPhrase() {
        return reasonPhrase;
    }

    public void setReasonPhrase(String reasonPhrase) {
        this.reasonPhrase = reasonPhrase;
    }

}
