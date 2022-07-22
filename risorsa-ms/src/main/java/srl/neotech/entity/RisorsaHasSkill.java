package srl.neotech.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "risorsa_has_skill")
public class RisorsaHasSkill implements Serializable {
    private static final long serialVersionUID = -8202653826135514026L;
    private RisorsaHasSkillId id;

    private Risorsa risorsa;

    private Skill skill;

    private String livello;

    @EmbeddedId
    public RisorsaHasSkillId getId() {
        return id;
    }

    public void setId(RisorsaHasSkillId id) {
        this.id = id;
    }

    @MapsId("risorsaId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "risorsa_id", nullable = false)
    public Risorsa getRisorsa() {
        return risorsa;
    }

    public void setRisorsa(Risorsa risorsa) {
        this.risorsa = risorsa;
    }

    @MapsId("skillId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "skill_id", nullable = false)
    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    @Column(name = "livello", length = 45)
    public String getLivello() {
        return livello;
    }

    public void setLivello(String livello) {
        this.livello = livello;
    }

}