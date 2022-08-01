package srl.neotech.requestresponse;

import srl.neotech.model.Skill;

public class GetRisorsaFromSkillRespo extends ResponseBase{
    private Skill skill;

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
