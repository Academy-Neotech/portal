package srl.neotech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "skill")
public class Skill implements Serializable {
    private static final long serialVersionUID = -2136110533197842622L;
    private String id;

    @Id
    @Column(name = "skill_id", nullable = false, length = 200)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//TODO [JPA Buddy] generate columns from DB
}