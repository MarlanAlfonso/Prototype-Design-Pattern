public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        sheepPrototype = new Sheep(4, "Baa", "Grass", "Dolly");
        cowPrototype = new Cow(4, "Moo", "Grass");
        horsePrototype = new Horse(4, "Neigh", "Hay", "Brown");
    }

    public Sheep createSheep(String name) {
        Sheep sheep = (Sheep) sheepPrototype.clone();
        sheep.setName(name);
        return sheep;
    }

    public Cow createCow(String sound) {
        Cow cow = (Cow) cowPrototype.clone();
        cow.setSound(sound);
        return cow;
    }

    public Horse createHorse(String color) {
        Horse horse = (Horse) horsePrototype.clone();
        horse.setColor(color);
        return horse;
    }
}