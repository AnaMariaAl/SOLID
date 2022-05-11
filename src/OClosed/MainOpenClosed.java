package OClosed;

public class MainOpenClosed {
    public static void main(String args[])
    {
        Object object1 = new Object();
        object1.length = 4;
        object1.breadth = 5;
        object1.height = 10;

        Object object2 = new Object();
        object2.length = 2;
        object2.breadth = 4;
        object2.height = 6;

        Object[] calculate = new Object[2];
        calculate[0] = object1;
        calculate[1] = object2;

        Application application = new Application();
        double vol = application.total(calculate);
        System.out.println("Volumul total este :" + vol);
    }
}
