package DInversion;

public class BackEndDeveloper implements Worker {
    @Override
    public void present() {
        System.out.println("BackEnd Developer is working on the task ");
    }
    @Override
    public void InVacation() {
        System.out.println("BackEnd  Developer is not at work");
    }

}
