// Subclass: Penguin
class Penguin extends Bird {
    private double swimSpeed; // Property specific to Penguins

    // Constructor overloaded
    public Penguin(String color, int age, double swimSpeed) {
        super("Penguin", color, age);
        this.swimSpeed = swimSpeed;
    }

    // Constructor overloaded
    public Penguin(String name, String color, int age, double swimSpeed) {
        super(name, color, age);
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void fly() {
        System.out.println(name + " cannot fly but swims gracefully in water.");
    }
}
