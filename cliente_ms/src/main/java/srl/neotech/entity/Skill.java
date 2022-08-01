package srl.neotech.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @Column(name = "skill_id", nullable = false, length = 200)
    private String id;

    @OneToMany(mappedBy = "skill")
    private Set<RisorsaHasSkill> risorsaHasSkills = new LinkedHashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<RisorsaHasSkill> getRisorsaHasSkills() {
        return risorsaHasSkills;
    }

    public void setRisorsaHasSkills(Set<RisorsaHasSkill> risorsaHasSkills) {
        this.risorsaHasSkills = risorsaHasSkills;
    }

}