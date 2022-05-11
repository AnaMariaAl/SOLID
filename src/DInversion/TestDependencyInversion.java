package DInversion;



public class TestDependencyInversion {

    public static void main(String args[]) throws Exception {
        Worker taskManagerDevelop = new FrontEndDeveloper();
        Manager taskManager1 = new TaskManager(taskManagerDevelop);
        taskManager1.delegateTasks();
        taskManager1.delegateTasks();
        Worker taskManagerTester = new BackEndDeveloper();
        Manager taskManager2 = new TaskManager(taskManagerTester);
        taskManager2.delegateTasks();
        taskManager2.delegateTasks();

    }
}
