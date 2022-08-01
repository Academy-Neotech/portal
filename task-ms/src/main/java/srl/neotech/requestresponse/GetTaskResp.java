package srl.neotech.requestresponse;

import srl.neotech.model.Task;

public class GetTaskResp extends ResponseBase{
      private Task task;

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
