public class Sheep implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep(int legs, String sound, String food, String name) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;
    }

    // Copy constructor for cloning
    private Sheep(Sheep other) {
        this.legs = other.legs;
        this.sound = other.sound;
        this.food = other.food;
        this.name = other.name;
    }

    @Override
    public Animal clone() {
        return new Sheep(this);
    }

    @Override
    public void makeSound() {
        System.out.println("Sheep name is " + name);
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getLegs() { return legs; }
    public void setLegs(int legs) { this.legs = legs; }
    public String getSound() { return sound; }
    public void setSound(String sound) { this.sound = sound; }
    public String getFood() { return food; }
    public void setFood(String food) { this.food = food; }
}
