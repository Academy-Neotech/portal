package srl.neotech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import srl.neotech.model.Task;
import srl.neotech.requestresponse.GetTaskResp;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.TaskService;

import java.util.List;

@RestController
public class TaskAPIController {

    @Autowired
    TaskService taskService;

    @ResponseBody
    @GetMapping(value = "api/get_task_by_id", produces = MediaType.APPLICATION_JSON_VALUE)
    public GetTaskResp getTaskById(@RequestParam("id")Integer id){
        GetTaskResp resp=new GetTaskResp();
try {
    List<Task> taskList = taskService.get_task_by_id(id);
    resp.setSimpleData(taskList);
    resp.setCode("OK");
}catch (Exception e){
    resp.setCode("KO");
    resp.setDescr(e.getMessage());
}
        return resp;
    }

    @ResponseBody
    @GetMapping(value = "api/get_task_b_client", produces = MediaType.APPLICATION_JSON_VALUE)
    public GetTaskResp getTaskRespByCli(@RequestParam("cliente_id")Integer cliente_id){
        GetTaskResp resp=new GetTaskResp();
        try {
            List<Task>list=taskService.get_task_b_client(cliente_id);
            resp.setSimpleData(list);
            resp.setCode("OK");
        }catch (Exception e){
            resp.setCode("KO");
            resp.setDescr(e.getMessage());
        }
        return resp;
    }

    @ResponseBody
    @GetMapping(value = "api/insert_task", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseBase insertTask(@RequestBody Task dati_req){
        ResponseBase base=new ResponseBase();

        try{
            taskService.insert_task(dati_req.getId(),dati_req.getTasDescr(),dati_req.getCliente(),
                        dati_req.getDataInizio(),dati_req.getDataTerminePrevista(),dati_req.getDataTermine());
            base.setCode("OK");
        }catch (Exception e){
            base.setCode("KO");
            base.setDescr(e.getMessage());
        }
        return base;
    }


    @ResponseBody
    @GetMapping(value = "api/delete_task{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseBase deleteTask(@RequestParam("id")Integer id){
        ResponseBase base=new ResponseBase();
        try {
            taskService.delete_task(id);
            base.setCode("OK");
        }catch (Exception e){
            base.setCode("KO");
            base.setDescr(e.getMessage());
        }
        return base;
    }

    @ResponseBody
    @GetMapping(value ="api/update_task", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseBase updateTask(@RequestBody Task taskM){
        ResponseBase base=new ResponseBase();
        try{
            taskService.update_task(taskM);
            base.setCode("OK");
        }catch (Exception e){
            base.setCode("KO");
            base.setDescr(e.getMessage());
        }
        return base;
    }






}
