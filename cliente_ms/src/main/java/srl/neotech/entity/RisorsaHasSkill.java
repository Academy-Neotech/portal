package srl.neotech.entity;

import javax.persistence.*;

@Entity
@Table(name = "risorsa_has_skill")
public class RisorsaHasSkill {
    @EmbeddedId
    private RisorsaHasSkillId id;

    @MapsId("risorsaId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "risorsa_id", nullable = false)
    private Risorsa risorsa;

    @MapsId("skillId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;

    @Column(name = "livello", length = 45)
    private String livello;

    public RisorsaHasSkillId getId() {
        return id;
    }

    public void setId(RisorsaHasSkillId id) {
        this.id = id;
    }

    public Risorsa getRisorsa() {
        return risorsa;
    }

    public void setRisorsa(Risorsa risorsa) {
        this.risorsa = risorsa;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public String getLivello() {
        return livello;
    }

    public void setLivello(String livello) {
        this.livello = livello;
    }

}