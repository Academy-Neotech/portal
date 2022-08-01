package srl.neotech.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import srl.neotech.entity.Risorsa;

import java.util.List;

public interface RisorsaJPARepository extends JpaRepository<Risorsa, String> {

     @Query("select r from Risorsa r where r.risorsaNominativo= :nominativo")
     public List<srl.neotech.entity.Risorsa> get_risorsa(@Param("nominativo") String risorsa_nominativo);

     @Query("select r from Risorsa r join r.risorsaHasSkills rhs where rhs.skill.id= :skill_id")
     public List<srl.neotech.entity.Risorsa>get_risorsa_from_skill(@Param("skill_id") String skillId);



}
