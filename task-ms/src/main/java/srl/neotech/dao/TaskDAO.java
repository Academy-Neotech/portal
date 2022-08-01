package srl.neotech.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.mapper.DozerMapper;
import srl.neotech.model.Task;
import srl.neotech.repository.TaskJPARepository;

import java.util.ArrayList;

import java.util.List;

@Component
public class TaskDAO {

    @Autowired
    TaskJPARepository taskJPARepository;

    public List<Task>get_task_by_id(Integer id){
        List<srl.neotech.entity.Task>entity=taskJPARepository.get_task_by_id(id);

        List<Task>list_model_tasks=new ArrayList<>();

        for (srl.neotech.entity.Task task:entity) {
            Task map=DozerMapper.getInstance().map(task, Task.class);
            list_model_tasks.add(map);
        }
        return list_model_tasks;
    }

    public List<Task>get_task_b_client(Integer cliente_id){
        List<srl.neotech.entity.Task>e=taskJPARepository.get_task_b_client(cliente_id);

        List<Task>lmt=new ArrayList<>();

        for (srl.neotech.entity.Task task:e) {
            Task map=DozerMapper.getInstance().map(task,Task.class);
            lmt.add(map);
        }
        return lmt;
    }

    public void insert_task(srl.neotech.entity.Task task){
        taskJPARepository.saveAndFlush(task);
    }

    public void delete_task(Integer id){
        taskJPARepository.deleteById(id);
    }

    public void update_task(Task taskM){
        srl.neotech.entity.Task ent=taskJPARepository.findById(taskM.getId()).orElseThrow(null);

        ent.setDataInizio(taskM.getDataInizio());
        ent.setDataTerminePrevista(taskM.getDataTerminePrevista());
        ent.setDataTermine(taskM.getDataTermine());
        ent.setStato(taskM.getCliente().getStato());
        ent.setCliente(taskM.getCliente());

        taskJPARepository.saveAndFlush(ent);
    }









}

