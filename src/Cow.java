public class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;

    public Cow(int legs, String sound, String food) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
    }

    // Copy constructor for cloning
    private Cow(Cow other) {
        this.legs = other.legs;
        this.sound = other.sound;
        this.food = other.food;
    }

    @Override
    public Animal clone() {
        return new Cow(this);
    }

    @Override
    public void makeSound() {
        System.out.println("Cow makes sound " + sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }

    public int getLegs() { return legs; }
    public void setLegs(int legs) { this.legs = legs; }
    public String getSound() { return sound; }
    public void setSound(String sound) { this.sound = sound; }
    public String getFood() { return food; }
    public void setFood(String food) { this.food = food; }
}
