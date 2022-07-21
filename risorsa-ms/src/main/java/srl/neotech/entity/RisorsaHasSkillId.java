package srl.neotech.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RisorsaHasSkillId implements Serializable {
    private static final long serialVersionUID = -8210152286106530757L;
    private String risorsaId;

    private String skillId;

    @Column(name = "risorsa_id", nullable = false, length = 9)
    public String getRisorsaId() {
        return risorsaId;
    }

    public void setRisorsaId(String risorsaId) {
        this.risorsaId = risorsaId;
    }

    @Column(name = "skill_id", nullable = false, length = 200)
    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RisorsaHasSkillId entity = (RisorsaHasSkillId) o;
        return Objects.equals(this.skillId, entity.skillId) &&
                Objects.equals(this.risorsaId, entity.risorsaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillId, risorsaId);
    }

}