public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        sheepPrototype = new Sheep(4, "Baa", "Grass", "Default Sheep");
        cowPrototype = new Cow(4, "Moo", "Grass");
        horsePrototype = new Horse(4, "Neigh", "Hay", "Brown");
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