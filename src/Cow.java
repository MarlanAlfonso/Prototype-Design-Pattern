public class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;

    public Cow(int legs, String sound, String food) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public Animal clone() {
        return new Cow(legs, sound, food);
    }

    @Override
    public void makeSound() {
        System.out.println("Cow makes sound " + sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }
}