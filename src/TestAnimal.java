public class TestAnimal {
    public static void main(String[] args) {

        AnimalRegistry registry = new AnimalRegistry();

        // ORIGINAL PROTOTYPES
        Sheep sheep1 = registry.createSheep("Dolly");
        Cow cow1 = registry.createCow("Moo");
        Horse horse1 = registry.createHorse("Brown");

        sheep1.makeSound();
        cow1.makeSound();
        horse1.makeSound();

        System.out.println("\nCloning animals...");

        Sheep sheep2 = registry.createSheep("Shaun");
        Cow cow2 = registry.createCow("Moo Moo");
        Horse horse2 = registry.createHorse("Black");

        sheep2.makeSound();
        cow2.makeSound();
        horse2.makeSound();
    }
}