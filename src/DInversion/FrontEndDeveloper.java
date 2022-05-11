package DInversion;

public class FrontEndDeveloper implements Worker {
    @Override
    public void present() {
        System.out.println("Frontend Developer is working on the task ");
    }

    @Override
    public void InVacation() {
        System.out.println("Frontend Developer is not at work");
    }

}
