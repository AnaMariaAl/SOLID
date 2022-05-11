package LSubstitution;

public class Lion extends Carnivore{


    @Override
    public void hunting() {
        System.out.println("Lion hunting the target!");
    }

    @Override
    public String getName() {
        return "Lion";
    }
}
