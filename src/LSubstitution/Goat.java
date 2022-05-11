package LSubstitution;

import LSubstitution.Herbivore;

public class Goat extends Herbivore {

    @Override
    public void eatGrass() {
        System.out.println("Eating grass...");
    }

    @Override
    public String getName() {
        return "Goat";
    }

}
