package OClosed;

public class Application {

        public double total(Object[] objects){
            double volum = 0;
            for (Object obj : objects) {
                volum += obj.length * obj.breadth * obj.height;
            }
            return volum;
        }
    }

