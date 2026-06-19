import java.util.Random;

// Abstract class
abstract class Compartment {
    public abstract String notice();
}

// First Class compartment
class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "First Class: Comfortable seating and premium facilities.";
    }
}

// Ladies compartment
class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Ladies Compartment: Reserved exclusively for women passengers.";
    }
}

// General compartment
class General extends Compartment {
    @Override
    public String notice() {
        return "General Compartment: Open for all passengers.";
    }
}

// Luggage compartment
class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Luggage Compartment: Reserved for luggage and goods only.";
    }
}

// Test class
public class TestCompartment {
    public static void main(String[] args) {

        // Array of Compartment references
        Compartment[] compartments = new Compartment[10];

        Random random = new Random();

        // Create 10 random compartments
        for (int i = 0; i < compartments.length; i++) {

            int choice = random.nextInt(4) + 1; // Random number between 1 and 4

            switch (choice) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        // Display notices (Polymorphism)
        System.out.println("===== Railway Compartments =====\n");

        for (int i = 0; i < compartments.length; i++) {
            System.out.println("Compartment " + (i + 1) + ": "
                    + compartments[i].getClass().getSimpleName());
            System.out.println("Notice: " + compartments[i].notice());
            System.out.println("--------------------------------");
        }
    }
}
