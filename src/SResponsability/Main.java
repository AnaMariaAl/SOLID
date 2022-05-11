package SResponsability;

public class Main {
    public static void main(String[] args) {
        Footballer footballer1= new Footballer(" Lionel", "Messi", " starting lineup player");
        PrintFootballer printFootballer1= new PrintFootballer();
        printFootballer1.PrintFootballerToConsole(footballer1);

        Footballer footballer2= new Footballer("Cristiano", "Ronaldo ", " backup player");
        printFootballer1.PrintFootballerToConsole(footballer2);
    }
}

