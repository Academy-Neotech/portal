package srl.neotech.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import srl.neotech.dao.TaskDAO;
import srl.neotech.entity.Cliente;
import srl.neotech.entity.Sprint;
import srl.neotech.entity.Stato;
import srl.neotech.model.Task;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Service
public class TaskService {
    @Autowired
    TaskDAO taskDAO;

    public List<Task>get_task_by_id(Integer id){
        return taskDAO.get_task_by_id(id);
    }

    public List<srl.neotech.model.Cliente>get_task_b_client(Integer cliente_id){
        return taskDAO.get_task_b_client(cliente_id);
    }

    @Transactional
    public void insert_task(Integer id, String taskDescr, Cliente cliente, LocalDate dataInizio,LocalDate dataTerminePrevista,LocalDate dataTermine){
        srl.neotech.entity.Task task=new srl.neotech.entity.Task();
        task.setId(id);
        task.setTasDescr(taskDescr);
        task.setDataInizio(dataInizio);
        task.setDataTerminePrevista(dataTerminePrevista);
        task.setDataTermine(dataTermine);
        task.setCliente(cliente);

        Stato stato=new Stato();
        stato.getId();

        Sprint sprint=new Sprint();
        sprint.getId();
        sprint.setStato(stato);

        task.setStato(stato);
        task.setSprints(Collections.singleton(sprint));

        taskDAO.insert_task(task);
    }

    public void delete_task(Integer id){
        taskDAO.delete_task(id);
    }

    public void update_task(Task taskM){
        taskDAO.update_task(taskM);
    }
}
