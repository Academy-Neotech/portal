package srl.neotech.taskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import srl.neotech.taskDao.TaskDAO;
import srl.neotech.taskModel.Task;

@Service
public class TaskService {
    @Autowired
    TaskDAO taskDAO;

    public Task getTaskById (Integer id){
        return taskDAO.getTaskById(id);
    }

    public Task getTaskByClient ( Integer cliente_id){ return taskDAO.getTaskByClient(cliente_id);}
}
