package srl.neotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import srl.neotech.entity.Task;

import java.util.List;

public interface TaskJPARepository extends JpaRepository<Task,Integer> {

    @Query("select t from Task t where t.id= :id")
    List<Task> get_task_by_id(@Param("id")Integer id);



    // @Query("select t.tas_descr from task t where t.cliente_id= :cliente_id")



    @Query("select t from Task t join t.cliente c where c.id= :cliente_id")
    List<Task> get_task_b_client(@Param("cliente_id")Integer cliente_id);

}
