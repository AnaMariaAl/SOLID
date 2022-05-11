package DInversion;

import DInversion.Manager;
import DInversion.Worker;

public class TaskManager implements Manager {
    public Worker client;
    public boolean present;

    public TaskManager(Worker worker) {
        this.client = worker;
        this.present = false;
    }
    public boolean present() {
        return this.present;
    }
    public void delegateTasks(){
        boolean checkPresent = present();
        if (checkPresent) {
            client.InVacation();
            this.present = false;
        } else {
            client.present();
            this.present = true;
        }
    }
}
