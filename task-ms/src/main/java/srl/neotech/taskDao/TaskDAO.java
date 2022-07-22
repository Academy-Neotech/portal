package srl.neotech.taskDao;

import srl.neotech.Mapper.DozerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import srl.neotech.taskRepository.TaskJPARepository;
@Component
public class TaskDAO {

    @Autowired
   TaskJPARepository taskJPARepository;

    public srl.neotech.taskModel.Task getTaskById (Integer id){
        srl.neotech.taskEntity.Task entity= taskJPARepository.getTaskById(id);
        srl.neotech.taskModel.Task task = DozerMapper.getInstance().map(entity, srl.neotech.taskModel.Task.class);
        return task;
    }

    public srl.neotech.taskModel.Task getTaskByClient (Integer cliente_id){
        srl.neotech.taskEntity.Task entity = taskJPARepository.getTaskByClient(cliente_id);
        srl.neotech.taskModel.Task  taskClient = DozerMapper.getInstance().map(entity, srl.neotech.taskModel.Task.class);
        return taskClient;
    }
}

