package srl.neotech.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import srl.neotech.entity.Risorsa;

import java.util.List;

public interface RisorsaJPARepository extends JpaRepository<Risorsa, Integer> {

    @Query("")
    public List<Risorsa> getRisorsaPerId(@Param("id") Integer id);


}
