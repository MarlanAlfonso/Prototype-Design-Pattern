public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        // Initialize prototypes with default values
        sheepPrototype = new Sheep(4, "Baa", "Grass", "Dolly");
        cowPrototype   = new Cow(4, "Moo", "Hay");
        horsePrototype = new Horse(4, "Neigh", "Oats", "Brown");
    }

    public Animal createSheep(String name) {
        Sheep sheep = (Sheep) sheepPrototype.clone();
        sheep.setName(name);
        return sheep;
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }
}
