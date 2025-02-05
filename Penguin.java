// Subclass: Penguin
class Penguin extends Bird {
    public Penguin(String name, String color) {
        super(name, color);
    }

    @Override
    public void fly() {
        System.out.println(name + " cannot fly but swims gracefully in water.");
    }
}
