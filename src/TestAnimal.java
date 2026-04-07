public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep = registry.createSheep("Dolly");
        Animal cow   = registry.createCow();
        Animal horse = registry.createHorse();

        sheep.makeSound();
        cow.makeSound();
        horse.makeSound();

        System.out.println("Cloning animals...");

        Animal clonedSheep = registry.createSheep("Shaun");

        Animal clonedCow = cow.clone();
        ((Cow) clonedCow).setSound("Moo Moo");

        Animal clonedHorse = horse.clone();
        ((Horse) clonedHorse).setColor("Black");

        clonedSheep.makeSound();
        clonedCow.makeSound();
        clonedHorse.makeSound();
    }
}
