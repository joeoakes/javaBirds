// Subclass: Penguin
class Penguin extends Bird {
    //Constructor method
    public Penguin(String name, String color) {
        super(name, color);
    }

    @Override
    public void fly() {
        System.out.println(name + " cannot fly but swims gracefully in water.");
    }
}
